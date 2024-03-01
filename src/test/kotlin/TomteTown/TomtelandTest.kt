import TomteTown.Tomteland
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue

class TomtelandTest {
    private var tl = Tomteland()

    // Dina listor...
    private var uTomten: List<String> = mutableListOf(
        "Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten", "Glader",
        "Butter", "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen"
    )
    private var uGlader: List<String> = mutableListOf("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten")
    private var uButter: List<String> = mutableListOf(
        "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran",
        "Bladlusen"
    )
    private var uTrötter: List<String> = mutableListOf("Dammråttan", "Skumtomten")
    private var uSkumtomten: List<String> = mutableListOf("Dammråttan")
    private var uRäven: List<String> = mutableListOf("Gråsuggan", "Myran", "Bladlusen")
    private var uMyran = mutableListOf("Bladlusen")

    @Test
    fun underlingsBladlusenTest() {
        val map: Map<String, List<String>> = mapOf()
        val underlings = tl.getUnderlings("Bladlusen", map)
        assertEquals(0, underlings.size)
    }

    @Test
    fun underlingsTrögerTest() {
        val map: Map<String, List<String>> = mapOf()
        val underlings = tl.getUnderlings("Tröger", map)
        assertEquals(0, underlings.size)
    }

    @Test
    fun underlingsBlygerTest() {
        val map: Map<String, List<String>> = mapOf()
        val underlings = tl.getUnderlings("Blyger", map)
        assertEquals(0, underlings.size)
    }

    @Test
    fun underlingsDammråttanTest() {
        val map: Map<String, List<String>> = mapOf()
        val underlings = tl.getUnderlings("Dammråttan", map)
        assertEquals(0, underlings.size)
    }

    @Test
    fun underlingsGråsugganTest() {
        val map: Map<String, List<String>> = mapOf()
        val underlings = tl.getUnderlings("Gråsuggan", map)
        assertEquals(0, underlings.size)
    }

    @Test
    fun underlingsHarenTest() {
        val map: Map<String, List<String>> = mapOf()
        val underlings = tl.getUnderlings("Haren", map)
        assertEquals(0, underlings.size)
    }

    @Test
    fun underlingsNyckelpiganTest() {
        val map: Map<String, List<String>> = mapOf()
        val underlings = tl.getUnderlings("Nyckelpigan", map)
        assertEquals(0, underlings.size)
    }

    @Test
    fun underlingsRådjuretTest() {
        val map: Map<String, List<String>> = mapOf()
        val underlings = tl.getUnderlings("Rådjuret", map)
        assertEquals(0, underlings.size)
    }

    @Test
    fun underlingsMyranTest() {
        val underlings = tl.getUnderlings("Myran", tl.mapTomteTown)
        assertEquals(uMyran.size, underlings.size)
        assertTrue(underlings.containsAll(uMyran) && uMyran.containsAll(underlings))
    }

    @Test
    fun underlingsRävenTest() {
        val underlings = tl.getUnderlings("Räven", tl.mapTomteTown)
        assertEquals(uRäven.size, underlings.size)
        assertTrue(underlings.containsAll(uRäven) && uRäven.containsAll(underlings))
    }

    @Test
    fun underlingsSkumtomtenTest() {
        val underlings = tl.getUnderlings("Skumtomten", tl.mapTomteTown)
        assertEquals(uSkumtomten.size, underlings.size)
        assertTrue(underlings.containsAll(uSkumtomten) && uSkumtomten.containsAll(underlings))
    }


}


