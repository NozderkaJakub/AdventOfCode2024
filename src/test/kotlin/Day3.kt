import day3.firstPart
import day3.secondPart
import java.io.File
import kotlin.test.Test

private fun readInput() = File("src/test/resources/day3/input").readText()

class Day3 {
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