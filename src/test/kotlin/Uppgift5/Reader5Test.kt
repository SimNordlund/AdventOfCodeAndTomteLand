package Uppgift5

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Reader5Test {

    @Test
    fun readFile() {
        fun readFile() {
            val testList = mutableListOf("500", "750", "1427", "1020", "1684", "1000", "770")
            val dataInString = r.readFile("src/test/kotlin/Uppgift5/dataFromDocTest")

            assert (dataInString.equals(testList))
            assert (!dataInString.equals(mutableListOf("B Z","B X", "B X", "C P")))
        }
    }
}