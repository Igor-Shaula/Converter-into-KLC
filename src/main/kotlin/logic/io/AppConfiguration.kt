package org.igor_shaula.logic.io

import org.igor_shaula.BuildConfig
import org.igor_shaula.globals.Defaults
import org.igor_shaula.globals.Str
import org.igor_shaula.globals.Sym
import org.igor_shaula.globals.X11
import org.igor_shaula.logic.string_processing.*
import org.igor_shaula.utils.lForArgs
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
        lForArgs("received args: ${args?.joinToString(", ")}")
        args?.forEach { oneArg ->
//            lForArgs("processing argument: $oneArg")
            if (oneArg.isArgumentAnOption()) {
                lForArgs("option detected: $oneArg")
                processOption(oneArg.substring(1)) // remove the already recognized "-" prefix
            } else {
                lForArgs("${Str.WARNING} unknown argument: $oneArg")
                // I decided to just ignore the incorrect arguments if they are not recognized as options
            }
        }
    }

    private fun processOption(option: String) {
        when {
            option.isHelp() -> handleHelpOption()
            option.isVersion() -> handleVersionOption()
            option.isSilent() -> handleSilentOption()
            option.isFile() -> handleFileOption(option)
            option.isLayout() -> handleLayoutOption(option)
            option.isKlcLayoutName() -> handleKlcLayoutName()
            option.isKlcLayoutDescription() -> handleKlcLayoutDescription()
            option.isKlcResultFileName() -> handleKlcResultFileName()
            option.isKlcCopyright() -> handleKlcCopyright()
            option.isKlcCompany() -> handleKlcCompany()
            option.isKlcLocaleName() -> handleKlcLocaleName()
            option.isKlcLocaleId() -> handleKlcLocaleId()
            option.isKlcVersion() -> handleKlcVersion()
            option.isKlcLanguage() -> handleKlcLanguage()
            else -> lForArgs("${Str.WARNING} unknown option: $option")
        }
    }

    private fun handleHelpOption() {
        printHelp()
        exitProcess(0)
    }

    private fun handleVersionOption() {
        println("Version: ${BuildConfig.VERSION}")
        exitProcess(0)
    }

    private fun handleSilentOption() {
        isLoggingAllowed = false // enable silent mode, it's verbose by default
    }

    private fun handleFileOption(arg: String) {
        // todo add check for the filename correctness and throw an exception if it's not correct
        x11LayoutSourceFilename = X11.XKB_SYMBOLS_LOCATION + arg.substringAfter(Sym.EQUALS)
    }

    private fun handleLayoutOption(arg: String) {
        // todo add check for the layout name correctness and throw an exception if it's not correct
        x11TargetLayoutName = arg.substringAfter(Sym.EQUALS)
    }

    private fun handleKlcLayoutName() {}

    private fun handleKlcLayoutDescription() {}

    private fun handleKlcResultFileName() {}

    private fun handleKlcCopyright() {}

    private fun handleKlcCompany() {}

    private fun handleKlcLocaleName() {}

    private fun handleKlcLocaleId() {}

    private fun handleKlcVersion() {}

    private fun handleKlcLanguage() {}

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