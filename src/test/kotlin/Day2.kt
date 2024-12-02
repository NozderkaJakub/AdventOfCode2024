import day2.firstPart
import day2.secondPart
import java.io.File
import kotlin.test.Test

private fun readInput() = File("src/test/resources/day2/input").readLines()
    .map { it.split(" ").map(String::toInt) }


class Day2 {
    @Test
    fun firstPart() {
        val input = readInput()

        val count = firstPart(input)
        println(count)
    }

    @Test
    fun secondPart() {
        val input = readInput()

        val count = secondPart(input)
        println(count)
    }
}