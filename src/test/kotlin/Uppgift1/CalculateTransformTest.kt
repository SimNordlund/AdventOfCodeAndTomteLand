package Uppgift1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CalculateTransformTest {

    val ct = CalculateAndTransform()

    @Test
    fun testSumOfNumbersList() {
        val inputList = listOf(100, 200, 0, 300, 400, 0)
        val expectedResult = listOf(300, 700)
        val result = ct.sumOfNumbersList(inputList)
        assertEquals(expectedResult, result, "sumOfNumbersList should correctly sum up numbers until 0 is encountered")
    }
}