package org.igor_shaula.logic.mapping

import org.igor_shaula.logic.models.Error
import org.igor_shaula.globals.Regex
import org.igor_shaula.globals.Sym
import org.igor_shaula.globals.X11
import org.igor_shaula.logic.*
import org.igor_shaula.logic.io.ArgumentsProcessor
import org.igor_shaula.logic.io.FileProcessor
import org.igor_shaula.logic.models.createValuesForLayers
import org.igor_shaula.logic.string_processing.clearAllBlanks
import org.igor_shaula.logic.string_processing.getKeyNameStartingWithA
import org.igor_shaula.logic.string_processing.getKeyNameStartingWithLat
import org.igor_shaula.logic.string_processing.getXkbSymbolsSectionName
import org.igor_shaula.logic.string_processing.isBeginningInclude
import org.igor_shaula.logic.string_processing.isKeySpace
import org.igor_shaula.logic.string_processing.isKeyStartingWithA
import org.igor_shaula.logic.string_processing.isKeyStartingWithLat
import org.igor_shaula.logic.string_processing.isKeyTilde
import org.igor_shaula.logic.string_processing.isLayoutEndingBlock
import org.igor_shaula.utils.l

internal class X11EssenceMapping(args: Array<String>) : IMapping {

    private var targetFileWithLayout: Pair<String, String> = parseLayoutInclude(X11.DEFAULT_INCLUDE_LINE)

    private var languageBlockCounter = 0

    override fun prepare(repository: Repository) {
        // customizing targetFileWithLayout is necessary to avoid the Stack Overflow error
        targetFileWithLayout = ArgumentsProcessor.x11LayoutSourceFilename to ArgumentsProcessor.x11TargetLayoutName
        l("fileAndLayoutPair: $targetFileWithLayout")

        val x11LayoutSourceFilename = if (targetFileWithLayout.first.contains(Sym.SLASH)) targetFileWithLayout.first
        else X11.XKB_SYMBOLS_LOCATION + targetFileWithLayout.first
        FileProcessor(x11LayoutSourceFilename).processFileLines { line ->
            processEveryLine(
                repository = repository, line = line.clearAllBlanks(), targetLayout = targetFileWithLayout.second
            )
        }
        l("assembled x11Essence: ${repository.printX11Essence()}")
    }

    // parses the given line and adds any found keycode to x11Essence, is invoked only from prepareX11Essence()
    private fun processEveryLine(
        repository: Repository, line: String, targetLayout: String = X11.DEFAULT_XKB_LAYOUT
    ) {
        // 0
        if (getXkbSymbolsSectionName(line) == targetLayout) { // start of a keyboard layout - like: """xkb_symbols "basic" {"""
            languageBlockCounter++
            l("isInsideLanguageBlock: targetLayout = $targetLayout, after languageBlockCounter++: $languageBlockCounter")
        } else if (languageBlockCounter > 0 && isLayoutEndingBlock(line)) { // end of a keyboard layout - like: """};"""
            languageBlockCounter--
            l("isInsideLanguageBlock: targetLayout = $targetLayout, after languageBlockCounter--: $languageBlockCounter")
        }
        // parse all existing "Lat" mappings
        if (isKeyStartingWithLat(line)) {
//        l("isKeyStartingWithLat: $line")
            val layers = createValuesForLayers(repository, line)
            val latName = line.getKeyNameStartingWithLat()
            repository.getX11LatAlias(latName)?.let {
//            l("isKeyStartingWithLat it: $it")
                repository.setX11EssenceValue(it, layers)
            }
        }

        if (languageBlockCounter <= 0) { // saving a lot of time and resources on processing the apriori invalid line
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
                repository.setX11EssenceValue(line.getKeyNameStartingWithA(), layers)
//            l("→ isKeyStartingWithA: $layers")
            }
            isKeyTilde(line) -> {
                val layers = createValuesForLayers(repository, line)
                repository.setX11EssenceValue(X11.NAME_TILDE, layers)
//            l("→ isKeyTilde: $layers")
            }
            isKeySpace(line) -> {
                val layers = createValuesForLayers(repository, line)
                repository.setX11EssenceValue(X11.NAME_SPACE, layers)
//            l("→ isKeySpace: $layers")
            }
            isKeyStartingWithLat(line) -> {
                l("isKeyStartingWithLat: $line")
            }
        }
    }

    private fun parseLayoutInclude(includeString: String): Pair<String, String> {
        val regex = Regex.FOR_LAYOUT_INCLUDE.toRegex()
        val matchResult = regex.find(includeString) // for example: include "us(basic)"
        return matchResult?.let {
            Pair(it.groupValues[1], it.groupValues[2]) // filename: "us", layout: "basic"
        } ?: throw Error.WithParsing("Invalid include format. Expected format: 'layout(variant)'")
    }
}