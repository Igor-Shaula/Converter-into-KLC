import org.igor_shaula.globals.Sym
import org.igor_shaula.globals.X11
import org.igor_shaula.logic.string_processing.*
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StringMatchersTest {

    @Test
    fun testIsEnglishUSNameGroup1() {
        val validString =
            X11.NAME_GROUP_1 + Sym.EQUALS + Sym.DOUBLE_QUOTE + X11.ENGLISH_US + Sym.DOUBLE_QUOTE + Sym.SEMICOLON
        assertTrue(validString.isEnglishUSNameGroup1())

        assertFalse("".isEnglishUSNameGroup1())
        assertFalse("some other string".isEnglishUSNameGroup1())
        assertFalse("name[Group1]=English(US);".isEnglishUSNameGroup1())
        assertFalse((X11.NAME_GROUP_1 + Sym.EQUALS + Sym.DOUBLE_QUOTE + "Other" + Sym.DOUBLE_QUOTE + Sym.SEMICOLON).isEnglishUSNameGroup1())
    }

    @Test
    fun testIsKeyTilde() {
        val validString = X11.KEY_TILDE + X11.OPENING_BRACKETS + "some content" + X11.CLOSING_BRACKETS + Sym.SEMICOLON
        assertTrue(validString.isKeyTilde())

        assertFalse("".isKeyTilde())
        assertFalse("key<TLDE>".isKeyTilde())
        assertFalse("key<TLDE>{[some content".isKeyTilde())
        assertFalse("other<TLDE>{[content]};".isKeyTilde())
    }

    @Test
    fun testIsKeySpace() {
        val validString = X11.KEY_SPACE + X11.OPENING_BRACKETS + "some content" + X11.CLOSING_BRACKETS + Sym.SEMICOLON
        assertTrue(validString.isKeySpace())

        assertFalse("".isKeySpace())
        assertFalse("key<SPCE>".isKeySpace())
        assertFalse("key<SPCE>{[some content".isKeySpace())
        assertFalse("other<SPCE>{[content]};".isKeySpace())
    }

    @Test
    fun testIsKeyStartingWithA() {
        val validLine =
            "key <AE01> {[\t1\t\t,exclam\t\t\t,onesuperior\t\t,exclamdown\t\t]}; // 1 ! ¹ ¡".clearAllBlanks()
        assertTrue(validLine.isKeyStartingWithA())

        assertFalse("".isKeyStartingWithA())
        assertFalse("key<A".isKeyStartingWithA())
        assertFalse("key<ABC>{[content".isKeyStartingWithA())
        assertFalse("other<ABC>{[content]};".isKeyStartingWithA())
    }

    @Test
    fun testIsKeyStartingWithLat() {
        val validString = "key <LatR> {[	Cyrillic_er		,Cyrillic_ER    ]};".clearAllBlanks()
        assertTrue(validString.isKeyStartingWithLat())

        assertFalse("".isKeyStartingWithLat())
        assertFalse("key<Lat".isKeyStartingWithLat())
        assertFalse("key<Latin>{[content".isKeyStartingWithLat())
        assertFalse("other<Latin>{[content]};".isKeyStartingWithLat())
    }

    @Test
    fun testIsKeyStartingWithAlias() {
        val validString = "\talias <LatQ> = <AD01>;".clearAllBlanks()
        assertTrue(validString.isKeyStartingWithAlias())

        assertFalse("".isKeyStartingWithAlias())
        assertFalse("alias <test>".isKeyStartingWithAlias())
        assertFalse("other <test> = <other>;".isKeyStartingWithAlias())
        assertFalse((X11.ALIAS + " <test> = <other>").isKeyStartingWithAlias())
    }

    @Test
    fun testIsUnicodeNumber() {
        assertTrue("U1234".isUnicodeNumber())
        assertTrue("UABCD".isUnicodeNumber())
        assertTrue("U0000".isUnicodeNumber())

        assertFalse("".isUnicodeNumber())
        assertFalse("U123".isUnicodeNumber())
        assertFalse("U12345".isUnicodeNumber())
        assertFalse("X1234".isUnicodeNumber())
        assertFalse("u1234".isUnicodeNumber())
    }

    @Test
    fun testIsXkbSymbolsSection() {
        assertTrue("xkb_symbols \"basic\" {".isXkbSymbolsSection())
        assertTrue("  xkb_symbols \"us\"  {  ".isXkbSymbolsSection())
        assertTrue("\txkb_symbols\t\"dvorak\"\t{\t".isXkbSymbolsSection())

        assertFalse("".isXkbSymbolsSection())
        assertFalse("xkb_symbols basic {".isXkbSymbolsSection())
        assertFalse("xkb_symbols \"basic\"".isXkbSymbolsSection())
        assertFalse("other \"basic\" {".isXkbSymbolsSection())
    }

    @Test
    fun testIsLayoutEndingBlock() {
        assertTrue("};".isLayoutEndingBlock())
        assertTrue("}; some comment".isLayoutEndingBlock())

        assertFalse("".isLayoutEndingBlock())
        assertFalse("}".isLayoutEndingBlock())
        assertFalse(";".isLayoutEndingBlock())
        assertFalse("other};".isLayoutEndingBlock())
    }

    @Test
    fun testIsBeginningInclude() {
        assertTrue("include \"basic\"".isBeginningInclude())
        assertTrue("  include   \"us\"  ".isBeginningInclude())
        assertTrue("\tinclude\t\"dvorak\"".isBeginningInclude())

        assertFalse("".isBeginningInclude())
        assertFalse("other include".isBeginningInclude())
        assertFalse("  other include".isBeginningInclude())
    }

    @Test
    fun testIsExtendedX11KeyCode() {
        assertTrue("100123".isExtendedX11KeyCode())
        assertTrue("100ABC".isExtendedX11KeyCode())

        assertFalse("".isExtendedX11KeyCode())
        assertFalse("99123".isExtendedX11KeyCode())
        assertFalse("200123".isExtendedX11KeyCode())
        assertFalse("10123".isExtendedX11KeyCode())
    }

    @Test
    fun testIsArgumentAnOption() {
        assertTrue("-h".isArgumentAnOption())
        assertTrue("-option".isArgumentAnOption())
        assertTrue("-123".isArgumentAnOption())

        assertFalse("".isArgumentAnOption())
        assertFalse("h".isArgumentAnOption())
        assertFalse("option".isArgumentAnOption())
        assertFalse("=option".isArgumentAnOption())
    }

    @Test
    fun testIsHelp() {
        assertTrue("h".isHelp())

        assertFalse("".isHelp())
        assertFalse("help".isHelp())
        assertFalse("H".isHelp())
        assertFalse("-h".isHelp())
    }

    @Test
    fun testIsVersion() {
        assertTrue("v".isVersion())

        assertFalse("".isVersion())
        assertFalse("version".isVersion())
        assertFalse("V".isVersion())
        assertFalse("-v".isVersion())
    }

    @Test
    fun testIsSilent() {
        assertTrue("s".isSilent())

        assertFalse("".isSilent())
        assertFalse("silent".isSilent())
        assertFalse("S".isSilent())
        assertFalse("-s".isSilent())
    }

    @Test
    fun testIsFile() {
        assertTrue("f=filename.txt".isFile())
        assertTrue("f=path/to/file.klc".isFile())

        assertFalse("".isFile())
        assertFalse("f".isFile())
        assertFalse("file=test".isFile())
        assertFalse("F=filename.txt".isFile())
    }

    @Test
    fun testIsLayout() {
        assertTrue("l=basic".isLayout())
        assertTrue("l=us".isLayout())

        assertFalse("".isLayout())
        assertFalse("l".isLayout())
        assertFalse("layout=basic".isLayout())
        assertFalse("L=basic".isLayout())
    }

    @Test
    fun testIsKlcResultFileName() {
        assertTrue("r=result.klc".isKlcResultFileName())
        assertTrue("r=path/to/result.klc".isKlcResultFileName())

        assertFalse("".isKlcResultFileName())
        assertFalse("r".isKlcResultFileName())
        assertFalse("result=file.klc".isKlcResultFileName())
        assertFalse("R=result.klc".isKlcResultFileName())
    }

    @Test
    fun testIsKlcKbdName8() {
        assertTrue("K_k8=basic_EN".isKlcKbdName8())
        assertTrue("K_k8=us_layout".isKlcKbdName8())

        assertFalse("".isKlcKbdName8())
        assertFalse("K_k8".isKlcKbdName8())
        assertFalse("kbd8=basic".isKlcKbdName8())
        assertFalse("k_k8=basic".isKlcKbdName8())
    }

    @Test
    fun testIsKlcKbdNameLong() {
        assertTrue("K_kl=from X11 - English (US)".isKlcKbdNameLong())
        assertTrue("K_kl=Custom Layout Name".isKlcKbdNameLong())

        assertFalse("".isKlcKbdNameLong())
        assertFalse("K_kl".isKlcKbdNameLong())
        assertFalse("kbdlong=name".isKlcKbdNameLong())
        assertFalse("k_kl=name".isKlcKbdNameLong())
    }

    @Test
    fun testIsKlcCopyright() {
        assertTrue("K_cr=(c) 2025 igor.shaula".isKlcCopyright())
        assertTrue("K_cr=Copyright Notice".isKlcCopyright())

        assertFalse("".isKlcCopyright())
        assertFalse("K_cr".isKlcCopyright())
        assertFalse("copyright=notice".isKlcCopyright())
        assertFalse("k_cr=notice".isKlcCopyright())
    }

    @Test
    fun testIsKlcCompany() {
        assertTrue("K_c=Igor Shaula".isKlcCompany())
        assertTrue("K_c=Company Name".isKlcCompany())

        assertFalse("".isKlcCompany())
        assertFalse("K_c".isKlcCompany())
        assertFalse("company=name".isKlcCompany())
        assertFalse("k_c=name".isKlcCompany())
    }

    @Test
    fun testIsKlcLocaleName() {
        assertTrue("K_l=en-US".isKlcLocaleName())
        assertTrue("K_l=de-DE".isKlcLocaleName())

        assertFalse("".isKlcLocaleName())
        assertFalse("K_l".isKlcLocaleName())
        assertFalse("locale=en-US".isKlcLocaleName())
        assertFalse("k_l=en-US".isKlcLocaleName())
    }

    @Test
    fun testIsKlcLocaleId() {
        assertTrue("K_l-id=00000409".isKlcLocaleId())
        assertTrue("K_l-id=12345678".isKlcLocaleId())

        assertFalse("".isKlcLocaleId())
        assertFalse("K_l-id".isKlcLocaleId())
        assertFalse("localeid=00000409".isKlcLocaleId())
        assertFalse("k_l-id=00000409".isKlcLocaleId())
    }

    @Test
    fun testIsKlcVersion() {
        assertTrue("K_v=1.0".isKlcVersion())
        assertTrue("K_v=2.5.3".isKlcVersion())

        assertFalse("".isKlcVersion())
        assertFalse("K_v".isKlcVersion())
        assertFalse("version=1.0".isKlcVersion())
        assertFalse("k_v=1.0".isKlcVersion())
    }

    @Test
    fun testIsKlcLanguage() {
        assertTrue("K_lang=English (United States)".isKlcLanguage())
        assertTrue("K_lang=German".isKlcLanguage())

        assertFalse("".isKlcLanguage())
        assertFalse("K_lang".isKlcLanguage())
        assertFalse("language=English".isKlcLanguage())
        assertFalse("k_lang=English".isKlcLanguage())
    }
}