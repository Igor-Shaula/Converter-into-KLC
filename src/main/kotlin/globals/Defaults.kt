package org.igor_shaula.globals

import org.igor_shaula.globals.X11.XKB_SYMBOLS_LOCATION

object Defaults {

    const val TARGET_FILE_NAME = "$XKB_SYMBOLS_LOCATION/us"
    const val TARGET_LAYOUT_NAME = "basic"
    const val ALIASES_MAPPING = "qwerty"
    const val INCLUDE_US_BASIC_LINE = """include "us(basic)""""

    const val KLC_LAYOUT_NAME_8 = "basic_EN"
    const val KLC_LAYOUT_DESCRIPTION = "from X11 - English (US)"
    const val KLC_RESULT_FILE_NAME = "result_UTF-16.klc"
    const val KLC_ABSENT_SYMBOL_VALUE = "-1"
    const val KLC_COPYRIGHT: String = "(c) 2025 igor.shaula"
    const val KLC_COMPANY: String = "Igor Shaula"
    const val KLC_LOCALE_NAME: String = "en-US"
    const val KLC_LOCALE_ID: String = "00000409"
    const val KLC_VERSION: String = "1.0"
    const val KLC_LANGUAGE: String = "English (United States)"
}