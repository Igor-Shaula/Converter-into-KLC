package org.igor_shaula

const val LOCATION_OF_SYMBOLS_US_FILE = "/usr/share/X11/xkb/symbols/us"
const val LOCATION_OF_KEYSYMDEF_FILE = "/usr/include/X11/keysymdef.h"

const val LAYOUT_STARTING_BLOCK = "xkb_symbols"
const val LAYOUT_ENDING_BLOCK = "};"
const val XKB_SYMBOLS_FINDING_PATTERN = """^\s*$LAYOUT_STARTING_BLOCK\s*"([^"]+)"\s*\{\s*$"""

// #define XK_name 0xHEX /* optional comment */
const val REGEX_FOR_KEYSYMDEF_FILE_4 = """#define\s+XK_(\w+)\s+0x([0-9a-fA-F]{4})"""
const val REGEX_FOR_KEYSYMDEF_FILE = """#define\s+XK_(\w+)\s+0x([0-9a-fA-F]+)"""

const val BEGINNING_OF_SYMBOL_RECORD = "#define"
const val SOME_WHITESPACES = "\\s+"
const val SYMBOL_PREFIX = "XK_"
const val SYMBOL_NAME = "(\\w+)"
const val SYMBOL_CODE = "0x([0-9a-fA-F]{4})"

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
const val LAYER_SEPARATOR = ','