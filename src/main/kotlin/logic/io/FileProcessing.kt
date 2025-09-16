package org.igor_shaula.logic.io

import org.igor_shaula.globals.Defaults
import org.igor_shaula.globals.Str
import org.igor_shaula.globals.dictionaries.scValueToVkValueMap
import org.igor_shaula.logic.Repository
import org.igor_shaula.logic.models.Error
import org.igor_shaula.logic.models.ValuesForLayers
import org.igor_shaula.logic.models.adaptForWindows
import org.igor_shaula.logic.string_processing.getCapitalizedValue
import org.igor_shaula.utils.l
import java.io.File

// I intend to restrict "java.io.File" usage only in this class
internal class FileProcessor() {

    /**
     * Processes a file line by line using the provided processing function.
     * This centralizes file I/O operations and eliminates the need for
     * java.io.File imports in other classes.
     */
    internal fun processFileLines(filename: String, action: (String) -> Unit) {
        try {
            File(filename).useLines { lines ->
                lines.forEach(action)
            }
        } catch (e: Exception) {
            throw Error.WithFile(filename, e.message ?: Str.EMPTY)
        }
    }

    internal fun composeKlcFile(repository: Repository) {
        val resultFile = File(Defaults.KLC_RESULT_FILE_NAME)
        val klcFilePrefix = createKlcFilePrefix()
        resultFile.writeText(klcFilePrefix.replace(Str.LF, Str.CR_LF), charset = Charsets.UTF_16)
        repository.performWithWindowsEssence { key, valuesForWindows ->
//            l("key: $key, valuesForWindows: $valuesForWindows")
            val scValue = key?.lowercase()
            val vkValue = scValueToVkValueMap[scValue]
            val capitalized = getCapitalizedValue(valuesForWindows.valuesForLayers.layer1)
            val valuesForWindowsLayers = valuesForWindows.valuesForLayers.adaptForWindows()
            resultFile.appendText(
                text = createKlcTable(scValue, vkValue, capitalized, valuesForWindowsLayers), charset = Charsets.UTF_16
            )
        }
        val klcFileSuffix = createKlcFileSuffix()
        resultFile.appendText(klcFileSuffix.replace(Str.LF, Str.CR_LF), charset = Charsets.UTF_16)
        l("resultFile: $resultFile")
    }

    private fun createKlcTable(scValue: String?, vkValue: String?, capitalized: Int, values: ValuesForLayers) =
        "$scValue${Str.TAB}$vkValue${Str.TAB}$capitalized${Str.TAB}${values.layer1}${Str.TAB}${values.layer2}${Str.TAB}${Defaults.KLC_ABSENT_SYMBOL_VALUE}${Str.TAB}${values.layer3}${Str.TAB}${values.layer4}${Str.CR_LF}"
}