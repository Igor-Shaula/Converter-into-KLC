package org.igor_shaula.logic.mapping

import org.igor_shaula.globals.Regex
import org.igor_shaula.globals.X11
import org.igor_shaula.logic.FileProcessor
import org.igor_shaula.logic.Repository
import org.igor_shaula.utils.l

internal class X11SymbolsMapping(val filename: String = X11.KEYSYMDEF_FILE_LOCATION) : IMapping {

    override fun prepare(repository: Repository) {
        FileProcessor(filename).processFileLines { line ->
            val pair = parseKeySymDefinition(line)
            if (pair != null) repository.setX11Symbol(pair.first, pair.second)
        }
        l("standard Linux symbols dictionary: ${repository.printX11SymbolsDictionary()}")
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