package org.igor_shaula

import org.igor_shaula.globals.Repository
import org.igor_shaula.globals.X11
import org.igor_shaula.logic.*

fun main(args: Array<String>) {

    val repository = Repository()

    // 1 - filling x11SymbolsDictionary
    X11SymbolsMapping().prepare(repository)
    println("standard Linux symbols dictionary: ${repository.x11SymbolsDictionary}")

    prepareSymbolsDictionary(repository)
    println("standard symbols dictionary: ${repository.symbolsDictionary}")

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
    prepareX11Essence(repository, x11LayoutSourceFilename to x11TargetLayoutName)
    println("assembled x11Essence: ${repository.x11Essence}")

    // 3 - filling windowsEssence
    prepareWindowsEssence(repository)
    println("assembled windowsEssence: ${repository.windowsEssence}")

    // 4 - creating the resulting .klc file
    composeKlcFile(repository)
}
