package Uppgift4Reviderad

import Uppgift4.Reader4
//2021 2A + 2B
//https://www.youtube.com/watch?v=4A2WwniJdNc
//https://kotlinlang.org/docs/advent-of-code.html#day-2-dive

val r = Reader4()

fun main() {
    val dataFromWeb = r.readFile("src/main/kotlin/Uppgift4/dataFromDoc")

    fun A (dataFromWeb: List <String>) {
        var sumDepth = 0
        var sumHoriz = 0
        //Splittar strängen mellan riktning och siffra
        val instructions = dataFromWeb.map { it.split(" ") }
        for ((direction, numberString) in instructions) {
            val numberInt = numberString.toInt()
            when (direction) {
                "up" -> sumDepth -= numberInt
                "down" -> sumDepth += numberInt
                "forward" -> sumHoriz += numberInt
            }
        }
        println(sumHoriz * sumDepth)
    }

    fun B (dataFromWeb: List <String>) {
        var sumDepth = 0
        var sumHoriz = 0
        var aim = 0
        //Splittar strängen mellan riktning och siffra
        val instructions = dataFromWeb.map { it.split(" ") }
        for ((direction, numberString) in instructions) {
            val numberInt = numberString.toInt()
            when (direction) {
                "up" -> aim -= numberInt
                "down" -> aim += numberInt
                "forward" -> {
                    sumHoriz += numberInt
                    sumDepth += aim * numberInt}
            }
        }
        println(sumHoriz * sumDepth)
    }


    A(dataFromWeb)
    B(dataFromWeb)
}