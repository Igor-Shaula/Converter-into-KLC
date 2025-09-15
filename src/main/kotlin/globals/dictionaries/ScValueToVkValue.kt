package org.igor_shaula.globals.dictionaries

import org.igor_shaula.globals.Str

val scValueToVkValueMap = mapOf(
    "39" to "SPACE${Str.TAB}",
    "02" to "1",
    "03" to "2",
    "04" to "3",
    "05" to "4",
    "06" to "5",
    "07" to "6",
    "08" to "7",
    "09" to "8",
    "0a" to "9",
    "0b" to "0",
    "0c" to "OEM_MINUS",
    "0d" to "OEM_PLUS",
    "10" to "Q",
    "11" to "W",
    "12" to "OEM_1${Str.TAB}", // colon
    "13" to "U",
    "14" to "OEM_7${Str.TAB}", // apostrophe
    "15" to "OEM_4${Str.TAB}", // left square bracket
    "16" to "OEM_6${Str.TAB}", // right square bracket
    "17" to "J",
    "18" to "R",
    "19" to "L",
    "1a" to "K",
    "1b" to "P",
    "1e" to "A",
    "1f" to "E",
    "20" to "O",
    "21" to "I",
    "22" to "Y",
    "23" to "OEM_2${Str.TAB}", // solidus / slash
    "24" to "G",
    "25" to "N",
    "26" to "D",
    "27" to "S",
    "28" to "T",
    "29" to "OEM_3${Str.TAB}", // tilde
    "2c" to "Z",
    "2d" to "X",
    "2e" to "C",
    "2f" to "V",
    "30" to "OEM_COMMA",
    "31" to "OEM_PERIOD",
    "32" to "H",
    "33" to "M",
    "34" to "F",
    "35" to "B",
//  "??" -> "OEM_5${Str.TAB}", // strange but there is no such value in the KLC files created in the MKLC program
    "53" to "DECIMAL"
)