# Converter into KLC

## Build and Run

To build and run the app from CLI (being in the project root directory):

1) `kotlinc src/main build/generated/ -include-runtime -d converter.jar`
2) `java -jar converter.jar`

Note: currently the app is not yet packaged as a single executable file and therefore needs Java to run.

---

To specify any arguments for the app:
`java -jar converter.jar arg1 arg2 arg…`

---

## Using arguments as options:

**"h"** - help: prints help information, as in other programs
→ SAMPLE: `-h`

**"v"** - version: displays the program version, as in other programs
→ SAMPLE: `-v`

**"s"** - silent (logging): minimize text output as much as possible
→ SAMPLE: `-s`

**"f="** - file (source with the language layout): specifies the X11 layout source file
→ SAMPLE: `-f=us` or `-f=ru`

**"l="** - layout (which one in the source file): specifies which layout section to use from the source file
→ SAMPLE: `-l=rus`

**"r="** - result KLC file: specifies the output KLC filename
→ SAMPLE: `-r=result_UTF-16.klc`

**"K_k8="** - KLC keyboard name (8 chars): sets the short keyboard name for the KLC file
→ SAMPLE: `-K_k8=basic_EN`

**"K_kl="** - KLC keyboard name (long): sets the long descriptive keyboard name for the KLC file
→ SAMPLE: `-K_kl=from X11 - English (US)`

**"K_cr="** - KLC copyright: sets the copyright notice for the KLC file
→ SAMPLE: `-K_cr=(c) 2025 igor.shaula`

**"K_c="** - KLC company: sets the company name for the KLC file
→ SAMPLE: `-K_c=Igor Shaula`

**"K_l="** - KLC locale name: sets the locale name for the KLC file
→ SAMPLE: `-K_l=en-US`

**"K_l-id="** - KLC locale ID: sets the locale ID for the KLC file
→ SAMPLE: `-K_l-id=00000409`

**"K_v="** - KLC version: sets the version number for the KLC file
→ SAMPLE: `-K_v=1.0`

**"K_lang="** - KLC language: sets the language description for the KLC file
→ SAMPLE: `-K_lang=English (United States)`

Note: currently only single-dash options are supported (will be changed in the future).

---

This tool converts X11 keyboard layout files to Microsoft Keyboard Layout Creator (KLC) format.