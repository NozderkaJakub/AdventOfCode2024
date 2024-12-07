import day7.firstPart
import day7.secondPart
//import day7.secondPart
import java.io.File
import kotlin.test.Test


private fun readInput() = File("src/test/resources/day7/input").readLines()
    .map {
        val parts = it.split(": ")
        parts[0].toLong() to parts[1].split(" ").map(String::toLong)
    }.toMap()

class Day7 {
    @Test
    fun firstPart() {
        val input = readInput()

        val sum = firstPart(input)
        println(sum)
    }

    @Test
    fun secondPart() {
        val input = readInput()

        val sum = secondPart(input)
        println(sum)
    }
}