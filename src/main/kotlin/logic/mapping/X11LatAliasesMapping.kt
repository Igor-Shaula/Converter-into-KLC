package org.igor_shaula.logic.mapping

import org.igor_shaula.globals.Defaults
import org.igor_shaula.globals.Regex
import org.igor_shaula.globals.X11
import org.igor_shaula.logic.*
import org.igor_shaula.logic.io.FileProcessor
import org.igor_shaula.logic.string_processing.clearAllBlanks
import org.igor_shaula.logic.string_processing.getXkbKeycodesSectionName
import org.igor_shaula.logic.string_processing.isKeyStartingWithAlias
import org.igor_shaula.logic.string_processing.isLayoutEndingBlock
import org.igor_shaula.utils.l

internal class X11LatAliasesMapping(
    val filename: String = X11.ALIASES_FILE_LOCATION, val targetMapping: String? = null
) : IMapping {

    private var isInsideKeycodesBlock = false

    override fun prepare(repository: Repository) {
        if (!repository.isX11LatAliasMapEmpty()) return
        FileProcessor(filename).processFileLines { line ->
            processEveryAliasLine(
                repository = repository, line = line.clearAllBlanks(), targetMapping = targetMapping
            )
        }
        l("prepareLatToKeyCodeDictionary: x11LatAliasesDictionary = ${repository.printX11LatAliasesMap()}")
    }

    // 1: find the necessary mapping, if not given this parameter - use "default" one
    // 2: read all aliases from the target mapping - build the dictionary
    private fun processEveryAliasLine(
        repository: Repository, line: String, targetMapping: String? = Defaults.ALIASES_MAPPING
    ) {
        if (getXkbKeycodesSectionName(line) == targetMapping) { // the start of a keyboard layout - like: """xkb_symbols "basic" {"""
//        l("getXkbSymbolsSectionName: $targetMapping")
            isInsideKeycodesBlock = true
        } else if (isInsideKeycodesBlock && isLayoutEndingBlock(line)) { // end of a keyboard layout - like: """};"""
            l("isInsideKeycodesBlock: isLayoutEndingBlock")
            isInsideKeycodesBlock = false
        }
        if (!isInsideKeycodesBlock) return
        // now we're ready to finally fill the x11LatAliasesDictionary with real mappings
        if (isKeyStartingWithAlias(line)) {
            val pair = parseAliasLine(line)
            if (pair != null) repository.setX11LatAlias(pair.first, pair.second)
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