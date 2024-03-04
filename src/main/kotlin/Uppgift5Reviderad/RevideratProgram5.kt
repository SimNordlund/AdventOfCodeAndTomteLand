package Uppgift5Reviderad

import Uppgift5.Reader5

//https://www.youtube.com/watch?v=o4emra1xm88
//https://kotlinlang.org/docs/advent-of-code.html#advent-of-code-2020

var r = Reader5()

fun main() {

    //a)
    val dataFromWeb = Uppgift5.r.readFile("src/main/kotlin/Uppgift5/dataFromDoc")
    val dataToInt = dataFromWeb.map(String::toInt)
    for (num1 in dataToInt) {
        for (num2 in dataToInt) {
            if (num1 + num2 == 2020) {
                println("$num1, $num2")
            }
        }
    }
    //b))

    for (num1 in dataToInt) {
        for (num2 in dataToInt) {
            for (num3 in dataToInt) {
                if (num1 + num2 + num3 == 2020) {
                    println("$num1, $num2, $num3")
                }
            }
        }
    }

}