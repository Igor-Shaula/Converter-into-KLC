package org.igor_shaula.globals

// some characters and control sequences ===
object Sym {
    const val DASH = '-'
    const val EQUALS = '='
    const val SEMICOLON = ';'
    const val DOUBLE_QUOTE = '"'
    const val COMMA = ','
    const val SLASH = '/'
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
    const val BASE_XKB_LOCATION = "/usr/share/X11/xkb"
    const val XKB_SYMBOLS_LOCATION = "$BASE_XKB_LOCATION/symbols"
    const val KEYSYMDEF_FILE_LOCATION = "/usr/include/X11/keysymdef.h"
    const val ALIASES_FILE_LOCATION = "$BASE_XKB_LOCATION/keycodes/aliases"
    const val LAYOUT_STARTING_BLOCK = "xkb_symbols"
    const val LAYOUT_ENDING_BLOCK = "};"
    const val KEYCODES_STARTING_BLOCK = "xkb_keycodes"
    const val KEYCODES_ENDING_BLOCK = ">;"
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
const val HEX_RADIX = 16

object Regex {
    const val WHITESPACES = "\\s+"
    const val ONE_WORD = "(\\w+)"
    const val XKB_SYMBOLS_FINDING_PATTERN = """^\s*${X11.LAYOUT_STARTING_BLOCK}\s*"([^"]+)"\s*\{\s*$"""
    const val XKB_KEYCODES_FINDING_PATTERN = """^\s*${X11.KEYCODES_STARTING_BLOCK}\s*"([^"]+)"\s*\{\s*$"""
    const val FOR_KEYSYMDEF_FILE = """${X11.SYMBOL_RECORD}\s+${X11.SYMBOL_PREFIX}(\w+)\s+0x([0-9a-fA-F]+)"""
    const val FOR_ALIASES_FILE = """^${X11.ALIAS}\s*<(\w+)>\s*=\s*<(\w+)>;$"""
    const val FOR_LAYOUT_INCLUDE = """$ONE_WORD\($ONE_WORD\)"""
}
