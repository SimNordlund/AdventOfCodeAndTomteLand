package TomteTown

private val tl = Tomteland()

//TODO()
//Test för input?
//Justera rekursiv funktion?
//Tailrec?

fun main() {
    println("Ange tomte") //Test för detta?
    val inputTomte: String = readlnOrNull() ?: "TomTomte"
    println(tl.getUnderlings(inputTomte, tl.mapTomteTown))
    println(tl.getUnderlings2(inputTomte, tl.mapTomteTown))
}