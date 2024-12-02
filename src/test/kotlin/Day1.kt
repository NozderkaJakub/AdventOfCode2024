import aoc.day1.firstPart
import aoc.day1.secondPart
import java.io.File
import kotlin.test.Test

private fun readInput() = File("src/test/resources/day1/input").readLines()
    .map { it.split("   ").map(String::toInt).zipWithNext()[0] }
    .unzip()

class Day1 {
    @Test
    fun firstPart() {
        val (leftList, rightList) = readInput()

        val distance = firstPart(leftList, rightList)
        println(distance)
    }

    @Test
    fun secondPart() {
        val (leftList, rightList) = readInput()

        val distance = secondPart(leftList, rightList)
        println(distance)
    }
}