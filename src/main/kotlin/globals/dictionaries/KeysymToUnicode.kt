package org.igor_shaula.globals.dictionaries

val keysymToUnicodeMap = mapOf(
//    0x06c1 to 0x0430, // XK_Cyrillic_a -> а
//    0x06c2 to 0x0431, // XK_Cyrillic_be -> б
//    0x06c3 to 0x0432, // XK_Cyrillic_ve -> в
//    0x06c4 to 0x0433, // XK_Cyrillic_ghe -> г
//    0x06c5 to 0x0434, // XK_Cyrillic_de -> д
//    0x06c6 to 0x0435, // XK_Cyrillic_ie -> е
//    0x06c7 to 0x0436, // XK_Cyrillic_zhe -> ж
//    0x06c8 to 0x0437, // XK_Cyrillic_ze -> з
//    0x06c9 to 0x0438, // XK_Cyrillic_i -> и
//    0x06ca to 0x0439, // XK_Cyrillic_shorti -> й
//    0x06cb to 0x043A, // XK_Cyrillic_ka -> к
//    0x06cc to 0x043B, // XK_Cyrillic_el -> л
//    0x06cd to 0x043C, // XK_Cyrillic_em -> м
//    0x06ce to 0x043D, // XK_Cyrillic_en -> н
//    0x06cf to 0x043E, // XK_Cyrillic_o -> о
//    0x06d0 to 0x043F, // XK_Cyrillic_pe -> п
//    0x06d1 to 0x0440, // XK_Cyrillic_er -> р
//    0x06d2 to 0x0441, // XK_Cyrillic_es -> с
//    0x06d3 to 0x0442, // XK_Cyrillic_te -> т
//    0x06d4 to 0x0443, // XK_Cyrillic_u -> у
//    0x06d5 to 0x0444, // XK_Cyrillic_ef -> ф
//    0x06d6 to 0x0445, // XK_Cyrillic_ha -> х
//    0x06d7 to 0x0446, // XK_Cyrillic_tse -> ц
//    0x06d8 to 0x0447, // XK_Cyrillic_che -> ч
//    0x06d9 to 0x044A, // XK_Cyrillic_hardsign -> ъ
//    0x06da to 0x0456, // XK_Ukrainian_i -> і
//    0x06db to 0x0457, // XK_Ukrainian_yi -> ї
//    0x06dc to 0x0448, // XK_Cyrillic_sha -> ш
//    0x06dd to 0x0449, // XK_Cyrillic_shcha -> щ
//    0x06de to 0x044B, // XK_Cyrillic_yeru -> ы
//    0x06df to 0x044F, // XK_Cyrillic_ya -> я
//    0x06e0 to 0x044D, // XK_Cyrillic_e -> э
//    0x06e1 to 0x044E, // XK_Cyrillic_yu -> ю
//    0x06e2 to 0x044C, // XK_Cyrillic_softsign -> ь
//    0x06e3 to 0x0451, // XK_Cyrillic_io -> ё
//    0x06e4 to 0x0410, // XK_Cyrillic_A -> А
//    0x06e5 to 0x0411, // XK_Cyrillic_BE -> Б
//    0x06e6 to 0x0412, // XK_Cyrillic_VE -> В
//    0x06e7 to 0x0413, // XK_Cyrillic_GHE -> Г
//    0x06e8 to 0x0414, // XK_Cyrillic_DE -> Д
//    0x06e9 to 0x0415, // XK_Cyrillic_IE -> Е
//    0x06ea to 0x0416, // XK_Cyrillic_ZHE -> Ж
//    0x06eb to 0x0417, // XK_Cyrillic_ZE -> З
//    0x06ec to 0x0418, // XK_Cyrillic_I -> И
//    0x06ed to 0x0419, // XK_Cyrillic_SHORTI -> Й
//    0x06ee to 0x041A, // XK_Cyrillic_KA -> К
//    0x06ef to 0x041B, // XK_Cyrillic_EL -> Л
//    0x06f0 to 0x041C, // XK_Cyrillic_EM -> М
//    0x06f1 to 0x041D, // XK_Cyrillic_EN -> Н
//    0x06f2 to 0x041E, // XK_Cyrillic_O -> О
//    0x06f3 to 0x041F, // XK_Cyrillic_PE -> П
//    0x06f4 to 0x0420, // XK_Cyrillic_ER -> Р
//    0x06f5 to 0x0421, // XK_Cyrillic_ES -> С
//    0x06f6 to 0x0422, // XK_Cyrillic_TE -> Т
//    0x06f7 to 0x0423, // XK_Cyrillic_U -> У
//    0x06f8 to 0x0424, // XK_Cyrillic_EF -> Ф
//    0x06f9 to 0x0425, // XK_Cyrillic_HA -> Х
//    0x06fa to 0x0426, // XK_Cyrillic_TSE -> Ц
//    0x06fb to 0x0427, // XK_Cyrillic_CHE -> Ч
//    0x06fc to 0x0428, // XK_Cyrillic_SHA -> Ш
//    0x06fd to 0x0429, // XK_Cyrillic_SHCHA -> Щ
//    0x06fe to 0x042B, // XK_Cyrillic_YERU -> Ы
//    0x06ff to 0x042F, // XK_Cyrillic_YA -> Я
//    0x07a1 to 0x042D, // XK_Cyrillic_E -> Э
//    0x07a2 to 0x042E, // XK_Cyrillic_YU -> Ю
//    0x07a3 to 0x042C, // XK_Cyrillic_SOFTSIGN -> Ь
//    0x07a4 to 0x0401, // XK_Cyrillic_IO -> Ё
//    0x07a5 to 0x0404, // XK_Ukrainian_IE -> Є
//    0x07a6 to 0x0406, // XK_Ukrainian_I -> І
//    0x07a7 to 0x0407, // XK_Ukrainian_YI -> Ї
//    0x07a8 to 0x0454, // XK_Ukrainian_ie -> є
//    0x07a9 to 0x0456, // XK_Ukrainian_i -> і
//    0x07aa to 0x0457, // XK_Ukrainian_yi -> ї
//    0x07ab to 0x040E, // XK_Byelorussian_SHORTU -> Ў
//    0x07ac to 0x045E, // XK_Byelorussian_shortu -> ў
//    0x07ad to 0x04D8, // XK_Cyrillic_SCHWA -> Ә (capital)
//    0x07ae to 0x0402, // XK_Serbian_DJE -> Ђ
//    0x07af to 0x0403, // XK_Macedonia_GJE -> Ѓ
//    0x07b0 to 0x0484, // XK_combining_cyrillic_palatalization -> ҄
//    0x07b1 to 0x0485, // XK_combining_cyrillic_psili -> ҅
//    0x07b2 to 0x0486, // XK_combining_cyrillic_dasia -> ҆
//    0x07b3 to 0x0487, // XK_combining_cyrillic_pneumata -> ҇
//    0x07b4 to 0x0490, // XK_Ukrainian_GHE_WITH_UPTURN -> Ґ
//    0x07b5 to 0x0491, // XK_Ukrainian_ghe_with_upturn -> ґ
//    0x07b6 to 0x0492, // XK_Cyrillic_GHE_bar -> Ғ
//    0x07b7 to 0x0493, // XK_Cyrillic_ghe_bar -> ғ
//    0x07b8 to 0x0496, // XK_Cyrillic_ZHE_descender -> Җ
//    0x07b9 to 0x0497, // XK_Cyrillic_zhe_descender -> җ
//    0x07ba to 0x049A, // XK_Cyrillic_KA_descender -> Қ
//    0x07bb to 0x049B, // XK_Cyrillic_ka_descender -> қ
//    0x07bc to 0x049C, // XK_Cyrillic_KA_vertstroke -> Ҝ
//    0x07bd to 0x049D, // XK_Cyrillic_ka_vertstroke -> ҝ
//    0x07be to 0x04A2, // XK_Cyrillic_EN_descender -> Ң
//    0x07bf to 0x04A3, // XK_Cyrillic_en_descender -> ң
//    0x07c0 to 0x04AE, // XK_Cyrillic_STRAIGHT_U -> Ү
//    0x07c1 to 0x04AF, // XK_Cyrillic_straight_u -> ү
//    0x07c2 to 0x04B0, // XK_Cyrillic_STRAIGHT_U_bar -> Ұ
//    0x07c3 to 0x04B1, // XK_Cyrillic_straight_u_bar -> ұ
//    0x07c4 to 0x04B2, // XK_Cyrillic_HA_descender -> Ҳ
//    0x07c5 to 0x04B3, // XK_Cyrillic_ha_descender -> ҳ
//    0x07c6 to 0x04B6, // XK_Cyrillic_CHE_descender -> Ҷ
//    0x07c7 to 0x04B7, // XK_Cyrillic_che_descender -> ҷ
//    0x07c8 to 0x04B8, // XK_Cyrillic_CHE_vertstroke -> Ҹ
//    0x07c9 to 0x04B9, // XK_Cyrillic_che_vertstroke -> ҹ
//    0x07ca to 0x04BA, // XK_Cyrillic_SHHA -> Һ
//    0x07cb to 0x04BB, // XK_Cyrillic_shha -> һ
//    0x07cc to 0x04D9, // XK_Cyrillic_schwa -> ә (small)
//    0x07cd to 0x04C1, // XK_Cyrillic_ZHE_breve -> Ӂ
//    0x07ce to 0x04C2, // XK_Cyrillic_zhe_breve -> ӂ
//    0x07cf to 0x04D0, // XK_Cyrillic_A_breve -> Ӑ
//    0x07d0 to 0x04D1, // XK_Cyrillic_a_breve -> ӑ
//    0x07d1 to 0x04D2, // XK_Cyrillic_A_diaeresis -> Ӓ
//    0x07d2 to 0x04D3, // XK_Cyrillic_a_diaeresis -> ӓ
//    0x07d3 to 0x04D4, // XK_Cyrillic_AE -> Ӕ
//    0x07d4 to 0x04D5, // XK_Cyrillic_ae -> ӕ
//    0x07d5 to 0x04D6, // XK_Cyrillic_IE_breve -> Ӗ
//    0x07d6 to 0x04D7, // XK_Cyrillic_ie_breve -> ӗ
//    0x07d7 to 0x04DA, // XK_Cyrillic_SCHWA_diaeresis -> Ӛ (Ӛ)
//    0x07d8 to 0x04DB, // XK_Cyrillic_schwa_diaeresis -> ӛ (ӛ)
//    0x07d9 to 0x04DC, // XK_Cyrillic_ZHE_diaeresis -> Ӝ
//    0x07da to 0x04DD, // XK_Cyrillic_zhe_diaeresis -> ӝ
//    0x07db to 0x04DE, // XK_Cyrillic_ZE_diaeresis -> Ӟ
//    0x07dc to 0x04DF, // XK_Cyrillic_ze_diaeresis -> ӟ
//    0x07dd to 0x04E2, // XK_Cyrillic_I_macron -> Ӣ
//    0x07de to 0x04E3, // XK_Cyrillic_i_macron -> ӣ
//    0x07df to 0x04E4, // XK_Cyrillic_I_diaeresis -> Ӥ
//    0x07e0 to 0x04E5, // XK_Cyrillic_i_diaeresis -> ӥ
//    0x07e1 to 0x04E6, // XK_Cyrillic_O_diaeresis -> Ӧ
//    0x07e2 to 0x04E7, // XK_Cyrillic_o_diaeresis -> ӧ
//    0x07e3 to 0x04E8, // XK_Cyrillic_barred_O -> Ө
//    0x07e4 to 0x04E9, // XK_Cyrillic_barred_o -> ө
//    0x07e5 to 0x04EA, // XK_Cyrillic_barred_O_diaeresis -> Ӫ
//    0x07e6 to 0x04EB, // XK_Cyrillic_barred_o_diaeresis -> ӫ
//    0x07e7 to 0x04EC, // XK_Cyrillic_E_diaeresis -> Ӭ
//    0x07e8 to 0x04ED, // XK_Cyrillic_e_diaeresis -> ӭ
//    0x07e9 to 0x04EE, // XK_Cyrillic_U_macron -> Ӯ
//    0x07ea to 0x04EF, // XK_Cyrillic_u_macron -> ӯ
//    0x07eb to 0x04F0, // XK_Cyrillic_U_diaeresis -> Ӱ
//    0x07ec to 0x04F1, // XK_Cyrillic_u_diaeresis -> ӱ
//    0x07ed to 0x04F2, // XK_Cyrillic_U_double_acute -> Ӳ
//    0x07ee to 0x04F3, // XK_Cyrillic_u_double_acute -> ӳ
//    0x07ef to 0x04F4, // XK_Cyrillic_CHE_diaeresis -> Ӵ
//    0x07f0 to 0x04F5, // XK_Cyrillic_che_diaeresis -> ӵ
//    0x07f1 to 0x04F8, // XK_Cyrillic_YA_diaeresis -> Ӹ
//    0x07f2 to 0x04F9, // XK_Cyrillic_ya_diaeresis -> ӹ

    "0020" to "0020", // . → space
    "0021" to "0021", // . → exclam
    "0022" to "0022", // . → quotedbl
    "0023" to "0023", // . → numbersign
    "0024" to "0024", // . → dollar
    "0025" to "0025", // . → percent
    "0026" to "0026", // . → ampersand
    "0027" to "0027", // . → apostrophe
    "0027" to "0027", // . → quoteright	/* deprecated */
    "0028" to "0028", // . → parenleft
    "0029" to "0029", // . → parenright
    "002a" to "002a", // . → asterisk
    "002b" to "002b", // . → plus
    "002c" to "002c", // . → comma
    "002d" to "002d", // . → minus
    "002e" to "002e", // . → period
    "002f" to "002f", // . → slash
    "0030" to "0030", // . → 0
    "0031" to "0031", // . → 1
    "0032" to "0032", // . → 2
    "0033" to "0033", // . → 3
    "0034" to "0034", // . → 4
    "0035" to "0035", // . → 5
    "0036" to "0036", // . → 6
    "0037" to "0037", // . → 7
    "0038" to "0038", // . → 8
    "0039" to "0039", // . → 9
    "003a" to "003a", // . → colon
    "003b" to "003b", // . → semicolon
    "003c" to "003c", // . → less
    "003d" to "003d", // . → equal
    "003e" to "003e", // . → greater
    "003f" to "003f", // . → question
    "0040" to "0040", // . → at
    "0041" to "0041", // . → A
    "0042" to "0042", // . → B
    "0043" to "0043", // . → C
    "0044" to "0044", // . → D
    "0045" to "0045", // . → E
    "0046" to "0046", // . → F
    "0047" to "0047", // . → G
    "0048" to "0048", // . → H
    "0049" to "0049", // . → I
    "004a" to "004a", // . → J
    "004b" to "004b", // . → K
    "004c" to "004c", // . → L
    "004d" to "004d", // . → M
    "004e" to "004e", // . → N
    "004f" to "004f", // . → O
    "0050" to "0050", // . → P
    "0051" to "0051", // . → Q
    "0052" to "0052", // . → R
    "0053" to "0053", // . → S
    "0054" to "0054", // . → T
    "0055" to "0055", // . → U
    "0056" to "0056", // . → V
    "0057" to "0057", // . → W
    "0058" to "0058", // . → X
    "0059" to "0059", // . → Y
    "005a" to "005a", // . → Z
    "005b" to "005b", // . → bracketleft
    "005c" to "005c", // . → backslash
    "005d" to "005d", // . → bracketright
    "005e" to "005e", // . → asciicircum
    "005f" to "005f", // . → underscore
    "0060" to "0060", // . → grave
    "0060" to "0060", // . → quoteleft	/* deprecated */
    "0061" to "0061", // . → a
    "0062" to "0062", // . → b
    "0063" to "0063", // . → c
    "0064" to "0064", // . → d
    "0065" to "0065", // . → e
    "0066" to "0066", // . → f
    "0067" to "0067", // . → g
    "0068" to "0068", // . → h
    "0069" to "0069", // . → i
    "006a" to "006a", // . → j
    "006b" to "006b", // . → k
    "006c" to "006c", // . → l
    "006d" to "006d", // . → m
    "006e" to "006e", // . → n
    "006f" to "006f", // . → o
    "0070" to "0070", // . → p
    "0071" to "0071", // . → q
    "0072" to "0072", // . → r
    "0073" to "0073", // . → s
    "0074" to "0074", // . → t
    "0075" to "0075", // . → u
    "0076" to "0076", // . → v
    "0077" to "0077", // . → w
    "0078" to "0078", // . → x
    "0079" to "0079", // . → y
    "007a" to "007a", // . → z
    "007b" to "007b", // . → braceleft
    "007c" to "007c", // . → bar
    "007d" to "007d", // . → braceright
    "007e" to "007e", // . → asciitilde
    "00a0" to "00a0", // . → nobreakspace
    "00a1" to "00a1", // . → exclamdown
    "00a2" to "00a2", // . → cent
    "00a3" to "00a3", // . → sterling
    "00a4" to "00a4", // . → currency
    "00a5" to "00a5", // . → yen
    "00a6" to "00a6", // . → brokenbar
    "00a7" to "00a7", // . → section
    "00a8" to "00a8", // . → diaeresis
    "00a9" to "00a9", // . → copyright
    "00aa" to "00aa", // . → ordfeminine
    "00ab" to "00ab", // . → guillemotleft	/* left angle quotation mark */
    "00ac" to "00ac", // . → notsign
    "00ad" to "00ad", // . → hyphen
    "00ae" to "00ae", // . → registered
    "00af" to "00af", // . → macron
    "00b0" to "00b0", // . → degree
    "00b1" to "00b1", // . → plusminus
    "00b2" to "00b2", // . → twosuperior
    "00b3" to "00b3", // . → threesuperior
    "00b4" to "00b4", // . → acute
    "00b5" to "00b5", // . → mu
    "00b6" to "00b6", // . → paragraph
    "00b7" to "00b7", // . → periodcentered
    "00b8" to "00b8", // . → cedilla
    "00b9" to "00b9", // . → onesuperior
    "00ba" to "00ba", // . → masculine
    "00bb" to "00bb", // . → guillemotright	/* right angle quotation mark */
    "00bc" to "00bc", // . → onequarter
    "00bd" to "00bd", // . → onehalf
    "00be" to "00be", // . → threequarters
    "00bf" to "00bf", // . → questiondown
    "00c0" to "00c0", // . → Agrave
    "00c1" to "00c1", // . → Aacute
    "00c2" to "00c2", // . → Acircumflex
    "00c3" to "00c3", // . → Atilde
    "00c4" to "00c4", // . → Adiaeresis
    "00c5" to "00c5", // . → Aring
    "00c6" to "00c6", // . → AE
    "00c7" to "00c7", // . → Ccedilla
    "00c8" to "00c8", // . → Egrave
    "00c9" to "00c9", // . → Eacute
    "00ca" to "00ca", // . → Ecircumflex
    "00cb" to "00cb", // . → Ediaeresis
    "00cc" to "00cc", // . → Igrave
    "00cd" to "00cd", // . → Iacute
    "00ce" to "00ce", // . → Icircumflex
    "00cf" to "00cf", // . → Idiaeresis
    "00d0" to "00d0", // . → ETH
    "00d0" to "00d0", // . → Eth	/* deprecated */
    "00d1" to "00d1", // . → Ntilde
    "00d2" to "00d2", // . → Ograve
    "00d3" to "00d3", // . → Oacute
    "00d4" to "00d4", // . → Ocircumflex
    "00d5" to "00d5", // . → Otilde
    "00d6" to "00d6", // . → Odiaeresis
    "00d7" to "00d7", // . → multiply
    "00d8" to "00d8", // . → Ooblique
    "00d9" to "00d9", // . → Ugrave
    "00da" to "00da", // . → Uacute
    "00db" to "00db", // . → Ucircumflex
    "00dc" to "00dc", // . → Udiaeresis
    "00dd" to "00dd", // . → Yacute
    "00de" to "00de", // . → THORN
    "00de" to "00de", // . → Thorn	/* deprecated */
    "00df" to "00df", // . → ssharp
    "00e0" to "00e0", // . → agrave
    "00e1" to "00e1", // . → aacute
    "00e2" to "00e2", // . → acircumflex
    "00e3" to "00e3", // . → atilde
    "00e4" to "00e4", // . → adiaeresis
    "00e5" to "00e5", // . → aring
    "00e6" to "00e6", // . → ae
    "00e7" to "00e7", // . → ccedilla
    "00e8" to "00e8", // . → egrave
    "00e9" to "00e9", // . → eacute
    "00ea" to "00ea", // . → ecircumflex
    "00eb" to "00eb", // . → ediaeresis
    "00ec" to "00ec", // . → igrave
    "00ed" to "00ed", // . → iacute
    "00ee" to "00ee", // . → icircumflex
    "00ef" to "00ef", // . → idiaeresis
    "00f0" to "00f0", // . → eth
    "00f1" to "00f1", // . → ntilde
    "00f2" to "00f2", // . → ograve
    "00f3" to "00f3", // . → oacute
    "00f4" to "00f4", // . → ocircumflex
    "00f5" to "00f5", // . → otilde
    "00f6" to "00f6", // . → odiaeresis
    "00f7" to "00f7", // . → division
    "00f8" to "00f8", // . → oslash
    "00f9" to "00f9", // . → ugrave
    "00fa" to "00fa", // . → uacute
    "00fb" to "00fb", // . → ucircumflex
    "00fc" to "00fc", // . → udiaeresis
    "00fd" to "00fd", // . → yacute
    "00fe" to "00fe", // . → thorn
    "00ff" to "00ff", // . → ydiaeresis

    "01a1" to "0104", // . → Aogonek
    "01a2" to "02d8", // . → breve
    "01a3" to "0141", // . → Lstroke
    "01a5" to "013d", // . → Lcaron
    "01a6" to "015a", // . → Sacute
    "01a9" to "0160", // . → Scaron
    "01aa" to "015e", // . → Scedilla
    "01ab" to "0164", // . → Tcaron
    "01ac" to "0179", // . → Zacute
    "01ae" to "017d", // . → Zcaron
    "01af" to "017b", // . → Zabovedot
    "01b1" to "0105", // . → aogonek
    "01b2" to "02db", // . → ogonek
    "01b3" to "0142", // . → lstroke
    "01b5" to "013e", // . → lcaron
    "01b6" to "015b", // . → sacute
    "01b7" to "02c7", // . → caron
    "01b9" to "0161", // . → scaron
    "01ba" to "015f", // . → scedilla
    "01bb" to "0165", // . → tcaron
    "01bc" to "017a", // . → zacute
    "01bd" to "02dd", // . → doubleacute
    "01be" to "017e", // . → zcaron
    "01bf" to "017c", // . → zabovedot
    "01c0" to "0154", // . → Racute
    "01c3" to "0102", // . → Abreve
    "01c5" to "0139", // . → Lacute
    "01c6" to "0106", // . → Cacute
    "01c8" to "010c", // . → Ccaron
    "01ca" to "0118", // . → Eogonek
    "01cc" to "011a", // . → Ecaron
    "01cf" to "010e", // . → Dcaron
    "01d0" to "0110", // . → Dstroke
    "01d1" to "0143", // . → Nacute
    "01d2" to "0147", // . → Ncaron
    "01d5" to "0150", // . → Odoubleacute
    "01d8" to "0158", // . → Rcaron
    "01d9" to "016e", // . → Uring
    "01db" to "0170", // . → Udoubleacute
    "01de" to "0162", // . → Tcedilla
    "01e0" to "0155", // . → racute
    "01e3" to "0103", // . → abreve
    "01e5" to "013a", // . → lacute
    "01e6" to "0107", // . → cacute
    "01e8" to "010d", // . → ccaron
    "01ea" to "0119", // . → eogonek
    "01ec" to "011b", // . → ecaron
    "01ef" to "010f", // . → dcaron
    "01f0" to "0111", // . → dstroke
    "01f1" to "0144", // . → nacute
    "01f2" to "0148", // . → ncaron
    "01f5" to "0151", // . → odoubleacute
    "01f8" to "0159", // . → rcaron
    "01f9" to "016f", // . → uring
    "01fb" to "0171", // . → udoubleacute
    "01fe" to "0163", // . → tcedilla
    "01ff" to "02d9", // . → abovedot
    "02a1" to "0126", // . → Hstroke
    "02a6" to "0124", // . → Hcircumflex
    "02a9" to "0130", // . → Iabovedot
    "02ab" to "011e", // . → Gbreve
    "02ac" to "0134", // . → Jcircumflex
    "02b1" to "0127", // . → hstroke
    "02b6" to "0125", // . → hcircumflex
    "02b9" to "0131", // . → idotless
    "02bb" to "011f", // . → gbreve
    "02bc" to "0135", // . → jcircumflex
    "02c5" to "010a", // . → Cabovedot
    "02c6" to "0108", // . → Ccircumflex
    "02d5" to "0120", // . → Gabovedot
    "02d8" to "011c", // . → Gcircumflex
    "02dd" to "016c", // . → Ubreve
    "02de" to "015c", // . → Scircumflex
    "02e5" to "010b", // . → cabovedot
    "02e6" to "0109", // . → ccircumflex
    "02f5" to "0121", // . → gabovedot
    "02f8" to "011d", // . → gcircumflex
    "02fd" to "016d", // . → ubreve
    "02fe" to "015d", // . → scircumflex
    "03a2" to "0138", // . → kra
    "03a3" to "0156", // . → Rcedilla
    "03a5" to "0128", // . → Itilde
    "03a6" to "013b", // . → Lcedilla
    "03aa" to "0112", // . → Emacron
    "03ab" to "0122", // . → Gcedilla
    "03ac" to "0166", // . → Tslash
    "03b3" to "0157", // . → rcedilla
    "03b5" to "0129", // . → itilde
    "03b6" to "013c", // . → lcedilla
    "03ba" to "0113", // . → emacron
    "03bb" to "0123", // . → gcedilla
    "03bc" to "0167", // . → tslash
    "03bd" to "014a", // . → ENG
    "03bf" to "014b", // . → eng
    "03c0" to "0100", // . → Amacron
    "03c7" to "012e", // . → Iogonek
    "03cc" to "0116", // . → Eabovedot
    "03cf" to "012a", // . → Imacron
    "03d1" to "0145", // . → Ncedilla
    "03d2" to "014c", // . → Omacron
    "03d3" to "0136", // . → Kcedilla
    "03d9" to "0172", // . → Uogonek
    "03dd" to "0168", // . → Utilde
    "03de" to "016a", // . → Umacron
    "03e0" to "0101", // . → amacron
    "03e7" to "012f", // . → iogonek
    "03ec" to "0117", // . → eabovedot
    "03ef" to "012b", // . → imacron
    "03f1" to "0146", // . → ncedilla
    "03f2" to "014d", // . → omacron
    "03f3" to "0137", // . → kcedilla
    "03f9" to "0173", // . → uogonek
    "03fd" to "0169", // . → utilde
    "03fe" to "016b", // . → umacron
    "047e" to "203e", // . → overline
    "04a1" to "3002", // . → kana_fullstop
    "04a2" to "300c", // . → kana_openingbracket
    "04a3" to "300d", // . → kana_closingbracket
    "04a4" to "3001", // . → kana_comma
    "04a5" to "30fb", // . → kana_conjunctive
    "04a6" to "30f2", // . → kana_WO
    "04a7" to "30a1", // . → kana_a
    "04a8" to "30a3", // . → kana_i
    "04a9" to "30a5", // . → kana_u
    "04aa" to "30a7", // . → kana_e
    "04ab" to "30a9", // . → kana_o
    "04ac" to "30e3", // . → kana_ya
    "04ad" to "30e5", // . → kana_yu
    "04ae" to "30e7", // . → kana_yo
    "04af" to "30c3", // . → kana_tsu
    "04b0" to "30fc", // . → prolongedsound
    "04b1" to "30a2", // . → kana_A
    "04b2" to "30a4", // . → kana_I
    "04b3" to "30a6", // . → kana_U
    "04b4" to "30a8", // . → kana_E
    "04b5" to "30aa", // . → kana_O
    "04b6" to "30ab", // . → kana_KA
    "04b7" to "30ad", // . → kana_KI
    "04b8" to "30af", // . → kana_KU
    "04b9" to "30b1", // . → kana_KE
    "04ba" to "30b3", // . → kana_KO
    "04bb" to "30b5", // . → kana_SA
    "04bc" to "30b7", // . → kana_SHI
    "04bd" to "30b9", // . → kana_SU
    "04be" to "30bb", // . → kana_SE
    "04bf" to "30bd", // . → kana_SO
    "04c0" to "30bf", // . → kana_TA
    "04c1" to "30c1", // . → kana_CHI
    "04c2" to "30c4", // . → kana_TSU
    "04c3" to "30c6", // . → kana_TE
    "04c4" to "30c8", // . → kana_TO
    "04c5" to "30ca", // . → kana_NA
    "04c6" to "30cb", // . → kana_NI
    "04c7" to "30cc", // . → kana_NU
    "04c8" to "30cd", // . → kana_NE
    "04c9" to "30ce", // . → kana_NO
    "04ca" to "30cf", // . → kana_HA
    "04cb" to "30d2", // . → kana_HI
    "04cc" to "30d5", // . → kana_FU
    "04cd" to "30d8", // . → kana_HE
    "04ce" to "30db", // . → kana_HO
    "04cf" to "30de", // . → kana_MA
    "04d0" to "30df", // . → kana_MI
    "04d1" to "30e0", // . → kana_MU
    "04d2" to "30e1", // . → kana_ME
    "04d3" to "30e2", // . → kana_MO
    "04d4" to "30e4", // . → kana_YA
    "04d5" to "30e6", // . → kana_YU
    "04d6" to "30e8", // . → kana_YO
    "04d7" to "30e9", // . → kana_RA
    "04d8" to "30ea", // . → kana_RI
    "04d9" to "30eb", // . → kana_RU
    "04da" to "30ec", // . → kana_RE
    "04db" to "30ed", // . → kana_RO
    "04dc" to "30ef", // . → kana_WA
    "04dd" to "30f3", // . → kana_N
    "04de" to "309b", // . → voicedsound
    "04df" to "309c", // . → semivoicedsound
    "05ac" to "060c", // . → Arabic_comma
    "05bb" to "061b", // . → Arabic_semicolon
    "05bf" to "061f", // . → Arabic_question_mark
    "05c1" to "0621", // . → Arabic_hamza
    "05c2" to "0622", // . → Arabic_maddaonalef
    "05c3" to "0623", // . → Arabic_hamzaonalef
    "05c4" to "0624", // . → Arabic_hamzaonwaw
    "05c5" to "0625", // . → Arabic_hamzaunderalef
    "05c6" to "0626", // . → Arabic_hamzaonyeh
    "05c7" to "0627", // . → Arabic_alef
    "05c8" to "0628", // . → Arabic_beh
    "05c9" to "0629", // . → Arabic_tehmarbuta
    "05ca" to "062a", // . → Arabic_teh
    "05cb" to "062b", // . → Arabic_theh
    "05cc" to "062c", // . → Arabic_jeem
    "05cd" to "062d", // . → Arabic_hah
    "05ce" to "062e", // . → Arabic_khah
    "05cf" to "062f", // . → Arabic_dal
    "05d0" to "0630", // . → Arabic_thal
    "05d1" to "0631", // . → Arabic_ra
    "05d2" to "0632", // . → Arabic_zain
    "05d3" to "0633", // . → Arabic_seen
    "05d4" to "0634", // . → Arabic_sheen
    "05d5" to "0635", // . → Arabic_sad
    "05d6" to "0636", // . → Arabic_dad
    "05d7" to "0637", // . → Arabic_tah
    "05d8" to "0638", // . → Arabic_zah
    "05d9" to "0639", // . → Arabic_ain
    "05da" to "063a", // . → Arabic_ghain
    "05e0" to "0640", // . → Arabic_tatweel
    "05e1" to "0641", // . → Arabic_feh
    "05e2" to "0642", // . → Arabic_qaf
    "05e3" to "0643", // . → Arabic_kaf
    "05e4" to "0644", // . → Arabic_lam
    "05e5" to "0645", // . → Arabic_meem
    "05e6" to "0646", // . → Arabic_noon
    "05e7" to "0647", // . → Arabic_ha
    "05e8" to "0648", // . → Arabic_waw
    "05e9" to "0649", // . → Arabic_alefmaksura
    "05ea" to "064a", // . → Arabic_yeh
    "05eb" to "064b", // . → Arabic_fathatan
    "05ec" to "064c", // . → Arabic_dammatan
    "05ed" to "064d", // . → Arabic_kasratan
    "05ee" to "064e", // . → Arabic_fatha
    "05ef" to "064f", // . → Arabic_damma
    "05f0" to "0650", // . → Arabic_kasra
    "05f1" to "0651", // . → Arabic_shadda
    "05f2" to "0652", // . → Arabic_sukun
    "06a1" to "0452", // . → Serbian_dje
    "06a2" to "0453", // . → Macedonia_gje
    "06a3" to "0451", // . → Cyrillic_io
    "06a4" to "0454", // . → Ukrainian_ie
    "06a5" to "0455", // . → Macedonia_dse
    "06a6" to "0456", // . → Ukrainian_i
    "06a7" to "0457", // . → Ukrainian_yi
    "06a8" to "0458", // . → Cyrillic_je
    "06a9" to "0459", // . → Cyrillic_lje
    "06aa" to "045a", // . → Cyrillic_nje
    "06ab" to "045b", // . → Serbian_tshe
    "06ac" to "045c", // . → Macedonia_kje
    "06ae" to "045e", // . → Byelorussian_shortu
    "06af" to "045f", // . → Cyrillic_dzhe
    "06b0" to "2116", // . → numerosign
    "06b1" to "0402", // . → Serbian_DJE
    "06b2" to "0403", // . → Macedonia_GJE
    "06b3" to "0401", // . → Cyrillic_IO
    "06b4" to "0404", // . → Ukrainian_IE
    "06b5" to "0405", // . → Macedonia_DSE
    "06b6" to "0406", // . → Ukrainian_I
    "06b7" to "0407", // . → Ukrainian_YI
    "06b8" to "0408", // . → Cyrillic_JE
    "06b9" to "0409", // . → Cyrillic_LJE
    "06ba" to "040a", // . → Cyrillic_NJE
    "06bb" to "040b", // . → Serbian_TSHE
    "06bc" to "040c", // . → Macedonia_KJE
    "06be" to "040e", // . → Byelorussian_SHORTU
    "06bf" to "040f", // . → Cyrillic_DZHE
    "06c0" to "044e", // . → Cyrillic_yu
    "06c1" to "0430", // . → Cyrillic_a
    "06c2" to "0431", // . → Cyrillic_be
    "06c3" to "0446", // . → Cyrillic_tse
    "06c4" to "0434", // . → Cyrillic_de
    "06c5" to "0435", // . → Cyrillic_ie
    "06c6" to "0444", // . → Cyrillic_ef
    "06c7" to "0433", // . → Cyrillic_ghe
    "06c8" to "0445", // . → Cyrillic_ha
    "06c9" to "0438", // . → Cyrillic_i
    "06ca" to "0439", // . → Cyrillic_shorti
    "06cb" to "043a", // . → Cyrillic_ka
    "06cc" to "043b", // . → Cyrillic_el
    "06cd" to "043c", // . → Cyrillic_em
    "06ce" to "043d", // . → Cyrillic_en
    "06cf" to "043e", // . → Cyrillic_o
    "06d0" to "043f", // . → Cyrillic_pe
    "06d1" to "044f", // . → Cyrillic_ya
    "06d2" to "0440", // . → Cyrillic_er
    "06d3" to "0441", // . → Cyrillic_es
    "06d4" to "0442", // . → Cyrillic_te
    "06d5" to "0443", // . → Cyrillic_u
    "06d6" to "0436", // . → Cyrillic_zhe
    "06d7" to "0432", // . → Cyrillic_ve
    "06d8" to "044c", // . → Cyrillic_softsign
    "06d9" to "044b", // . → Cyrillic_yeru
    "06da" to "0437", // . → Cyrillic_ze
    "06db" to "0448", // . → Cyrillic_sha
    "06dc" to "044d", // . → Cyrillic_e
    "06dd" to "0449", // . → Cyrillic_shcha
    "06de" to "0447", // . → Cyrillic_che
    "06df" to "044a", // . → Cyrillic_hardsign
    "06e0" to "042e", // . → Cyrillic_YU
    "06e1" to "0410", // . → Cyrillic_A
    "06e2" to "0411", // . → Cyrillic_BE
    "06e3" to "0426", // . → Cyrillic_TSE
    "06e4" to "0414", // . → Cyrillic_DE
    "06e5" to "0415", // . → Cyrillic_IE
    "06e6" to "0424", // . → Cyrillic_EF
    "06e7" to "0413", // . → Cyrillic_GHE
    "06e8" to "0425", // . → Cyrillic_HA
    "06e9" to "0418", // . → Cyrillic_I
    "06ea" to "0419", // . → Cyrillic_SHORTI
    "06eb" to "041a", // . → Cyrillic_KA
    "06ec" to "041b", // . → Cyrillic_EL
    "06ed" to "041c", // . → Cyrillic_EM
    "06ee" to "041d", // . → Cyrillic_EN
    "06ef" to "041e", // . → Cyrillic_O
    "06f0" to "041f", // . → Cyrillic_PE
    "06f1" to "042f", // . → Cyrillic_YA
    "06f2" to "0420", // . → Cyrillic_ER
    "06f3" to "0421", // . → Cyrillic_ES
    "06f4" to "0422", // . → Cyrillic_TE
    "06f5" to "0423", // . → Cyrillic_U
    "06f6" to "0416", // . → Cyrillic_ZHE
    "06f7" to "0412", // . → Cyrillic_VE
    "06f8" to "042c", // . → Cyrillic_SOFTSIGN
    "06f9" to "042b", // . → Cyrillic_YERU
    "06fa" to "0417", // . → Cyrillic_ZE
    "06fb" to "0428", // . → Cyrillic_SHA
    "06fc" to "042d", // . → Cyrillic_E
    "06fd" to "0429", // . → Cyrillic_SHCHA
    "06fe" to "0427", // . → Cyrillic_CHE
    "06ff" to "042a", // . → Cyrillic_HARDSIGN
    "07a1" to "0386", // . → Greek_ALPHAaccent
    "07a2" to "0388", // . → Greek_EPSILONaccent
    "07a3" to "0389", // . → Greek_ETAaccent
    "07a4" to "038a", // . → Greek_IOTAaccent
    "07a5" to "03aa", // . → Greek_IOTAdiaeresis
    "07a7" to "038c", // . → Greek_OMICRONaccent
    "07a8" to "038e", // . → Greek_UPSILONaccent
    "07a9" to "03ab", // . → Greek_UPSILONdieresis
    "07ab" to "038f", // . → Greek_OMEGAaccent
    "07ae" to "0385", // . → Greek_accentdieresis
    "07af" to "2015", // . → Greek_horizbar
    "07b1" to "03ac", // . → Greek_alphaaccent
    "07b2" to "03ad", // . → Greek_epsilonaccent
    "07b3" to "03ae", // . → Greek_etaaccent
    "07b4" to "03af", // . → Greek_iotaaccent
    "07b5" to "03ca", // . → Greek_iotadieresis
    "07b6" to "0390", // . → Greek_iotaaccentdieresis
    "07b7" to "03cc", // . → Greek_omicronaccent
    "07b8" to "03cd", // . → Greek_upsilonaccent
    "07b9" to "03cb", // . → Greek_upsilondieresis
    "07ba" to "03b0", // . → Greek_upsilonaccentdieresis
    "07bb" to "03ce", // . → Greek_omegaaccent
    "07c1" to "0391", // . → Greek_ALPHA
    "07c2" to "0392", // . → Greek_BETA
    "07c3" to "0393", // . → Greek_GAMMA
    "07c4" to "0394", // . → Greek_DELTA
    "07c5" to "0395", // . → Greek_EPSILON
    "07c6" to "0396", // . → Greek_ZETA
    "07c7" to "0397", // . → Greek_ETA
    "07c8" to "0398", // . → Greek_THETA
    "07c9" to "0399", // . → Greek_IOTA
    "07ca" to "039a", // . → Greek_KAPPA
    "07cb" to "039b", // . → Greek_LAMBDA
    "07cb" to "039b", // . → Greek_LAMDA
    "07cc" to "039c", // . → Greek_MU
    "07cd" to "039d", // . → Greek_NU
    "07ce" to "039e", // . → Greek_XI
    "07cf" to "039f", // . → Greek_OMICRON
    "07d0" to "03a0", // . → Greek_PI
    "07d1" to "03a1", // . → Greek_RHO
    "07d2" to "03a3", // . → Greek_SIGMA
    "07d4" to "03a4", // . → Greek_TAU
    "07d5" to "03a5", // . → Greek_UPSILON
    "07d6" to "03a6", // . → Greek_PHI
    "07d7" to "03a7", // . → Greek_CHI
    "07d8" to "03a8", // . → Greek_PSI
    "07d9" to "03a9", // . → Greek_OMEGA
    "07e1" to "03b1", // . → Greek_alpha
    "07e2" to "03b2", // . → Greek_beta
    "07e3" to "03b3", // . → Greek_gamma
    "07e4" to "03b4", // . → Greek_delta
    "07e5" to "03b5", // . → Greek_epsilon
    "07e6" to "03b6", // . → Greek_zeta
    "07e7" to "03b7", // . → Greek_eta
    "07e8" to "03b8", // . → Greek_theta
    "07e9" to "03b9", // . → Greek_iota
    "07ea" to "03ba", // . → Greek_kappa
    "07eb" to "03bb", // . → Greek_lambda
    "07ec" to "03bc", // . → Greek_mu
    "07ed" to "03bd", // . → Greek_nu
    "07ee" to "03be", // . → Greek_xi
    "07ef" to "03bf", // . → Greek_omicron
    "07f0" to "03c0", // . → Greek_pi
    "07f1" to "03c1", // . → Greek_rho
    "07f2" to "03c3", // . → Greek_sigma
    "07f3" to "03c2", // . → Greek_finalsmallsigma
    "07f4" to "03c4", // . → Greek_tau
    "07f5" to "03c5", // . → Greek_upsilon
    "07f6" to "03c6", // . → Greek_phi
    "07f7" to "03c7", // . → Greek_chi
    "07f8" to "03c8", // . → Greek_psi
    "07f9" to "03c9", // . → Greek_omega
    "08a1" to "23b7", // . → leftradical
    "08a2" to "250c", // d → topleftradical
    "08a3" to "2500", // d → horizconnector
    "08a4" to "2320", // . → topintegral
    "08a5" to "2321", // . → botintegral
    "08a6" to "2502", // d → vertconnector
    "08a7" to "23a1", // . → topleftsqbracket
    "08a8" to "23a3", // . → botleftsqbracket
    "08a9" to "23a4", // . → toprightsqbracket
    "08aa" to "23a6", // . → botrightsqbracket
    "08ab" to "239b", // . → topleftparens
    "08ac" to "239d", // . → botleftparens
    "08ad" to "239e", // . → toprightparens
    "08ae" to "23a0", // . → botrightparens
    "08af" to "23a8", // . → leftmiddlecurlybrace
    "08b0" to "23ac", // . → rightmiddlecurlybrace
//    0x08b1 to 0x0000, // o → topleftsummation
//    0x08b2 to 0x0000, // o → botleftsummation
//    0x08b3 to 0x0000, // o → topvertsummationconnector
//    0x08b4 to 0x0000, // o → botvertsummationconnector
//    0x08b5 to 0x0000, // o → toprightsummation
//    0x08b6 to 0x0000, // o → botrightsummation
//    0x08b7 to 0x0000, // o → rightmiddlesummation
    "08bc" to "2264", // . → lessthanequal
    "08bd" to "2260", // . → notequal
    "08be" to "2265", // . → greaterthanequal
    "08bf" to "222b", // . → integral
    "08c0" to "2234", // . → therefore
    "08c1" to "221d", // . → variation
    "08c2" to "221e", // . → infinity
    "08c5" to "2207", // . → nabla
    "08c8" to "223c", // . → approximate
    "08c9" to "2243", // . → similarequal
    "08cd" to "21d4", // . → ifonlyif
    "08ce" to "21d2", // . → implies
    "08cf" to "2261", // . → identical
    "08d6" to "221a", // . → radical
    "08da" to "2282", // . → includedin
    "08db" to "2283", // . → includes
    "08dc" to "2229", // . → intersection
    "08dd" to "222a", // . → union
    "08de" to "2227", // . → logicaland
    "08df" to "2228", // . → logicalor
    "08ef" to "2202", // . → partialderivative
    "08f6" to "0192", // . → function
    "08fb" to "2190", // . → leftarrow
    "08fc" to "2191", // . → uparrow
    "08fd" to "2192", // . → rightarrow
    "08fe" to "2193", // . → downarrow
//    0x09df to 0x0000, // o → blank
    "09e0" to "25c6", // . → soliddiamond
    "09e1" to "2592", // . → checkerboard
    "09e2" to "2409", // . → ht
    "09e3" to "240c", // . → ff
    "09e4" to "240d", // . → cr
    "09e5" to "240a", // . → lf
    "09e8" to "2424", // . → nl
    "09e9" to "240b", // . → vt
    "09ea" to "2518", // . → lowrightcorner
    "09eb" to "2510", // . → uprightcorner
    "09ec" to "250c", // . → upleftcorner
    "09ed" to "2514", // . → lowleftcorner
    "09ee" to "253c", // . → crossinglines
    "09ef" to "23ba", // . → horizlinescan1
    "09f0" to "23bb", // . → horizlinescan3
    "09f1" to "2500", // . → horizlinescan5
    "09f2" to "23bc", // . → horizlinescan7
    "09f3" to "23bd", // . → horizlinescan9
    "09f4" to "251c", // . → leftt
    "09f5" to "2524", // . → rightt
    "09f6" to "2534", // . → bott
    "09f7" to "252c", // . → topt
    "09f8" to "2502", // . → vertbar
    "0aa1" to "2003", // . → emspace
    "0aa2" to "2002", // . → enspace
    "0aa3" to "2004", // . → em3space
    "0aa4" to "2005", // . → em4space
    "0aa5" to "2007", // . → digitspace
    "0aa6" to "2008", // . → punctspace
    "0aa7" to "2009", // . → thinspace
    "0aa8" to "200a", // . → hairspace
    "0aa9" to "2014", // . → emdash
    "0aaa" to "2013", // . → endash
    "0aac" to "2423", // o → signifblank
    "0aae" to "2026", // . → ellipsis
    "0aaf" to "2025", // . → doubbaselinedot
    "0ab0" to "2153", // . → onethird
    "0ab1" to "2154", // . → twothirds
    "0ab2" to "2155", // . → onefifth
    "0ab3" to "2156", // . → twofifths
    "0ab4" to "2157", // . → threefifths
    "0ab5" to "2158", // . → fourfifths
    "0ab6" to "2159", // . → onesixth
    "0ab7" to "215a", // . → fivesixths
    "0ab8" to "2105", // . → careof
    "0abb" to "2012", // . → figdash
    "0abc" to "27e8", // o → leftanglebracket
    "0abd" to "002e", // o → decimalpoint
    "0abe" to "27e9", // o → rightanglebracket
//    0x0abf to 0x0000, // o → marker
    "0ac3" to "215b", // . → oneeighth
    "0ac4" to "215c", // . → threeeighths
    "0ac5" to "215d", // . → fiveeighths
    "0ac6" to "215e", // . → seveneighths
    "0ac9" to "2122", // . → trademark
    "0aca" to "2613", // o → signaturemark
//    0x0acb to 0x0000, // o → trademarkincircle
    "0acc" to "25c1", // o → leftopentriangle
    "0acd" to "25b7", // o → rightopentriangle
    "0ace" to "25cb", // o → emopencircle
    "0acf" to "25af", // o → emopenrectangle
    "0ad0" to "2018", // . → leftsinglequotemark
    "0ad1" to "2019", // . → rightsinglequotemark
    "0ad2" to "201c", // . → leftdoublequotemark
    "0ad3" to "201d", // . → rightdoublequotemark
    "0ad4" to "211e", // . → prescription
    "0ad6" to "2032", // . → minutes
    "0ad7" to "2033", // . → seconds
    "0ad9" to "271d", // . → latincross
//    0x0ada to 0x0000, // o → hexagram
    "0adb" to "25ac", // o → filledrectbullet
    "0adc" to "25c0", // o → filledlefttribullet
    "0add" to "25b6", // o → filledrighttribullet
    "0ade" to "25cf", // o → emfilledcircle
    "0adf" to "25ae", // o → emfilledrect
    "0ae0" to "25e6", // o → enopencircbullet
    "0ae1" to "25ab", // o → enopensquarebullet
    "0ae2" to "25ad", // o → openrectbullet
    "0ae3" to "25b3", // o → opentribulletup
    "0ae4" to "25bd", // o → opentribulletdown
    "0ae5" to "2606", // o → openstar
    "0ae6" to "2022", // o → enfilledcircbullet
    "0ae7" to "25aa", // o → enfilledsqbullet
    "0ae8" to "25b2", // o → filledtribulletup
    "0ae9" to "25bc", // o → filledtribulletdown
    "0aea" to "261c", // o → leftpointer
    "0aeb" to "261e", // o → rightpointer
    "0aec" to "2663", // . → club
    "0aed" to "2666", // . → diamond
    "0aee" to "2665", // . → heart
    "0af0" to "2720", // . → maltesecross
    "0af1" to "2020", // . → dagger
    "0af2" to "2021", // . → doubledagger
    "0af3" to "2713", // . → checkmark
    "0af4" to "2717", // . → ballotcross
    "0af5" to "266f", // . → musicalsharp
    "0af6" to "266d", // . → musicalflat
    "0af7" to "2642", // . → malesymbol
    "0af8" to "2640", // . → femalesymbol
    "0af9" to "260e", // . → telephone
    "0afa" to "2315", // . → telephonerecorder
    "0afb" to "2117", // . → phonographcopyright
    "0afc" to "2038", // . → caret
    "0afd" to "201a", // . → singlelowquotemark
    "0afe" to "201e", // . → doublelowquotemark
//    0x0aff to 0x0000, // o → cursor
    "0ba3" to "003c", // d → leftcaret
    "0ba6" to "003e", // d → rightcaret
    "0ba8" to "2228", // d → downcaret
    "0ba9" to "2227", // d → upcaret
    "0bc0" to "00af", // d → overbar
    "0bc2" to "22a5", // . → downtack
    "0bc3" to "2229", // d → upshoe
    "0bc4" to "230a", // . → downstile
    "0bc6" to "005f", // d → underbar
    "0bca" to "2218", // . → jot
    "0bcc" to "2395", // . → quad
    "0bce" to "22a4", // . → uptack
    "0bcf" to "25cb", // . → circle
    "0bd3" to "2308", // . → upstile
    "0bd6" to "222a", // d → downshoe
    "0bd8" to "2283", // d → rightshoe
    "0bda" to "2282", // d → leftshoe
    "0bdc" to "22a2", // . → lefttack
    "0bfc" to "22a3", // . → righttack
    "0cdf" to "2017", // . → hebrew_doublelowline
    "0ce0" to "05d0", // . → hebrew_aleph
    "0ce1" to "05d1", // . → hebrew_bet
    "0ce1" to "05d1", // . → hebrew_beth /* deprecated */
    "0ce2" to "05d2", // . → hebrew_gimel
    "0ce2" to "05d2", // . → hebrew_gimmel /* deprecated */
    "0ce3" to "05d3", // . → hebrew_dalet
    "0ce3" to "05d3", // . → hebrew_daleth /* deprecated */
    "0ce4" to "05d4", // . → hebrew_he
    "0ce5" to "05d5", // . → hebrew_waw
    "0ce6" to "05d6", // . → hebrew_zain
    "0ce6" to "05d6", // . → hebrew_zayin /* deprecated */
    "0ce7" to "05d7", // . → hebrew_chet
    "0ce7" to "05d7", // . → hebrew_het /* deprecated */
    "0ce8" to "05d8", // . → hebrew_tet
    "0ce8" to "05d8", // . → hebrew_teth /* deprecated */
    "0ce9" to "05d9", // . → hebrew_yod
    "0cea" to "05da", // . → hebrew_finalkaph
    "0ceb" to "05db", // . → hebrew_kaph
    "0cec" to "05dc", // . → hebrew_lamed
    "0ced" to "05dd", // . → hebrew_finalmem
    "0cee" to "05de", // . → hebrew_mem
    "0cef" to "05df", // . → hebrew_finalnun
    "0cf0" to "05e0", // . → hebrew_nun
    "0cf1" to "05e1", // . → hebrew_samech
    "0cf1" to "05e1", // . → hebrew_samekh /* deprecated */
    "0cf2" to "05e2", // . → hebrew_ayin
    "0cf3" to "05e3", // . → hebrew_finalpe
    "0cf4" to "05e4", // . → hebrew_pe
    "0cf5" to "05e5", // . → hebrew_finalzade
    "0cf5" to "05e5", // . → hebrew_finalzadi /* deprecated */
    "0cf6" to "05e6", // . → hebrew_zade
    "0cf6" to "05e6", // . → hebrew_zadi /* deprecated */
    "0cf7" to "05e7", // . → hebrew_kuf /* deprecated */
    "0cf7" to "05e7", // . → hebrew_qoph
    "0cf8" to "05e8", // . → hebrew_resh
    "0cf9" to "05e9", // . → hebrew_shin
    "0cfa" to "05ea", // . → hebrew_taf /* deprecated */
    "0cfa" to "05ea", // . → hebrew_taw
    "0da1" to "0e01", // . → Thai_kokai
    "0da2" to "0e02", // . → Thai_khokhai
    "0da3" to "0e03", // . → Thai_khokhuat
    "0da4" to "0e04", // . → Thai_khokhwai
    "0da5" to "0e05", // . → Thai_khokhon
    "0da6" to "0e06", // . → Thai_khorakhang
    "0da7" to "0e07", // . → Thai_ngongu
    "0da8" to "0e08", // . → Thai_chochan
    "0da9" to "0e09", // . → Thai_choching
    "0daa" to "0e0a", // . → Thai_chochang
    "0dab" to "0e0b", // . → Thai_soso
    "0dac" to "0e0c", // . → Thai_chochoe
    "0dad" to "0e0d", // . → Thai_yoying
    "0dae" to "0e0e", // . → Thai_dochada
    "0daf" to "0e0f", // . → Thai_topatak
    "0db0" to "0e10", // . → Thai_thothan
    "0db1" to "0e11", // . → Thai_thonangmontho
    "0db2" to "0e12", // . → Thai_thophuthao
    "0db3" to "0e13", // . → Thai_nonen
    "0db4" to "0e14", // . → Thai_dodek
    "0db5" to "0e15", // . → Thai_totao
    "0db6" to "0e16", // . → Thai_thothung
    "0db7" to "0e17", // . → Thai_thothahan
    "0db8" to "0e18", // . → Thai_thothong
    "0db9" to "0e19", // . → Thai_nonu
    "0dba" to "0e1a", // . → Thai_bobaimai
    "0dbb" to "0e1b", // . → Thai_popla
    "0dbc" to "0e1c", // . → Thai_phophung
    "0dbd" to "0e1d", // . → Thai_fofa
    "0dbe" to "0e1e", // . → Thai_phophan
    "0dbf" to "0e1f", // . → Thai_fofan
    "0dc0" to "0e20", // . → Thai_phosamphao
    "0dc1" to "0e21", // . → Thai_moma
    "0dc2" to "0e22", // . → Thai_yoyak
    "0dc3" to "0e23", // . → Thai_rorua
    "0dc4" to "0e24", // . → Thai_ru
    "0dc5" to "0e25", // . → Thai_loling
    "0dc6" to "0e26", // . → Thai_lu
    "0dc7" to "0e27", // . → Thai_wowaen
    "0dc8" to "0e28", // . → Thai_sosala
    "0dc9" to "0e29", // . → Thai_sorusi
    "0dca" to "0e2a", // . → Thai_sosua
    "0dcb" to "0e2b", // . → Thai_hohip
    "0dcc" to "0e2c", // . → Thai_lochula
    "0dcd" to "0e2d", // . → Thai_oang
    "0dce" to "0e2e", // . → Thai_honokhuk
    "0dcf" to "0e2f", // . → Thai_paiyannoi
    "0dd0" to "0e30", // . → Thai_saraa
    "0dd1" to "0e31", // . → Thai_maihanakat
    "0dd2" to "0e32", // . → Thai_saraaa
    "0dd3" to "0e33", // . → Thai_saraam
    "0dd4" to "0e34", // . → Thai_sarai
    "0dd5" to "0e35", // . → Thai_saraii
    "0dd6" to "0e36", // . → Thai_saraue
    "0dd7" to "0e37", // . → Thai_sarauee
    "0dd8" to "0e38", // . → Thai_sarau
    "0dd9" to "0e39", // . → Thai_sarauu
    "0dda" to "0e3a", // . → Thai_phinthu
//    0x0dde to 0x0000, // o → Thai_maihanakat_maitho
    "0ddf" to "0e3f", // . → Thai_baht
    "0de0" to "0e40", // . → Thai_sarae
    "0de1" to "0e41", // . → Thai_saraae
    "0de2" to "0e42", // . → Thai_sarao
    "0de3" to "0e43", // . → Thai_saraaimaimuan
    "0de4" to "0e44", // . → Thai_saraaimaimalai
    "0de5" to "0e45", // . → Thai_lakkhangyao
    "0de6" to "0e46", // . → Thai_maiyamok
    "0de7" to "0e47", // . → Thai_maitaikhu
    "0de8" to "0e48", // . → Thai_maiek
    "0de9" to "0e49", // . → Thai_maitho
    "0dea" to "0e4a", // . → Thai_maitri
    "0deb" to "0e4b", // . → Thai_maichattawa
    "0dec" to "0e4c", // . → Thai_thanthakhat
    "0ded" to "0e4d", // . → Thai_nikhahit
    "0df0" to "0e50", // . → Thai_leksun
    "0df1" to "0e51", // . → Thai_leknung
    "0df2" to "0e52", // . → Thai_leksong
    "0df3" to "0e53", // . → Thai_leksam
    "0df4" to "0e54", // . → Thai_leksi
    "0df5" to "0e55", // . → Thai_lekha
    "0df6" to "0e56", // . → Thai_lekhok
    "0df7" to "0e57", // . → Thai_lekchet
    "0df8" to "0e58", // . → Thai_lekpaet
    "0df9" to "0e59", // . → Thai_lekkao
    "0ea1" to "3131", // f → Hangul_Kiyeog
    "0ea2" to "3132", // f → Hangul_SsangKiyeog
    "0ea3" to "3133", // f → Hangul_KiyeogSios
    "0ea4" to "3134", // f → Hangul_Nieun
    "0ea5" to "3135", // f → Hangul_NieunJieuj
    "0ea6" to "3136", // f → Hangul_NieunHieuh
    "0ea7" to "3137", // f → Hangul_Dikeud
    "0ea8" to "3138", // f → Hangul_SsangDikeud
    "0ea9" to "3139", // f → Hangul_Rieul
    "0eaa" to "313a", // f → Hangul_RieulKiyeog
    "0eab" to "313b", // f → Hangul_RieulMieum
    "0eac" to "313c", // f → Hangul_RieulPieub
    "0ead" to "313d", // f → Hangul_RieulSios
    "0eae" to "313e", // f → Hangul_RieulTieut
    "0eaf" to "313f", // f → Hangul_RieulPhieuf
    "0eb0" to "3140", // f → Hangul_RieulHieuh
    "0eb1" to "3141", // f → Hangul_Mieum
    "0eb2" to "3142", // f → Hangul_Pieub
    "0eb3" to "3143", // f → Hangul_SsangPieub
    "0eb4" to "3144", // f → Hangul_PieubSios
    "0eb5" to "3145", // f → Hangul_Sios
    "0eb6" to "3146", // f → Hangul_SsangSios
    "0eb7" to "3147", // f → Hangul_Ieung
    "0eb8" to "3148", // f → Hangul_Jieuj
    "0eb9" to "3149", // f → Hangul_SsangJieuj
    "0eba" to "314a", // f → Hangul_Cieuc
    "0ebb" to "314b", // f → Hangul_Khieuq
    "0ebc" to "314c", // f → Hangul_Tieut
    "0ebd" to "314d", // f → Hangul_Phieuf
    "0ebe" to "314e", // f → Hangul_Hieuh
    "0ebf" to "314f", // f → Hangul_A
    "0ec0" to "3150", // f → Hangul_AE
    "0ec1" to "3151", // f → Hangul_YA
    "0ec2" to "3152", // f → Hangul_YAE
    "0ec3" to "3153", // f → Hangul_EO
    "0ec4" to "3154", // f → Hangul_E
    "0ec5" to "3155", // f → Hangul_YEO
    "0ec6" to "3156", // f → Hangul_YE
    "0ec7" to "3157", // f → Hangul_O
    "0ec8" to "3158", // f → Hangul_WA
    "0ec9" to "3159", // f → Hangul_WAE
    "0eca" to "315a", // f → Hangul_OE
    "0ecb" to "315b", // f → Hangul_YO
    "0ecc" to "315c", // f → Hangul_U
    "0ecd" to "315d", // f → Hangul_WEO
    "0ece" to "315e", // f → Hangul_WE
    "0ecf" to "315f", // f → Hangul_WI
    "0ed0" to "3160", // f → Hangul_YU
    "0ed1" to "3161", // f → Hangul_EU
    "0ed2" to "3162", // f → Hangul_YI
    "0ed3" to "3163", // f → Hangul_I
    "0ed4" to "11a8", // f → Hangul_J_Kiyeog
    "0ed5" to "11a9", // f → Hangul_J_SsangKiyeog
    "0ed6" to "11aa", // f → Hangul_J_KiyeogSios
    "0ed7" to "11ab", // f → Hangul_J_Nieun
    "0ed8" to "11ac", // f → Hangul_J_NieunJieuj
    "0ed9" to "11ad", // f → Hangul_J_NieunHieuh
    "0eda" to "11ae", // f → Hangul_J_Dikeud
    "0edb" to "11af", // f → Hangul_J_Rieul
    "0edc" to "11b0", // f → Hangul_J_RieulKiyeog
    "0edd" to "11b1", // f → Hangul_J_RieulMieum
    "0ede" to "11b2", // f → Hangul_J_RieulPieub
    "0edf" to "11b3", // f → Hangul_J_RieulSios
    "0ee0" to "11b4", // f → Hangul_J_RieulTieut
    "0ee1" to "11b5", // f → Hangul_J_RieulPhieuf
    "0ee2" to "11b6", // f → Hangul_J_RieulHieuh
    "0ee3" to "11b7", // f → Hangul_J_Mieum
    "0ee4" to "11b8", // f → Hangul_J_Pieub
    "0ee5" to "11b9", // f → Hangul_J_PieubSios
    "0ee6" to "11ba", // f → Hangul_J_Sios
    "0ee7" to "11bb", // f → Hangul_J_SsangSios
    "0ee8" to "11bc", // f → Hangul_J_Ieung
    "0ee9" to "11bd", // f → Hangul_J_Jieuj
    "0eea" to "11be", // f → Hangul_J_Cieuc
    "0eeb" to "11bf", // f → Hangul_J_Khieuq
    "0eec" to "11c0", // f → Hangul_J_Tieut
    "0eed" to "11c1", // f → Hangul_J_Phieuf
    "0eee" to "11c2", // f → Hangul_J_Hieuh
    "0eef" to "316d", // f → Hangul_RieulYeorinHieuh
    "0ef0" to "3171", // f → Hangul_SunkyeongeumMieum
    "0ef1" to "3178", // f → Hangul_SunkyeongeumPieub
    "0ef2" to "317f", // f → Hangul_PanSios
    "0ef3" to "3181", // f → Hangul_KkogjiDalrinIeung
    "0ef4" to "3184", // f → Hangul_SunkyeongeumPhieuf
    "0ef5" to "3186", // f → Hangul_YeorinHieuh
    "0ef6" to "318d", // f → Hangul_AraeA
    "0ef7" to "318e", // f → Hangul_AraeAE
    "0ef8" to "11eb", // f → Hangul_J_PanSios
    "0ef9" to "11f0", // f → Hangul_J_KkogjiDalrinIeung
    "0efa" to "11f9", // f → Hangul_J_YeorinHieuh
    "0eff" to "20a9", // o → Korean_Won
    "13bc" to "0152", // . → OE
    "13bd" to "0153", // . → oe
    "13be" to "0178", // . → Ydiaeresis
    "20a0" to "20a0", // u → EcuSign
    "20a1" to "20a1", // u → ColonSign
    "20a2" to "20a2", // u → CruzeiroSign
    "20a3" to "20a3", // u → FFrancSign
    "20a4" to "20a4", // u → LiraSign
    "20a5" to "20a5", // u → MillSign
    "20a6" to "20a6", // u → NairaSign
    "20a7" to "20a7", // u → PesetaSign
    "20a8" to "20a8", // u → RupeeSign
    "20a9" to "20a9", // u → WonSign
    "20aa" to "20aa", // u → NewSheqelSign
    "20ab" to "20ab", // u → DongSign
    "20ac" to "20ac", // . → EuroSign
//    0xfd01 to 0x0000, // f → 3270_Duplicate
//    0xfd02 to 0x0000, // f → 3270_FieldMark
//    0xfd03 to 0x0000, // f → 3270_Right2
//    0xfd04 to 0x0000, // f → 3270_Left2
//    0xfd05 to 0x0000, // f → 3270_BackTab
//    0xfd06 to 0x0000, // f → 3270_EraseEOF
//    0xfd07 to 0x0000, // f → 3270_EraseInput
//    0xfd08 to 0x0000, // f → 3270_Reset
//    0xfd09 to 0x0000, // f → 3270_Quit
//    0xfd0a to 0x0000, // f → 3270_PA1
//    0xfd0b to 0x0000, // f → 3270_PA2
//    0xfd0c to 0x0000, // f → 3270_PA3
//    0xfd0d to 0x0000, // f → 3270_Test
//    0xfd0e to 0x0000, // f → 3270_Attn
//    0xfd0f to 0x0000, // f → 3270_CursorBlink
//    0xfd10 to 0x0000, // f → 3270_AltCursor
//    0xfd11 to 0x0000, // f → 3270_KeyClick
//    0xfd12 to 0x0000, // f → 3270_Jump
//    0xfd13 to 0x0000, // f → 3270_Ident
//    0xfd14 to 0x0000, // f → 3270_Rule
//    0xfd15 to 0x0000, // f → 3270_Copy
//    0xfd16 to 0x0000, // f → 3270_Play
//    0xfd17 to 0x0000, // f → 3270_Setup
//    0xfd18 to 0x0000, // f → 3270_Record
//    0xfd19 to 0x0000, // f → 3270_ChangeScreen
//    0xfd1a to 0x0000, // f → 3270_DeleteWord
//    0xfd1b to 0x0000, // f → 3270_ExSelect
//    0xfd1c to 0x0000, // f → 3270_CursorSelect
//    0xfd1d to 0x0000, // f → 3270_PrintScreen
//    0xfd1e to 0x0000, // f → 3270_Enter
//    0xfe01 to 0x0000, // f → ISO_Lock
//    0xfe02 to 0x0000, // f → ISO_Level2_Latch
//    0xfe03 to 0x0000, // f → ISO_Level3_Shift
//    0xfe04 to 0x0000, // f → ISO_Level3_Latch
//    0xfe05 to 0x0000, // f → ISO_Level3_Lock
//    0xfe06 to 0x0000, // f → ISO_Group_Latch
//    0xfe07 to 0x0000, // f → ISO_Group_Lock
//    0xfe08 to 0x0000, // f → ISO_Next_Group
//    0xfe09 to 0x0000, // f → ISO_Next_Group_Lock
//    0xfe0a to 0x0000, // f → ISO_Prev_Group
//    0xfe0b to 0x0000, // f → ISO_Prev_Group_Lock
//    0xfe0c to 0x0000, // f → ISO_First_Group
//    0xfe0d to 0x0000, // f → ISO_First_Group_Lock
//    0xfe0e to 0x0000, // f → ISO_Last_Group
//    0xfe0f to 0x0000, // f → ISO_Last_Group_Lock
//    0xfe20 to 0x0000, // f → ISO_Left_Tab
//    0xfe21 to 0x0000, // f → ISO_Move_Line_Up
//    0xfe22 to 0x0000, // f → ISO_Move_Line_Down
//    0xfe23 to 0x0000, // f → ISO_Partial_Line_Up
//    0xfe24 to 0x0000, // f → ISO_Partial_Line_Down
//    0xfe25 to 0x0000, // f → ISO_Partial_Space_Left
//    0xfe26 to 0x0000, // f → ISO_Partial_Space_Right
//    0xfe27 to 0x0000, // f → ISO_Set_Margin_Left
//    0xfe28 to 0x0000, // f → ISO_Set_Margin_Right
//    0xfe29 to 0x0000, // f → ISO_Release_Margin_Left
//    0xfe2a to 0x0000, // f → ISO_Release_Margin_Right
//    0xfe2b to 0x0000, // f → ISO_Release_Both_Margins
//    0xfe2c to 0x0000, // f → ISO_Fast_Cursor_Left
//    0xfe2d to 0x0000, // f → ISO_Fast_Cursor_Right
//    0xfe2e to 0x0000, // f → ISO_Fast_Cursor_Up
//    0xfe2f to 0x0000, // f → ISO_Fast_Cursor_Down
//    0xfe30 to 0x0000, // f → ISO_Continuous_Underline
//    0xfe31 to 0x0000, // f → ISO_Discontinuous_Underline
//    0xfe32 to 0x0000, // f → ISO_Emphasize
//    0xfe33 to 0x0000, // f → ISO_Center_Object
//    0xfe34 to 0x0000, // f → ISO_Enter
    "fe50" to "0300", // f → dead_grave
    "fe51" to "0301", // f → dead_acute
    "fe52" to "0302", // f → dead_circumflex
    "fe53" to "0303", // f → dead_tilde
    "fe54" to "0304", // f → dead_macron
    "fe55" to "0306", // f → dead_breve
    "fe56" to "0307", // f → dead_abovedot
    "fe57" to "0308", // f → dead_diaeresis
    "fe58" to "030a", // f → dead_abovering
    "fe59" to "030b", // f → dead_doubleacute
    "fe5a" to "030c", // f → dead_caron
    "fe5b" to "0327", // f → dead_cedilla
    "fe5c" to "0328", // f → dead_ogonek
    "fe5d" to "0345", // f → dead_iota
    "fe5e" to "3099", // f → dead_voiced_sound
    "fe5f" to "309a", // f → dead_semivoiced_sound
//    0xfe70 to 0x0000, // f → AccessX_Enable
//    0xfe71 to 0x0000, // f → AccessX_Feedback_Enable
//    0xfe72 to 0x0000, // f → RepeatKeys_Enable
//    0xfe73 to 0x0000, // f → SlowKeys_Enable
//    0xfe74 to 0x0000, // f → BounceKeys_Enable
//    0xfe75 to 0x0000, // f → StickyKeys_Enable
//    0xfe76 to 0x0000, // f → MouseKeys_Enable
//    0xfe77 to 0x0000, // f → MouseKeys_Accel_Enable
//    0xfe78 to 0x0000, // f → Overlay1_Enable
//    0xfe79 to 0x0000, // f → Overlay2_Enable
//    0xfe7a to 0x0000, // f → AudibleBell_Enable
//    0xfed0 to 0x0000, // f → First_Virtual_Screen
//    0xfed1 to 0x0000, // f → Prev_Virtual_Screen
//    0xfed2 to 0x0000, // f → Next_Virtual_Screen
//    0xfed4 to 0x0000, // f → Last_Virtual_Screen
//    0xfed5 to 0x0000, // f → Terminate_Server
//    0xfee0 to 0x0000, // f → Pointer_Left
//    0xfee1 to 0x0000, // f → Pointer_Right
//    0xfee2 to 0x0000, // f → Pointer_Up
//    0xfee3 to 0x0000, // f → Pointer_Down
//    0xfee4 to 0x0000, // f → Pointer_UpLeft
//    0xfee5 to 0x0000, // f → Pointer_UpRight
//    0xfee6 to 0x0000, // f → Pointer_DownLeft
//    0xfee7 to 0x0000, // f → Pointer_DownRight
//    0xfee8 to 0x0000, // f → Pointer_Button_Dflt
//    0xfee9 to 0x0000, // f → Pointer_Button1
//    0xfeea to 0x0000, // f → Pointer_Button2
//    0xfeeb to 0x0000, // f → Pointer_Button3
//    0xfeec to 0x0000, // f → Pointer_Button4
//    0xfeed to 0x0000, // f → Pointer_Button5
//    0xfeee to 0x0000, // f → Pointer_DblClick_Dflt
//    0xfeef to 0x0000, // f → Pointer_DblClick1
//    0xfef0 to 0x0000, // f → Pointer_DblClick2
//    0xfef1 to 0x0000, // f → Pointer_DblClick3
//    0xfef2 to 0x0000, // f → Pointer_DblClick4
//    0xfef3 to 0x0000, // f → Pointer_DblClick5
//    0xfef4 to 0x0000, // f → Pointer_Drag_Dflt
//    0xfef5 to 0x0000, // f → Pointer_Drag1
//    0xfef6 to 0x0000, // f → Pointer_Drag2
//    0xfef7 to 0x0000, // f → Pointer_Drag3
//    0xfef8 to 0x0000, // f → Pointer_Drag4
//    0xfef9 to 0x0000, // f → Pointer_EnableKeys
//    0xfefa to 0x0000, // f → Pointer_Accelerate
//    0xfefb to 0x0000, // f → Pointer_DfltBtnNext
//    0xfefc to 0x0000, // f → Pointer_DfltBtnPrev
//    0xfefd to 0x0000, // f → Pointer_Drag5
    "ff08" to "0008", // f → BackSpace	/* back space, back char */
    "ff09" to "0009", // f → Tab
    "ff0a" to "000a", // f → Linefeed	/* Linefeed, LF */
    "ff0b" to "000b", // f → Clear
    "ff0d" to "000d", // f → Return	/* Return, enter */
    "ff13" to "0013", // f → Pause	/* Pause, hold */
    "ff14" to "0014", // f → Scroll_Lock
    "ff15" to "0015", // f → Sys_Req
    "ff1b" to "001b", // f → Escape
//    0xff20 to 0x0000, // f → Multi_key
//    0xff21 to 0x0000, // f → Kanji
//    0xff22 to 0x0000, // f → Muhenkan
//    0xff23 to 0x0000, // f → Henkan_Mode
//    0xff24 to 0x0000, // f → Romaji
//    0xff25 to 0x0000, // f → Hiragana
//    0xff26 to 0x0000, // f → Katakana
//    0xff27 to 0x0000, // f → Hiragana_Katakana
//    0xff28 to 0x0000, // f → Zenkaku
//    0xff29 to 0x0000, // f → Hankaku
//    0xff2a to 0x0000, // f → Zenkaku_Hankaku
//    0xff2b to 0x0000, // f → Touroku
//    0xff2c to 0x0000, // f → Massyo
//    0xff2d to 0x0000, // f → Kana_Lock
//    0xff2e to 0x0000, // f → Kana_Shift
//    0xff2f to 0x0000, // f → Eisu_Shift
//    0xff30 to 0x0000, // f → Eisu_toggle
//    0xff31 to 0x0000, // f → Hangul
//    0xff32 to 0x0000, // f → Hangul_Start
//    0xff33 to 0x0000, // f → Hangul_End
//    0xff34 to 0x0000, // f → Hangul_Hanja
//    0xff35 to 0x0000, // f → Hangul_Jamo
//    0xff36 to 0x0000, // f → Hangul_Romaja
//    0xff37 to 0x0000, // f → Codeinput
//    0xff38 to 0x0000, // f → Hangul_Jeonja
//    0xff39 to 0x0000, // f → Hangul_Banja
//    0xff3a to 0x0000, // f → Hangul_PreHanja
//    0xff3b to 0x0000, // f → Hangul_PostHanja
//    0xff3c to 0x0000, // f → SingleCandidate
//    0xff3d to 0x0000, // f → MultipleCandidate
//    0xff3e to 0x0000, // f → PreviousCandidate
//    0xff3f to 0x0000, // f → Hangul_Special
//    0xff50 to 0x0000, // f → Home
//    0xff51 to 0x0000, // f → Left
//    0xff52 to 0x0000, // f → Up
//    0xff53 to 0x0000, // f → Right
//    0xff54 to 0x0000, // f → Down
//    0xff55 to 0x0000, // f → Prior
//    0xff56 to 0x0000, // f → Next
//    0xff57 to 0x0000, // f → End
//    0xff58 to 0x0000, // f → Begin
//    0xff60 to 0x0000, // f → Select
//    0xff61 to 0x0000, // f → Print
//    0xff62 to 0x0000, // f → Execute
//    0xff63 to 0x0000, // f → Insert
//    0xff65 to 0x0000, // f → Undo
//    0xff66 to 0x0000, // f → Redo
//    0xff67 to 0x0000, // f → Menu
//    0xff68 to 0x0000, // f → Find
//    0xff69 to 0x0000, // f → Cancel
//    0xff6a to 0x0000, // f → Help
//    0xff6b to 0x0000, // f → Break
//    0xff7e to 0x0000, // f → Mode_switch
//    0xff7f to 0x0000, // f → Num_Lock
    "ff80" to "0020", // f → KP_Space /* space */
    "ff89" to "0009", // f → KP_Tab
    "ff8d" to "000d", // f → KP_Enter /* enter */
//    0xff91 to 0x0000, // f → KP_F1
//    0xff92 to 0x0000, // f → KP_F2
//    0xff93 to 0x0000, // f → KP_F3
//    0xff94 to 0x0000, // f → KP_F4
//    0xff95 to 0x0000, // f → KP_Home
//    0xff96 to 0x0000, // f → KP_Left
//    0xff97 to 0x0000, // f → KP_Up
//    0xff98 to 0x0000, // f → KP_Right
//    0xff99 to 0x0000, // f → KP_Down
//    0xff9a to 0x0000, // f → KP_Prior
//    0xff9b to 0x0000, // f → KP_Next
//    0xff9c to 0x0000, // f → KP_End
//    0xff9d to 0x0000, // f → KP_Begin
//    0xff9e to 0x0000, // f → KP_Insert
//    0xff9f to 0x0000, // f → KP_Delete
    "ffaa" to "002a", // f → KP_Multiply
    "ffab" to "002b", // f → KP_Add
    "ffac" to "002c", // f → KP_Separator	/* separator, often comma */
    "ffad" to "002d", // f → KP_Subtract
    "ffae" to "002e", // f → KP_Decimal
    "ffaf" to "002f", // f → KP_Divide
    "ffb0" to "0030", // f → KP_0
    "ffb1" to "0031", // f → KP_1
    "ffb2" to "0032", // f → KP_2
    "ffb3" to "0033", // f → KP_3
    "ffb4" to "0034", // f → KP_4
    "ffb5" to "0035", // f → KP_5
    "ffb6" to "0036", // f → KP_6
    "ffb7" to "0037", // f → KP_7
    "ffb8" to "0038", // f → KP_8
    "ffb9" to "0039", // f → KP_9
    "ffbd" to "003d", // f → KP_Equal	/* equals */
//    0xffbe to 0x0000, // f → F1
//    0xffbf to 0x0000, // f → F2
//    0xffc0 to 0x0000, // f → F3
//    0xffc1 to 0x0000, // f → F4
//    0xffc2 to 0x0000, // f → F5
//    0xffc3 to 0x0000, // f → F6
//    0xffc4 to 0x0000, // f → F7
//    0xffc5 to 0x0000, // f → F8
//    0xffc6 to 0x0000, // f → F9
//    0xffc7 to 0x0000, // f → F10
//    0xffc8 to 0x0000, // f → F11
//    0xffc9 to 0x0000, // f → F12
//    0xffca to 0x0000, // f → F13
//    0xffcb to 0x0000, // f → F14
//    0xffcc to 0x0000, // f → F15
//    0xffcd to 0x0000, // f → F16
//    0xffce to 0x0000, // f → F17
//    0xffcf to 0x0000, // f → F18
//    0xffd0 to 0x0000, // f → F19
//    0xffd1 to 0x0000, // f → F20
//    0xffd2 to 0x0000, // f → F21
//    0xffd3 to 0x0000, // f → F22
//    0xffd4 to 0x0000, // f → F23
//    0xffd5 to 0x0000, // f → F24
//    0xffd6 to 0x0000, // f → F25
//    0xffd7 to 0x0000, // f → F26
//    0xffd8 to 0x0000, // f → F27
//    0xffd9 to 0x0000, // f → F28
//    0xffda to 0x0000, // f → F29
//    0xffdb to 0x0000, // f → F30
//    0xffdc to 0x0000, // f → F31
//    0xffdd to 0x0000, // f → F32
//    0xffde to 0x0000, // f → F33
//    0xffdf to 0x0000, // f → F34
//    0xffe0 to 0x0000, // f → F35
//    0xffe1 to 0x0000, // f → Shift_L
//    0xffe2 to 0x0000, // f → Shift_R
//    0xffe3 to 0x0000, // f → Control_L
//    0xffe4 to 0x0000, // f → Control_R
//    0xffe5 to 0x0000, // f → Caps_Lock
//    0xffe6 to 0x0000, // f → Shift_Lock
//    0xffe7 to 0x0000, // f → Meta_L
//    0xffe8 to 0x0000, // f → Meta_R
//    0xffe9 to 0x0000, // f → Alt_L
//    0xffea to 0x0000, // f → Alt_R
//    0xffeb to 0x0000, // f → Super_L
//    0xffec to 0x0000, // f → Super_R
//    0xffed to 0x0000, // f → Hyper_L
//    0xffee to 0x0000, // f → Hyper_R
//    0xffff to 0x0000, // f → Delete
//    0xffffff to 0x0000, // f → VoidSymbol
    "06ad" to "0491", // . → Ukrainian_ghe_with_upturn
    "06bd" to "0490", // . → Ukrainian_GHE_WITH_UPTURN
    "12a1" to "1e02", // u → Babovedot
    "12a2" to "1e03", // u → babovedot
    "12a6" to "1e0a", // u → Dabovedot
    "12a8" to "1e80", // u → Wgrave
    "12aa" to "1e82", // u → Wacute
    "12ab" to "1e0b", // u → dabovedot
    "12ac" to "1ef2", // u → Ygrave
    "12b0" to "1e1e", // u → Fabovedot
    "12b1" to "1e1f", // u → fabovedot
    "12b4" to "1e40", // u → Mabovedot
    "12b5" to "1e41", // u → mabovedot
    "12b7" to "1e56", // u → Pabovedot
    "12b8" to "1e81", // u → wgrave
    "12b9" to "1e57", // u → pabovedot
    "12ba" to "1e83", // u → wacute
    "12bb" to "1e60", // u → Sabovedot
    "12bc" to "1ef3", // u → ygrave
    "12bd" to "1e84", // u → Wdiaeresis
    "12be" to "1e85", // u → wdiaeresis
    "12bf" to "1e61", // u → sabovedot
    "12d0" to "0174", // u → Wcircumflex
    "12d7" to "1e6a", // u → Tabovedot
    "12de" to "0176", // u → Ycircumflex
    "12f0" to "0175", // u → wcircumflex
    "12f7" to "1e6b", // u → tabovedot
    "12fe" to "0177", // u → ycircumflex
    "0680" to "0492", // u → Cyrillic_GHE_bar
    "0681" to "0496", // u → Cyrillic_ZHE_descender
    "0682" to "049a", // u → Cyrillic_KA_descender
    "0683" to "049c", // u → Cyrillic_KA_vertstroke
    "0684" to "04a2", // u → Cyrillic_EN_descender
    "0685" to "04ae", // u → Cyrillic_U_straight
    "0686" to "04b0", // u → Cyrillic_U_straight_bar
    "0687" to "04b2", // u → Cyrillic_HA_descender
    "0688" to "04b6", // u → Cyrillic_CHE_descender
    "0689" to "04b8", // u → Cyrillic_CHE_vertstroke
    "068a" to "04ba", // u → Cyrillic_SHHA
    "068c" to "04d8", // u → Cyrillic_SCHWA
    "068d" to "04e2", // u → Cyrillic_I_macron
    "068e" to "04e8", // u → Cyrillic_O_bar
    "068f" to "04ee", // u → Cyrillic_U_macron
    "0690" to "0493", // u → Cyrillic_ghe_bar
    "0691" to "0497", // u → Cyrillic_zhe_descender
    "0692" to "049b", // u → Cyrillic_ka_descender
    "0693" to "049d", // u → Cyrillic_ka_vertstroke
    "0694" to "04a3", // u → Cyrillic_en_descender
    "0695" to "04af", // u → Cyrillic_u_straight
    "0696" to "04b1", // u → Cyrillic_u_straight_bar
    "0697" to "04b3", // u → Cyrillic_ha_descender
    "0698" to "04b7", // u → Cyrillic_che_descender
    "0699" to "04b9", // u → Cyrillic_che_vertstroke
    "069a" to "04bb", // u → Cyrillic_shha
    "069c" to "04d9", // u → Cyrillic_schwa
    "069d" to "04e3", // u → Cyrillic_i_macron
    "069e" to "04e9", // u → Cyrillic_o_bar
    "069f" to "04ef", // u → Cyrillic_u_macron
)