package org.igor_shaula

const val KLC_FILE_BASIS = """
KBD	7-chars	"layout-description"

COPYRIGHT	"(c) 2025 igor.shaula"

COMPANY	"Igor Shaula"

LOCALENAME	"en-US"

LOCALEID	"00000409"

VERSION	1.0

SHIFTSTATE

0	//Column 4
1	//Column 5 : Shft
2	//Column 6 :       Ctrl
6	//Column 7 :       Ctrl Alt
7	//Column 8 : Shft  Ctrl Alt

LAYOUT		;an extra '@' at the end is a dead key

//SC	VK_		Cap	0	1	    2	    6   	7
//--------------------------------------------------

02	1		    0	1	    00b9    -1  0021	00a1	// DIGIT ONE, SUPERSCRIPT ONE, <none>, EXCLAMATION MARK, INVERTED EXCLAMATION MARK
03	2		    0	2	    00b2    -1	0040	20ac	// DIGIT TWO, SUPERSCRIPT TWO, <none>, COMMERCIAL AT, EURO SIGN
04	3		    0	3	    00b3    -1	0023	2234	// DIGIT THREE, SUPERSCRIPT THREE, <none>, NUMBER SIGN, THEREFORE
05	4		    0	4	    2074    -1	0024	00a7	// DIGIT FOUR, SUPERSCRIPT FOUR, <none>, DOLLAR SIGN, SECTION SIGN
06	5		    0	5	    2075    -1	0025	00a5	// DIGIT FIVE, SUPERSCRIPT FIVE, <none>, PERCENT SIGN, YEN SIGN
07	6		    0	6	    2076    -1	005e	02c7	// DIGIT SIX, SUPERSCRIPT SIX, <none>, CIRCUMFLEX ACCENT, CARON (Mandarin Chinese third tone)
08	7		    0	7	    2077	-1	0026	00b6	// DIGIT SEVEN, SUPERSCRIPT SEVEN, <none>, AMPERSAND, PILCROW SIGN
09	8		    0	8	    2078	-1	002a	00b0	// DIGIT EIGHT, SUPERSCRIPT EIGHT, <none>, ASTERISK, DEGREE SIGN
0a	9		    0	9	    2079	-1	0028	2116	// DIGIT NINE, SUPERSCRIPT NINE, <none>, LEFT PARENTHESIS, NUMERO SIGN
0b	0		    0	0	    2070	-1  0029	00a4	// DIGIT ZERO, SUPERSCRIPT ZERO, <none>, RIGHT PARENTHESIS, CURRENCY SIGN
0c	OEM_MINUS	0	002d	007e    -1  005f	2248	// HYPHEN-MINUS, TILDE, <none>, LOW LINE, ALMOST EQUAL TO
0d	OEM_PLUS	0	003d	2260    -1  002b	00b1	// EQUALS SIGN, NOT EQUAL TO, <none>, PLUS SIGN, PLUS-MINUS SIGN

10	Q	    	1	q	    Q   	-1	-1  	-1		// LATIN SMALL LETTER Q, LATIN CAPITAL LETTER Q, <none>, <none>, <none>
11	W		    1	w	    W	    -1	-1	    -1		// LATIN SMALL LETTER W, LATIN CAPITAL LETTER W, <none>, <none>, <none>
12	OEM_1	    0	003a	00a6	-1	007c	205e	// COLON, BROKEN BAR, <none>, VERTICAL LINE, VERTICAL FOUR DOTS
13	U		    1	u	    U	    -1	-1	    -1		// LATIN SMALL LETTER U, LATIN CAPITAL LETTER U, <none>, <none>, <none>
14	OEM_7		0	0027	00a8	-1	0022	00af	// APOSTROPHE, DIAERESIS, <none>, QUOTATION MARK, MACRON
15	OEM_4		0	007b	2329	-1	005b	00ab	// LEFT CURLY BRACKET, LEFT-POINTING ANGLE BRACKET, <none>, LEFT SQUARE BRACKET, LEFT-POINTING DOUBLE ANGLE QUOTATION MARK *
16	OEM_6		0	007d	232a	-1	005d	00bb	// RIGHT CURLY BRACKET, RIGHT-POINTING ANGLE BRACKET, <none>, RIGHT SQUARE BRACKET, RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK *
17	J		    1	j	    J	    -1	0060	00b4	// LATIN SMALL LETTER J, LATIN CAPITAL LETTER J, <none>, GRAVE ACCENT, ACUTE ACCENT
18	R		    1	r	    R	    -1	-1	    -1		// LATIN SMALL LETTER R, LATIN CAPITAL LETTER R, <none>, <none>, <none>
19	P		    1	p	    P	    -1	-1	    -1		// LATIN SMALL LETTER P, LATIN CAPITAL LETTER P, <none>, <none>, <none>
1a	K		    1	k	    K	    -1	2194	201c	// LATIN SMALL LETTER K, LATIN CAPITAL LETTER K, <none>, LEFT RIGHT ARROW, LEFT DOUBLE QUOTATION MARK
1b	L		    1	l	    L	    -1	2195	201d	// LATIN SMALL LETTER L, LATIN CAPITAL LETTER L, <none>, UP DOWN ARROW, RIGHT DOUBLE QUOTATION MARK

1e	A		    1	a   	A   	-1	-1	    -1		// LATIN SMALL LETTER A, LATIN CAPITAL LETTER A, <none>, <none>, <none>
1f	E		    1	e	    E	    -1	-1	    -1		// LATIN SMALL LETTER E, LATIN CAPITAL LETTER E, <none>, <none>, <none>
20	O		    1	o	    O	    -1	-1	    -1		// LATIN SMALL LETTER O, LATIN CAPITAL LETTER O, <none>, <none>, <none>
21	I		    1	i	    I	    -1	-1	    -1		// LATIN SMALL LETTER I, LATIN CAPITAL LETTER I, <none>, <none>, <none>
22	Y		    1	y	    Y	    -1	-1	    -1		// LATIN SMALL LETTER Y, LATIN CAPITAL LETTER Y, <none>, <none>, <none>
23	OEM_2		0	003f	00bf	-1	002f	005c	// QUESTION MARK, INVERTED QUESTION MARK, <none>, SOLIDUS, REVERSE SOLIDUS
24	G		    1	f	    F	    -1	-1	    -1		// LATIN SMALL LETTER F, LATIN CAPITAL LETTER F, <none>, <none>, <none>
25	F		    1	n	    N	    -1	-1	    -1		// LATIN SMALL LETTER N, LATIN CAPITAL LETTER N, <none>, <none>, <none>
26	D		    1	t	    T	    -1	-1	    -1		// LATIN SMALL LETTER T, LATIN CAPITAL LETTER T, <none>, <none>, <none>
27	S		    1	s	    S	    -1	-1	    -1		// LATIN SMALL LETTER S, LATIN CAPITAL LETTER S, <none>, <none>, <none>
28	T		    1	d	    D	    -1	-1	    -1		// LATIN SMALL LETTER D, LATIN CAPITAL LETTER D, <none>, <none>, <none>

29	OEM_3		0	002e	003b	-1	002c	2026	// FULL STOP, SEMICOLON, <none>, COMMA, HORIZONTAL ELLIPSIS

2c	Z		    1	z	    Z   	-1	00ac	2263	// LATIN SMALL LETTER Z, LATIN CAPITAL LETTER Z, <none>, NOT SIGN, STRICTLY EQUIVALENT TO
2d	X		    1	x	    X	    -1	00d7	00f7	// LATIN SMALL LETTER X, LATIN CAPITAL LETTER X, <none>, MULTIPLICATION SIGN, DIVISION SIGN
2e	C		    1	c	    C	    -1	00a9	2022	// LATIN SMALL LETTER C, LATIN CAPITAL LETTER C, <none>, COPYRIGHT SIGN, BULLET
2f	V		    1	v	    V	    -1	2193	25bc	// LATIN SMALL LETTER V, LATIN CAPITAL LETTER V, <none>, DOWNWARDS ARROW, BLACK DOWN-POINTING TRIANGLE
30	OEM_COMMA	0	003c	2264	-1	2190	25c4	// LESS-THAN SIGN, LESS-THAN OR EQUAL TO, <none>, LEFTWARDS ARROW, BLACK LEFT-POINTING POINTER
31	OEM_PERIOD	0	003e	2265	-1	2192	25ba	// GREATER-THAN SIGN, GREATER-THAN OR EQUAL TO, <none>, RIGHTWARDS ARROW, BLACK RIGHT-POINTING POINTER
32	M		    1	m	    M	    -1	2191	25b2	// LATIN SMALL LETTER M, LATIN CAPITAL LETTER M, <none>, UPWARDS ARROW, BLACK UP-POINTING TRIANGLE
33	B		    1	h	    H	    -1	-1  	-1		// LATIN SMALL LETTER H, LATIN CAPITAL LETTER H, <none>, <none>, <none>
34	N		    1	g	    G	    -1	-1	    -1		// LATIN SMALL LETTER G, LATIN CAPITAL LETTER G, <none>, <none>, <none>
35	H		    1	b	    B	    -1	221e	2588	// LATIN SMALL LETTER B, LATIN CAPITAL LETTER B, <none>, INFINITY, FULL BLOCK

39	SPACE		0	0020	000d	-1	000a	-1		// SPACE, CARRIAGE RETURN, <none>, LINE FEED, <none>
53	DECIMAL 	0	002e	002c	-1	-1  	-1		// FULL STOP, COMMA, , , 


KEYNAME

01	Esc
0e	Backspace
0f	Tab
1c	Enter
1d	Ctrl
2a	Shift
36	"Right Shift"
37	"Num *"
38	Alt
39	Space
3a	"Caps Lock"
3b	F1
3c	F2
3d	F3
3e	F4
3f	F5
40	F6
41	F7
42	F8
43	F9
44	F10
45	Pause
46	"Scroll Lock"
47	"Num 7"
48	"Num 8"
49	"Num 9"
4a	"Num -"
4b	"Num 4"
4c	"Num 5"
4d	"Num 6"
4e	"Num +"
4f	"Num 1"
50	"Num 2"
51	"Num 3"
52	"Num 0"
53	"Num Del"
54	"Sys Req"
57	F11
58	F12
7c	F13
7d	F14
7e	F15
7f	F16
80	F17
81	F18
82	F19
83	F20
84	F21
85	F22
86	F23
87	F24

KEYNAME_EXT

1c	"Num Enter"
1d	"Right Ctrl"
35	"Num /"
37	"Prnt Scrn"
38	"Right Alt"
45	"Num Lock"
46	Break
47	Home
48	Up
49	"Page Up"
4b	Left
4d	Right
4f	End
50	Down
51	"Page Down"
52	Insert
53	Delete
54	<00>
56	Help
5b	"Left Windows"
5c	"Right Windows"
5d	Application

DESCRIPTIONS

0409	layout-description

LANGUAGENAMES

0409	English (United States)

ENDKBD
"""