package org.igor_shaula.logic.string_processing

import org.igor_shaula.globals.*

fun String.isEnglishUSNameGroup1() =
    this == X11.NAME_GROUP_1 + Sym.EQUALS + Sym.DOUBLE_QUOTE + X11.ENGLISH_US + Sym.DOUBLE_QUOTE + Sym.SEMICOLON

fun String.isKeyTilde() = lineContainsTheKeyAndEndsCorrectly(X11.KEY_TILDE + X11.OPENING_BRACKETS)

fun String.isKeySpace() = lineContainsTheKeyAndEndsCorrectly(X11.KEY_SPACE + X11.OPENING_BRACKETS)

fun String.isKeyStartingWithA() = lineContainsTheKeyAndEndsCorrectly(X11.KEY_A_BEGINNING)

fun String.isKeyStartingWithLat() = lineContainsTheKeyAndEndsCorrectly(X11.KEY_LAT_BEGINNING)

private fun String.lineContainsTheKeyAndEndsCorrectly(key: String) =
    this.startsWith(key) && this.contains(X11.CLOSING_BRACKETS + Sym.SEMICOLON)

fun String.isKeyStartingWithAlias() = this.startsWith(X11.ALIAS) && this.contains(X11.KEYCODES_ENDING_BLOCK)

fun String.isUnicodeNumber() =
    this.startsWith(Sym.BEGINNING_OF_UNICODE_NUMBER) && this.length == X11.UNICODE_FULL_LENGTH

fun String.isXkbSymbolsSection(): Boolean {
    val pattern = Regex.XKB_SYMBOLS_FINDING_PATTERN.toRegex()
    return pattern.matches(this)
}

fun String.isLayoutEndingBlock() = this.startsWith(X11.LAYOUT_ENDING_BLOCK)

fun String.isBeginningInclude() = this.clearAllBlanks().startsWith(X11.INCLUDE)

fun String.isExtendedX11KeyCode() = this.startsWith(X11.EXTENDED_CODE_PREFIX)

fun String.isArgumentAnOption() = this.startsWith(Sym.DASH)

fun String.isHelp() = this == Options.HELP

fun String.isVersion() = this == Options.VERSION

fun String.isSilent() = this == Options.SILENT

fun String.isFile() = this.startsWith(Options.SOURCE_X11_FILE + Sym.EQUALS)

fun String.isLayout() = this.startsWith(Options.SOURCE_X11_LAYOUT + Sym.EQUALS)

fun String.isKlcResultFileName() = this.startsWith(Options.RESULT_KLC_FILE + Sym.EQUALS)

fun String.isKlcKbdName8() = this.startsWith(Options.KLC_KBD_NAME_8 + Sym.EQUALS)

fun String.isKlcKbdNameLong() = this.startsWith(Options.KLC_KBD_NAME_LONG + Sym.EQUALS)

fun String.isKlcCopyright() = this.startsWith(Options.KLC_COPYRIGHT + Sym.EQUALS)

fun String.isKlcCompany() = this.startsWith(Options.KLC_COMPANY + Sym.EQUALS)

fun String.isKlcLocaleName() = this.startsWith(Options.KLC_LOCALE_NAME + Sym.EQUALS)

fun String.isKlcLocaleId() = this.startsWith(Options.KLC_LOCALE_ID + Sym.EQUALS)

fun String.isKlcVersion() = this.startsWith(Options.KLC_VERSION + Sym.EQUALS)

fun String.isKlcLanguage() = this.startsWith(Options.KLC_LANGUAGE + Sym.EQUALS)