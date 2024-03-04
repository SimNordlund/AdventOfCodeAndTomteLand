package TomteTown

class Tomteland {

    val mapTomteTown = mapOf( "Tomten" to listOf("Glader", "Butter"), "Glader" to listOf("Tröger", "Trötter", "Blyger"),
        "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"), "Trötter" to listOf("Skumtomten"),
        "Skumtomten" to listOf("Dammråttan"), "Räven" to listOf("Gråsuggan", "Myran"), "Myran" to listOf("Bladlusen")
    )

    fun getUnderlings(currentName: String, mapTomteTown: Map<String, List<String>>): List<String> {
        val tempListAvTomtar = mutableListOf<String>() // Samlar slav-tomtar

        tailrec fun recursiveFind(name: String) {
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

    //Hittar undersåtar, direkta samt indirekta
    fun getUnderlings2(currentName: String, mapTomteTown: Map<String, List<String>>): List<String> {

        //ToProcess ex. Trötter samt en tom list foundUnderlings initialt.
        tailrec fun recursiveFind(toProcess: List<String>, foundUnderlings: List<String>): List<String> {
            if (toProcess.isEmpty()) return foundUnderlings //.distinct??

            val current = toProcess.first() //Vi tar det första elementet -> Trötter
            val newUnderlings = mapTomteTown[current] ?: listOf() //Tar fram -> Skumtomten
            val newToProcess = toProcess.drop(1) + newUnderlings //Tar bort Trötter och lägger till -> Skumtomten
            val newFound = foundUnderlings + newUnderlings //Blir också skumtomten

            return recursiveFind(newToProcess, newFound)
        }
        return recursiveFind(listOf(currentName), listOf())
    }
}