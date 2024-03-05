package Uppgift1

class HuvudProgram() { //2022 1

    private val r = Reader()
    private val ct = CalculateAndTransform()

    //Lösning A)
    init {
        var dataInString = r.readFile("src/main/kotlin/Uppgift1/dataFromDoc") //Hämtar data

        var dataInInt = ct.createIntList(dataInString) // Gör om innehåll till en Int lista.
        dataInInt = ct.sumOfNumbersList(dataInInt) //Funktion som skapar ny lista med sorterad data av kalorier
        println("Svar A: " + dataInInt.maxOfOrNull { it }) //Skriver ut max kalorie för den tomte som har mest.

        //Lösning B)

        //Tar fram de tre högst i listan och räknar ut summan.
        val sumList = ct.sumOfNumbersVerson2(dataInInt)
        println("Svar B: $sumList")
    }
}

fun main() {
    val hp = HuvudProgram()
}
