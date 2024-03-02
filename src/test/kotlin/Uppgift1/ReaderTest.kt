package Uppgift1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ReaderTest {
    val r = Reader()

    @Test
    fun readFile() {
        val testList = mutableListOf(
            "8eight1",
            "98126",
            "fourfourthreehnbhkmscqxdfksg64bvpppznkh",
            "8fivenvvtrlj",
            "six3zbhvrfhsevennine",
            "427nine6chnqrssxfour")
        val dataInString = r.readFile("src/test/kotlin/Uppgift3/dataFromDocTest")

        assert (dataInString.equals(testList))
        assert (!dataInString.equals(mutableListOf("B Z","B X", "B X", "C P")))
    }
}