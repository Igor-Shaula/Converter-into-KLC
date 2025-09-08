package org.igor_shaula

import org.igor_shaula.globals.X11
import org.igor_shaula.logic.*
import org.igor_shaula.logic.mapping.X11EssenceMapping
import org.igor_shaula.logic.mapping.X11LatAliasesMapping
import org.igor_shaula.logic.mapping.X11SymbolsMapping

fun main(args: Array<String>) {

    // the only data container for the whole application
    val repository = Repository()

    // 1 - filling x11SymbolsDictionary
    X11SymbolsMapping().prepare(repository)

    repository.prepareSymbolsDictionary()

    // todo - later add processing of the arguments - in Linux style with one-symbol keys with dashes
    val x11LayoutSourceFilename = if (args.isEmpty()) {
        X11.US_FILE_LOCATION
    } else {
        args[0]
    }
//    val x11TargetLayoutName = X11.DEFAULT_XKB_LAYOUT
    val x11TargetLayoutName = X11.RUS_LAYOUT_NAME
    X11LatAliasesMapping().prepare(repository) // by default, "qwerty" is used for mapping

    // 2 - filling x11Essence
    X11EssenceMapping(x11LayoutSourceFilename to x11TargetLayoutName).prepare(repository)

    // 3 - filling windowsEssence
    repository.prepareWindowsEssence()

    // 4 - creating the resulting .klc file
    composeKlcFile(repository)
}
