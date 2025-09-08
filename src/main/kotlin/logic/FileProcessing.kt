package org.igor_shaula.logic

import org.igor_shaula.globals.*
import java.io.File

interface IMapping {
    fun prepare(repository: Repository)
}

internal class X11SymbolsMapping(val filename: String = X11.KEYSYMDEF_FILE_LOCATION) : IMapping {

    override fun prepare(repository: Repository) {
        try {
            //  this file is inevitably needed for the upcoming symbols conversion
            File(filename).useLines { lines ->
                lines.forEach {
                    val pair = parseKeySymDefinition(it)
                    if (pair != null) repository.x11SymbolsDictionary[pair.first] = pair.second
                }
            }
        } catch (e: Exception) {
            Error.WithFile(filename, e.message ?: Str.EMPTY)
        }
    }

    private fun parseKeySymDefinition(input: String): Pair<String, String>? {

        if (input.isBlank()) return null

        val regex = Regex.FOR_KEYSYMDEF_FILE.toRegex()

        val matchResult = regex.find(input)
        return matchResult?.let {
            var (name, code) = it.destructured
            if (code.startsWith(X11.EXTENDED_CODE_PREFIX)) code = code.substring(X11.EXTENDED_CODE_PREFIX.length)
            name to code
        }
    }
}

internal class X11LatAliasesMapping(
    val filename: String = X11.ALIASES_FILE_LOCATION, val targetMapping: String? = null
) : IMapping {

    override fun prepare(repository: Repository) {
        if (repository.x11LatAliasesDictionary.isNotEmpty()) return
        try {
            File(filename).useLines { lines ->
                lines.forEach { line ->
                    // 1: find the necessary mapping, if not given this parameter - use "default" one
                    // 2: read all aliases from the target mapping - build the dictionary
                    processEveryAliasLine(
                        repository = repository, line = line.clearAllBlanks(), targetMapping = targetMapping
                    )
                }
            }
        } catch (e: Exception) {
            Error.WithFile(filename, e.message ?: Str.EMPTY)
        }
        println("prepareLatToKeyCodeDictionary: x11LatAliasesDictionary: ${repository.x11LatAliasesDictionary}")
    }

    private fun processEveryAliasLine(
        repository: Repository, line: String, targetMapping: String? = X11.DEFAULT_ALIAS_MAPPING
    ) {
        if (getXkbKeycodesSectionName(line) == targetMapping) { // the start of a keyboard layout - like: """xkb_symbols "basic" {"""
//        println("getXkbSymbolsSectionName: $targetMapping")
            repository.isInsideKeycodesBlock = true
        } else if (repository.isInsideKeycodesBlock && isLayoutEndingBlock(line)) { // end of a keyboard layout - like: """};"""
            println("isInsideKeycodesBlock: isLayoutEndingBlock")
            repository.isInsideKeycodesBlock = false
        }
        if (!repository.isInsideKeycodesBlock) return
        // now we're ready to finally fill the x11LatAliasesDictionary with real mappings
        if (isKeyStartingWithAlias(line)) {
            val pair = parseAliasLine(line)
            if (pair != null) repository.x11LatAliasesDictionary[pair.first] = pair.second
        }
    }
}

internal fun prepareX11Essence(
    repository: Repository, fileAndLayoutPair: Pair<String, String>
) {
    println("fileAndLayoutPair: $fileAndLayoutPair")
    val x11LayoutSourceFilename = if (fileAndLayoutPair.first.contains('/')) fileAndLayoutPair.first
    else X11.XKB_SYMBOLS_LOCATION + fileAndLayoutPair.first
    try {
        File(x11LayoutSourceFilename).useLines { lines ->
            lines.forEach {
                processEveryLine(
                    repository = repository, line = it.clearAllBlanks(), targetLayout = fileAndLayoutPair.second
                )
            }
        }
    } catch (e: Exception) {
        Error.WithFile(x11LayoutSourceFilename, e.message ?: Str.EMPTY)
    }
}

internal fun composeKlcFile(repository: Repository) {
    val resultFile = File(Klc.DEFAULT_RESULT_FILE_NAME)
    resultFile.writeText(KLC_FILE_PREFIX.replace(Str.LF, Str.CR_LF), charset = Charsets.UTF_16)
    repository.windowsEssence.forEach { (key, value) ->
        val scValue = key?.lowercase()
        val vkValue = getVkValueByScValue(repository, key?.lowercase()) ?: (value.layer1.uppercase() + Str.TAB)
        val capitalized = getCapitalizedValue(value.layer1)
        val (layer1, layer2, layer3, layer4) = value.adaptForWindows()
        resultFile.appendText(
            "$scValue${Str.TAB}$vkValue${Str.TAB}$capitalized${Str.TAB}$layer1${Str.TAB}$layer2${Str.TAB}${Klc.ABSENT_SYMBOL_VALUE}${Str.TAB}$layer3${Str.TAB}$layer4${Str.CR_LF}",
            charset = Charsets.UTF_16
        )
    }
    resultFile.appendText(KLC_FILE_SUFFIX.replace(Str.LF, Str.CR_LF), charset = Charsets.UTF_16)
    println("resultFile: $resultFile")
}

// parses the given line and adds any found keycode to x11Essence, is invoked only from prepareX11Essence()
private fun processEveryLine(
    repository: Repository, line: String, targetLayout: String = X11.DEFAULT_XKB_LAYOUT
) {
    // 0
    if (getXkbSymbolsSectionName(line) == targetLayout) { // start of a keyboard layout - like: """xkb_symbols "basic" {"""
        repository.languageBlockCounter++
        println("isInsideLanguageBlock: targetLayout = $targetLayout, after languageBlockCounter++: ${repository.languageBlockCounter}")
    } else if (repository.languageBlockCounter > 0 && isLayoutEndingBlock(line)) { // end of a keyboard layout - like: """};"""
        repository.languageBlockCounter--
        println("isInsideLanguageBlock: targetLayout = $targetLayout, after languageBlockCounter--: ${repository.languageBlockCounter}")
    }
    // parse all existing "Lat" mappings
    if (isKeyStartingWithLat(line)) {
//        println("isKeyStartingWithLat: $line")
        val layers = createValuesForLayers(repository, line)
        val latName = line.getKeyNameStartingWithLat()
        repository.x11LatAliasesDictionary[latName]?.let {
//            println("isKeyStartingWithLat it: $it")
            repository.x11Essence.put(it, layers)
        }
    }

    if (repository.languageBlockCounter <= 0) { // saving a lot of time and resources on processing the apriori invalid line
        return // because any further recognition action outside a detected layout block has no sense
    }

    // recognize and include possible included layout - very useful for "rus" based on "us(basic)"
    if (isBeginningInclude(line)) {
        // detect the necessary filename
        val fileAndLayoutPair = parseLayoutInclude(line) // the correct X11 file and layout should be not empty
        // open the included file
        prepareX11Essence(repository, fileAndLayoutPair)
        // find the necessary layout
//        prepareLatToKeyCodeDictionary(X11.DEFAULT_ALIAS_MAPPING)
        // fill the x11Essence from this layout
    }
    // 1
    when {
        isKeyStartingWithA(line) -> {
            val layers = createValuesForLayers(repository, line)
            repository.x11Essence[line.getKeyNameStartingWithA()] = layers
//            println("→ isKeyStartingWithA: $layers")
        }
        isKeyTilde(line) -> {
            val layers = createValuesForLayers(repository, line)
            repository.x11Essence[X11.NAME_TILDE] = layers
//            println("→ isKeyTilde: $layers")
        }
        isKeySpace(line) -> {
            val layers = createValuesForLayers(repository, line)
            repository.x11Essence[X11.NAME_SPACE] = layers
//            println("→ isKeySpace: $layers")
        }
        isKeyStartingWithLat(line) -> {
            println("isKeyStartingWithLat: $line")
        }
    }
}
