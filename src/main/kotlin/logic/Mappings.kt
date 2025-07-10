package org.igor_shaula.logic

import org.igor_shaula.globals.*

internal fun parseKeySymDefinition(input: String): Pair<String, String>? {

    if (input.isBlank()) return null

    val regex = Regex.FOR_KEYSYMDEF_FILE.toRegex()

    val matchResult = regex.find(input)
    return matchResult?.let {
        var (name, code) = it.destructured
        if (code.startsWith(X11.EXTENDED_CODE_PREFIX)) code = code.substring(X11.EXTENDED_CODE_PREFIX.length)
        name to code
    }
}

internal fun parseAliasLine(line: String): Pair<String, String>? {
    val regex = Regex.FOR_ALIASES_FILE.toRegex()
    val matchResult = regex.find(line)
    return matchResult?.let {
        val (alias, keycode) = it.destructured
        alias to keycode
    }
}

internal fun parseLayoutInclude(includeString: String): Pair<String, String> {
    val regex = Regex.FOR_LAYOUT_INCLUDE.toRegex()
    val matchResult = regex.find(includeString) // for example: include "us(basic)"
    return matchResult?.let {
        Pair(it.groupValues[1], it.groupValues[2]) // filename: "us", layout: "basic"
    } ?: throw Error.WithParsing("Invalid include format. Expected format: 'layout(variant)'")
}

internal fun getVkValueByScValue(base: String?) = when (base) {
    "0c" -> "OEM_MINUS"
    "0d" -> "OEM_PLUS"
    "30" -> "OEM_COMMA"
    "31" -> "OEM_PERIOD"
    "12" -> "OEM_1${Str.TAB}" // colon
    "23" -> "OEM_2${Str.TAB}" // solidus / slash
    "29" -> "OEM_3${Str.TAB}" // tilde
    "15" -> "OEM_4${Str.TAB}" // left square bracket
//    "??" -> "OEM_5${Str.TAB}"
    "16" -> "OEM_6${Str.TAB}" // right square bracket
    "14" -> "OEM_7${Str.TAB}" // apostrophe
    "39" -> "SPACE${Str.TAB}"
    "53" -> "DECIMAL"
    else -> Data.x11SymbolsDictionary[base]?.uppercase()
}

internal fun getUnicodeSymbolFromKeysym(keysym: String): Char? {
    try {
        val keySymValue = keysym.toInt(HEX_RADIX)

        // X11 Keysym to Unicode mapping for Cyrillic
        val unicodeValue = when (keySymValue) {

            0x06c1 -> 0x0430  // XK_Cyrillic_a -> а
            0x06c2 -> 0x0431  // XK_Cyrillic_be -> б
            0x06c3 -> 0x0432  // XK_Cyrillic_ve -> в
            0x06c4 -> 0x0433  // XK_Cyrillic_ghe -> г
            0x06c5 -> 0x0434  // XK_Cyrillic_de -> д
            0x06c6 -> 0x0435  // XK_Cyrillic_ie -> е
            0x06c7 -> 0x0436  // XK_Cyrillic_zhe -> ж
            0x06c8 -> 0x0437  // XK_Cyrillic_ze -> з
            0x06c9 -> 0x0438  // XK_Cyrillic_i -> и
            0x06ca -> 0x0439  // XK_Cyrillic_shorti -> й
            0x06cb -> 0x043A  // XK_Cyrillic_ka -> к
            0x06cc -> 0x043B  // XK_Cyrillic_el -> л
            0x06cd -> 0x043C  // XK_Cyrillic_em -> м
            0x06ce -> 0x043D  // XK_Cyrillic_en -> н
            0x06cf -> 0x043E  // XK_Cyrillic_o -> о
            0x06d0 -> 0x043F  // XK_Cyrillic_pe -> п
            0x06d1 -> 0x0440  // XK_Cyrillic_er -> р
            0x06d2 -> 0x0441  // XK_Cyrillic_es -> с
            0x06d3 -> 0x0442  // XK_Cyrillic_te -> т
            0x06d4 -> 0x0443  // XK_Cyrillic_u -> у
            0x06d5 -> 0x0444  // XK_Cyrillic_ef -> ф
            0x06d6 -> 0x0445  // XK_Cyrillic_ha -> х
            0x06d7 -> 0x0446  // XK_Cyrillic_tse -> ц
            0x06d8 -> 0x0447  // XK_Cyrillic_che -> ч
            0x06d9 -> 0x044A  // XK_Cyrillic_hardsign -> ъ
            0x06da -> 0x0456  // XK_Ukrainian_i -> і
            0x06db -> 0x0457  // XK_Ukrainian_yi -> ї
            0x06dc -> 0x0448  // XK_Cyrillic_sha -> ш
            0x06dd -> 0x0449  // XK_Cyrillic_shcha -> щ
            0x06de -> 0x044B  // XK_Cyrillic_yeru -> ы
            0x06df -> 0x044F  // XK_Cyrillic_ya -> я
            0x06e0 -> 0x044D  // XK_Cyrillic_e -> э
            0x06e1 -> 0x044E  // XK_Cyrillic_yu -> ю
            0x06e2 -> 0x044C  // XK_Cyrillic_softsign -> ь
            0x06e3 -> 0x0451  // XK_Cyrillic_io -> ё
            0x06e4 -> 0x0410  // XK_Cyrillic_A -> А
            0x06e5 -> 0x0411  // XK_Cyrillic_BE -> Б
            0x06e6 -> 0x0412  // XK_Cyrillic_VE -> В
            0x06e7 -> 0x0413  // XK_Cyrillic_GHE -> Г
            0x06e8 -> 0x0414  // XK_Cyrillic_DE -> Д
            0x06e9 -> 0x0415  // XK_Cyrillic_IE -> Е
            0x06ea -> 0x0416  // XK_Cyrillic_ZHE -> Ж
            0x06eb -> 0x0417  // XK_Cyrillic_ZE -> З
            0x06ec -> 0x0418  // XK_Cyrillic_I -> И
            0x06ed -> 0x0419  // XK_Cyrillic_SHORTI -> Й
            0x06ee -> 0x041A  // XK_Cyrillic_KA -> К
            0x06ef -> 0x041B  // XK_Cyrillic_EL -> Л
            0x06f0 -> 0x041C  // XK_Cyrillic_EM -> М
            0x06f1 -> 0x041D  // XK_Cyrillic_EN -> Н
            0x06f2 -> 0x041E  // XK_Cyrillic_O -> О
            0x06f3 -> 0x041F  // XK_Cyrillic_PE -> П
            0x06f4 -> 0x0420  // XK_Cyrillic_ER -> Р
            0x06f5 -> 0x0421  // XK_Cyrillic_ES -> С
            0x06f6 -> 0x0422  // XK_Cyrillic_TE -> Т
            0x06f7 -> 0x0423  // XK_Cyrillic_U -> У
            0x06f8 -> 0x0424  // XK_Cyrillic_EF -> Ф
            0x06f9 -> 0x0425  // XK_Cyrillic_HA -> Х
            0x06fa -> 0x0426  // XK_Cyrillic_TSE -> Ц
            0x06fb -> 0x0427  // XK_Cyrillic_CHE -> Ч
            0x06fc -> 0x0428  // XK_Cyrillic_SHA -> Ш
            0x06fd -> 0x0429  // XK_Cyrillic_SHCHA -> Щ
            0x06fe -> 0x042B  // XK_Cyrillic_YERU -> Ы
            0x06ff -> 0x042F  // XK_Cyrillic_YA -> Я
            0x07a1 -> 0x042D  // XK_Cyrillic_E -> Э
            0x07a2 -> 0x042E  // XK_Cyrillic_YU -> Ю
            0x07a3 -> 0x042C  // XK_Cyrillic_SOFTSIGN -> Ь
            0x07a4 -> 0x0401  // XK_Cyrillic_IO -> Ё
            0x07a5 -> 0x0404  // XK_Ukrainian_IE -> Є
            0x07a6 -> 0x0406  // XK_Ukrainian_I -> І
            0x07a7 -> 0x0407  // XK_Ukrainian_YI -> Ї
            0x07a8 -> 0x0454  // XK_Ukrainian_ie -> є
            0x07a9 -> 0x0456  // XK_Ukrainian_i -> і
            0x07aa -> 0x0457  // XK_Ukrainian_yi -> ї
            0x07ab -> 0x040E  // XK_Byelorussian_SHORTU -> Ў
            0x07ac -> 0x045E  // XK_Byelorussian_shortu -> ў

            0x07ae -> 0x0402  // XK_Serbian_DJE -> Ђ
            0x07af -> 0x0403  // XK_Macedonia_GJE -> Ѓ
            0x07b0 -> 0x0484  // XK_combining_cyrillic_palatalization -> ҄
            0x07b1 -> 0x0485  // XK_combining_cyrillic_psili -> ҅
            0x07b2 -> 0x0486  // XK_combining_cyrillic_dasia -> ҆
            0x07b3 -> 0x0487  // XK_combining_cyrillic_pneumata -> ҇
            0x07b4 -> 0x0490  // XK_Ukrainian_GHE_WITH_UPTURN -> Ґ
            0x07b5 -> 0x0491  // XK_Ukrainian_ghe_with_upturn -> ґ
            0x07b6 -> 0x0492  // XK_Cyrillic_GHE_bar -> Ғ
            0x07b7 -> 0x0493  // XK_Cyrillic_ghe_bar -> ғ
            0x07b8 -> 0x0496  // XK_Cyrillic_ZHE_descender -> Җ
            0x07b9 -> 0x0497  // XK_Cyrillic_zhe_descender -> җ
            0x07ba -> 0x049A  // XK_Cyrillic_KA_descender -> Қ
            0x07bb -> 0x049B  // XK_Cyrillic_ka_descender -> қ
            0x07bc -> 0x049C  // XK_Cyrillic_KA_vertstroke -> Ҝ
            0x07bd -> 0x049D  // XK_Cyrillic_ka_vertstroke -> ҝ

            else -> keySymValue // fallback for non-Cyrillic or direct Unicode values
        }
        return unicodeValue.toChar()
    } catch (e: NumberFormatException) {
        println("Invalid input: '$keysym'. NumberFormatException: ${e.message}")
        return null
    }
}
