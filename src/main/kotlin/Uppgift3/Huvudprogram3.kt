package Uppgift3

private var r = Reader3()
private var ct = CalculateAndTransform3()

fun main() {
    var dataFromWeb = r.readFile("src/main/kotlin/Uppgift3/dataFromDoc")

    //2023 1a)
    //Letar upp alla tal. Tar ut första och andra samt summerar dem.
    var resultOfSum = ct.calculateAllCalibrations(dataFromWeb)
    println(resultOfSum)

    //2023 1b)
    val dataFromWeb2 = r.readFile("src/main/kotlin/Uppgift3/dataFromDoc2")
    val dataFromWebAdjusted = dataFromWeb2.map { e -> ct.adjusteddataFromWeb(e) } //Gör om undantag till siffror
    val test1337 = dataFromWebAdjusted.map { e -> ct.stringToStringNumber(e) } //Gör om bokstäver till siffror

    var test12345678XDDDD = ct.calculateAllCalibrations(test1337)
    println(test12345678XDDDD)
}



