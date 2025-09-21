package org.igor_shaula.logic.string_processing

import org.igor_shaula.globals.*

internal fun String.isEnglishUSNameGroup1() =
    this == X11.NAME_GROUP_1 + Sym.EQUALS + Sym.DOUBLE_QUOTE + X11.ENGLISH_US + Sym.DOUBLE_QUOTE + Sym.SEMICOLON

internal fun String.isKeyTilde() = lineContainsTheKeyAndEndsCorrectly(X11.KEY_TILDE + X11.OPENING_BRACKETS)

internal fun String.isKeySpace() = lineContainsTheKeyAndEndsCorrectly(X11.KEY_SPACE + X11.OPENING_BRACKETS)

internal fun String.isKeyStartingWithA() = lineContainsTheKeyAndEndsCorrectly(X11.KEY_A_BEGINNING)

internal fun String.isKeyStartingWithLat() = lineContainsTheKeyAndEndsCorrectly(X11.KEY_LAT_BEGINNING)

private fun String.lineContainsTheKeyAndEndsCorrectly(key: String) =
    this.startsWith(key) && this.contains(X11.CLOSING_BRACKETS + Sym.SEMICOLON)

internal fun String.isKeyStartingWithAlias() = this.startsWith(X11.ALIAS) && this.contains(X11.KEYCODES_ENDING_BLOCK)

internal fun String.isUnicodeNumber() =
    this.startsWith(Sym.BEGINNING_OF_UNICODE_NUMBER) && this.length == X11.UNICODE_FULL_LENGTH

internal fun String.isXkbSymbolsSection(): Boolean {
    val pattern = Regex.XKB_SYMBOLS_FINDING_PATTERN.toRegex()
    return pattern.matches(this)
}

internal fun String.isLayoutEndingBlock() = this.startsWith(X11.LAYOUT_ENDING_BLOCK)

internal fun String.isBeginningInclude() = this.clearAllBlanks().startsWith(X11.INCLUDE)

internal fun String.isExtendedX11KeyCode() = this.startsWith(X11.EXTENDED_CODE_PREFIX)

internal fun String.isArgumentAnOption() = this.startsWith(Sym.DASH)

internal fun String.isHelp() = this == Options.HELP

internal fun String.isVersion() = this == Options.VERSION

internal fun String.isSilent() = this == Options.SILENT

internal fun String.isFile() = this.startsWith(Options.SOURCE_X11_FILE + Sym.EQUALS)

internal fun String.isLayout() = this.startsWith(Options.SOURCE_X11_LAYOUT + Sym.EQUALS)

internal fun String.isKlcResultFileName() = this.startsWith(Options.RESULT_KLC_FILE + Sym.EQUALS)

internal fun String.isKlcKbdName8() = this.startsWith(Options.KLC_KBD_NAME_8 + Sym.EQUALS)

internal fun String.isKlcKbdNameLong() = this.startsWith(Options.KLC_KBD_NAME_LONG + Sym.EQUALS)

internal fun String.isKlcCopyright() = this.startsWith(Options.KLC_COPYRIGHT + Sym.EQUALS)

internal fun String.isKlcCompany() = this.startsWith(Options.KLC_COMPANY + Sym.EQUALS)

internal fun String.isKlcLocaleName() = this.startsWith(Options.KLC_LOCALE_NAME + Sym.EQUALS)

internal fun String.isKlcLocaleId() = this.startsWith(Options.KLC_LOCALE_ID + Sym.EQUALS)

internal fun String.isKlcVersion() = this.startsWith(Options.KLC_VERSION + Sym.EQUALS)

internal fun String.isKlcLanguage() = this.startsWith(Options.KLC_LANGUAGE + Sym.EQUALS)