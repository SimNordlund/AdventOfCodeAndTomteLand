package Uppgift2

//2022 Uppgift 2A)
//A = Sten, B = Påse, C = Sax

private val r = Reader2()
private val ct = CalculateAndTransform2()

fun main() {
    val dataInString = r.readFile("src/main/kotlin/Uppgift2/dataFromDoca") //Läser in data ifrån fil

    //Skapar upp två listar som får spela emot varandra i gameRounds.
    val tomtePlayer = dataInString.map { it.substring(0, 1) } //Tar fram tomtes val.
    val simonPlayer = ct.convertSimonList(dataInString) //Tar fram Simons val, översätter till abc.
    println("Tomte: $tomtePlayer")
    println("Simon: $simonPlayer")

    //Listorna spelar emot varandra, räknar poäng samtidigt.
    val resultGames = ct.gameRounds(simonPlayer, tomtePlayer) //Tar fram poäng
    println(resultGames) //Skriver ut resultat

//2022 Uppgift 2B)

    //Översätter nya instruktioner så att gameRounds kan användas igen.
    var actualSimonPlayer = ct.convertSimonListVersion2(dataInString)
    println("SimonV2: $actualSimonPlayer")
    println(actualSimonPlayer)

    //Skickar in reviderad spelare i metoden.
    val isItDone = ct.gameRounds(actualSimonPlayer, tomtePlayer)
    println(isItDone)

}
