package org.igor_shaula.globals

object Defaults {

    const val TARGET_FILE_NAME = X11.XKB_SYMBOLS_LOCATION + "/us"
    const val TARGET_LAYOUT_NAME = "basic"
    const val ALIASES_FILE = X11.ALIASES_FILE_LOCATION
    const val ALIASES_MAPPING = "qwerty"
    const val INCLUDE_US_BASIC_LINE = """include "us(basic)""""

    const val KLC_RESULT_FILE_NAME = "result_UTF-16.klc"
    const val KLC_KBD_NAME_8 = "basic_EN"
    const val KLC_KBD_NAME_LONG = "from X11 - English (US)"
    const val KLC_ABSENT_SYMBOL_VALUE = "-1"
    const val KLC_COPYRIGHT = "(c) 2025 igor.shaula"
    const val KLC_COMPANY = "Igor Shaula"
    const val KLC_LOCALE_NAME = "en-US"
    const val KLC_LOCALE_ID = "00000409"
    const val KLC_VERSION = "1.0"
    const val KLC_LANGUAGE = "English (United States)"
}