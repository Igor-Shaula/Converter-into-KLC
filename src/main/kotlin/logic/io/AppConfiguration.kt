package org.igor_shaula.logic.io

import org.igor_shaula.globals.Defaults
import org.igor_shaula.globals.Sym
import org.igor_shaula.globals.X11
import org.igor_shaula.utils.l

/**
 * the purpose of this class is to process the command line arguments and set the app's configuration accordingly.
 */
object AppConfiguration {

    const val VERBOSE = "v"
    const val SILENT = "s"
    const val FILE = "f"
    const val LAYOUT = "l"
    const val HELP = "h"

    var isLoggingAllowed = true
        private set

    var x11LayoutSourceFilename = Defaults.TARGET_FILE_NAME
        private set

    var x11TargetLayoutName = Defaults.TARGET_LAYOUT_NAME
        private set

    // this function is intended to be invoked first - right after the program starts
    fun processArguments(args: Array<String>?) {
        args?.forEach { oneArg ->
            l("arg: $oneArg")
            if (oneArg.startsWith(Sym.DASH)) when {
                oneArg.isVerbose() -> isLoggingAllowed = true // verbose mode
                oneArg.isSilent() -> isLoggingAllowed = false // silent mode
                oneArg.isFile() -> x11LayoutSourceFilename =
                    X11.XKB_SYMBOLS_LOCATION + oneArg.substringAfter(Sym.EQUALS) // the file with the x11 layout to be processed
                oneArg.isLayout() -> x11TargetLayoutName =
                    oneArg.substringAfter("=") // the target layout name - it should be one of the X11.layouts
                else -> l("Unknown argument: $oneArg")
            }
        }
        l("args: ${args?.joinToString(", ")}")
    }

    private fun String.isVerbose() = substring(1) == VERBOSE

    private fun String.isSilent() = substring(1) == SILENT

    private fun String.isFile() = contains(FILE + Sym.EQUALS)

    private fun String.isLayout() = contains(LAYOUT + Sym.EQUALS)

    private fun String.isHelp() = substring(1) == HELP
}