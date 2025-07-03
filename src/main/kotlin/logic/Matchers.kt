package org.igor_shaula.logic

import org.igor_shaula.globals.*

fun isEnglishUSNameGroup1(normalizedLine: String) =
    normalizedLine == X11.NAME_GROUP_1 + Sym.EQUALS + Sym.DOUBLE_QUOTE + X11.ENGLISH_US + Sym.DOUBLE_QUOTE + Sym.SEMICOLON

fun isKeyTilde(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, X11.KEY_TILDE + X11.OPENING_BRACKETS)

fun isKeySpace(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, X11.KEY_SPACE + X11.OPENING_BRACKETS)

fun isKeyStartingWithA(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, X11.KEY_A_BEGINNING)

fun isKeyStartingWithLat(normalizedLine: String) =
    lineContainsTheKeyAndEndsCorrectly(normalizedLine, X11.KEY_LAT_BEGINNING)

private fun lineContainsTheKeyAndEndsCorrectly(normalizedLine: String, key: String) =
    normalizedLine.startsWith(key) && normalizedLine.contains(X11.CLOSING_BRACKETS + Sym.SEMICOLON)

fun isKeyStartingWithAlias(normalizedLine: String) =
    normalizedLine.startsWith(X11.ALIAS) && normalizedLine.contains(X11.KEYCODES_ENDING_BLOCK)

fun isXkbSymbolsSection(line: String): Boolean {
    val pattern = Regex.XKB_SYMBOLS_FINDING_PATTERN.toRegex()
    return pattern.matches(line)
}

fun isLayoutEndingBlock(line: String) = line.startsWith(X11.LAYOUT_ENDING_BLOCK)

fun isBeginningInclude(line: String): Boolean = line.clearAllBlanks().startsWith(X11.INCLUDE)
