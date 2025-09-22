package org.igor_shaula.logic.string_processing

import org.igor_shaula.globals.*
import org.igor_shaula.logic.Repository

private val whitespacesRegex = Regex.WHITESPACES.toRegex()
private val xkbSymbolsRegex = Regex.XKB_SYMBOLS_FINDING_PATTERN.toRegex()
private val xkbKeycodesRegex = Regex.XKB_KEYCODES_FINDING_PATTERN.toRegex()

/**
 * removes all whitespaces - not only spaces but many more - from the given string
 */
fun String.clearAllBlanks() = replace(whitespacesRegex, Str.EMPTY)

/**
 * extraction of section names from XKB symbols lines
 */
fun getXkbSymbolsSectionName(line: String): String? = xkbSymbolsRegex.find(line)?.groupValues?.get(1)

/**
 * extraction of section names from XKB keycodes lines
 */
fun getXkbKeycodesSectionName(line: String): String? = xkbKeycodesRegex.find(line)?.groupValues?.get(1)

/**
 * returns 1 if the given string is a single capitalized letter, 0 otherwise
 */
fun getCapitalizedValue(base: String) = if (base.length == 1 && base.first().isLetter()) 1 else 0

/**
 * complex mapping logic for converting strings to keysym format
 */
fun String.mapToKeysym(repository: Repository): String = when {
    this.isBlank() -> Str.EMPTY // should not ever happen
    this.length == 1 -> this // must be located before the next case with starting-with-U
    this.isUnicodeNumber() -> this.substring(1).lowercase() // because the length of the char U is "1"
//    this.startsWith('f') && this.length == 4 -> EMPTY_STRING // special case of using commands in KB layouts only in Linux
    else -> {
        val unicodeValue = repository.getUnicodeValue(this)
        unicodeValue?.lowercase() ?: this.lowercase().filterMissingKeysyms()
//        val unicodeSymbol = repository.getUnicodeSymbol(this)
//        val unicodeSymbol: Char = Char((unicodeValue ?: "").toInt(HEX_RADIX)) // ?:"" is just to make the compiler happy
//        l("other: $other\t\t:unicodeSymbol: $unicodeSymbol")
//        unicodeSymbol.toString()
    }
}

/**
 * removes the beginning of the string if it starts with a command symbol which is 'f' in X11
 */
fun String.filterCommands() = if (this.lowercase().startsWith(Sym.BEGINNING_OF_COMMAND_SYMBOL)) Str.EMPTY else this

/**
 * removes the beginning of the string if it starts with a '0x100' prefix
 */
fun String.filterMissingKeysyms() = if (this == X11.NOSYMBOL.lowercase() || is0x100KeysymCode(this)) {
    Str.EMPTY
} else this

/**
 * checks if the given string is an extended X11 code like '0x1002800'
 */
private fun is0x100KeysymCode(s: String) =
    s.startsWith(X11.EXTENDED_CODE_PREFIX_HEX) && s.length > X11.UNICODE_VALUE_LENGTH

/**
 * returns the base value of the X11 keycode, like '0x28' from '0x1002800'
 */
fun String.getX11KeycodeBaseValue() = this.substring(X11.EXTENDED_CODE_PREFIX.length)

/**
 * extraction of key names from A-type key definitions
 */
fun String.getKeyNameStartingWithA() =
    substring(X11.KEY_A_BEGINNING.length - 1, X11.KEY_A_BEGINNING.length + 3) // 4 in total

/**
 * extraction of key names from Lat-type key definitions
 */
fun String.getKeyNameStartingWithLat() =
    substring(X11.KEY_LAT_BEGINNING.length - 3, X11.KEY_LAT_BEGINNING.length + 1) // 4 in total