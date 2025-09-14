package org.igor_shaula.logic

import org.igor_shaula.globals.Defaults
import org.igor_shaula.logic.io.AppConfiguration
import org.igor_shaula.logic.io.FileProcessor
import org.igor_shaula.logic.mapping.X11EssenceMapping
import org.igor_shaula.logic.mapping.X11LatAliasesMapping
import org.igor_shaula.logic.mapping.X11SymbolsMapping

fun main(args: Array<String>) {

    // 0 - preparing the application: configuration from args, and the data containers:
    AppConfiguration.processArguments(args) // must be called first
    val repository = Repository() // the only data container for the whole application

    // 1 - filling x11SymbolsDictionary
    X11SymbolsMapping().prepare(repository)

    // 2 - normalizing the x11SymbolsDictionary to the Unicode symbols
    repository.prepareUnicodeValuesMap()

    if (AppConfiguration.x11TargetLayoutName != Defaults.TARGET_LAYOUT_NAME) {
        X11LatAliasesMapping().prepare(repository) // by default, "qwerty" is used for mapping
    }

    // 3 - filling x11Essence
    X11EssenceMapping().prepare(repository)

    // 4 - filling windowsEssence
    repository.prepareWindowsEssence()

    // 5 - creating the resulting .klc file
    FileProcessor().composeKlcFile(repository)
}
