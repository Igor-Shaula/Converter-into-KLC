package org.igor_shaula.logic.mapping

import org.igor_shaula.globals.Error
import org.igor_shaula.globals.Str
import org.igor_shaula.globals.X11
import org.igor_shaula.logic.Repository
import org.igor_shaula.logic.clearAllBlanks
import org.igor_shaula.logic.createValuesForLayers
import org.igor_shaula.logic.getKeyNameStartingWithA
import org.igor_shaula.logic.getKeyNameStartingWithLat
import org.igor_shaula.logic.getXkbSymbolsSectionName
import org.igor_shaula.logic.isBeginningInclude
import org.igor_shaula.logic.isKeySpace
import org.igor_shaula.logic.isKeyStartingWithA
import org.igor_shaula.logic.isKeyStartingWithLat
import org.igor_shaula.logic.isKeyTilde
import org.igor_shaula.logic.isLayoutEndingBlock
import org.igor_shaula.logic.parseLayoutInclude
import org.igor_shaula.utils.l
import java.io.File

internal class X11EssenceMapping(fileAndLayoutPair: Pair<String, String>) : IMapping {

    private var targetFileWithLayout: Pair<String, String> = parseLayoutInclude("include \"us(basic)\"")

    init {
        targetFileWithLayout = fileAndLayoutPair // necessary to avoid the Stack Overflow error
    }

    override fun prepare(repository: Repository) {
        l("fileAndLayoutPair: $targetFileWithLayout")
        val x11LayoutSourceFilename = if (targetFileWithLayout.first.contains('/')) targetFileWithLayout.first
        else X11.XKB_SYMBOLS_LOCATION + targetFileWithLayout.first
        try {
            File(x11LayoutSourceFilename).useLines { lines ->
                lines.forEach {
                    processEveryLine(
                        repository = repository, line = it.clearAllBlanks(), targetLayout = targetFileWithLayout.second
                    )
                }
            }
        } catch (e: Exception) {
            throw Error.WithFile(x11LayoutSourceFilename, e.message ?: Str.EMPTY)
        }
        l("assembled x11Essence: ${repository.x11Essence}")
    }

    // parses the given line and adds any found keycode to x11Essence, is invoked only from prepareX11Essence()
    private fun processEveryLine(
        repository: Repository, line: String, targetLayout: String = X11.DEFAULT_XKB_LAYOUT
    ) {
        // 0
        if (getXkbSymbolsSectionName(line) == targetLayout) { // start of a keyboard layout - like: """xkb_symbols "basic" {"""
            repository.languageBlockCounter++
            l("isInsideLanguageBlock: targetLayout = $targetLayout, after languageBlockCounter++: ${repository.languageBlockCounter}")
        } else if (repository.languageBlockCounter > 0 && isLayoutEndingBlock(line)) { // end of a keyboard layout - like: """};"""
            repository.languageBlockCounter--
            l("isInsideLanguageBlock: targetLayout = $targetLayout, after languageBlockCounter--: ${repository.languageBlockCounter}")
        }
        // parse all existing "Lat" mappings
        if (isKeyStartingWithLat(line)) {
//        l("isKeyStartingWithLat: $line")
            val layers = createValuesForLayers(repository, line)
            val latName = line.getKeyNameStartingWithLat()
            repository.x11LatAliasesDictionary[latName]?.let {
//            l("isKeyStartingWithLat it: $it")
                repository.x11Essence.put(it, layers)
            }
        }

        if (repository.languageBlockCounter <= 0) { // saving a lot of time and resources on processing the apriori invalid line
            return // because any further recognition action outside a detected layout block has no sense
        }

        // recognize and include possible included layout - very useful for "rus" based on "us(basic)"
        if (isBeginningInclude(line)) {
            // detect the necessary filename
            targetFileWithLayout = parseLayoutInclude(line) // the correct X11 file and layout should be not empty
            // open the included file
            prepare(repository)
            // find the necessary layout
//        prepareLatToKeyCodeDictionary(X11.DEFAULT_ALIAS_MAPPING)
            // fill the x11Essence from this layout
        }
        // 1
        when {
            isKeyStartingWithA(line) -> {
                val layers = createValuesForLayers(repository, line)
                repository.x11Essence[line.getKeyNameStartingWithA()] = layers
//            l("→ isKeyStartingWithA: $layers")
            }
            isKeyTilde(line) -> {
                val layers = createValuesForLayers(repository, line)
                repository.x11Essence[X11.NAME_TILDE] = layers
//            l("→ isKeyTilde: $layers")
            }
            isKeySpace(line) -> {
                val layers = createValuesForLayers(repository, line)
                repository.x11Essence[X11.NAME_SPACE] = layers
//            l("→ isKeySpace: $layers")
            }
            isKeyStartingWithLat(line) -> {
                l("isKeyStartingWithLat: $line")
            }
        }
    }
}