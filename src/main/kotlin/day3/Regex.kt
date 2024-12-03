package day3

private val regex = """mul\(\d{1,3},\d{1,3}\)""".toRegex()


fun firstPart(input: String): Int =
    regex.findAll(input).multiplyAndSum()

fun secondPart(input: String): Int =
    input.split("do()")
        .map { it.split("don't()")[0] }
        .flatMap(regex::findAll)
        .asSequence()
        .multiplyAndSum()

private fun getProduct(operation: String): Int {
    val (multiplicand, multiplier) = operation.substring(4, operation.length - 1).split(",").map(String::toInt)
    return multiplicand * multiplier
}

private fun Sequence<MatchResult>.multiplyAndSum() = this.fold(0) { acc, next -> acc + getProduct(next.value) }
