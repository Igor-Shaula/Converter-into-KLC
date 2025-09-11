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

    0x0020 to 0x0020, // . → space
    0x0021 to 0x0021, // . → exclam
    0x0022 to 0x0022, // . → quotedbl
    0x0023 to 0x0023, // . → numbersign
    0x0024 to 0x0024, // . → dollar
    0x0025 to 0x0025, // . → percent
    0x0026 to 0x0026, // . → ampersand
    0x0027 to 0x0027, // . → apostrophe
    0x0027 to 0x0027, // . → quoteright	/* deprecated */
    0x0028 to 0x0028, // . → parenleft
    0x0029 to 0x0029, // . → parenright
    0x002a to 0x002a, // . → asterisk
    0x002b to 0x002b, // . → plus
    0x002c to 0x002c, // . → comma
    0x002d to 0x002d, // . → minus
    0x002e to 0x002e, // . → period
    0x002f to 0x002f, // . → slash
    0x0030 to 0x0030, // . → 0
    0x0031 to 0x0031, // . → 1
    0x0032 to 0x0032, // . → 2
    0x0033 to 0x0033, // . → 3
    0x0034 to 0x0034, // . → 4
    0x0035 to 0x0035, // . → 5
    0x0036 to 0x0036, // . → 6
    0x0037 to 0x0037, // . → 7
    0x0038 to 0x0038, // . → 8
    0x0039 to 0x0039, // . → 9
    0x003a to 0x003a, // . → colon
    0x003b to 0x003b, // . → semicolon
    0x003c to 0x003c, // . → less
    0x003d to 0x003d, // . → equal
    0x003e to 0x003e, // . → greater
    0x003f to 0x003f, // . → question
    0x0040 to 0x0040, // . → at
    0x0041 to 0x0041, // . → A
    0x0042 to 0x0042, // . → B
    0x0043 to 0x0043, // . → C
    0x0044 to 0x0044, // . → D
    0x0045 to 0x0045, // . → E
    0x0046 to 0x0046, // . → F
    0x0047 to 0x0047, // . → G
    0x0048 to 0x0048, // . → H
    0x0049 to 0x0049, // . → I
    0x004a to 0x004a, // . → J
    0x004b to 0x004b, // . → K
    0x004c to 0x004c, // . → L
    0x004d to 0x004d, // . → M
    0x004e to 0x004e, // . → N
    0x004f to 0x004f, // . → O
    0x0050 to 0x0050, // . → P
    0x0051 to 0x0051, // . → Q
    0x0052 to 0x0052, // . → R
    0x0053 to 0x0053, // . → S
    0x0054 to 0x0054, // . → T
    0x0055 to 0x0055, // . → U
    0x0056 to 0x0056, // . → V
    0x0057 to 0x0057, // . → W
    0x0058 to 0x0058, // . → X
    0x0059 to 0x0059, // . → Y
    0x005a to 0x005a, // . → Z
    0x005b to 0x005b, // . → bracketleft
    0x005c to 0x005c, // . → backslash
    0x005d to 0x005d, // . → bracketright
    0x005e to 0x005e, // . → asciicircum
    0x005f to 0x005f, // . → underscore
    0x0060 to 0x0060, // . → grave
    0x0060 to 0x0060, // . → quoteleft	/* deprecated */
    0x0061 to 0x0061, // . → a
    0x0062 to 0x0062, // . → b
    0x0063 to 0x0063, // . → c
    0x0064 to 0x0064, // . → d
    0x0065 to 0x0065, // . → e
    0x0066 to 0x0066, // . → f
    0x0067 to 0x0067, // . → g
    0x0068 to 0x0068, // . → h
    0x0069 to 0x0069, // . → i
    0x006a to 0x006a, // . → j
    0x006b to 0x006b, // . → k
    0x006c to 0x006c, // . → l
    0x006d to 0x006d, // . → m
    0x006e to 0x006e, // . → n
    0x006f to 0x006f, // . → o
    0x0070 to 0x0070, // . → p
    0x0071 to 0x0071, // . → q
    0x0072 to 0x0072, // . → r
    0x0073 to 0x0073, // . → s
    0x0074 to 0x0074, // . → t
    0x0075 to 0x0075, // . → u
    0x0076 to 0x0076, // . → v
    0x0077 to 0x0077, // . → w
    0x0078 to 0x0078, // . → x
    0x0079 to 0x0079, // . → y
    0x007a to 0x007a, // . → z
    0x007b to 0x007b, // . → braceleft
    0x007c to 0x007c, // . → bar
    0x007d to 0x007d, // . → braceright
    0x007e to 0x007e, // . → asciitilde
    0x00a0 to 0x00a0, // . → nobreakspace
    0x00a1 to 0x00a1, // . → exclamdown
    0x00a2 to 0x00a2, // . → cent
    0x00a3 to 0x00a3, // . → sterling
    0x00a4 to 0x00a4, // . → currency
    0x00a5 to 0x00a5, // . → yen
    0x00a6 to 0x00a6, // . → brokenbar
    0x00a7 to 0x00a7, // . → section
    0x00a8 to 0x00a8, // . → diaeresis
    0x00a9 to 0x00a9, // . → copyright
    0x00aa to 0x00aa, // . → ordfeminine
    0x00ab to 0x00ab, // . → guillemotleft	/* left angle quotation mark */
    0x00ac to 0x00ac, // . → notsign
    0x00ad to 0x00ad, // . → hyphen
    0x00ae to 0x00ae, // . → registered
    0x00af to 0x00af, // . → macron
    0x00b0 to 0x00b0, // . → degree
    0x00b1 to 0x00b1, // . → plusminus
    0x00b2 to 0x00b2, // . → twosuperior
    0x00b3 to 0x00b3, // . → threesuperior
    0x00b4 to 0x00b4, // . → acute
    0x00b5 to 0x00b5, // . → mu
    0x00b6 to 0x00b6, // . → paragraph
    0x00b7 to 0x00b7, // . → periodcentered
    0x00b8 to 0x00b8, // . → cedilla
    0x00b9 to 0x00b9, // . → onesuperior
    0x00ba to 0x00ba, // . → masculine
    0x00bb to 0x00bb, // . → guillemotright	/* right angle quotation mark */
    0x00bc to 0x00bc, // . → onequarter
    0x00bd to 0x00bd, // . → onehalf
    0x00be to 0x00be, // . → threequarters
    0x00bf to 0x00bf, // . → questiondown
    0x00c0 to 0x00c0, // . → Agrave
    0x00c1 to 0x00c1, // . → Aacute
    0x00c2 to 0x00c2, // . → Acircumflex
    0x00c3 to 0x00c3, // . → Atilde
    0x00c4 to 0x00c4, // . → Adiaeresis
    0x00c5 to 0x00c5, // . → Aring
    0x00c6 to 0x00c6, // . → AE
    0x00c7 to 0x00c7, // . → Ccedilla
    0x00c8 to 0x00c8, // . → Egrave
    0x00c9 to 0x00c9, // . → Eacute
    0x00ca to 0x00ca, // . → Ecircumflex
    0x00cb to 0x00cb, // . → Ediaeresis
    0x00cc to 0x00cc, // . → Igrave
    0x00cd to 0x00cd, // . → Iacute
    0x00ce to 0x00ce, // . → Icircumflex
    0x00cf to 0x00cf, // . → Idiaeresis
    0x00d0 to 0x00d0, // . → ETH
    0x00d0 to 0x00d0, // . → Eth	/* deprecated */
    0x00d1 to 0x00d1, // . → Ntilde
    0x00d2 to 0x00d2, // . → Ograve
    0x00d3 to 0x00d3, // . → Oacute
    0x00d4 to 0x00d4, // . → Ocircumflex
    0x00d5 to 0x00d5, // . → Otilde
    0x00d6 to 0x00d6, // . → Odiaeresis
    0x00d7 to 0x00d7, // . → multiply
    0x00d8 to 0x00d8, // . → Ooblique
    0x00d9 to 0x00d9, // . → Ugrave
    0x00da to 0x00da, // . → Uacute
    0x00db to 0x00db, // . → Ucircumflex
    0x00dc to 0x00dc, // . → Udiaeresis
    0x00dd to 0x00dd, // . → Yacute
    0x00de to 0x00de, // . → THORN
    0x00de to 0x00de, // . → Thorn	/* deprecated */
    0x00df to 0x00df, // . → ssharp
    0x00e0 to 0x00e0, // . → agrave
    0x00e1 to 0x00e1, // . → aacute
    0x00e2 to 0x00e2, // . → acircumflex
    0x00e3 to 0x00e3, // . → atilde
    0x00e4 to 0x00e4, // . → adiaeresis
    0x00e5 to 0x00e5, // . → aring
    0x00e6 to 0x00e6, // . → ae
    0x00e7 to 0x00e7, // . → ccedilla
    0x00e8 to 0x00e8, // . → egrave
    0x00e9 to 0x00e9, // . → eacute
    0x00ea to 0x00ea, // . → ecircumflex
    0x00eb to 0x00eb, // . → ediaeresis
    0x00ec to 0x00ec, // . → igrave
    0x00ed to 0x00ed, // . → iacute
    0x00ee to 0x00ee, // . → icircumflex
    0x00ef to 0x00ef, // . → idiaeresis
    0x00f0 to 0x00f0, // . → eth
    0x00f1 to 0x00f1, // . → ntilde
    0x00f2 to 0x00f2, // . → ograve
    0x00f3 to 0x00f3, // . → oacute
    0x00f4 to 0x00f4, // . → ocircumflex
    0x00f5 to 0x00f5, // . → otilde
    0x00f6 to 0x00f6, // . → odiaeresis
    0x00f7 to 0x00f7, // . → division
    0x00f8 to 0x00f8, // . → oslash
    0x00f9 to 0x00f9, // . → ugrave
    0x00fa to 0x00fa, // . → uacute
    0x00fb to 0x00fb, // . → ucircumflex
    0x00fc to 0x00fc, // . → udiaeresis
    0x00fd to 0x00fd, // . → yacute
    0x00fe to 0x00fe, // . → thorn
    0x00ff to 0x00ff, // . → ydiaeresis
    0x01a1 to 0x0104, // . → Aogonek
    0x01a2 to 0x02d8, // . → breve
    0x01a3 to 0x0141, // . → Lstroke
    0x01a5 to 0x013d, // . → Lcaron
    0x01a6 to 0x015a, // . → Sacute
    0x01a9 to 0x0160, // . → Scaron
    0x01aa to 0x015e, // . → Scedilla
    0x01ab to 0x0164, // . → Tcaron
    0x01ac to 0x0179, // . → Zacute
    0x01ae to 0x017d, // . → Zcaron
    0x01af to 0x017b, // . → Zabovedot
    0x01b1 to 0x0105, // . → aogonek
    0x01b2 to 0x02db, // . → ogonek
    0x01b3 to 0x0142, // . → lstroke
    0x01b5 to 0x013e, // . → lcaron
    0x01b6 to 0x015b, // . → sacute
    0x01b7 to 0x02c7, // . → caron
    0x01b9 to 0x0161, // . → scaron
    0x01ba to 0x015f, // . → scedilla
    0x01bb to 0x0165, // . → tcaron
    0x01bc to 0x017a, // . → zacute
    0x01bd to 0x02dd, // . → doubleacute
    0x01be to 0x017e, // . → zcaron
    0x01bf to 0x017c, // . → zabovedot
    0x01c0 to 0x0154, // . → Racute
    0x01c3 to 0x0102, // . → Abreve
    0x01c5 to 0x0139, // . → Lacute
    0x01c6 to 0x0106, // . → Cacute
    0x01c8 to 0x010c, // . → Ccaron
    0x01ca to 0x0118, // . → Eogonek
    0x01cc to 0x011a, // . → Ecaron
    0x01cf to 0x010e, // . → Dcaron
    0x01d0 to 0x0110, // . → Dstroke
    0x01d1 to 0x0143, // . → Nacute
    0x01d2 to 0x0147, // . → Ncaron
    0x01d5 to 0x0150, // . → Odoubleacute
    0x01d8 to 0x0158, // . → Rcaron
    0x01d9 to 0x016e, // . → Uring
    0x01db to 0x0170, // . → Udoubleacute
    0x01de to 0x0162, // . → Tcedilla
    0x01e0 to 0x0155, // . → racute
    0x01e3 to 0x0103, // . → abreve
    0x01e5 to 0x013a, // . → lacute
    0x01e6 to 0x0107, // . → cacute
    0x01e8 to 0x010d, // . → ccaron
    0x01ea to 0x0119, // . → eogonek
    0x01ec to 0x011b, // . → ecaron
    0x01ef to 0x010f, // . → dcaron
    0x01f0 to 0x0111, // . → dstroke
    0x01f1 to 0x0144, // . → nacute
    0x01f2 to 0x0148, // . → ncaron
    0x01f5 to 0x0151, // . → odoubleacute
    0x01f8 to 0x0159, // . → rcaron
    0x01f9 to 0x016f, // . → uring
    0x01fb to 0x0171, // . → udoubleacute
    0x01fe to 0x0163, // . → tcedilla
    0x01ff to 0x02d9, // . → abovedot
    0x02a1 to 0x0126, // . → Hstroke
    0x02a6 to 0x0124, // . → Hcircumflex
    0x02a9 to 0x0130, // . → Iabovedot
    0x02ab to 0x011e, // . → Gbreve
    0x02ac to 0x0134, // . → Jcircumflex
    0x02b1 to 0x0127, // . → hstroke
    0x02b6 to 0x0125, // . → hcircumflex
    0x02b9 to 0x0131, // . → idotless
    0x02bb to 0x011f, // . → gbreve
    0x02bc to 0x0135, // . → jcircumflex
    0x02c5 to 0x010a, // . → Cabovedot
    0x02c6 to 0x0108, // . → Ccircumflex
    0x02d5 to 0x0120, // . → Gabovedot
    0x02d8 to 0x011c, // . → Gcircumflex
    0x02dd to 0x016c, // . → Ubreve
    0x02de to 0x015c, // . → Scircumflex
    0x02e5 to 0x010b, // . → cabovedot
    0x02e6 to 0x0109, // . → ccircumflex
    0x02f5 to 0x0121, // . → gabovedot
    0x02f8 to 0x011d, // . → gcircumflex
    0x02fd to 0x016d, // . → ubreve
    0x02fe to 0x015d, // . → scircumflex
    0x03a2 to 0x0138, // . → kra
    0x03a3 to 0x0156, // . → Rcedilla
    0x03a5 to 0x0128, // . → Itilde
    0x03a6 to 0x013b, // . → Lcedilla
    0x03aa to 0x0112, // . → Emacron
    0x03ab to 0x0122, // . → Gcedilla
    0x03ac to 0x0166, // . → Tslash
    0x03b3 to 0x0157, // . → rcedilla
    0x03b5 to 0x0129, // . → itilde
    0x03b6 to 0x013c, // . → lcedilla
    0x03ba to 0x0113, // . → emacron
    0x03bb to 0x0123, // . → gcedilla
    0x03bc to 0x0167, // . → tslash
    0x03bd to 0x014a, // . → ENG
    0x03bf to 0x014b, // . → eng
    0x03c0 to 0x0100, // . → Amacron
    0x03c7 to 0x012e, // . → Iogonek
    0x03cc to 0x0116, // . → Eabovedot
    0x03cf to 0x012a, // . → Imacron
    0x03d1 to 0x0145, // . → Ncedilla
    0x03d2 to 0x014c, // . → Omacron
    0x03d3 to 0x0136, // . → Kcedilla
    0x03d9 to 0x0172, // . → Uogonek
    0x03dd to 0x0168, // . → Utilde
    0x03de to 0x016a, // . → Umacron
    0x03e0 to 0x0101, // . → amacron
    0x03e7 to 0x012f, // . → iogonek
    0x03ec to 0x0117, // . → eabovedot
    0x03ef to 0x012b, // . → imacron
    0x03f1 to 0x0146, // . → ncedilla
    0x03f2 to 0x014d, // . → omacron
    0x03f3 to 0x0137, // . → kcedilla
    0x03f9 to 0x0173, // . → uogonek
    0x03fd to 0x0169, // . → utilde
    0x03fe to 0x016b, // . → umacron
    0x047e to 0x203e, // . → overline
    0x04a1 to 0x3002, // . → kana_fullstop
    0x04a2 to 0x300c, // . → kana_openingbracket
    0x04a3 to 0x300d, // . → kana_closingbracket
    0x04a4 to 0x3001, // . → kana_comma
    0x04a5 to 0x30fb, // . → kana_conjunctive
    0x04a6 to 0x30f2, // . → kana_WO
    0x04a7 to 0x30a1, // . → kana_a
    0x04a8 to 0x30a3, // . → kana_i
    0x04a9 to 0x30a5, // . → kana_u
    0x04aa to 0x30a7, // . → kana_e
    0x04ab to 0x30a9, // . → kana_o
    0x04ac to 0x30e3, // . → kana_ya
    0x04ad to 0x30e5, // . → kana_yu
    0x04ae to 0x30e7, // . → kana_yo
    0x04af to 0x30c3, // . → kana_tsu
    0x04b0 to 0x30fc, // . → prolongedsound
    0x04b1 to 0x30a2, // . → kana_A
    0x04b2 to 0x30a4, // . → kana_I
    0x04b3 to 0x30a6, // . → kana_U
    0x04b4 to 0x30a8, // . → kana_E
    0x04b5 to 0x30aa, // . → kana_O
    0x04b6 to 0x30ab, // . → kana_KA
    0x04b7 to 0x30ad, // . → kana_KI
    0x04b8 to 0x30af, // . → kana_KU
    0x04b9 to 0x30b1, // . → kana_KE
    0x04ba to 0x30b3, // . → kana_KO
    0x04bb to 0x30b5, // . → kana_SA
    0x04bc to 0x30b7, // . → kana_SHI
    0x04bd to 0x30b9, // . → kana_SU
    0x04be to 0x30bb, // . → kana_SE
    0x04bf to 0x30bd, // . → kana_SO
    0x04c0 to 0x30bf, // . → kana_TA
    0x04c1 to 0x30c1, // . → kana_CHI
    0x04c2 to 0x30c4, // . → kana_TSU
    0x04c3 to 0x30c6, // . → kana_TE
    0x04c4 to 0x30c8, // . → kana_TO
    0x04c5 to 0x30ca, // . → kana_NA
    0x04c6 to 0x30cb, // . → kana_NI
    0x04c7 to 0x30cc, // . → kana_NU
    0x04c8 to 0x30cd, // . → kana_NE
    0x04c9 to 0x30ce, // . → kana_NO
    0x04ca to 0x30cf, // . → kana_HA
    0x04cb to 0x30d2, // . → kana_HI
    0x04cc to 0x30d5, // . → kana_FU
    0x04cd to 0x30d8, // . → kana_HE
    0x04ce to 0x30db, // . → kana_HO
    0x04cf to 0x30de, // . → kana_MA
    0x04d0 to 0x30df, // . → kana_MI
    0x04d1 to 0x30e0, // . → kana_MU
    0x04d2 to 0x30e1, // . → kana_ME
    0x04d3 to 0x30e2, // . → kana_MO
    0x04d4 to 0x30e4, // . → kana_YA
    0x04d5 to 0x30e6, // . → kana_YU
    0x04d6 to 0x30e8, // . → kana_YO
    0x04d7 to 0x30e9, // . → kana_RA
    0x04d8 to 0x30ea, // . → kana_RI
    0x04d9 to 0x30eb, // . → kana_RU
    0x04da to 0x30ec, // . → kana_RE
    0x04db to 0x30ed, // . → kana_RO
    0x04dc to 0x30ef, // . → kana_WA
    0x04dd to 0x30f3, // . → kana_N
    0x04de to 0x309b, // . → voicedsound
    0x04df to 0x309c, // . → semivoicedsound
    0x05ac to 0x060c, // . → Arabic_comma
    0x05bb to 0x061b, // . → Arabic_semicolon
    0x05bf to 0x061f, // . → Arabic_question_mark
    0x05c1 to 0x0621, // . → Arabic_hamza
    0x05c2 to 0x0622, // . → Arabic_maddaonalef
    0x05c3 to 0x0623, // . → Arabic_hamzaonalef
    0x05c4 to 0x0624, // . → Arabic_hamzaonwaw
    0x05c5 to 0x0625, // . → Arabic_hamzaunderalef
    0x05c6 to 0x0626, // . → Arabic_hamzaonyeh
    0x05c7 to 0x0627, // . → Arabic_alef
    0x05c8 to 0x0628, // . → Arabic_beh
    0x05c9 to 0x0629, // . → Arabic_tehmarbuta
    0x05ca to 0x062a, // . → Arabic_teh
    0x05cb to 0x062b, // . → Arabic_theh
    0x05cc to 0x062c, // . → Arabic_jeem
    0x05cd to 0x062d, // . → Arabic_hah
    0x05ce to 0x062e, // . → Arabic_khah
    0x05cf to 0x062f, // . → Arabic_dal
    0x05d0 to 0x0630, // . → Arabic_thal
    0x05d1 to 0x0631, // . → Arabic_ra
    0x05d2 to 0x0632, // . → Arabic_zain
    0x05d3 to 0x0633, // . → Arabic_seen
    0x05d4 to 0x0634, // . → Arabic_sheen
    0x05d5 to 0x0635, // . → Arabic_sad
    0x05d6 to 0x0636, // . → Arabic_dad
    0x05d7 to 0x0637, // . → Arabic_tah
    0x05d8 to 0x0638, // . → Arabic_zah
    0x05d9 to 0x0639, // . → Arabic_ain
    0x05da to 0x063a, // . → Arabic_ghain
    0x05e0 to 0x0640, // . → Arabic_tatweel
    0x05e1 to 0x0641, // . → Arabic_feh
    0x05e2 to 0x0642, // . → Arabic_qaf
    0x05e3 to 0x0643, // . → Arabic_kaf
    0x05e4 to 0x0644, // . → Arabic_lam
    0x05e5 to 0x0645, // . → Arabic_meem
    0x05e6 to 0x0646, // . → Arabic_noon
    0x05e7 to 0x0647, // . → Arabic_ha
    0x05e8 to 0x0648, // . → Arabic_waw
    0x05e9 to 0x0649, // . → Arabic_alefmaksura
    0x05ea to 0x064a, // . → Arabic_yeh
    0x05eb to 0x064b, // . → Arabic_fathatan
    0x05ec to 0x064c, // . → Arabic_dammatan
    0x05ed to 0x064d, // . → Arabic_kasratan
    0x05ee to 0x064e, // . → Arabic_fatha
    0x05ef to 0x064f, // . → Arabic_damma
    0x05f0 to 0x0650, // . → Arabic_kasra
    0x05f1 to 0x0651, // . → Arabic_shadda
    0x05f2 to 0x0652, // . → Arabic_sukun
    0x06a1 to 0x0452, // . → Serbian_dje
    0x06a2 to 0x0453, // . → Macedonia_gje
    0x06a3 to 0x0451, // . → Cyrillic_io
    0x06a4 to 0x0454, // . → Ukrainian_ie
    0x06a5 to 0x0455, // . → Macedonia_dse
    0x06a6 to 0x0456, // . → Ukrainian_i
    0x06a7 to 0x0457, // . → Ukrainian_yi
    0x06a8 to 0x0458, // . → Cyrillic_je
    0x06a9 to 0x0459, // . → Cyrillic_lje
    0x06aa to 0x045a, // . → Cyrillic_nje
    0x06ab to 0x045b, // . → Serbian_tshe
    0x06ac to 0x045c, // . → Macedonia_kje
    0x06ae to 0x045e, // . → Byelorussian_shortu
    0x06af to 0x045f, // . → Cyrillic_dzhe
    0x06b0 to 0x2116, // . → numerosign
    0x06b1 to 0x0402, // . → Serbian_DJE
    0x06b2 to 0x0403, // . → Macedonia_GJE
    0x06b3 to 0x0401, // . → Cyrillic_IO
    0x06b4 to 0x0404, // . → Ukrainian_IE
    0x06b5 to 0x0405, // . → Macedonia_DSE
    0x06b6 to 0x0406, // . → Ukrainian_I
    0x06b7 to 0x0407, // . → Ukrainian_YI
    0x06b8 to 0x0408, // . → Cyrillic_JE
    0x06b9 to 0x0409, // . → Cyrillic_LJE
    0x06ba to 0x040a, // . → Cyrillic_NJE
    0x06bb to 0x040b, // . → Serbian_TSHE
    0x06bc to 0x040c, // . → Macedonia_KJE
    0x06be to 0x040e, // . → Byelorussian_SHORTU
    0x06bf to 0x040f, // . → Cyrillic_DZHE
    0x06c0 to 0x044e, // . → Cyrillic_yu
    0x06c1 to 0x0430, // . → Cyrillic_a
    0x06c2 to 0x0431, // . → Cyrillic_be
    0x06c3 to 0x0446, // . → Cyrillic_tse
    0x06c4 to 0x0434, // . → Cyrillic_de
    0x06c5 to 0x0435, // . → Cyrillic_ie
    0x06c6 to 0x0444, // . → Cyrillic_ef
    0x06c7 to 0x0433, // . → Cyrillic_ghe
    0x06c8 to 0x0445, // . → Cyrillic_ha
    0x06c9 to 0x0438, // . → Cyrillic_i
    0x06ca to 0x0439, // . → Cyrillic_shorti
    0x06cb to 0x043a, // . → Cyrillic_ka
    0x06cc to 0x043b, // . → Cyrillic_el
    0x06cd to 0x043c, // . → Cyrillic_em
    0x06ce to 0x043d, // . → Cyrillic_en
    0x06cf to 0x043e, // . → Cyrillic_o
    0x06d0 to 0x043f, // . → Cyrillic_pe
    0x06d1 to 0x044f, // . → Cyrillic_ya
    0x06d2 to 0x0440, // . → Cyrillic_er
    0x06d3 to 0x0441, // . → Cyrillic_es
    0x06d4 to 0x0442, // . → Cyrillic_te
    0x06d5 to 0x0443, // . → Cyrillic_u
    0x06d6 to 0x0436, // . → Cyrillic_zhe
    0x06d7 to 0x0432, // . → Cyrillic_ve
    0x06d8 to 0x044c, // . → Cyrillic_softsign
    0x06d9 to 0x044b, // . → Cyrillic_yeru
    0x06da to 0x0437, // . → Cyrillic_ze
    0x06db to 0x0448, // . → Cyrillic_sha
    0x06dc to 0x044d, // . → Cyrillic_e
    0x06dd to 0x0449, // . → Cyrillic_shcha
    0x06de to 0x0447, // . → Cyrillic_che
    0x06df to 0x044a, // . → Cyrillic_hardsign
    0x06e0 to 0x042e, // . → Cyrillic_YU
    0x06e1 to 0x0410, // . → Cyrillic_A
    0x06e2 to 0x0411, // . → Cyrillic_BE
    0x06e3 to 0x0426, // . → Cyrillic_TSE
    0x06e4 to 0x0414, // . → Cyrillic_DE
    0x06e5 to 0x0415, // . → Cyrillic_IE
    0x06e6 to 0x0424, // . → Cyrillic_EF
    0x06e7 to 0x0413, // . → Cyrillic_GHE
    0x06e8 to 0x0425, // . → Cyrillic_HA
    0x06e9 to 0x0418, // . → Cyrillic_I
    0x06ea to 0x0419, // . → Cyrillic_SHORTI
    0x06eb to 0x041a, // . → Cyrillic_KA
    0x06ec to 0x041b, // . → Cyrillic_EL
    0x06ed to 0x041c, // . → Cyrillic_EM
    0x06ee to 0x041d, // . → Cyrillic_EN
    0x06ef to 0x041e, // . → Cyrillic_O
    0x06f0 to 0x041f, // . → Cyrillic_PE
    0x06f1 to 0x042f, // . → Cyrillic_YA
    0x06f2 to 0x0420, // . → Cyrillic_ER
    0x06f3 to 0x0421, // . → Cyrillic_ES
    0x06f4 to 0x0422, // . → Cyrillic_TE
    0x06f5 to 0x0423, // . → Cyrillic_U
    0x06f6 to 0x0416, // . → Cyrillic_ZHE
    0x06f7 to 0x0412, // . → Cyrillic_VE
    0x06f8 to 0x042c, // . → Cyrillic_SOFTSIGN
    0x06f9 to 0x042b, // . → Cyrillic_YERU
    0x06fa to 0x0417, // . → Cyrillic_ZE
    0x06fb to 0x0428, // . → Cyrillic_SHA
    0x06fc to 0x042d, // . → Cyrillic_E
    0x06fd to 0x0429, // . → Cyrillic_SHCHA
    0x06fe to 0x0427, // . → Cyrillic_CHE
    0x06ff to 0x042a, // . → Cyrillic_HARDSIGN
    0x07a1 to 0x0386, // . → Greek_ALPHAaccent
    0x07a2 to 0x0388, // . → Greek_EPSILONaccent
    0x07a3 to 0x0389, // . → Greek_ETAaccent
    0x07a4 to 0x038a, // . → Greek_IOTAaccent
    0x07a5 to 0x03aa, // . → Greek_IOTAdiaeresis
    0x07a7 to 0x038c, // . → Greek_OMICRONaccent
    0x07a8 to 0x038e, // . → Greek_UPSILONaccent
    0x07a9 to 0x03ab, // . → Greek_UPSILONdieresis
    0x07ab to 0x038f, // . → Greek_OMEGAaccent
    0x07ae to 0x0385, // . → Greek_accentdieresis
    0x07af to 0x2015, // . → Greek_horizbar
    0x07b1 to 0x03ac, // . → Greek_alphaaccent
    0x07b2 to 0x03ad, // . → Greek_epsilonaccent
    0x07b3 to 0x03ae, // . → Greek_etaaccent
    0x07b4 to 0x03af, // . → Greek_iotaaccent
    0x07b5 to 0x03ca, // . → Greek_iotadieresis
    0x07b6 to 0x0390, // . → Greek_iotaaccentdieresis
    0x07b7 to 0x03cc, // . → Greek_omicronaccent
    0x07b8 to 0x03cd, // . → Greek_upsilonaccent
    0x07b9 to 0x03cb, // . → Greek_upsilondieresis
    0x07ba to 0x03b0, // . → Greek_upsilonaccentdieresis
    0x07bb to 0x03ce, // . → Greek_omegaaccent
    0x07c1 to 0x0391, // . → Greek_ALPHA
    0x07c2 to 0x0392, // . → Greek_BETA
    0x07c3 to 0x0393, // . → Greek_GAMMA
    0x07c4 to 0x0394, // . → Greek_DELTA
    0x07c5 to 0x0395, // . → Greek_EPSILON
    0x07c6 to 0x0396, // . → Greek_ZETA
    0x07c7 to 0x0397, // . → Greek_ETA
    0x07c8 to 0x0398, // . → Greek_THETA
    0x07c9 to 0x0399, // . → Greek_IOTA
    0x07ca to 0x039a, // . → Greek_KAPPA
    0x07cb to 0x039b, // . → Greek_LAMBDA
    0x07cb to 0x039b, // . → Greek_LAMDA
    0x07cc to 0x039c, // . → Greek_MU
    0x07cd to 0x039d, // . → Greek_NU
    0x07ce to 0x039e, // . → Greek_XI
    0x07cf to 0x039f, // . → Greek_OMICRON
    0x07d0 to 0x03a0, // . → Greek_PI
    0x07d1 to 0x03a1, // . → Greek_RHO
    0x07d2 to 0x03a3, // . → Greek_SIGMA
    0x07d4 to 0x03a4, // . → Greek_TAU
    0x07d5 to 0x03a5, // . → Greek_UPSILON
    0x07d6 to 0x03a6, // . → Greek_PHI
    0x07d7 to 0x03a7, // . → Greek_CHI
    0x07d8 to 0x03a8, // . → Greek_PSI
    0x07d9 to 0x03a9, // . → Greek_OMEGA
    0x07e1 to 0x03b1, // . → Greek_alpha
    0x07e2 to 0x03b2, // . → Greek_beta
    0x07e3 to 0x03b3, // . → Greek_gamma
    0x07e4 to 0x03b4, // . → Greek_delta
    0x07e5 to 0x03b5, // . → Greek_epsilon
    0x07e6 to 0x03b6, // . → Greek_zeta
    0x07e7 to 0x03b7, // . → Greek_eta
    0x07e8 to 0x03b8, // . → Greek_theta
    0x07e9 to 0x03b9, // . → Greek_iota
    0x07ea to 0x03ba, // . → Greek_kappa
    0x07eb to 0x03bb, // . → Greek_lambda
    0x07ec to 0x03bc, // . → Greek_mu
    0x07ed to 0x03bd, // . → Greek_nu
    0x07ee to 0x03be, // . → Greek_xi
    0x07ef to 0x03bf, // . → Greek_omicron
    0x07f0 to 0x03c0, // . → Greek_pi
    0x07f1 to 0x03c1, // . → Greek_rho
    0x07f2 to 0x03c3, // . → Greek_sigma
    0x07f3 to 0x03c2, // . → Greek_finalsmallsigma
    0x07f4 to 0x03c4, // . → Greek_tau
    0x07f5 to 0x03c5, // . → Greek_upsilon
    0x07f6 to 0x03c6, // . → Greek_phi
    0x07f7 to 0x03c7, // . → Greek_chi
    0x07f8 to 0x03c8, // . → Greek_psi
    0x07f9 to 0x03c9, // . → Greek_omega
    0x08a1 to 0x23b7, // . → leftradical
    0x08a2 to 0x250c, // d → topleftradical
    0x08a3 to 0x2500, // d → horizconnector
    0x08a4 to 0x2320, // . → topintegral
    0x08a5 to 0x2321, // . → botintegral
    0x08a6 to 0x2502, // d → vertconnector
    0x08a7 to 0x23a1, // . → topleftsqbracket
    0x08a8 to 0x23a3, // . → botleftsqbracket
    0x08a9 to 0x23a4, // . → toprightsqbracket
    0x08aa to 0x23a6, // . → botrightsqbracket
    0x08ab to 0x239b, // . → topleftparens
    0x08ac to 0x239d, // . → botleftparens
    0x08ad to 0x239e, // . → toprightparens
    0x08ae to 0x23a0, // . → botrightparens
    0x08af to 0x23a8, // . → leftmiddlecurlybrace
    0x08b0 to 0x23ac, // . → rightmiddlecurlybrace
//    0x08b1 to 0x0000, // o → topleftsummation
//    0x08b2 to 0x0000, // o → botleftsummation
//    0x08b3 to 0x0000, // o → topvertsummationconnector
//    0x08b4 to 0x0000, // o → botvertsummationconnector
//    0x08b5 to 0x0000, // o → toprightsummation
//    0x08b6 to 0x0000, // o → botrightsummation
//    0x08b7 to 0x0000, // o → rightmiddlesummation
    0x08bc to 0x2264, // . → lessthanequal
    0x08bd to 0x2260, // . → notequal
    0x08be to 0x2265, // . → greaterthanequal
    0x08bf to 0x222b, // . → integral
    0x08c0 to 0x2234, // . → therefore
    0x08c1 to 0x221d, // . → variation
    0x08c2 to 0x221e, // . → infinity
    0x08c5 to 0x2207, // . → nabla
    0x08c8 to 0x223c, // . → approximate
    0x08c9 to 0x2243, // . → similarequal
    0x08cd to 0x21d4, // . → ifonlyif
    0x08ce to 0x21d2, // . → implies
    0x08cf to 0x2261, // . → identical
    0x08d6 to 0x221a, // . → radical
    0x08da to 0x2282, // . → includedin
    0x08db to 0x2283, // . → includes
    0x08dc to 0x2229, // . → intersection
    0x08dd to 0x222a, // . → union
    0x08de to 0x2227, // . → logicaland
    0x08df to 0x2228, // . → logicalor
    0x08ef to 0x2202, // . → partialderivative
    0x08f6 to 0x0192, // . → function
    0x08fb to 0x2190, // . → leftarrow
    0x08fc to 0x2191, // . → uparrow
    0x08fd to 0x2192, // . → rightarrow
    0x08fe to 0x2193, // . → downarrow
//    0x09df to 0x0000, // o → blank
    0x09e0 to 0x25c6, // . → soliddiamond
    0x09e1 to 0x2592, // . → checkerboard
    0x09e2 to 0x2409, // . → ht
    0x09e3 to 0x240c, // . → ff
    0x09e4 to 0x240d, // . → cr
    0x09e5 to 0x240a, // . → lf
    0x09e8 to 0x2424, // . → nl
    0x09e9 to 0x240b, // . → vt
    0x09ea to 0x2518, // . → lowrightcorner
    0x09eb to 0x2510, // . → uprightcorner
    0x09ec to 0x250c, // . → upleftcorner
    0x09ed to 0x2514, // . → lowleftcorner
    0x09ee to 0x253c, // . → crossinglines
    0x09ef to 0x23ba, // . → horizlinescan1
    0x09f0 to 0x23bb, // . → horizlinescan3
    0x09f1 to 0x2500, // . → horizlinescan5
    0x09f2 to 0x23bc, // . → horizlinescan7
    0x09f3 to 0x23bd, // . → horizlinescan9
    0x09f4 to 0x251c, // . → leftt
    0x09f5 to 0x2524, // . → rightt
    0x09f6 to 0x2534, // . → bott
    0x09f7 to 0x252c, // . → topt
    0x09f8 to 0x2502, // . → vertbar
    0x0aa1 to 0x2003, // . → emspace
    0x0aa2 to 0x2002, // . → enspace
    0x0aa3 to 0x2004, // . → em3space
    0x0aa4 to 0x2005, // . → em4space
    0x0aa5 to 0x2007, // . → digitspace
    0x0aa6 to 0x2008, // . → punctspace
    0x0aa7 to 0x2009, // . → thinspace
    0x0aa8 to 0x200a, // . → hairspace
    0x0aa9 to 0x2014, // . → emdash
    0x0aaa to 0x2013, // . → endash
    0x0aac to 0x2423, // o → signifblank
    0x0aae to 0x2026, // . → ellipsis
    0x0aaf to 0x2025, // . → doubbaselinedot
    0x0ab0 to 0x2153, // . → onethird
    0x0ab1 to 0x2154, // . → twothirds
    0x0ab2 to 0x2155, // . → onefifth
    0x0ab3 to 0x2156, // . → twofifths
    0x0ab4 to 0x2157, // . → threefifths
    0x0ab5 to 0x2158, // . → fourfifths
    0x0ab6 to 0x2159, // . → onesixth
    0x0ab7 to 0x215a, // . → fivesixths
    0x0ab8 to 0x2105, // . → careof
    0x0abb to 0x2012, // . → figdash
    0x0abc to 0x27e8, // o → leftanglebracket
    0x0abd to 0x002e, // o → decimalpoint
    0x0abe to 0x27e9, // o → rightanglebracket
//    0x0abf to 0x0000, // o → marker
    0x0ac3 to 0x215b, // . → oneeighth
    0x0ac4 to 0x215c, // . → threeeighths
    0x0ac5 to 0x215d, // . → fiveeighths
    0x0ac6 to 0x215e, // . → seveneighths
    0x0ac9 to 0x2122, // . → trademark
    0x0aca to 0x2613, // o → signaturemark
//    0x0acb to 0x0000, // o → trademarkincircle
    0x0acc to 0x25c1, // o → leftopentriangle
    0x0acd to 0x25b7, // o → rightopentriangle
    0x0ace to 0x25cb, // o → emopencircle
    0x0acf to 0x25af, // o → emopenrectangle
    0x0ad0 to 0x2018, // . → leftsinglequotemark
    0x0ad1 to 0x2019, // . → rightsinglequotemark
    0x0ad2 to 0x201c, // . → leftdoublequotemark
    0x0ad3 to 0x201d, // . → rightdoublequotemark
    0x0ad4 to 0x211e, // . → prescription
    0x0ad6 to 0x2032, // . → minutes
    0x0ad7 to 0x2033, // . → seconds
    0x0ad9 to 0x271d, // . → latincross
//    0x0ada to 0x0000, // o → hexagram
    0x0adb to 0x25ac, // o → filledrectbullet
    0x0adc to 0x25c0, // o → filledlefttribullet
    0x0add to 0x25b6, // o → filledrighttribullet
    0x0ade to 0x25cf, // o → emfilledcircle
    0x0adf to 0x25ae, // o → emfilledrect
    0x0ae0 to 0x25e6, // o → enopencircbullet
    0x0ae1 to 0x25ab, // o → enopensquarebullet
    0x0ae2 to 0x25ad, // o → openrectbullet
    0x0ae3 to 0x25b3, // o → opentribulletup
    0x0ae4 to 0x25bd, // o → opentribulletdown
    0x0ae5 to 0x2606, // o → openstar
    0x0ae6 to 0x2022, // o → enfilledcircbullet
    0x0ae7 to 0x25aa, // o → enfilledsqbullet
    0x0ae8 to 0x25b2, // o → filledtribulletup
    0x0ae9 to 0x25bc, // o → filledtribulletdown
    0x0aea to 0x261c, // o → leftpointer
    0x0aeb to 0x261e, // o → rightpointer
    0x0aec to 0x2663, // . → club
    0x0aed to 0x2666, // . → diamond
    0x0aee to 0x2665, // . → heart
    0x0af0 to 0x2720, // . → maltesecross
    0x0af1 to 0x2020, // . → dagger
    0x0af2 to 0x2021, // . → doubledagger
    0x0af3 to 0x2713, // . → checkmark
    0x0af4 to 0x2717, // . → ballotcross
    0x0af5 to 0x266f, // . → musicalsharp
    0x0af6 to 0x266d, // . → musicalflat
    0x0af7 to 0x2642, // . → malesymbol
    0x0af8 to 0x2640, // . → femalesymbol
    0x0af9 to 0x260e, // . → telephone
    0x0afa to 0x2315, // . → telephonerecorder
    0x0afb to 0x2117, // . → phonographcopyright
    0x0afc to 0x2038, // . → caret
    0x0afd to 0x201a, // . → singlelowquotemark
    0x0afe to 0x201e, // . → doublelowquotemark
//    0x0aff to 0x0000, // o → cursor
    0x0ba3 to 0x003c, // d → leftcaret
    0x0ba6 to 0x003e, // d → rightcaret
    0x0ba8 to 0x2228, // d → downcaret
    0x0ba9 to 0x2227, // d → upcaret
    0x0bc0 to 0x00af, // d → overbar
    0x0bc2 to 0x22a5, // . → downtack
    0x0bc3 to 0x2229, // d → upshoe
    0x0bc4 to 0x230a, // . → downstile
    0x0bc6 to 0x005f, // d → underbar
    0x0bca to 0x2218, // . → jot
    0x0bcc to 0x2395, // . → quad
    0x0bce to 0x22a4, // . → uptack
    0x0bcf to 0x25cb, // . → circle
    0x0bd3 to 0x2308, // . → upstile
    0x0bd6 to 0x222a, // d → downshoe
    0x0bd8 to 0x2283, // d → rightshoe
    0x0bda to 0x2282, // d → leftshoe
    0x0bdc to 0x22a2, // . → lefttack
    0x0bfc to 0x22a3, // . → righttack
    0x0cdf to 0x2017, // . → hebrew_doublelowline
    0x0ce0 to 0x05d0, // . → hebrew_aleph
    0x0ce1 to 0x05d1, // . → hebrew_bet
    0x0ce1 to 0x05d1, // . → hebrew_beth /* deprecated */
    0x0ce2 to 0x05d2, // . → hebrew_gimel
    0x0ce2 to 0x05d2, // . → hebrew_gimmel /* deprecated */
    0x0ce3 to 0x05d3, // . → hebrew_dalet
    0x0ce3 to 0x05d3, // . → hebrew_daleth /* deprecated */
    0x0ce4 to 0x05d4, // . → hebrew_he
    0x0ce5 to 0x05d5, // . → hebrew_waw
    0x0ce6 to 0x05d6, // . → hebrew_zain
    0x0ce6 to 0x05d6, // . → hebrew_zayin /* deprecated */
    0x0ce7 to 0x05d7, // . → hebrew_chet
    0x0ce7 to 0x05d7, // . → hebrew_het /* deprecated */
    0x0ce8 to 0x05d8, // . → hebrew_tet
    0x0ce8 to 0x05d8, // . → hebrew_teth /* deprecated */
    0x0ce9 to 0x05d9, // . → hebrew_yod
    0x0cea to 0x05da, // . → hebrew_finalkaph
    0x0ceb to 0x05db, // . → hebrew_kaph
    0x0cec to 0x05dc, // . → hebrew_lamed
    0x0ced to 0x05dd, // . → hebrew_finalmem
    0x0cee to 0x05de, // . → hebrew_mem
    0x0cef to 0x05df, // . → hebrew_finalnun
    0x0cf0 to 0x05e0, // . → hebrew_nun
    0x0cf1 to 0x05e1, // . → hebrew_samech
    0x0cf1 to 0x05e1, // . → hebrew_samekh /* deprecated */
    0x0cf2 to 0x05e2, // . → hebrew_ayin
    0x0cf3 to 0x05e3, // . → hebrew_finalpe
    0x0cf4 to 0x05e4, // . → hebrew_pe
    0x0cf5 to 0x05e5, // . → hebrew_finalzade
    0x0cf5 to 0x05e5, // . → hebrew_finalzadi /* deprecated */
    0x0cf6 to 0x05e6, // . → hebrew_zade
    0x0cf6 to 0x05e6, // . → hebrew_zadi /* deprecated */
    0x0cf7 to 0x05e7, // . → hebrew_kuf /* deprecated */
    0x0cf7 to 0x05e7, // . → hebrew_qoph
    0x0cf8 to 0x05e8, // . → hebrew_resh
    0x0cf9 to 0x05e9, // . → hebrew_shin
    0x0cfa to 0x05ea, // . → hebrew_taf /* deprecated */
    0x0cfa to 0x05ea, // . → hebrew_taw
    0x0da1 to 0x0e01, // . → Thai_kokai
    0x0da2 to 0x0e02, // . → Thai_khokhai
    0x0da3 to 0x0e03, // . → Thai_khokhuat
    0x0da4 to 0x0e04, // . → Thai_khokhwai
    0x0da5 to 0x0e05, // . → Thai_khokhon
    0x0da6 to 0x0e06, // . → Thai_khorakhang
    0x0da7 to 0x0e07, // . → Thai_ngongu
    0x0da8 to 0x0e08, // . → Thai_chochan
    0x0da9 to 0x0e09, // . → Thai_choching
    0x0daa to 0x0e0a, // . → Thai_chochang
    0x0dab to 0x0e0b, // . → Thai_soso
    0x0dac to 0x0e0c, // . → Thai_chochoe
    0x0dad to 0x0e0d, // . → Thai_yoying
    0x0dae to 0x0e0e, // . → Thai_dochada
    0x0daf to 0x0e0f, // . → Thai_topatak
    0x0db0 to 0x0e10, // . → Thai_thothan
    0x0db1 to 0x0e11, // . → Thai_thonangmontho
    0x0db2 to 0x0e12, // . → Thai_thophuthao
    0x0db3 to 0x0e13, // . → Thai_nonen
    0x0db4 to 0x0e14, // . → Thai_dodek
    0x0db5 to 0x0e15, // . → Thai_totao
    0x0db6 to 0x0e16, // . → Thai_thothung
    0x0db7 to 0x0e17, // . → Thai_thothahan
    0x0db8 to 0x0e18, // . → Thai_thothong
    0x0db9 to 0x0e19, // . → Thai_nonu
    0x0dba to 0x0e1a, // . → Thai_bobaimai
    0x0dbb to 0x0e1b, // . → Thai_popla
    0x0dbc to 0x0e1c, // . → Thai_phophung
    0x0dbd to 0x0e1d, // . → Thai_fofa
    0x0dbe to 0x0e1e, // . → Thai_phophan
    0x0dbf to 0x0e1f, // . → Thai_fofan
    0x0dc0 to 0x0e20, // . → Thai_phosamphao
    0x0dc1 to 0x0e21, // . → Thai_moma
    0x0dc2 to 0x0e22, // . → Thai_yoyak
    0x0dc3 to 0x0e23, // . → Thai_rorua
    0x0dc4 to 0x0e24, // . → Thai_ru
    0x0dc5 to 0x0e25, // . → Thai_loling
    0x0dc6 to 0x0e26, // . → Thai_lu
    0x0dc7 to 0x0e27, // . → Thai_wowaen
    0x0dc8 to 0x0e28, // . → Thai_sosala
    0x0dc9 to 0x0e29, // . → Thai_sorusi
    0x0dca to 0x0e2a, // . → Thai_sosua
    0x0dcb to 0x0e2b, // . → Thai_hohip
    0x0dcc to 0x0e2c, // . → Thai_lochula
    0x0dcd to 0x0e2d, // . → Thai_oang
    0x0dce to 0x0e2e, // . → Thai_honokhuk
    0x0dcf to 0x0e2f, // . → Thai_paiyannoi
    0x0dd0 to 0x0e30, // . → Thai_saraa
    0x0dd1 to 0x0e31, // . → Thai_maihanakat
    0x0dd2 to 0x0e32, // . → Thai_saraaa
    0x0dd3 to 0x0e33, // . → Thai_saraam
    0x0dd4 to 0x0e34, // . → Thai_sarai
    0x0dd5 to 0x0e35, // . → Thai_saraii
    0x0dd6 to 0x0e36, // . → Thai_saraue
    0x0dd7 to 0x0e37, // . → Thai_sarauee
    0x0dd8 to 0x0e38, // . → Thai_sarau
    0x0dd9 to 0x0e39, // . → Thai_sarauu
    0x0dda to 0x0e3a, // . → Thai_phinthu
//    0x0dde to 0x0000, // o → Thai_maihanakat_maitho
    0x0ddf to 0x0e3f, // . → Thai_baht
    0x0de0 to 0x0e40, // . → Thai_sarae
    0x0de1 to 0x0e41, // . → Thai_saraae
    0x0de2 to 0x0e42, // . → Thai_sarao
    0x0de3 to 0x0e43, // . → Thai_saraaimaimuan
    0x0de4 to 0x0e44, // . → Thai_saraaimaimalai
    0x0de5 to 0x0e45, // . → Thai_lakkhangyao
    0x0de6 to 0x0e46, // . → Thai_maiyamok
    0x0de7 to 0x0e47, // . → Thai_maitaikhu
    0x0de8 to 0x0e48, // . → Thai_maiek
    0x0de9 to 0x0e49, // . → Thai_maitho
    0x0dea to 0x0e4a, // . → Thai_maitri
    0x0deb to 0x0e4b, // . → Thai_maichattawa
    0x0dec to 0x0e4c, // . → Thai_thanthakhat
    0x0ded to 0x0e4d, // . → Thai_nikhahit
    0x0df0 to 0x0e50, // . → Thai_leksun
    0x0df1 to 0x0e51, // . → Thai_leknung
    0x0df2 to 0x0e52, // . → Thai_leksong
    0x0df3 to 0x0e53, // . → Thai_leksam
    0x0df4 to 0x0e54, // . → Thai_leksi
    0x0df5 to 0x0e55, // . → Thai_lekha
    0x0df6 to 0x0e56, // . → Thai_lekhok
    0x0df7 to 0x0e57, // . → Thai_lekchet
    0x0df8 to 0x0e58, // . → Thai_lekpaet
    0x0df9 to 0x0e59, // . → Thai_lekkao
    0x0ea1 to 0x3131, // f → Hangul_Kiyeog
    0x0ea2 to 0x3132, // f → Hangul_SsangKiyeog
    0x0ea3 to 0x3133, // f → Hangul_KiyeogSios
    0x0ea4 to 0x3134, // f → Hangul_Nieun
    0x0ea5 to 0x3135, // f → Hangul_NieunJieuj
    0x0ea6 to 0x3136, // f → Hangul_NieunHieuh
    0x0ea7 to 0x3137, // f → Hangul_Dikeud
    0x0ea8 to 0x3138, // f → Hangul_SsangDikeud
    0x0ea9 to 0x3139, // f → Hangul_Rieul
    0x0eaa to 0x313a, // f → Hangul_RieulKiyeog
    0x0eab to 0x313b, // f → Hangul_RieulMieum
    0x0eac to 0x313c, // f → Hangul_RieulPieub
    0x0ead to 0x313d, // f → Hangul_RieulSios
    0x0eae to 0x313e, // f → Hangul_RieulTieut
    0x0eaf to 0x313f, // f → Hangul_RieulPhieuf
    0x0eb0 to 0x3140, // f → Hangul_RieulHieuh
    0x0eb1 to 0x3141, // f → Hangul_Mieum
    0x0eb2 to 0x3142, // f → Hangul_Pieub
    0x0eb3 to 0x3143, // f → Hangul_SsangPieub
    0x0eb4 to 0x3144, // f → Hangul_PieubSios
    0x0eb5 to 0x3145, // f → Hangul_Sios
    0x0eb6 to 0x3146, // f → Hangul_SsangSios
    0x0eb7 to 0x3147, // f → Hangul_Ieung
    0x0eb8 to 0x3148, // f → Hangul_Jieuj
    0x0eb9 to 0x3149, // f → Hangul_SsangJieuj
    0x0eba to 0x314a, // f → Hangul_Cieuc
    0x0ebb to 0x314b, // f → Hangul_Khieuq
    0x0ebc to 0x314c, // f → Hangul_Tieut
    0x0ebd to 0x314d, // f → Hangul_Phieuf
    0x0ebe to 0x314e, // f → Hangul_Hieuh
    0x0ebf to 0x314f, // f → Hangul_A
    0x0ec0 to 0x3150, // f → Hangul_AE
    0x0ec1 to 0x3151, // f → Hangul_YA
    0x0ec2 to 0x3152, // f → Hangul_YAE
    0x0ec3 to 0x3153, // f → Hangul_EO
    0x0ec4 to 0x3154, // f → Hangul_E
    0x0ec5 to 0x3155, // f → Hangul_YEO
    0x0ec6 to 0x3156, // f → Hangul_YE
    0x0ec7 to 0x3157, // f → Hangul_O
    0x0ec8 to 0x3158, // f → Hangul_WA
    0x0ec9 to 0x3159, // f → Hangul_WAE
    0x0eca to 0x315a, // f → Hangul_OE
    0x0ecb to 0x315b, // f → Hangul_YO
    0x0ecc to 0x315c, // f → Hangul_U
    0x0ecd to 0x315d, // f → Hangul_WEO
    0x0ece to 0x315e, // f → Hangul_WE
    0x0ecf to 0x315f, // f → Hangul_WI
    0x0ed0 to 0x3160, // f → Hangul_YU
    0x0ed1 to 0x3161, // f → Hangul_EU
    0x0ed2 to 0x3162, // f → Hangul_YI
    0x0ed3 to 0x3163, // f → Hangul_I
    0x0ed4 to 0x11a8, // f → Hangul_J_Kiyeog
    0x0ed5 to 0x11a9, // f → Hangul_J_SsangKiyeog
    0x0ed6 to 0x11aa, // f → Hangul_J_KiyeogSios
    0x0ed7 to 0x11ab, // f → Hangul_J_Nieun
    0x0ed8 to 0x11ac, // f → Hangul_J_NieunJieuj
    0x0ed9 to 0x11ad, // f → Hangul_J_NieunHieuh
    0x0eda to 0x11ae, // f → Hangul_J_Dikeud
    0x0edb to 0x11af, // f → Hangul_J_Rieul
    0x0edc to 0x11b0, // f → Hangul_J_RieulKiyeog
    0x0edd to 0x11b1, // f → Hangul_J_RieulMieum
    0x0ede to 0x11b2, // f → Hangul_J_RieulPieub
    0x0edf to 0x11b3, // f → Hangul_J_RieulSios
    0x0ee0 to 0x11b4, // f → Hangul_J_RieulTieut
    0x0ee1 to 0x11b5, // f → Hangul_J_RieulPhieuf
    0x0ee2 to 0x11b6, // f → Hangul_J_RieulHieuh
    0x0ee3 to 0x11b7, // f → Hangul_J_Mieum
    0x0ee4 to 0x11b8, // f → Hangul_J_Pieub
    0x0ee5 to 0x11b9, // f → Hangul_J_PieubSios
    0x0ee6 to 0x11ba, // f → Hangul_J_Sios
    0x0ee7 to 0x11bb, // f → Hangul_J_SsangSios
    0x0ee8 to 0x11bc, // f → Hangul_J_Ieung
    0x0ee9 to 0x11bd, // f → Hangul_J_Jieuj
    0x0eea to 0x11be, // f → Hangul_J_Cieuc
    0x0eeb to 0x11bf, // f → Hangul_J_Khieuq
    0x0eec to 0x11c0, // f → Hangul_J_Tieut
    0x0eed to 0x11c1, // f → Hangul_J_Phieuf
    0x0eee to 0x11c2, // f → Hangul_J_Hieuh
    0x0eef to 0x316d, // f → Hangul_RieulYeorinHieuh
    0x0ef0 to 0x3171, // f → Hangul_SunkyeongeumMieum
    0x0ef1 to 0x3178, // f → Hangul_SunkyeongeumPieub
    0x0ef2 to 0x317f, // f → Hangul_PanSios
    0x0ef3 to 0x3181, // f → Hangul_KkogjiDalrinIeung
    0x0ef4 to 0x3184, // f → Hangul_SunkyeongeumPhieuf
    0x0ef5 to 0x3186, // f → Hangul_YeorinHieuh
    0x0ef6 to 0x318d, // f → Hangul_AraeA
    0x0ef7 to 0x318e, // f → Hangul_AraeAE
    0x0ef8 to 0x11eb, // f → Hangul_J_PanSios
    0x0ef9 to 0x11f0, // f → Hangul_J_KkogjiDalrinIeung
    0x0efa to 0x11f9, // f → Hangul_J_YeorinHieuh
    0x0eff to 0x20a9, // o → Korean_Won
    0x13bc to 0x0152, // . → OE
    0x13bd to 0x0153, // . → oe
    0x13be to 0x0178, // . → Ydiaeresis
    0x20a0 to 0x20a0, // u → EcuSign
    0x20a1 to 0x20a1, // u → ColonSign
    0x20a2 to 0x20a2, // u → CruzeiroSign
    0x20a3 to 0x20a3, // u → FFrancSign
    0x20a4 to 0x20a4, // u → LiraSign
    0x20a5 to 0x20a5, // u → MillSign
    0x20a6 to 0x20a6, // u → NairaSign
    0x20a7 to 0x20a7, // u → PesetaSign
    0x20a8 to 0x20a8, // u → RupeeSign
    0x20a9 to 0x20a9, // u → WonSign
    0x20aa to 0x20aa, // u → NewSheqelSign
    0x20ab to 0x20ab, // u → DongSign
    0x20ac to 0x20ac, // . → EuroSign
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
    0xfe50 to 0x0300, // f → dead_grave
    0xfe51 to 0x0301, // f → dead_acute
    0xfe52 to 0x0302, // f → dead_circumflex
    0xfe53 to 0x0303, // f → dead_tilde
    0xfe54 to 0x0304, // f → dead_macron
    0xfe55 to 0x0306, // f → dead_breve
    0xfe56 to 0x0307, // f → dead_abovedot
    0xfe57 to 0x0308, // f → dead_diaeresis
    0xfe58 to 0x030a, // f → dead_abovering
    0xfe59 to 0x030b, // f → dead_doubleacute
    0xfe5a to 0x030c, // f → dead_caron
    0xfe5b to 0x0327, // f → dead_cedilla
    0xfe5c to 0x0328, // f → dead_ogonek
    0xfe5d to 0x0345, // f → dead_iota
    0xfe5e to 0x3099, // f → dead_voiced_sound
    0xfe5f to 0x309a, // f → dead_semivoiced_sound
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
    0xff08 to 0x0008, // f → BackSpace	/* back space, back char */
    0xff09 to 0x0009, // f → Tab
    0xff0a to 0x000a, // f → Linefeed	/* Linefeed, LF */
    0xff0b to 0x000b, // f → Clear
    0xff0d to 0x000d, // f → Return	/* Return, enter */
    0xff13 to 0x0013, // f → Pause	/* Pause, hold */
    0xff14 to 0x0014, // f → Scroll_Lock
    0xff15 to 0x0015, // f → Sys_Req
    0xff1b to 0x001b, // f → Escape
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
    0xff80 to 0x0020, // f → KP_Space /* space */
    0xff89 to 0x0009, // f → KP_Tab
    0xff8d to 0x000d, // f → KP_Enter /* enter */
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
    0xffaa to 0x002a, // f → KP_Multiply
    0xffab to 0x002b, // f → KP_Add
    0xffac to 0x002c, // f → KP_Separator	/* separator, often comma */
    0xffad to 0x002d, // f → KP_Subtract
    0xffae to 0x002e, // f → KP_Decimal
    0xffaf to 0x002f, // f → KP_Divide
    0xffb0 to 0x0030, // f → KP_0
    0xffb1 to 0x0031, // f → KP_1
    0xffb2 to 0x0032, // f → KP_2
    0xffb3 to 0x0033, // f → KP_3
    0xffb4 to 0x0034, // f → KP_4
    0xffb5 to 0x0035, // f → KP_5
    0xffb6 to 0x0036, // f → KP_6
    0xffb7 to 0x0037, // f → KP_7
    0xffb8 to 0x0038, // f → KP_8
    0xffb9 to 0x0039, // f → KP_9
    0xffbd to 0x003d, // f → KP_Equal	/* equals */
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
    0x06ad to 0x0491, // . → Ukrainian_ghe_with_upturn
    0x06bd to 0x0490, // . → Ukrainian_GHE_WITH_UPTURN
    0x12a1 to 0x1e02, // u → Babovedot
    0x12a2 to 0x1e03, // u → babovedot
    0x12a6 to 0x1e0a, // u → Dabovedot
    0x12a8 to 0x1e80, // u → Wgrave
    0x12aa to 0x1e82, // u → Wacute
    0x12ab to 0x1e0b, // u → dabovedot
    0x12ac to 0x1ef2, // u → Ygrave
    0x12b0 to 0x1e1e, // u → Fabovedot
    0x12b1 to 0x1e1f, // u → fabovedot
    0x12b4 to 0x1e40, // u → Mabovedot
    0x12b5 to 0x1e41, // u → mabovedot
    0x12b7 to 0x1e56, // u → Pabovedot
    0x12b8 to 0x1e81, // u → wgrave
    0x12b9 to 0x1e57, // u → pabovedot
    0x12ba to 0x1e83, // u → wacute
    0x12bb to 0x1e60, // u → Sabovedot
    0x12bc to 0x1ef3, // u → ygrave
    0x12bd to 0x1e84, // u → Wdiaeresis
    0x12be to 0x1e85, // u → wdiaeresis
    0x12bf to 0x1e61, // u → sabovedot
    0x12d0 to 0x0174, // u → Wcircumflex
    0x12d7 to 0x1e6a, // u → Tabovedot
    0x12de to 0x0176, // u → Ycircumflex
    0x12f0 to 0x0175, // u → wcircumflex
    0x12f7 to 0x1e6b, // u → tabovedot
    0x12fe to 0x0177, // u → ycircumflex
    0x0680 to 0x0492, // u → Cyrillic_GHE_bar
    0x0681 to 0x0496, // u → Cyrillic_ZHE_descender
    0x0682 to 0x049a, // u → Cyrillic_KA_descender
    0x0683 to 0x049c, // u → Cyrillic_KA_vertstroke
    0x0684 to 0x04a2, // u → Cyrillic_EN_descender
    0x0685 to 0x04ae, // u → Cyrillic_U_straight
    0x0686 to 0x04b0, // u → Cyrillic_U_straight_bar
    0x0687 to 0x04b2, // u → Cyrillic_HA_descender
    0x0688 to 0x04b6, // u → Cyrillic_CHE_descender
    0x0689 to 0x04b8, // u → Cyrillic_CHE_vertstroke
    0x068a to 0x04ba, // u → Cyrillic_SHHA
    0x068c to 0x04d8, // u → Cyrillic_SCHWA
    0x068d to 0x04e2, // u → Cyrillic_I_macron
    0x068e to 0x04e8, // u → Cyrillic_O_bar
    0x068f to 0x04ee, // u → Cyrillic_U_macron
    0x0690 to 0x0493, // u → Cyrillic_ghe_bar
    0x0691 to 0x0497, // u → Cyrillic_zhe_descender
    0x0692 to 0x049b, // u → Cyrillic_ka_descender
    0x0693 to 0x049d, // u → Cyrillic_ka_vertstroke
    0x0694 to 0x04a3, // u → Cyrillic_en_descender
    0x0695 to 0x04af, // u → Cyrillic_u_straight
    0x0696 to 0x04b1, // u → Cyrillic_u_straight_bar
    0x0697 to 0x04b3, // u → Cyrillic_ha_descender
    0x0698 to 0x04b7, // u → Cyrillic_che_descender
    0x0699 to 0x04b9, // u → Cyrillic_che_vertstroke
    0x069a to 0x04bb, // u → Cyrillic_shha
    0x069c to 0x04d9, // u → Cyrillic_schwa
    0x069d to 0x04e3, // u → Cyrillic_i_macron
    0x069e to 0x04e9, // u → Cyrillic_o_bar
    0x069f to 0x04ef, // u → Cyrillic_u_macron
)