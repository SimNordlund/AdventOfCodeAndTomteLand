package Uppgift2

class CalculateAndTransform2 {

    //Gör om XYZ till ABC för att efterlikna tomtes val av sten, sax, påse
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

    //Räknar fram hur mycket poäng som ges i spelet till "Simon".
    fun gameRounds(simon: List<String>, tomte: List<String>): Int {
        var counter = 0
        var points = 0
        for (e in tomte) {
            if (simon.get(counter).equals(tomte.get(counter))) {
                points = points + 3
                if (simon.get(counter).equals("A")) {
                    points = points + 1
                } else if (simon.get(counter).equals("B")) {
                    points = points + 2
                } else if (simon.get(counter).equals("C")) {
                    points = points + 3
                }
            } else if (simon.get(counter).equals("A")) {
                if (tomte.get(counter).equals("B")) {
                    points = points + 1
                } else if (tomte.get(counter).equals("C")) {
                    points = points + 7
                }
            } else if (simon.get(counter).equals("B")) {
                if (tomte.get(counter).equals("C")) {
                    points = points + 2
                } else if (tomte.get(counter).equals("A")) {
                    points = points + 8
                }
            } else if (simon.get(counter).equals("C")) {
                if (tomte.get(counter).equals("A")) {
                    points = points + 3
                } else if (tomte.get(counter).equals("B")) {
                    points = points + 9
                }
            }
            counter++
        }
        return points
    }

    //Översätter nya instruktioner så att gameRounds kan användas igen.
    fun convertSimonListVersion2(dataInString: List<String>): List<String> {
        var tempList = dataInString.map {
            if (it.contains("X"))
                if ((it.get(0) - 1).code != 64) {
                    it.get(0) + " " + (it.get(0) - 1).code.toChar()
                } else {
                    it.get(0) + " " + (it.get(0) + 2).code.toChar()
                }
            else if (it.contains("Y")) it.get(0) + " " + it.get(0)
            else if (it.contains("Z"))
                if ((it.get(0) + 1).code != 68) {
                    it.get(0) + " " + (it.get(0) + 1).code.toChar()
                } else {
                    it.get(0) + " " + (it.get(0) - 2).code.toChar()
                }
            else it
        }
        return tempList.map { it.substring(2) } //Returnerar endast Simons A,B,C
    }
}