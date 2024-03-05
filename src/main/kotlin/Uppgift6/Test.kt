package Uppgift6

fun main() {
    fun getUnderlings(currentName: String, mapTomteTown: Map<String, List<String>>): List<String> {
        val tempListAvTomtar = mutableListOf<String>() // Samlar slav-tomtar

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