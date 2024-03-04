package TomteTown

class Tomteland {

    //Init?
    //Test för input?

    val mapTomteTown = mapOf( "Tomten" to listOf("Glader", "Butter"), "Glader" to listOf("Tröger", "Trötter", "Blyger"),
        "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"), "Trötter" to listOf("Skumtomten"),
        "Skumtomten" to listOf("Dammråttan"), "Räven" to listOf("Gråsuggan", "Myran"), "Myran" to listOf("Bladlusen")
    )

    init {
        //println("Ange tomte") //Test för detta?
        //var inputTomte: String = readlnOrNull() ?: "TomTomte"
        var test1337 = getUnderlings("Butter", mapTomteTown)
        println(test1337)
      //  if (inputTomte.equals(null)) println("Du angav ingen tomte i Tomteland")
      //  else println(test1337)
    }

    fun getUnderlings(currentName: String, mapTomteTown: Map<String, List<String>>): List<String> {
        val tempListAvTomtar = mutableListOf<String>() // Samlar slav-tomtar

     //   if (currentName.equals("TomTomte")) println("Du angav ingen tomte i Tomteland")

        fun recursiveFind(name: String) {
            mapTomteTown[name]?.forEach { underling -> //Elvis
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