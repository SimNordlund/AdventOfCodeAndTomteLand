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

    ///65 = A, //66 = B, //67 = C
    fun convertSimonListVersionTest(dataInString: List<String>): List<String> {
        val tempList = dataInString.map {
            if (it.contains("X")) //OM förlust
                if ((it.get(0) - 1).code != 64) { //OM TOMTEN -> INTE ETT A
                    it.get(0) + " " + (it.get(0) - 1).code.toChar()
                } else {
                    it.get(0) + " " + (it.get(0) + 2).code.toChar()//C
                }
            else if (it.contains("Y")) it.get(0) + " " + it.get(0) //OM lika
            else if (it.contains("Z")) //OM vinst
                if ((it.get(0) + 1).code != 68) { //OM TOMTEN -> INTE ETT C
                    it.get(0) + " " + (it.get(0) + 1).code.toChar()
                } else {
                    it.get(0) + " " + (it.get(0) - 2).code.toChar()//A
                }
            else it
        }
        return tempList.map { it.substring(2) } //Returnerar endast Simons A,B,C
    }
}