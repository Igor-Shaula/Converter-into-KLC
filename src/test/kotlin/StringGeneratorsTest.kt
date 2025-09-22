import org.igor_shaula.logic.Repository
import org.igor_shaula.logic.string_processing.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class StringGeneratorsTest {

    @Test
    fun testClearAllBlanks() {
        assertEquals("", "".clearAllBlanks())
        assertEquals("test", "test".clearAllBlanks())
        assertEquals("teststring", "test string".clearAllBlanks())
        assertEquals("test", " test ".clearAllBlanks())
        assertEquals("teststring", " test  string ".clearAllBlanks())
        assertEquals("teststring", "\ttest\nstring\r".clearAllBlanks())
        assertEquals("", "   \t\n\r   ".clearAllBlanks())
    }

    @Test
    fun testGetXkbSymbolsSectionName() {
        assertEquals("basic", getXkbSymbolsSectionName("xkb_symbols \"basic\" {"))
        assertEquals("us", getXkbSymbolsSectionName("  xkb_symbols \"us\"  {  "))
        assertEquals("dvorak", getXkbSymbolsSectionName("\txkb_symbols\t\"dvorak\"\t{\t"))
        assertNull(getXkbSymbolsSectionName(""))
        assertNull(getXkbSymbolsSectionName("xkb_symbols basic {"))
        assertNull(getXkbSymbolsSectionName("xkb_symbols \"basic\""))
        assertNull(getXkbSymbolsSectionName("other \"basic\" {"))
    }

    @Test
    fun testGetXkbKeycodesSectionName() {
        assertEquals("evdev", getXkbKeycodesSectionName("xkb_keycodes \"evdev\" {"))
        assertEquals("aliases", getXkbKeycodesSectionName("  xkb_keycodes \"aliases\"  {  "))
        assertEquals("custom", getXkbKeycodesSectionName("\txkb_keycodes\t\"custom\"\t{\t"))
        assertNull(getXkbKeycodesSectionName(""))
        assertNull(getXkbKeycodesSectionName("xkb_keycodes evdev {"))
        assertNull(getXkbKeycodesSectionName("xkb_keycodes \"evdev\""))
        assertNull(getXkbKeycodesSectionName("other \"evdev\" {"))
    }

    @Test
    fun testGetCapitalizedValue() {
        assertEquals(1, getCapitalizedValue("A"))
        assertEquals(1, getCapitalizedValue("z"))
        assertEquals(1, getCapitalizedValue("M"))
        assertEquals(0, getCapitalizedValue(""))
        assertEquals(0, getCapitalizedValue("1"))
        assertEquals(0, getCapitalizedValue("@"))
        assertEquals(0, getCapitalizedValue("AB"))
        assertEquals(0, getCapitalizedValue("a1"))
        assertEquals(0, getCapitalizedValue(" "))
    }

    @Test
    fun testMapToKeysym() {
        val repository = Repository()
        repository.setX11Symbol("A", "0041")
        repository.setUnicodeValue("A", "0041")

        assertEquals("", "".mapToKeysym(repository))
        assertEquals("", " ".mapToKeysym(repository))
        assertEquals("", "   ".mapToKeysym(repository))
        assertEquals("a", "a".mapToKeysym(repository))
        assertEquals("Z", "Z".mapToKeysym(repository))
        assertEquals("1234", "U1234".mapToKeysym(repository))
        assertEquals("abcd", "UABCD".mapToKeysym(repository))
        assertEquals("0000", "U0000".mapToKeysym(repository))
        assertEquals("test", "TEST".mapToKeysym(repository))
        assertEquals("unknown", "UNKNOWN".mapToKeysym(repository))
    }

    @Test
    fun testFilterCommands() {
        assertEquals("", "f123".filterCommands())
        assertEquals("", "F456".filterCommands())
        assertEquals("test", "test".filterCommands())
        assertEquals("", "".filterCommands())
        assertEquals("gf123", "gf123".filterCommands())
        assertEquals("123f", "123f".filterCommands())
    }

    @Test
    fun testFilterMissingKeysyms() {
        assertEquals("", "nosymbol".filterMissingKeysyms())
        assertEquals("", "0x100000001".filterMissingKeysyms())
        assertEquals("", "0x10012345".filterMissingKeysyms())
        assertEquals("test", "test".filterMissingKeysyms())
        assertEquals("", "".filterMissingKeysyms())
        assertEquals("", "0x100".filterMissingKeysyms())
        assertEquals("", "0x100ABCD".filterMissingKeysyms())
        assertEquals("0x10", "0x10".filterMissingKeysyms())
    }

    @Test
    fun testGetX11KeycodeBaseValue() {
        assertEquals("123", "100123".getX11KeycodeBaseValue())
        assertEquals("ABC", "100ABC".getX11KeycodeBaseValue())
        assertEquals("", "100".getX11KeycodeBaseValue())
        assertEquals("1", "1001".getX11KeycodeBaseValue())
    }

    @Test
    fun testGetKeyNameStartingWithA() {
        assertEquals("AD01", "key<AD01>".getKeyNameStartingWithA())
        assertEquals("BC02", "key<BC02>".getKeyNameStartingWithA())
    }

    @Test
    fun testGetKeyNameStartingWithLat() {
        assertEquals("LatQ", "key<LatQ>".getKeyNameStartingWithLat())
        assertEquals("LatW", "key<LatW>".getKeyNameStartingWithLat())
        assertEquals("LatA", "key<LatA>".getKeyNameStartingWithLat())
        assertEquals("Lat1", "key<Lat1>".getKeyNameStartingWithLat())
    }
}