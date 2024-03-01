package Uppgift1

class CalculateAndTransform {

    //Gör om listan till en int lista där mellan slag representeras av 0.
    fun createIntList(dataInString: List<String>): List<Int> {
        val tempList = dataInString.map { if (it.isEmpty()) "0" else it } // Lägger in 0 där det är tomt
        val dataInInt = tempList.map { it.toInt() } // Gör om innehåll till en Int lista.
        return dataInInt
    }

    //Skapar ny lista där kalorier är summerade. Varje element i lista representerar en tomte.
    fun sumOfNumbersList(intList: List<Int>): List<Int> {
        var sum = 0
        val newIntList = mutableListOf<Int>()
        //För varje element i intList
        for (e in intList) {
            if (e != 0) {
                sum += e
            } else {
                newIntList.add(sum)
                sum = 0
            }
        }
        if (sum != 0) {
            newIntList.add(sum)
        }
        return newIntList
    }

    fun sumOfNumbersVerson2 (intList: List <Int>) : Int {
        val sumList = intList.sortedDescending().take(3).sum() //Tar de tre högsta i listan + räknar summan.
        return sumList
    }

    //Temp lösning tidigare. Justerad emot funktionell lösning i huvudprogram.
    fun convertToIntLIst(stringList: List<String>): List<Int> {
        val tempIntList = mutableListOf<Int>()

        for (e in stringList) {
            if (e.isNotBlank()) {
                tempIntList.add(e.toInt())
            } else {
                tempIntList.add(0)
            }
        }

        return tempIntList
    }
}