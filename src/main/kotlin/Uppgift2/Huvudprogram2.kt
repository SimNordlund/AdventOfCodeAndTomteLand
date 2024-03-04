package Uppgift2

private val r = Reader2()
private val ct = CalculateAndTransform2()

fun main() {
    val dataInString = r.readFile("src/main/kotlin/Uppgift2/dataFromDoc") //Läser in data ifrån fil

    //2022 Uppgift 2A), A = Sten, B = Påse, C = Sax

    //Skapar upp två listar som får spela emot varandra i gameRounds.
    val tomtePlayer = ct.convertTomteList(dataInString) //Tar fram tomtes val.
    val simonPlayer = ct.convertSimonList(dataInString) //Tar fram Simons val, översätter till abc.

    //Listorna spelar emot varandra, räknar poäng samtidigt.
    val resultGames = ct.gameRounds(simonPlayer, tomtePlayer) //Tar fram poäng
    println(resultGames) //Skriver ut resultat

//2022 Uppgift 2B) X = LOSS, Y = LIKA, Z = VINST

    //Översätter nya instruktioner så att gameRounds kan användas igen.
    val actualSimonPlayer = ct.convertSimonListVersion2(dataInString)

    //Skickar in reviderad spelare i metoden.
    val isItDone = ct.gameRounds(actualSimonPlayer, tomtePlayer)
    println(isItDone)
}
