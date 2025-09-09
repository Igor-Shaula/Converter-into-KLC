package org.igor_shaula.logic

import org.igor_shaula.globals.X11
import org.igor_shaula.logic.io.ArgumentsProcessor
import org.igor_shaula.logic.io.FileProcessor
import org.igor_shaula.logic.mapping.X11EssenceMapping
import org.igor_shaula.logic.mapping.X11LatAliasesMapping
import org.igor_shaula.logic.mapping.X11SymbolsMapping

fun main(args: Array<String>) {

    ArgumentsProcessor.processArguments(args) // must be called first

    // 0 - preparing the application
    val repository = Repository() // the only data container for the whole application

    // 1 - filling x11SymbolsDictionary
    X11SymbolsMapping().prepare(repository)

    if (ArgumentsProcessor.x11TargetLayoutName != X11.DEFAULT_XKB_LAYOUT) {
        repository.prepareSymbolsDictionary()
        X11LatAliasesMapping().prepare(repository) // by default, "qwerty" is used for mapping
    }

    // 2 - filling x11Essence
    X11EssenceMapping().prepare(repository)

    // 3 - filling windowsEssence
    repository.prepareWindowsEssence()

    // 4 - creating the resulting .klc file
    FileProcessor().composeKlcFile(repository)
}
