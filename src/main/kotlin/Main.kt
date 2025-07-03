package org.igor_shaula

import org.igor_shaula.globals.Data
import org.igor_shaula.globals.X11
import org.igor_shaula.logic.composeKlcFile
import org.igor_shaula.logic.prepareWindowsEssence
import org.igor_shaula.logic.prepareX11Essence
import org.igor_shaula.logic.prepareX11SymbolsDictionary

fun main(args: Array<String>) {

    // 1 - filling x11SymbolsDictionary
    prepareX11SymbolsDictionary()
    println("standard Linux symbols dictionary: ${Data.x11SymbolsDictionary}")

    // todo - later add processing of the arguments - in Linux style with one-symbol keys with dashes
    val x11LayoutSourceFilename = if (args.isEmpty()) {
        X11.LOCATION_OF_SYMBOLS_US_FILE
    } else {
        args[0]
    }
    // 2 - filling x11Essence
//    prepareX11Essence(Pair(x11LayoutSourceFilename, X11.DEFAULT_XKB_LAYOUT))
    prepareX11Essence(Pair(x11LayoutSourceFilename, "rus"))
    println("assembled x11Essence: ${Data.x11Essence}")

    // 3 - filling windowsEssence
    prepareWindowsEssence()
    println("assembled windowsEssence: ${Data.windowsEssence}")

    // 4 - creating the resulting .klc file
    composeKlcFile()
}
