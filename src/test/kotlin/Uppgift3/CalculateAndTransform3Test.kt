package Uppgift3

import org.junit.jupiter.api.Test

class CalculateAndTransform3Test {

    var ct = CalculateAndTransform3()

    @Test
    fun calculateAllCalibrations() {
        var testList = mutableListOf("8eight1", "98126", "fourfourthreehnbhkmscqxdfksg64bvpppznkh")
        var res = (81 + 96 + 64)
        var res1 = 221
        assert(ct.calculateAllCalibrations(testList).equals(res))
        assert(!ct.calculateAllCalibrations(testList).equals(res1))
    }

    @Test
    fun adjusteddataFromWeb() {
        var test1 = "oneight"
        var test2 = "twone"
        var test3 = "eightwo"

        assert(ct.adjusteddataFromWeb(test1).equals("18"))
        assert(ct.adjusteddataFromWeb(test2).equals("21"))
        assert(ct.adjusteddataFromWeb(test3).equals("82"))
    }

    @Test
    fun stringToStringNumber() {
        var test1 = "nine"
        var test2 = "three"
        var test3 = "seven"

        assert(ct.stringToStringNumber(test1).equals("9"))
        assert(ct.stringToStringNumber(test2).equals("3"))
        assert(ct.stringToStringNumber(test3).equals("7"))
        assert(!ct.stringToStringNumber(test3).equals("6"))
    }
}