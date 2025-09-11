package org.igor_shaula.logic.io

import org.igor_shaula.BuildConfig
import org.igor_shaula.globals.Defaults
import org.igor_shaula.globals.Sym
import org.igor_shaula.globals.X11
import org.igor_shaula.utils.l
import kotlin.system.exitProcess

/**
 * the purpose of this class is to process the command line arguments and set the app's configuration accordingly.
 */
object AppConfiguration {

    const val HELP = "h"
    const val VERSION = "v"
    const val SILENT = "s"
    const val FILE = "f"
    const val LAYOUT = "l"

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
                oneArg.isHelp() -> {
                    printHelp()
                    exitProcess(0)
                }
                oneArg.isVersion() -> {
                    println("Version: ${BuildConfig.VERSION}")
                    exitProcess(0)
                } // verbose mode
                oneArg.isSilent() -> isLoggingAllowed = false // enable silent mode, it's verbose by default
                oneArg.isFile() -> x11LayoutSourceFilename =
                    X11.XKB_SYMBOLS_LOCATION + oneArg.substringAfter(Sym.EQUALS) // the file with the x11 layout to be processed
                oneArg.isLayout() -> x11TargetLayoutName =
                    oneArg.substringAfter("=") // the target layout name - it should be one of the X11.layouts
                else -> l("Unknown argument: $oneArg")
            }
        }
        l("args: ${args?.joinToString(", ")}")
    }

    private fun String.isVersion() = substring(1) == VERSION

    private fun String.isSilent() = substring(1) == SILENT

    private fun String.isFile() = contains(FILE + Sym.EQUALS)

    private fun String.isLayout() = contains(LAYOUT + Sym.EQUALS)

    private fun String.isHelp() = substring(1) == HELP

    private fun printHelp() = println(
        """
        PARAMETERS:

        "h" - help: prints this help, as in other programs.
        "v" - version: as in other programs → SAMPLE: -v
        "s" - silent (logging): minimize text output as much as possible → SAMPLE: -s
        "f" with "=" - file (source with the language layout) → SAMPLE: -f=us or -f=ru
        "l" with "=" - layout (which one in the source file) → SAMPLE: -l=basic or -l=rus
        
        there will be more parameters available in the nearest future.
        """.trimIndent()
    )
}