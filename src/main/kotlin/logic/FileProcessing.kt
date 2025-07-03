package org.igor_shaula.logic

import org.igor_shaula.globals.*
import java.io.File

internal fun prepareX11SymbolsDictionary() {
    try {
        //  this file is inevitably needed for the upcoming symbols conversion
        File(X11.KEYSYMDEF_FILE_LOCATION).useLines { lines ->
            lines.forEach {
                val pair = parseKeySymDefinition(it)
                if (pair != null) Data.x11SymbolsDictionary.put(pair.first, pair.second)
            }
        }
    } catch (e: Exception) {
        Error.WithFile(X11.KEYSYMDEF_FILE_LOCATION, e.message ?: Str.EMPTY)
    }
}

internal fun prepareLatToKeyCodeDictionary(targetMapping: String) {
    try {
        File(X11.ALIASES_FILE_LOCATION).useLines { lines ->
            lines.forEach { line ->
                // 1: find the necessary mapping, if not given this parameter - use "default" one
                // 2: read all aliases from the target mapping - build the dictionary
                processEveryAliasLine(line = line.clearAllBlanks(), targetMapping = targetMapping)
            }
        }
    } catch (e: Exception) {
        Error.WithFile(X11.ALIASES_FILE_LOCATION, e.message ?: Str.EMPTY)
    }
}

internal fun prepareX11Essence(fileAndLayoutPair: Pair<String, String>) {
    println("fileAndLayoutPair: $fileAndLayoutPair")
    val x11LayoutSourceFilename = if (fileAndLayoutPair.first.contains('/')) fileAndLayoutPair.first
    else X11.XKB_SYMBOLS_LOCATION + fileAndLayoutPair.first
    try {
        File(x11LayoutSourceFilename).useLines { lines ->
            lines.forEach { processEveryLine(line = it.clearAllBlanks(), targetLayout = fileAndLayoutPair.second) }
        }
    } catch (e: Exception) {
        Error.WithFile(x11LayoutSourceFilename, e.message ?: Str.EMPTY)
    }
}

internal fun prepareWindowsEssence() {
    Data.x11Essence.map { (key, value) -> Data.windowsEssence.put(xkbToWindowsScancode[key], value) }
}

internal fun composeKlcFile() {
    val resultFile = File(Klc.DEFAULT_RESULT_FILE_NAME)
    resultFile.writeText(KLC_FILE_PREFIX.replace(Str.LF, Str.CR_LF), charset = Charsets.UTF_16)
    Data.windowsEssence.forEach { (key, value) ->
        val scValue = key?.lowercase()
        val vkValue = getVkValueByScValue(key?.lowercase()) ?: (value.layer1.uppercase() + Str.TAB)
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
private fun processEveryLine(line: String, targetLayout: String = X11.DEFAULT_XKB_LAYOUT) {
    // 0
    if (getXkbSymbolsSectionName(line) == targetLayout) { // start of a keyboard layout - like: """xkb_symbols "basic" {"""
        Data.languageBlockCounter++
        println("isInsideLanguageBlock: targetLayout = $targetLayout, languageBlockCounter = ${Data.languageBlockCounter}")
    } else if (Data.languageBlockCounter > 0 && isLayoutEndingBlock(line)) { // end of a keyboard layout - like: """};"""
        println("isInsideLanguageBlock: isLayoutEndingBlock, languageBlockCounter = ${Data.languageBlockCounter}")
        Data.languageBlockCounter--
    }

    if (Data.languageBlockCounter <= 0) { // saving a lot of time and resources on processing the apriori invalid line
        return // because any further recognition action outside a detected layout block has no sense
    }
    if (isKeyStartingWithLat(line)) {
        println("isKeyStartingWithLat: $line")
    }

    // recognize and include possible included layout - very useful for "rus" based on "us(basic)"
    if (isBeginningInclude(line)) {
        // detect the necessary filename
        val fileAndLayoutPair = parseLayoutInclude(line) // the correct X11 file and layout should be not empty
        // open the included file
        prepareX11Essence(fileAndLayoutPair)
        // find the necessary layout
        prepareLatToKeyCodeDictionary(X11.DEFAULT_ALIAS_MAPPING)
        // fill the x11Essence from this layout
        println("x11LatAliasesDictionary: ${Data.x11LatAliasesDictionary}")
    }
    // 1
    when {
        isKeyStartingWithA(line) -> {
            val layers = createValuesForLayers(line)
            Data.x11Essence.put(line.getKeyNameStartingWithA(), layers)
//            println("→ isKeyStartingWithA: $layers")
        }
        isKeyTilde(line) -> {
            val layers = createValuesForLayers(line)
            Data.x11Essence.put(X11.NAME_TILDE, layers)
//            println("→ isKeyTilde: $layers")
        }
        isKeySpace(line) -> {
            val layers = createValuesForLayers(line)
            Data.x11Essence.put(X11.NAME_SPACE, layers)
//            println("→ isKeySpace: $layers")
        }
        isKeyStartingWithLat(line) -> {
            println("isKeyStartingWithLat: $line")
        }
    }
}

private fun processEveryAliasLine(line: String, targetMapping: String = X11.DEFAULT_ALIAS_MAPPING) {
    if (getXkbKeycodesSectionName(line) == targetMapping) { // start of a keyboard layout - like: """xkb_symbols "basic" {"""
        println("getXkbSymbolsSectionName: $targetMapping")
        Data.isInsideKeycodesBlock = true
    } else if (Data.isInsideKeycodesBlock && isLayoutEndingBlock(line)) { // end of a keyboard layout - like: """};"""
        println("isInsideKeycodesBlock: isLayoutEndingBlock")
        Data.isInsideKeycodesBlock = false
    }
    if (!Data.isInsideKeycodesBlock) return
    // now we're ready to finally fill the x11LatAliasesDictionary with real mappings
    if (isKeyStartingWithAlias(line)) {
        val pair = parseAliasLine(line)
        if (pair != null) Data.x11LatAliasesDictionary.put(pair.first, pair.second)
    }
}