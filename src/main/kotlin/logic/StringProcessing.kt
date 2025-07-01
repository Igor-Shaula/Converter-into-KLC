package org.igor_shaula.logic

import org.igor_shaula.globals.*

private val whitespacesRegex = REGEX_WHITESPACES.toRegex()
private val xkbSymbolsRegex = X11_REGEX_XKB_SYMBOLS_FINDING_PATTERN.toRegex()
private val xkbKeycodesRegex = X11_REGEX_XKB_KEYCODES_FINDING_PATTERN.toRegex()

// removes all whitespace in the given line
internal fun String.clearAllBlanks() = replace(whitespacesRegex, EMPTY_STRING)

// extracts the section name:
internal fun getXkbSymbolsSectionName(line: String): String? = xkbSymbolsRegex.find(line)?.groupValues?.get(1)

internal fun getXkbKeycodesSectionName(line: String): String? = xkbKeycodesRegex.find(line)?.groupValues?.get(1)

internal fun getCapitalizedValue(base: String) = if (base.length == 1 && base.first().isLetter()) 1 else 0

internal fun String.mapToKeysym(): String = when {
    this.isBlank() -> EMPTY_STRING // should not ever happen
    this.length == 1 -> this // must be located before the next case with starting-with-U
    this.startsWith(BEGINNING_OF_UNICODE_NUMBER) && this.length == X11_UNICODE_NUMBER_LENGTH
        -> this.substring(1).lowercase() // because the length of the char U is "1"
//    this.startsWith('f') && this.length == 4 -> EMPTY_STRING // special case of using commands in KB layouts only in Linux
    else -> x11SymbolsDictionary[this]?.lowercase() ?: this.lowercase().filterMissingKeysyms()
}

internal fun String.filterCommands() =
    if (this.lowercase().startsWith(BEGINNING_OF_COMMAND_SYMBOL)) EMPTY_STRING else this

internal fun String.filterMissingKeysyms() =
    if (this == X11_NOSYMBOL.lowercase() || this.startsWith(X11_EXTENDED_CODE_PREFIX_HEX) && this.length > UNICODE_NUMBER_LENGTH)
        EMPTY_STRING else this

internal fun String.getKeyNameStartingWithA() =
    substring(X11_KEY_A_BEGINNING.length - 1, X11_KEY_A_BEGINNING.length + 3) // 4 in total