import aoc.day1.countDistance
import aoc.day1.countDistanceMultiplied
import java.io.File
import kotlin.test.Test

private fun readInput() = File("src/test/resources/day1/input").readLines()
    .map { it.split("   ").map(String::toInt).zipWithNext()[0] }
    .unzip()

class Day1 {
    @Test
    fun firstPart() {
        val (leftList, rightList) = readInput()

        val distance = countDistance(leftList, rightList)
        println(distance)
    }

    @Test
    fun secondPart() {
        val (leftList, rightList) = readInput()

        val distance = countDistanceMultiplied(leftList, rightList)
        println(distance)
    }
}