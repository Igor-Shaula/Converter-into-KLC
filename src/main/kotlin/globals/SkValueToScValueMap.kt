package org.igor_shaula.globals

val skValueToScValueMap = mapOf(
    "0c" to "OEM_MINUS",
    "0d" to "OEM_PLUS",
    "30" to "OEM_COMMA",
    "31" to "OEM_PERIOD",
    "12" to "OEM_1${Str.TAB}", // colon
    "23" to "OEM_2${Str.TAB}", // solidus / slash
    "29" to "OEM_3${Str.TAB}", // tilde
    "15" to "OEM_4${Str.TAB}", // left square bracket
//  "??" -> "OEM_5${Str.TAB}",
    "16" to "OEM_6${Str.TAB}", // right square bracket
    "14" to "OEM_7${Str.TAB}", // apostrophe
    "39" to "SPACE${Str.TAB}",
    "53" to "DECIMAL"
)