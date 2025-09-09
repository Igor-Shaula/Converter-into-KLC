package org.igor_shaula.logic

import org.igor_shaula.globals.*
import org.igor_shaula.utils.l

internal fun getUnicodeSymbolFromKeysym(keysym: String): Char? {
    try {
        val keySymValue = keysym.toInt(HEX_RADIX)
        // X11 Keysym to Unicode mapping for Cyrillic
        val unicodeValue = keysymToUnicodeMapping[keySymValue] ?: keySymValue
        // fallback for non-Cyrillic or direct Unicode values
        return unicodeValue.toChar()
    } catch (e: NumberFormatException) {
        l("Invalid input: '$keysym'. NumberFormatException: ${e.message}")
        return null
    }
}
