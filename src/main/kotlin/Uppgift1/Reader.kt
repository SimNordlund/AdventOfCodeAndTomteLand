package Uppgift1

import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

class Reader {

    fun readFile(p: String): List<String> {
        try {
            val data: List<String> = File(p).readLines()
            return data
        } catch (e: FileNotFoundException) {
            println("Filen kunde inte hittas: $p")
        } catch (e: IOException) {
            println("Ett I/O-fel inträffade vid läsning av filen")
        } catch (e: Exception) {
            println("Ett oväntat fel inträffade")
        }
        return emptyList()
    }

}
