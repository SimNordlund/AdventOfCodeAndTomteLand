package Uppgift1

import org.junit.jupiter.api.Test

val ct = CalculateAndTransform()

class CalculateAndTransformTest {

    @Test
    fun createIntList() {
        var testListString = mutableListOf("1", "2", "3", "", "5")
        var testListString2 = mutableListOf("1", "33", "55", "4", "5")
        var res = mutableListOf(1, 2, 3, 0, 5)
        assert (ct.createIntList(testListString).equals(res))
        assert (!ct.createIntList(testListString2).equals(res))
    }

    @Test
    fun sumOfNumbersList() {
        var testListInt = mutableListOf(1, 2, 0, 4, 3)
        var testListInt2 = mutableListOf(1, 33, 55, 0, 5)
        var res = mutableListOf(3, 7)
        var res2 = mutableListOf(89, 5)
        assert(ct.sumOfNumbersList(testListInt).equals(res))
        assert(ct.sumOfNumbersList(testListInt2).equals(res2))
        assert(!ct.sumOfNumbersList(testListInt).equals(res2))
    }

    @Test
    fun sumOfNumbersVerson2() {
        var testListInt = mutableListOf(3, 7, 5, 10, 15)
        var testListInt2 = mutableListOf(1, 33, 55, 0, 5)

        assert(ct.sumOfNumbersVerson2(testListInt).equals(32))
        assert(ct.sumOfNumbersVerson2(testListInt2).equals(93))
        assert(!ct.sumOfNumbersVerson2(testListInt).equals(105))
    }

}