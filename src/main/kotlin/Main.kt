package org.igor_shaula

import org.igor_shaula.logic.io.FileProcessor
import org.igor_shaula.logic.Repository
import org.igor_shaula.logic.mapping.X11EssenceMapping
import org.igor_shaula.logic.mapping.X11LatAliasesMapping
import org.igor_shaula.logic.mapping.X11SymbolsMapping
import org.igor_shaula.utils.l

fun main(args: Array<String>) {

    l("args: ${args.joinToString(", ")}")

    // 0 - preparing the application
    val repository = Repository() // the only data container for the whole application

    // 1 - filling x11SymbolsDictionary
    X11SymbolsMapping().prepare(repository)

    repository.prepareSymbolsDictionary()

    X11LatAliasesMapping().prepare(repository) // by default, "qwerty" is used for mapping

    // 2 - filling x11Essence
    X11EssenceMapping(args).prepare(repository)

    // 3 - filling windowsEssence
    repository.prepareWindowsEssence()

    // 4 - creating the resulting .klc file
    FileProcessor().composeKlcFile(repository)
}
