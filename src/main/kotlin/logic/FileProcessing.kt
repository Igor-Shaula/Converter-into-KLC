package org.igor_shaula.logic

import org.igor_shaula.globals.*
import org.igor_shaula.globals.X11
import org.igor_shaula.logic.models.Error
import org.igor_shaula.logic.models.adaptForWindows
import org.igor_shaula.utils.l
import java.io.File

// I intend to restrict "java.io.File" usage only in this class
internal class FileProcessor(val filename: String = X11.US_FILE_LOCATION) {

    /**
     * Processes a file line by line using the provided processing function.
     * This centralizes file I/O operations and eliminates the need for
     * java.io.File imports in other classes.
     */
    internal fun processFileLines(action: (String) -> Unit) {
        try {
            File(filename).useLines { lines ->
                lines.forEach(action)
            }
        } catch (e: Exception) {
            throw Error.WithFile(filename, e.message ?: Str.EMPTY)
        }
    }

    internal fun composeKlcFile(repository: Repository) {
        val resultFile = File(Klc.DEFAULT_RESULT_FILE_NAME)
        resultFile.writeText(KLC_FILE_PREFIX.replace(Str.LF, Str.CR_LF), charset = Charsets.UTF_16)
        repository.performWithWindowsEssence { key, value ->
            val scValue = key?.lowercase()
            val vkValue = getVkValueByScValue(repository, scValue) ?: (value.layer1.uppercase() + Str.TAB)
            val capitalized = getCapitalizedValue(value.layer1)
            val (layer1, layer2, layer3, layer4) = value.adaptForWindows()
            resultFile.appendText(
                "$scValue${Str.TAB}$vkValue${Str.TAB}$capitalized${Str.TAB}$layer1${Str.TAB}$layer2${Str.TAB}${Klc.ABSENT_SYMBOL_VALUE}${Str.TAB}$layer3${Str.TAB}$layer4${Str.CR_LF}",
                charset = Charsets.UTF_16
            )
        }
        resultFile.appendText(KLC_FILE_SUFFIX.replace(Str.LF, Str.CR_LF), charset = Charsets.UTF_16)
        l("resultFile: $resultFile")
    }

    private fun getVkValueByScValue(repository: Repository, scValue: String?) =
        skValueToScValueMap[scValue] ?: repository.getX11Symbol(scValue)?.uppercase()
}