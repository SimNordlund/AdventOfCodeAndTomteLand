package Uppgift2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CalculateAndTransform2Test {

    private var ct = CalculateAndTransform2()

    @Test
    fun convertTomteListTest(){
        val testList = mutableListOf("A Z","B X","C X")
        val result = mutableListOf("A", "B", "C")
        val result2 = mutableListOf("A", "B", "D")
        assert(ct.convertTomteList(testList) == result)
        assert(ct.convertTomteList(testList) != result2)
        assertEquals(ct.convertTomteList(testList), result)
    }

    @Test
    fun convertSimonListTest() {
        val testList = mutableListOf("A Y","B X","B Z")
        val result = mutableListOf("B","A","C")
        val testList2 = mutableListOf("B", "A", "C P")
        val result2 = mutableListOf("B", "A", "C P")

        assert (ct.convertSimonList(testList) == result)
        assert (ct.convertSimonList(testList2) == result2)
        assert (ct.convertSimonList(testList2) != result)
        assertNotEquals(result2, ct.convertSimonList(testList))
    }

    @Test
    fun gameRoundsTest() {
        val testListTomte = mutableListOf("A", "B", "C")
        val testListSimon = mutableListOf("B", "A", "C")

        assertEquals(15, ct.gameRounds(testListSimon, testListTomte))
        assert (ct.gameRounds(testListSimon, testListTomte) == 15)
        assert (ct.gameRounds(testListSimon, testListTomte) != 16)
        assert (ct.gameRounds(testListSimon, testListTomte) != 1337)
    }

    @Test
    fun convertSimonListVersion2Test() {
        val testList = mutableListOf("B Z", "B X", "B X","C Y")
        val resList = mutableListOf("C", "A", "A", "C")
        val fakeList = mutableListOf("C", "5", "3", "C")

        assert (ct.convertSimonListVersion2(testList) == resList)
        assert (ct.convertSimonListVersion2(testList) != fakeList)
    }
}