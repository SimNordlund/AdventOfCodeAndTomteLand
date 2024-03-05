package Uppgift2

class CalculateAndTransform2 {

    fun convertTomteList(dataInString: List<String>): List<String> {
        return dataInString.map { it.substring(0, 1) }
    }

    //Gör om XYZ till ABC för att efterlikna tomtes val av sten, påse, sax
    fun convertSimonList(simonList: List<String>): List<String> {
        val simonPlayer = simonList.map {
            when {
                it.contains("X") -> "A"
                it.contains("Y") -> "B"
                it.contains("Z") -> "C"
                else -> it
            }
        }
        return simonPlayer
    }

    //Översätter nya instruktioner så att gameRounds kan användas igen. X = LOSS, Y = LIKA, Z = VINST
    fun convertSimonListVersion2(dataInString: List<String>): List<String> {
        val simonPlayer = dataInString.map {
            when {
                it.contains("X") -> {
                    if (it[0] != 'A') (it[0] - 1).toString() else 'C'.toString()
                }
                it.contains("Y") -> "${it[0]}"
                it.contains("Z") -> {
                    if (it[0] != 'C') (it[0] + 1).toString() else 'A'.toString()
                }
                else -> it
            }
        }
        return simonPlayer
    }

    //Räknar fram hur mycket poäng som ges i spelet till "Simon". STEN, PÅSE, SAX
    fun gameRounds(simon: List<String>, tomte: List<String>): Int {
        var counter = 0
        var points = 0
        for (e in tomte) {
            if (simon[counter] == tomte[counter]) { //Om det blir lika +3
                points += 3
                if (simon[counter] == "A") {
                    points += 1
                } else if (simon[counter] == "B") {
                    points += 2
                } else if (simon[counter] == "C") {
                    points += 3
                }
            } else if (simon[counter] == "A") { //Sten för Simon
                if (tomte[counter] == "B") { //Påse för Tomte
                    points += 1
                } else if (tomte[counter] == "C") { //Sax för Tomte
                    points += 7
                }
            } else if (simon[counter] == "B") { //Påse för Simon
                if (tomte[counter] == "C") {
                    points += 2
                } else if (tomte[counter] == "A") {
                    points += 8
                }
            } else if (simon[counter] == "C") { //Påse för Simon
                if (tomte[counter] == "A") {
                    points += 3
                } else if (tomte[counter] == "B") {
                    points += 9
                }
            }
            counter++
        }
        return points
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