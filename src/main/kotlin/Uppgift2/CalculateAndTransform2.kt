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
}