package Uppgift4

import org.junit.jupiter.api.Test

class Reader4Test {

    var r = Reader4()

    @Test
    fun readFile() {
        val testList = mutableListOf("forward 6", "forward 9", "down 9", "down 7", "forward 8", "down 4",)
        val dataInString = r.readFile("src/test/kotlin/Uppgift4/dataFromDocTest")

        assert (dataInString.equals(testList))
        assert (!dataInString.equals(mutableListOf("B Z","B X", "B X", "C P")))
    }
}