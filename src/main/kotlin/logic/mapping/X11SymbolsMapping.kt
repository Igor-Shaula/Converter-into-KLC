package org.igor_shaula.logic.mapping

import org.igor_shaula.globals.Error
import org.igor_shaula.globals.Regex
import org.igor_shaula.globals.Str
import org.igor_shaula.globals.X11
import org.igor_shaula.logic.Repository
import org.igor_shaula.utils.l
import java.io.File

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
            throw Error.WithFile(filename, e.message ?: Str.EMPTY)
        }
        l("standard Linux symbols dictionary: ${repository.x11SymbolsDictionary}")
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