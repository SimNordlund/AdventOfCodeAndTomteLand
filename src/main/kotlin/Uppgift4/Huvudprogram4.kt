package Uppgift4

//2021 2a)
private val r = Reader4()
private val cr = CalculateAndTransform4()

fun main() {
    val dataFromWeb = r.readFile("src/main/kotlin/Uppgift4/dataFromDoc")

    //Räknar fram Horisontell position
    var sumHozData = cr.calculateHorizontal(dataFromWeb)
    println("Summan Hoz: $sumHozData")

    //Räknar fram Up
    var sumUpData = cr.calculateUpOrDown(dataFromWeb, "up")
    println("Summa Up: $sumUpData")

    //Räknar fram Down
    var sumDownData = cr.calculateUpOrDown(dataFromWeb, "down")
    println("Summa Down: $sumDownData")

    //Räknar fram res
    var resDjup = sumDownData - sumUpData //Också aim 1031?
    println(sumHozData * resDjup)

    //2b)

    //Tar fram depth för uppgift b)
    var actualDepth = cr.calculateDepth(dataFromWeb)
    println("DEPTH: $actualDepth")

    //Räknar fram res
    var actualPosition = sumHozData * actualDepth
    println(actualPosition)

}