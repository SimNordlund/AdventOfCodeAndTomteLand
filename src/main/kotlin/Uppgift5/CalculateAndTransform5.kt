package Uppgift5

class CalculateAndTransform5 {

    fun matchNumbers(numberSentIn: String, listOfNumbers: List<String>): String {
        var counter = 0
        for (e in listOfNumbers) {
            if (counter == listOfNumbers.size) {
                return "0"
            }
            var tempSum = numberSentIn.toInt() + listOfNumbers.get(counter).toInt()
            if (tempSum == 2020) {
                return "Found"
            }
            counter++
        }
        return "0"
    }

    fun match3Numbers(numberSentIn: String, listOfNumbers: List<String>): String {
        var counter = 0
        var innerCounter = 0

        for (e in listOfNumbers) {
            if (counter == listOfNumbers.size) {
                return "0"
            }

            var tempSum = numberSentIn.toInt() + listOfNumbers.get(counter).toInt()

            while (innerCounter < listOfNumbers.size) {

                var actualSum = tempSum + listOfNumbers.get(innerCounter).toInt()

                if (actualSum == 2020) {
                    return "Found"
                }
                innerCounter++
            }
            innerCounter = 0
            counter++
        }
        return "0"
    }
}