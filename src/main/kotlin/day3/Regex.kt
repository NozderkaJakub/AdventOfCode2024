package day3

private val regex = """mul\(\d{1,3},\d{1,3}\)""".toRegex()


fun firstPart(input: String): Int =
    regex.findAll(input).sumOf { getProduct(it.value) }

fun secondPart(input: String): Int =
    input.split("do()")
        .map { it.split("don't()")[0] }
        .flatMap(regex::findAll)
        .asSequence()
        .sumOf { getProduct(it.value) }

private fun getProduct(operation: String): Int {
    val (multiplicand, multiplier) = operation.substring(4, operation.length - 1).split(",").map(String::toInt)
    return multiplicand * multiplier
}
