package org.igor_shaula.logic.string_processing

import org.igor_shaula.globals.*

internal fun isEnglishUSNameGroup1(normalizedLine: String) =
    normalizedLine == X11.NAME_GROUP_1 + Sym.EQUALS + Sym.DOUBLE_QUOTE + X11.ENGLISH_US + Sym.DOUBLE_QUOTE + Sym.SEMICOLON

internal fun isKeyTilde(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, X11.KEY_TILDE + X11.OPENING_BRACKETS)

internal fun isKeySpace(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, X11.KEY_SPACE + X11.OPENING_BRACKETS)

internal fun isKeyStartingWithA(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, X11.KEY_A_BEGINNING)

internal fun isKeyStartingWithLat(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, X11.KEY_LAT_BEGINNING)

private fun lineContainsTheKeyAndEndsCorrectly(normalizedLine: String, key: String) =
    normalizedLine.startsWith(key) && normalizedLine.contains(X11.CLOSING_BRACKETS + Sym.SEMICOLON)

internal fun isKeyStartingWithAlias(normalizedLine: String) =
    normalizedLine.startsWith(X11.ALIAS) && normalizedLine.contains(X11.KEYCODES_ENDING_BLOCK)

internal fun String.isUnicodeNumber() =
    this.startsWith(Sym.BEGINNING_OF_UNICODE_NUMBER) && this.length == X11.UNICODE_FULL_LENGTH

internal fun isXkbSymbolsSection(line: String): Boolean {
    val pattern = Regex.XKB_SYMBOLS_FINDING_PATTERN.toRegex()
    return pattern.matches(line)
}

internal fun isLayoutEndingBlock(line: String) = line.startsWith(X11.LAYOUT_ENDING_BLOCK)

internal fun isBeginningInclude(line: String): Boolean = line.clearAllBlanks().startsWith(X11.INCLUDE)

internal fun String.isArgumentAnOption() = this.startsWith(Sym.DASH)

internal fun String.isHelp() = this == Options.HELP

internal fun String.isVersion() = this == Options.VERSION

internal fun String.isSilent() = this == Options.SILENT

internal fun String.isFile() = contains(Options.FILE + Sym.EQUALS)

internal fun String.isLayout() = contains(Options.LAYOUT + Sym.EQUALS)

internal fun String.isKlcResultFileName() = this.startsWith(Options.KLC_RESULT_FILE_NAME + Sym.EQUALS)

internal fun String.isKlcKbdName8() = this.startsWith(Options.KLC_KBD_NAME_8 + Sym.EQUALS)

internal fun String.isKlcKbdNameLong() = this.startsWith(Options.KLC_KBD_NAME_LONG + Sym.EQUALS)

internal fun String.isKlcCopyright() = this.startsWith(Options.KLC_COPYRIGHT + Sym.EQUALS)

internal fun String.isKlcCompany() = this.startsWith(Options.KLC_COMPANY + Sym.EQUALS)

internal fun String.isKlcLocaleName() = this.startsWith(Options.KLC_LOCALE_NAME + Sym.EQUALS)

internal fun String.isKlcLocaleId() = this.startsWith(Options.KLC_LOCALE_ID + Sym.EQUALS)

internal fun String.isKlcVersion() = this.startsWith(Options.KLC_VERSION + Sym.EQUALS)

internal fun String.isKlcLanguage() = this.startsWith(Options.KLC_LANGUAGE + Sym.EQUALS)