package Uppgift2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Reader2Test {

    val r = Reader2()

    @Test
    fun readFile() {
        val testList = mutableListOf("B Z","B X", "B X", "C Y")
        val testList2 = mutableListOf("55 12","xxx 33", "22 5", "aA P")

        val dataInString = r.readFile("src/test/kotlin/Uppgift2/dataFromDocTest")
        val dataInString2 = r.readFile("src/test/kotlin/Uppgift2/dataFromDocTest1")

        assert (dataInString.equals(testList))
        assert (!dataInString.equals(mutableListOf("B Z","B X", "B X", "C P")))
        assert (dataInString2.equals(testList2))
    }
}