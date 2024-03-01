package Uppgift5

//2020 uppgift 1

var r = Reader5()
var ct = CalculateAndTransform5()

fun main() {
    //A)
    val dataFromWeb = r.readFile("src/main/kotlin/Uppgift5/dataFromDoc")

    val numbersThatSumsUp = dataFromWeb.filter { e -> (ct.matchNumbers(e, dataFromWeb).contains("Found")) } //Göra metod?
    //println(numbersThatSumsUp)

    println(numbersThatSumsUp.get(0).toInt() * numbersThatSumsUp.get(1).toInt())

    //B)
    val numbersActualSumsUp = dataFromWeb.filter { e -> (ct.match3Numbers(e, dataFromWeb).contains("Found")) } //Göra metod?
    //println(numbersActualSumsUp)

    println(numbersActualSumsUp.get(0).toInt()*numbersActualSumsUp.get(1).toInt()*numbersActualSumsUp.get(2).toInt())

}
