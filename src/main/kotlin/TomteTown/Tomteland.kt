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

    fun askForTomte(isTest: Boolean): String {
        return if (isTest) {
            "TestTomte"
        } else {
            println("Ange tomte")
            val userInput: String = readlnOrNull() ?: "TomTomte"
            userInput
        }
    }

    fun printValuesFromFunction(key: String, newUL: List<String>, newTS: List<String>, newULF: List<String>) {
        println()
        println("Detta är tomteKey: $key")
        println("Detta är newUnderlings: $newUL")
        println("Detta är newTomteSearch: $newTS")
        println("Detta är newUnderlingsFound: $newULF")
    }

    fun getUnderlings(tomteName: String, mapTomteTown: Map<String, List<String>>): List<String> {

        tailrec fun findUnderlings(tomteSearch: List<String>, underlingsFound: List<String>): List<String> {
            return if (tomteSearch.isEmpty()) underlingsFound ///När tomteSearch är tom, return underlings/ackumulator.

            else {
                //Tar fram tomtenyckeln som ska sökas på.
                val tomteKey = tomteSearch.first()
                //Letar upp listan som tillhör nyckeln. Om ej finns någon och det blir null -> TomLista.
                val newUnderlings = mapTomteTown[tomteKey] ?: listOf()
                //Tar bort söktTomte och lägger till nästa ev. Tomte/Tomtar. Tom lista + befintlig lista = oförändrat.
                val newTomteSearch = tomteSearch.drop(1) + newUnderlings
                //Slår ihop nya underlings med de nuvarande.
                val newUnderlingsFound = underlingsFound + newUnderlings

                printValuesFromFunction(tomteKey, newUnderlings, newTomteSearch, newUnderlingsFound)
                return findUnderlings(newTomteSearch, newUnderlingsFound)
            }
        }
        return findUnderlings(listOf(tomteName), listOf())
    }
}