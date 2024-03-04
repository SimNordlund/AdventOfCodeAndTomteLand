package Uppgift3Reviderad

import Uppgift3.CalculateAndTransform3
import Uppgift3.Reader3

//https://www.youtube.com/watch?v=44b5ycjUaDk
//https://www.youtube.com/watch?v=AoQw4t8Cb94
//https://github.com/tginsberg/advent-2023-kotlin/blob/main/src/main/kotlin/com/ginsberg/advent2023/Day01.kt
//https://github.com/kotlin-hands-on/advent-of-code-kotlin-template/blob/main/src/Day01.kt

//2023 1A + 1B

private var r = Reader3()

fun transformData(input: String): String {
    val replacements = mapOf(
        "oneight" to "18",
        "twone" to "21",
        "eightwo" to "82",
        "one" to "1",
        "two" to "2",
        "three" to "3",
        "four" to "4",
        "five" to "5",
        "six" to "6",
        "seven" to "7",
        "eight" to "8",
        "nine" to "9"
    )

    var result = input
    replacements.forEach { (key, value) ->
        result = result.replace(key, value)
    }
    return result
}

private fun calibrationValue(row: String): Int =
    "${row.first { it.isDigit() }}${row.last { it.isDigit() }}".toInt()

fun main() {
    var dataFromWeb = r.readFile("src/main/kotlin/Uppgift3/dataFromDoc")
    var resPart1 = dataFromWeb.sumOf { calibrationValue(it) }
    var transformedData = dataFromWeb.map { transformData(it) }
    var resPart2 = transformedData.sumOf { calibrationValue(it) }

    println(resPart1)
    println(resPart2)
}