package org.igor_shaula.logic.mapping

import org.igor_shaula.globals.Regex
import org.igor_shaula.logic.Repository
import org.igor_shaula.logic.io.AppConfiguration
import org.igor_shaula.logic.io.FileProcessor
import org.igor_shaula.logic.string_processing.getX11KeycodeBaseValue
import org.igor_shaula.logic.string_processing.isExtendedX11KeyCode
import org.igor_shaula.utils.l

/**
 * container of the logic to fill the x11SymbolsMap dictionary which will be used later in the flow.
 *
 * having in mind that Kotlin objects are created lazily,
 * and as AppConfiguration is by its contract accessed first - it will be ready by the time we reach this object.
 * so we can safely access the correct configuration values here.
 *
 * I also decided to have this as an object instead of a class as no more than one instance is currently needed.
 */
object X11SymbolsMapping : IMapping {

    override fun prepare(repository: Repository) {
        FileProcessor.processFileLines(AppConfiguration.X11_KEYSYM_FILE) { line ->
            val pair = parseKeySymDefinition(line)
            if (pair != null) repository.setX11Symbol(pair.first, pair.second)
        }
        l("prepare: ${repository.printX11SymbolsMap()}")
    }

    private fun parseKeySymDefinition(input: String): Pair<String, String>? {

        if (input.isBlank()) return null

        val regex = Regex.FOR_KEYSYMDEF_FILE.toRegex()

        val matchResult = regex.find(input)
        return matchResult?.let {
            var (name, code) = it.destructured
            if (code.isExtendedX11KeyCode()) code = code.getX11KeycodeBaseValue()
            name to code
        }
    }
}