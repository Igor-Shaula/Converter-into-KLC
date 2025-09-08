package org.igor_shaula.logic.mapping

import org.igor_shaula.globals.Error
import org.igor_shaula.globals.Str
import org.igor_shaula.globals.X11
import org.igor_shaula.logic.Repository
import org.igor_shaula.logic.clearAllBlanks
import org.igor_shaula.logic.getXkbKeycodesSectionName
import org.igor_shaula.logic.isKeyStartingWithAlias
import org.igor_shaula.logic.isLayoutEndingBlock
import org.igor_shaula.logic.parseAliasLine
import org.igor_shaula.utils.l
import java.io.File

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
            throw Error.WithFile(filename, e.message ?: Str.EMPTY)
        }
        l("prepareLatToKeyCodeDictionary: x11LatAliasesDictionary: ${repository.x11LatAliasesDictionary}")
    }

    private fun processEveryAliasLine(
        repository: Repository, line: String, targetMapping: String? = X11.DEFAULT_ALIAS_MAPPING
    ) {
        if (getXkbKeycodesSectionName(line) == targetMapping) { // the start of a keyboard layout - like: """xkb_symbols "basic" {"""
//        l("getXkbSymbolsSectionName: $targetMapping")
            repository.isInsideKeycodesBlock = true
        } else if (repository.isInsideKeycodesBlock && isLayoutEndingBlock(line)) { // end of a keyboard layout - like: """};"""
            l("isInsideKeycodesBlock: isLayoutEndingBlock")
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