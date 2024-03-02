package Uppgift5

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CalculateAndTransform5Test {

    var ct = CalculateAndTransform5()

    @Test
    fun matchNumbers() {
        val testList = mutableListOf("500", "750", "1427", "1020", "1684", "1000", "770")
        assert(ct.matchNumbers("500", testList).equals("0"))
        assert(ct.matchNumbers("1020", testList).equals("Found"))
        assert(ct.matchNumbers("1000", testList).equals("Found"))
    }

    @Test
    fun match3Numbers() {
        val testList = mutableListOf("500", "750", "1427", "900", "1684", "1000", "770")
        assert(ct.match3Numbers("500", testList).equals("Found"))
        assert(ct.match3Numbers("750", testList).equals("Found"))
        assert(ct.match3Numbers("770", testList).equals("Found"))
        assert(ct.match3Numbers("900", testList).equals("0"))
        assert(ct.match3Numbers("1684", testList).equals("0"))
    }
}