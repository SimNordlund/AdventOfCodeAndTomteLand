package TomteTown

class Tomteland {

    val mapTomteTown = mapOf(
        "Tomten" to listOf("Glader", "Butter"),
        "Glader" to listOf("Tröger", "Trötter", "Blyger"),
        "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"),
        "Trötter" to listOf("Skumtomten"),
        "Skumtomten" to listOf("Dammråttan"),
        "Räven" to listOf("Gråsuggan", "Myran"),
        "Myran" to listOf("Bladlusen")
    )

    init {
        var test1337 = getUnderlings("Räven", mapTomteTown)
        println(test1337)
    }

    fun getUnderlings(currentName: String, mapTomteTown: Map<String, List<String>>): List<String> {
        val tempListAvTomtar = mutableListOf<String>() // Samlar slav-tomtar

        fun recursiveFind(name: String) {
            mapTomteTown[name]?.forEach { underling ->
                if (!tempListAvTomtar.contains(underling)) {
                    tempListAvTomtar.add(underling)
                    recursiveFind(underling) // Rekursivt sök efter underlydande
                }
            }
        }
        recursiveFind(currentName) // Starta sökningen. Tar in namn som parameter.
        return tempListAvTomtar
    }
}

fun main() {
    var tl = Tomteland()
}