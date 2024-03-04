package Uppgift3

class CalculateAndTransform3 {

    //Letar upp första och sista talet. Sätter ihop dom. Konverterar till int och returnerar summan.
    fun calculateAllCalibrations(dataFromWeb: List<String>): Int {
        var numberList = dataFromWeb.map { it.filter { it.isDigit() } } //Filtrerar på tal
        numberList =
            numberList.map { it.substring(0, 1) + "" + it.substring(it.length - 1) } //Tar första och sista talet.
        var intNumberList = numberList.map { it.toInt() }
        var resultOfList = intNumberList.map { it }.sum()

        return resultOfList
    }

    fun adjusteddataFromWeb(number: String): String {
        var modifiedNumber = number
        if (modifiedNumber.contains("oneight")) {
            modifiedNumber = modifiedNumber.replace("oneight", "18")
        }
        if (modifiedNumber.contains("twone")) {
            modifiedNumber = modifiedNumber.replace("twone", "21")
        }
        if (modifiedNumber.contains("eightwo")) {
            modifiedNumber = modifiedNumber.replace("eightwo", "82")
        }
        return modifiedNumber
    }

    fun stringToStringNumber(number: String): String {
        var modifiedNumber = number

        if (modifiedNumber.contains("nine")) {
            modifiedNumber = modifiedNumber.replace("nine", "9")
        }
        if (modifiedNumber.contains("one")) {
            modifiedNumber = modifiedNumber.replace("one", "1")
        }
        if (modifiedNumber.contains("five")) {
            modifiedNumber = modifiedNumber.replace("five", "5")
        }
        if (modifiedNumber.contains("two")) {
            modifiedNumber = modifiedNumber.replace("two", "2")
        }
        if (modifiedNumber.contains("six")) {
            modifiedNumber = modifiedNumber.replace("six", "6")
        }
        if (modifiedNumber.contains("seven")) {
            modifiedNumber = modifiedNumber.replace("seven", "7")
        }
        if (modifiedNumber.contains("eight")) {
            modifiedNumber = modifiedNumber.replace("eight", "8")
        }
        if (modifiedNumber.contains("four")) {
            modifiedNumber = modifiedNumber.replace("four", "4")
        }
        if (modifiedNumber.contains("three")) {
            modifiedNumber = modifiedNumber.replace("three", "3")
        }
        return modifiedNumber
    }
}