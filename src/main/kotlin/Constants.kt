package org.igor_shaula

// some characters and control sequences ===
const val EQUALS = '='
const val SEMICOLON = ';'
const val DOUBLE_QUOTE = '"'
const val COMMA = ','
const val BEGINNING_OF_UNICODE_NUMBER = 'U'
const val BEGINNING_OF_COMMAND_SYMBOL = 'f'
const val EMPTY_STRING = ""
const val LF = "\n"
const val CR_LF = "\r\n"
const val TAB = "\t"
const val REGEX_WHITESPACES = "\\s+"

const val X11_LOCATION_OF_SYMBOLS_US_FILE = "/usr/share/X11/xkb/symbols/us"
const val X11_LOCATION_OF_KEYSYMDEF_FILE = "/usr/include/X11/keysymdef.h"

const val X11_LAYOUT_STARTING_BLOCK = "xkb_symbols"
const val X11_LAYOUT_ENDING_BLOCK = "};"
const val X11_DEFAULT_XKB_LAYOUT = "basic"
const val X11_OPENING_BRACKETS = "{["
const val X11_CLOSING_BRACKETS = "]}"

const val X11_SYMBOL_RECORD = "#define"
const val X11_SYMBOL_PREFIX = "XK_"
const val REGEX_SYMBOL_NAME_WORD = "(\\w+)"
const val REGEX_SYMBOL_HEX_CODE = "0x([0-9a-fA-F]{4})"

// a regex pattern that matches "xkb_symbols" followed by any word in quotes
const val X11_REGEX_XKB_SYMBOLS_FINDING_PATTERN = """^\s*xkb_symbols\s*"([^"]+)"\s*\{\s*$"""
const val X11_REGEX_FOR_KEYSYMDEF_FILE = """#define\s+XK_(\w+)\s+0x([0-9a-fA-F]+)""" // any number of symbols

const val X11_NAME_GROUP_1 = "name[Group1]"
const val X11_ENGLISH_US = "English(US)"

const val X11_NAME_TILDE = "TLDE"
const val X11_NAME_SPACE = "SPCE"
const val X11_KEY_TILDE = "key<TLDE>"
const val X11_KEY_SPACE = "key<SPCE>"
const val X11_KEY_A_BEGINNING = "key<A"
const val X11_EXTENDED_CODE_PREFIX = "100"
const val X11_EXTENDED_CODE_PREFIX_HEX = "0x100"
const val X11_UNICODE_NUMBER_LENGTH = 5

const val UNICODE_NUMBER_LENGTH = 4
const val X11_NOSYMBOL = "NoSymbol"

const val KLC_DEFAULT_LAYOUT_NAME_8 = "basic_EN"
const val KLC_DEFAULT_LAYOUT_DESCRIPTION = "from X11 - English (US)"
const val KLC_DEFAULT_RESULT_FILE_NAME = "result_UTF-16.klc"
const val KLC_ABSENT_SYMBOL_VALUE = "-1"
