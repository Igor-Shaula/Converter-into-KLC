package org.igor_shaula.logic.mapping

import org.igor_shaula.globals.Defaults
import org.igor_shaula.globals.Regex
import org.igor_shaula.globals.Sym
import org.igor_shaula.globals.X11
import org.igor_shaula.logic.Repository
import org.igor_shaula.logic.io.AppConfiguration
import org.igor_shaula.logic.io.FileProcessor
import org.igor_shaula.logic.models.Error
import org.igor_shaula.logic.models.createValuesForLayers
import org.igor_shaula.logic.string_processing.*
import org.igor_shaula.utils.l

/**
 * container of the logic to fill the x11EssenceMap dictionary, which is the main data used in the flow.
 *
 * having in mind that Kotlin objects are created lazily,
 * and as AppConfiguration is by its contract accessed first - it will be ready by the time we reach this object.
 * so we can safely access the correct configuration values here.
 *
 * I also decided to have this as an object instead of a class as no more than one instance is currently needed.
 */
object X11EssenceMapping : IMapping {

    private var targetFileWithLayout: Pair<String, String> = parseLayoutInclude(Defaults.INCLUDE_US_BASIC_LINE)

    private var languageBlockCounter = 0

    // as the constructor of X11EssenceMapping is invoked after processArguments(), so the arguments are already parsed
    init {
        // customizing targetFileWithLayout is necessary to avoid the Stack Overflow error
        targetFileWithLayout = AppConfiguration.x11LayoutSourceFilename to AppConfiguration.x11TargetLayoutName
    }

    override fun prepare(repository: Repository) {
        l("fileAndLayoutPair: $targetFileWithLayout")

        val x11LayoutSourceFilename = if (targetFileWithLayout.first.contains(Sym.SLASH)) {
            targetFileWithLayout.first
        } else {
            X11.XKB_SYMBOLS_LOCATION + Sym.SLASH + targetFileWithLayout.first
        }
        FileProcessor.processFileLines(x11LayoutSourceFilename) { line ->
            processEveryLine(
                repository = repository, line = line.clearAllBlanks(), targetLayout = targetFileWithLayout.second
            )
        }
        l("assembled: ${repository.printX11EssenceMap()}")
    }

    // parses the given line and adds any found keycode to x11Essence, is invoked only from prepareX11Essence()
    private fun processEveryLine(
        repository: Repository, line: String, targetLayout: String = Defaults.TARGET_LAYOUT_NAME
    ) {
        // 0
        if (getXkbSymbolsSectionName(line) == targetLayout) { // start of a keyboard layout - like: """xkb_symbols "basic" {"""
            languageBlockCounter++
            l("isInsideLanguageBlock: targetLayout = $targetLayout, after languageBlockCounter++: $languageBlockCounter")
        } else if (languageBlockCounter > 0 && isLayoutEndingBlock(line)) { // end of a keyboard layout - like: """};"""
            languageBlockCounter--
            l("isInsideLanguageBlock: targetLayout = $targetLayout, after languageBlockCounter--: $languageBlockCounter")
        }
        // 1
        processPossibleAlias(line, repository)
        // 2
        if (languageBlockCounter <= 0) { // saving a lot of time and resources on processing the apriori invalid line
            return // because any further recognition action outside a detected layout block has no sense
        }
        // 3
        processPossibleIncludeRecursively(line, repository)
        // 4
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

    private fun processPossibleAlias(line: String, repository: Repository) {
        // parse all existing "Lat" mappings
        if (isKeyStartingWithLat(line)) {
//        l("isKeyStartingWithLat: $line")
            val layers = createValuesForLayers(repository, line)
            val latName = line.getKeyNameStartingWithLat()
            repository.getX11LatAlias(latName)?.let {
//            l("isKeyStartingWithLat it: $it")
                repository.updateX11EssenceValue(it, layers)
            }
        }
    }

    private fun processPossibleIncludeRecursively(line: String, repository: Repository) {
        // recognize and include possible included layout - very useful for layouts like "rus" based on "us(basic)"
        if (isBeginningInclude(line)) {
            // detect the necessary filename
            targetFileWithLayout = parseLayoutInclude(line) // the correct X11 file and layout should be not empty
            // open the included file
            prepare(repository) // a recursive call to process the included layout.
            // find the necessary layout
//        prepareLatToKeyCodeDictionary(X11.DEFAULT_ALIAS_MAPPING)
            // fill the x11Essence from this layout
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