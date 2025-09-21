package org.igor_shaula.logic

import org.igor_shaula.logic.io.AppConfiguration
import org.igor_shaula.logic.io.FileProcessor
import org.igor_shaula.logic.mapping.*

fun main(args: Array<String>) {

    // 0 - preparing the application: configuration from args, and the data containers:
    AppConfiguration.processArguments(args) // must be called first
    val repository = Repository() // the only data container for the whole application

    // 1 - filling x11SymbolsMap
    X11SymbolsMapping.prepare(repository)

    // 2 - normalizing the x11SymbolsMap to the Unicode symbols
    X11UnicodeMapping.prepare(repository)

    // 3 - filling x11LatAliasesMap
    X11LatAliasesMapping.prepare(repository)

    // 4 - filling x11Essence
    X11EssenceMapping.prepare(repository)

    // 5 - filling windowsEssence
    WindowsEssenceMapping.prepare(repository)

    // 6 - creating the resulting .klc file
    FileProcessor.composeKlcFile(repository)
}
