package org.igor_shaula.logic.string_processing

import org.igor_shaula.globals.*
import org.igor_shaula.logic.Repository

private val whitespacesRegex = Regex.WHITESPACES.toRegex()
private val xkbSymbolsRegex = Regex.XKB_SYMBOLS_FINDING_PATTERN.toRegex()
private val xkbKeycodesRegex = Regex.XKB_KEYCODES_FINDING_PATTERN.toRegex()

// removes all whitespace in the given line
internal fun String.clearAllBlanks() = replace(whitespacesRegex, Str.EMPTY)

// extracts the section name:
internal fun getXkbSymbolsSectionName(line: String): String? = xkbSymbolsRegex.find(line)?.groupValues?.get(1)

internal fun getXkbKeycodesSectionName(line: String): String? = xkbKeycodesRegex.find(line)?.groupValues?.get(1)

internal fun getCapitalizedValue(base: String) = if (base.length == 1 && base.first().isLetter()) 1 else 0

internal fun String.mapToKeysym(repository: Repository): String = when {
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

internal fun String.filterCommands() =
    if (this.lowercase().startsWith(Sym.BEGINNING_OF_COMMAND_SYMBOL)) Str.EMPTY else this

internal fun String.filterMissingKeysyms() = if (this == X11.NOSYMBOL.lowercase() || is0x100KeysymCode(this)) {
    Str.EMPTY
} else this

private fun is0x100KeysymCode(s: String) =
    s.startsWith(X11.EXTENDED_CODE_PREFIX_HEX) && s.length > X11.UNICODE_VALUE_LENGTH

internal fun String.getKeyNameStartingWithA() =
    substring(X11.KEY_A_BEGINNING.length - 1, X11.KEY_A_BEGINNING.length + 3) // 4 in total

internal fun String.getKeyNameStartingWithLat() =
    substring(X11.KEY_LAT_BEGINNING.length - 3, X11.KEY_LAT_BEGINNING.length + 1) // 4 in total