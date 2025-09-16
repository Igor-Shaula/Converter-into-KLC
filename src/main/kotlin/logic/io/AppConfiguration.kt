package org.igor_shaula.logic.io

import org.igor_shaula.BuildConfig
import org.igor_shaula.globals.Options
import org.igor_shaula.globals.Defaults
import org.igor_shaula.globals.Sym
import org.igor_shaula.globals.X11
import org.igor_shaula.utils.l
import kotlin.system.exitProcess

/**
 * the purpose of this class is to process the command line arguments and set the app's configuration accordingly.
 */
object AppConfiguration {

    var isLoggingAllowed = true
        private set

    var x11LayoutSourceFilename = Defaults.TARGET_FILE_NAME
        private set

    var x11TargetLayoutName = Defaults.TARGET_LAYOUT_NAME
        private set

    // this function MUST BE INVOKED FIRST - right after the program starts
    fun processArguments(args: Array<String>?) {
        args?.forEach { oneArg ->
            l("received argument: $oneArg")
            if (oneArg.startsWith(Sym.DASH)) when {
                oneArg.isHelp() -> handleHelpOption()
                oneArg.isVersion() -> handleVersionOption()
                oneArg.isSilent() -> handleSilentOption()
                oneArg.isFile() -> handleFileOption(oneArg)
                oneArg.isLayout() -> handleLayoutOption(oneArg)
                else -> l("Unknown argument: $oneArg")
            }
        }
        l("args: ${args?.joinToString(", ")}")
    }

    private fun String.isHelp() = substring(1) == Options.HELP

    private fun handleHelpOption() {
        printHelp()
        exitProcess(0)
    }

    private fun String.isVersion() = substring(1) == Options.VERSION

    private fun handleVersionOption() {
        println("Version: ${BuildConfig.VERSION}")
        exitProcess(0)
    }

    private fun String.isSilent() = substring(1) == Options.SILENT

    private fun handleSilentOption() {
        isLoggingAllowed = false // enable silent mode, it's verbose by default
    }

    private fun String.isFile() = contains(Options.FILE + Sym.EQUALS)

    private fun handleFileOption(arg: String) {
        x11LayoutSourceFilename = X11.XKB_SYMBOLS_LOCATION + arg.substringAfter(Sym.EQUALS)
    }

    private fun String.isLayout() = contains(Options.LAYOUT + Sym.EQUALS)

    private fun handleLayoutOption(arg: String) {
        x11TargetLayoutName = arg.substringAfter(Sym.EQUALS)
    }

    private fun printHelp() = println(
        """
        OPTIONS:

        "h" - help: prints this help, as in other programs.
        "v" - version: as in other programs → SAMPLE: -v
        "s" - silent (logging): minimize text output as much as possible → SAMPLE: -s
        "f" with "=" - file (source with the language layout) → SAMPLE: -f=us or -f=ru
        "l" with "=" - layout (which one in the source file) → SAMPLE: -l=basic or -l=rus
        
        there will be more app launch options available in the nearest future.
        """.trimIndent()
    )
}