package TomteTown

fun main() {
    val tl = Tomteland()
    val isTest = false
    val mapTomteTown = mapOf(
        "Tomten" to listOf("Glader", "Butter"), "Glader" to listOf("Tröger", "Trötter", "Blyger"),
        "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"), "Trötter" to listOf("Skumtomten"),
        "Skumtomten" to listOf("Dammråttan"), "Räven" to listOf("Gråsuggan", "Myran"), "Myran" to listOf("Bladlusen")
    )

    val tomteNameInput = tl.askForTomte(isTest)
    println("$tomteNameInput har följande undersåtar: " + tl.getUnderlings(tomteNameInput, mapTomteTown))
}