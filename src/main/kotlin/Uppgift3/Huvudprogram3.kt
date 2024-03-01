package Uppgift3

private var r = Reader3()
private var ct = CalculateAndTransform3()

fun main() {

        //2023 1a)
        var dataFromWeb = r.readFile("src/main/kotlin/Uppgift3/dataFromDoc")

        //Letar  upp alla tal. Tar ut första och andra samt summerar dem.
        var resultOfSum = ct.calculateAllCalibrations(dataFromWeb)
        println(resultOfSum)

        //2023 1b)

    /*    val wordToNumber = mapOf(
         "one" to "1",
         "two" to "2",
         "three" to "3",
         "four" to "4",
         "five" to "5",
         "six" to "6",
         "seven" to "7",
         "eight" to "8",
         "nine" to "9",
     )

     var numberList3 = dataFromWeb2.map { string ->
         var resultString = string
         wordToNumber.forEach { (word, number) ->
             resultString = resultString.replace(word, number)
         }
         resultString
     } */

    val dataFromWeb2 = r.readFile("src/main/kotlin/Uppgift3/dataFromDoc2")

    val dataFromWebAdjusted = dataFromWeb2.map { e -> ct.adjusteddataFromWeb(e) } //Gör om undantag till siffror

    val test1337 = dataFromWebAdjusted.map { e -> ct.stringToStringNumber(e) } //Gör om bokstäver till siffror

    var test12345678XDDDD = ct.calculateAllCalibrations(test1337) //Använd denna bara och ta bort allt under? XD
    println(test12345678XDDDD)

    /*
    println("Här ska det ej finnas nummer kvar$test1337")

    var numberList2 = test1337.map { it.filter { it.isDigit() } }

    println(numberList2)

    numberList2 = numberList2.map { it.substring(0, 1) + "" + it.substring(it.length-1) }

    println(numberList2)

    val intNumberList2 = numberList2.map { it.toInt() }

    println(intNumberList2)

    val resultOfList2 = intNumberList2.map { it }.sum()

    println(resultOfList2)

     */
}



