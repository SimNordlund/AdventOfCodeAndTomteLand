package Uppgift2Reviderad

import Uppgift2.Reader2

var r = Reader2()

//2022 Uppgift 2A) + 2B)

//https://www.youtube.com/watch?v=X1XH774hId0 PY
//https://todd.ginsberg.com/post/advent-of-code/2022/day2/
//https://github.com/tginsberg/advent-2022-kotlin/blob/main/src/main/kotlin/com/ginsberg/advent2022/Day02.kt
//https://www.youtube.com/watch?v=Fn0SY2yGDSA

fun main() {
    val dataInString = r.readFile("src/main/kotlin/Uppgift2/dataFromDoc")

    val scores1: Map<String, Int> =
        mapOf(
            "A X" to 1 + 3, "A Y" to 2 + 6, "A Z" to 3 + 0,
            "B X" to 1 + 0, "B Y" to 2 + 3, "B Z" to 3 + 6,
            "C X" to 1 + 6, "C Y" to 2 + 0, "C Z" to 3 + 3,
        )
    val scores2: Map<String, Int> =
        mapOf(
            "A X" to 3 + 0, "A Y" to 1 + 3, "A Z" to 2 + 6,
            "B X" to 1 + 0, "B Y" to 2 + 3, "B Z" to 3 + 6,
            "C X" to 2 + 0, "C Y" to 3 + 3, "C Z" to 1 + 6,
        )

    //Använder fold för att summera score.  Om e är null blir det 0.
    println(dataInString.fold(0) { sum, e -> sum + (scores1[e] ?: 0) })
    println(dataInString.fold(0) { sum, e -> sum + (scores2[e] ?: 0) })

    // var finalRes1 = dataInString.sumOf { scores1[it] ?: 0 } //Elvis-operator
    // var finalRes2 = dataInString.sumOf { scores2[it] ?: 0 }
}