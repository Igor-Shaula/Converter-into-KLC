package org.igor_shaula.logic.io

import org.igor_shaula.globals.X11
import org.igor_shaula.utils.l

/**
 * the purpose of this class is to process the command line arguments and set the app's configuration accordingly.
 */
object AppConfiguration {

    var isLoggingAllowed = true
        private set

    var x11LayoutSourceFilename = X11.US_FILE_LOCATION
        private set

    var x11TargetLayoutName = X11.DEFAULT_XKB_LAYOUT
        private set

    // this function is intended to be invoked first - right after the program starts
    fun processArguments(args: Array<String>?) {
        args?.forEach { oneArg ->
            l("arg: $oneArg")
            if (oneArg.startsWith("-")) when {
                oneArg.substring(1) == "v" -> isLoggingAllowed = true // verbose mode
                oneArg.substring(1) == "s" -> isLoggingAllowed = false // silent mode
                oneArg.contains("f=") -> x11LayoutSourceFilename =
                    X11.XKB_SYMBOLS_LOCATION + oneArg.substringAfter("=") // the file with the x11 layout to be processed
                oneArg.contains("l=") -> x11TargetLayoutName =
                    oneArg.substringAfter("=") // the target layout name - it should be one of the X11.layouts
                else -> l("Unknown argument: $oneArg")
            }
        }
        l("args: ${args?.joinToString(", ")}")
    }
}