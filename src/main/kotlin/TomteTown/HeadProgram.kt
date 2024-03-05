package TomteTown

fun main() {
    val tl = Tomteland()
    val isTest = false

    val tomteNameInput = tl.askForTomte(isTest)
    println("$tomteNameInput har följande undersåtar: " + tl.getUnderlings(tomteNameInput, tl.mapTomteTown))
}