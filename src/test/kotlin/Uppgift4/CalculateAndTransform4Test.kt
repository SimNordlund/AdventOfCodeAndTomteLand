package Uppgift4

import org.junit.jupiter.api.Test

class CalculateAndTransform4Test {

    val ct = CalculateAndTransform4()

    @Test
    fun calculateHorizontal() {
        val testList = mutableListOf("forward 6", "forward 9", "down 9", "down 7", "forward 8", "down 4",)
        val testList2 = mutableListOf("forward 6", "forward 5", "down 9", "down 7", "forward 5", "forward 4",)
        val res1 = 23
        val res2 = 20

        assert(ct.calculateHorizontal(testList).equals(res1))
        assert(ct.calculateHorizontal(testList2).equals(res2))
        assert(!ct.calculateHorizontal(testList2).equals(res1))
    }

    @Test
    fun calculateUpOrDown() {
        val testList = mutableListOf("forward 6", "forward 9", "down 5", "down 6", "forward 8", "down 4",)
        val testList2 = mutableListOf("up 6", "forward 5", "up 9", "down 7", "up 5", "forward 4",)
        val res1 = 15
        val res2 = 20

        assert(ct.calculateUpOrDown(testList, "down").equals(res1))
        assert(!ct.calculateUpOrDown(testList, "down").equals(1338))
        assert(ct.calculateUpOrDown(testList2, "up").equals(res2))
        assert(!ct.calculateUpOrDown(testList2, "up").equals(53))
    }

    @Test
    fun calculateDepth() {
        val testList = mutableListOf("forward 6", "forward 9", "down 5", "down 1", "forward 5", "down 4",)
        val res1 = 30
        val res2 = 20

        assert(ct.calculateDepth(testList).equals(res1))
        assert(!ct.calculateDepth(testList).equals(res2))

    }
}