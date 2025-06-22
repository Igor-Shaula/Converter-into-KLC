package org.igor_shaula

const val LOCATION_OF_SYMBOLS_US_FILE = "/usr/share/X11/xkb/symbols/us"

const val LAYOUT_STARTING_BLOCK = "xkb_symbols"
const val LAYOUT_ENDING_BLOCK = "};"
const val XKB_SYMBOLS_FINDING_PATTERN = """^\s*$LAYOUT_STARTING_BLOCK\s*"([^"]+)"\s*\{\s*$"""

const val REGEX_FOR_REMOVING_BLANKS = "\\s+"
const val EMPTY_STRING = ""
const val EQUALS = '='
const val SEMICOLON = ';'
const val DOUBLE_QUOTE = '"'

const val NAME_GROUP_1 = "name[Group1]"
const val ENGLISH_US = "English(US)"

const val KEY_TILDE = "key<TLDE>"
const val KEY_A_BEGINNING = "key<A"

const val OPENING_BRACKETS = "{["
const val CLOSING_BRACKETS = "]}"