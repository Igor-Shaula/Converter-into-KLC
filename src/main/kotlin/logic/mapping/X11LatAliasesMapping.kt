package org.igor_shaula.logic.mapping

import org.igor_shaula.globals.Defaults
import org.igor_shaula.globals.Regex
import org.igor_shaula.logic.Repository
import org.igor_shaula.logic.io.AppConfiguration
import org.igor_shaula.logic.io.FileProcessor
import org.igor_shaula.logic.string_processing.clearAllBlanks
import org.igor_shaula.logic.string_processing.getXkbKeycodesSectionName
import org.igor_shaula.logic.string_processing.isKeyStartingWithAlias
import org.igor_shaula.logic.string_processing.isLayoutEndingBlock
import org.igor_shaula.utils.l

/**
 * container of the logic to fill the X11 Lat* aliases dictionary which can be used later in the flow.
 *
 * having in mind that Kotlin objects are created lazily,
 * and as AppConfiguration is by its contract accessed first - it will be ready by the time we reach this object.
 * so we can safely access the correct configuration values here.
 *
 * I also decided to have this as an object instead of a class as no more than one instance is currently needed.
 */
object X11LatAliasesMapping : IMapping {

    private var isInsideKeycodesBlock = false

    override fun prepare(repository: Repository) {
        if (AppConfiguration.x11TargetLayoutName == Defaults.TARGET_LAYOUT_NAME || !repository.isX11LatAliasMapEmpty()) {
            return // this is a performance optimization
        }
        l("prepare: filename = ${AppConfiguration.x11AliasFilename}, mapping = ${AppConfiguration.x11AliasesMapping}")
        FileProcessor.processFileLines(AppConfiguration.x11AliasFilename) { line ->
            processEveryAliasLine(repository = repository, line = line.clearAllBlanks())
        }
        l("prepared X11 Lat aliases map: ${repository.getX11LatAliasesMap()}")
    }

    // find the necessary mapping, then read all aliases from the target mapping - build the dictionary
    private fun processEveryAliasLine(repository: Repository, line: String) {
        prepareIsInsideKeycodesBlock(line)
        if (!isInsideKeycodesBlock) return
        // now we're ready to finally fill the x11LatAliasesDictionary with real mappings
        if (line.isKeyStartingWithAlias()) {
            val pair = parseAliasLine(line)
            if (pair != null) repository.setX11LatAlias(pair.first, pair.second)
        }
    }

    private fun prepareIsInsideKeycodesBlock(line: String) {
        // the start of a keyboard layout - like: """xkb_symbols "basic" {"""
        if (getXkbKeycodesSectionName(line) == AppConfiguration.x11AliasesMapping) {
//        l("getXkbSymbolsSectionName: $targetMapping")
            isInsideKeycodesBlock = true
        } else if (isInsideKeycodesBlock && line.isLayoutEndingBlock()) { // end of a keyboard layout - like: """};"""
            l("isInsideKeycodesBlock: isLayoutEndingBlock")
            isInsideKeycodesBlock = false
        }
    }

    private fun parseAliasLine(line: String): Pair<String, String>? {
        val regex = Regex.FOR_ALIASES_FILE.toRegex()
        val matchResult = regex.find(line)
        return matchResult?.let {
            val (alias, keycode) = it.destructured
            alias to keycode
        }
    }
}