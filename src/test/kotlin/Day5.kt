import day5.firstPart
import day5.secondPart
import java.io.File
import kotlin.test.Test

private fun readRules() = File("src/test/resources/day5/inputRules").readLines()
    .map { it.split("|").map(String::toInt).zipWithNext()[0] }
    .groupBy { it.first }
    .mapValues { it.value.map { it.second } }

private fun readPages() = File("src/test/resources/day5/inputPages").readLines()
    .map { it.split(",").map(String::toInt) }

class Day5 {
    @Test
    fun firstPart() {
        val rules = readRules()
        val pages = readPages()

        val sum = firstPart(rules, pages)
        println(sum)
    }

    @Test
    fun secondPart() {
        val rules = readRules()
        val pages = readPages()

        val sum = secondPart(rules, pages)
        println(sum)
    }
}