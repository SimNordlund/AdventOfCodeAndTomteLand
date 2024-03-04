package Uppgift1

    val r = Reader()

    private fun parseInput(): List<Int> {
        val tempListData = r.readFile("src/main/kotlin/Uppgift1/dataFromDoc") //lista med innehåll ifrån textfil.
        val sums = tempListData.joinToString(separator = "\n") // Joinar ihop allt till en enda sträng
            .trim()
            .split("\n\n")
            .map { it.lines().sumOf(String::toInt) }
        val sortedSums = sums.sortedDescending()
        return sortedSums
    }


fun main() {
    val part1 = parseInput().first()
    val part2 = parseInput().take(3).sum()
    println(part1)
    println(part2)
}
