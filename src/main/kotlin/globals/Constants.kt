package org.igor_shaula.globals

// some characters and control sequences ===
object Sym {
    const val EQUALS = '='
    const val SEMICOLON = ';'
    const val DOUBLE_QUOTE = '"'
    const val COMMA = ','
    const val BEGINNING_OF_UNICODE_NUMBER = 'U'
    const val BEGINNING_OF_COMMAND_SYMBOL = 'f'
}

object Str {
    const val EMPTY = ""
    const val LF = "\n"
    const val CR_LF = "\r\n"
    const val TAB = "\t"
}

object X11 {
    const val LOCATION_OF_SYMBOLS_US_FILE = "/usr/share/X11/xkb/symbols/us"
    const val LOCATION_OF_KEYSYMDEF_FILE = "/usr/include/X11/keysymdef.h"
    const val LAYOUT_STARTING_BLOCK = "xkb_symbols"
    const val LAYOUT_ENDING_BLOCK = "};"
    const val KEYCODES_STARTING_BLOCK = "xkb_keycodes"
    const val KEYCODES_ENDING_BLOCK = ">;"
    const val DEFAULT_XKB_LAYOUT = "basic"
    const val DEFAULT_ALIAS_MAPPING = "qwerty"
    const val OPENING_BRACKETS = "{["
    const val CLOSING_BRACKETS = "]}"
    const val SYMBOL_RECORD = "#define"
    const val SYMBOL_PREFIX = "XK_"
    const val INCLUDE = "include"
    const val NAME_GROUP_1 = "name[Group1]"
    const val ENGLISH_US = "English(US)"
    const val NAME_TILDE = "TLDE"
    const val NAME_SPACE = "SPCE"
    const val KEY_TILDE = "key<TLDE>"
    const val KEY_SPACE = "key<SPCE>"
    const val KEY_A_BEGINNING = "key<A"
    const val KEY_LAT_BEGINNING = "key<Lat"
    const val ALIAS = "alias"
    const val EXTENDED_CODE_PREFIX = "100"
    const val EXTENDED_CODE_PREFIX_HEX = "0x100"
    const val NOSYMBOL = "NoSymbol"
    const val UNICODE_NUMBER_LENGTH = 5
}

const val UNICODE_NUMBER_LENGTH = 4

object Regex {
    const val WHITESPACES = "\\s+"
    const val SYMBOL_NAME_WORD = "(\\w+)"
    const val SYMBOL_HEX_CODE = "0x([0-9a-fA-F]{4})"

    // a regex pattern that matches "xkb_symbols" followed by any word in quotes
    const val XKB_SYMBOLS_FINDING_PATTERN = """^\s*xkb_symbols\s*"([^"]+)"\s*\{\s*$"""
    const val XKB_KEYCODES_FINDING_PATTERN = """^\s*xkb_keycodes\s*"([^"]+)"\s*\{\s*$"""
    const val FOR_KEYSYMDEF_FILE = """#define\s+XK_(\w+)\s+0x([0-9a-fA-F]+)""" // any number of symbols
    const val FOR_ALIASES_FILE = """^alias\s*<(\w+)>\s*=\s*<(\w+)>;$"""
}

object Klc {
    const val DEFAULT_LAYOUT_NAME_8 = "basic_EN"
    const val DEFAULT_LAYOUT_DESCRIPTION = "from X11 - English (US)"
    const val DEFAULT_RESULT_FILE_NAME = "result_UTF-16.klc"
    const val ABSENT_SYMBOL_VALUE = "-1"
}