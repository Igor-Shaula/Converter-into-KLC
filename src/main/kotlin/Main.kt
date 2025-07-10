package org.igor_shaula

import org.igor_shaula.globals.Data
import org.igor_shaula.globals.X11
import org.igor_shaula.logic.composeKlcFile
import org.igor_shaula.logic.prepareLatToKeyCodeDictionary
import org.igor_shaula.logic.prepareSymbolsDictionary
import org.igor_shaula.logic.prepareWindowsEssence
import org.igor_shaula.logic.prepareX11Essence
import org.igor_shaula.logic.prepareX11SymbolsDictionary

fun main(args: Array<String>) {

    // 1 - filling x11SymbolsDictionary
    prepareX11SymbolsDictionary()
    println("standard Linux symbols dictionary: ${Data.x11SymbolsDictionary}")

    prepareSymbolsDictionary()
    println("standard symbols dictionary: ${Data.symbolsDictionary}")

    // todo - later add processing of the arguments - in Linux style with one-symbol keys with dashes
    val x11LayoutSourceFilename = if (args.isEmpty()) {
        X11.US_FILE_LOCATION
    } else {
        args[0]
    }
//    val x11TargetLayoutName = X11.DEFAULT_XKB_LAYOUT
    val x11TargetLayoutName = X11.RUS_LAYOUT_NAME
    prepareLatToKeyCodeDictionary() // by default, "qwerty" is used for mapping

    // 2 - filling x11Essence
    prepareX11Essence(x11LayoutSourceFilename to x11TargetLayoutName)
    println("assembled x11Essence: ${Data.x11Essence}")

    // 3 - filling windowsEssence
    prepareWindowsEssence()
    println("assembled windowsEssence: ${Data.windowsEssence}")

    // 4 - creating the resulting .klc file
    composeKlcFile()
}
