package org.igor_shaula

import org.igor_shaula.globals.X11_DEFAULT_XKB_LAYOUT
import org.igor_shaula.globals.X11_LOCATION_OF_SYMBOLS_US_FILE
import org.igor_shaula.globals.windowsEssence
import org.igor_shaula.globals.x11Essence
import org.igor_shaula.globals.x11SymbolsDictionary
import org.igor_shaula.logic.composeKlcFile
import org.igor_shaula.logic.prepareWindowsEssence
import org.igor_shaula.logic.prepareX11Essence
import org.igor_shaula.logic.prepareX11SymbolsDictionary

fun main(args: Array<String>) {

    // 1 - filling x11SymbolsDictionary
    prepareX11SymbolsDictionary()
    println("standard Linux symbols dictionary: $x11SymbolsDictionary")

    // todo - later add processing of the arguments - in Linux style with one-symbol keys with dashes
    val x11LayoutSourceFilename = if (args.isEmpty()) {
        X11_LOCATION_OF_SYMBOLS_US_FILE
    } else {
        args[0]
    }
    // 2 - filling x11Essence
    prepareX11Essence(Pair(x11LayoutSourceFilename, X11_DEFAULT_XKB_LAYOUT))
//    prepareX11Essence(Pair(x11LayoutSourceFilename, "rus"))
    println("assembled x11Essence: $x11Essence")

    // 3 - filling windowsEssence
    prepareWindowsEssence()
    println("assembled windowsEssence: $windowsEssence")

    // 4 - creating the resulting .klc file
    composeKlcFile()
}
