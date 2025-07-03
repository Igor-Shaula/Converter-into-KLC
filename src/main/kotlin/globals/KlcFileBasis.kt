package org.igor_shaula.globals

internal val KLC_FILE_PREFIX = """
KBD ${Klc.DEFAULT_LAYOUT_NAME_8}    "${Klc.DEFAULT_LAYOUT_DESCRIPTION}"

COPYRIGHT	"(c) 2025 igor.shaula"

COMPANY	"Igor Shaula"

LOCALENAME	"en-US"

LOCALEID	"00000409"

VERSION	1.0

SHIFTSTATE

0	//Column 4
1	//Column 5:	Shft
2	//Column 6:			Ctrl
6	//Column 7:			Ctrl	Alt
7	//Column 8:	Shft	Ctrl	Alt

LAYOUT	;an extra '@' at the end is a dead key


""".trimIndent() // we do need the last 2 blank lines - one of them remains in the result file after trimIndent()

internal val KLC_FILE_SUFFIX = """
53	DECIMAL		0	002e	002c	-1	-1	-1

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

0409	${Klc.DEFAULT_LAYOUT_DESCRIPTION}

LANGUAGENAMES

0409	English (United States)

ENDKBD
""".trimIndent()