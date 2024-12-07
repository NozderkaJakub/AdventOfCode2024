package day7

fun findLastVariation(numbers: List<Long>, next: (Long, Long) -> List<Long>) =
    numbers.foldIndexed(listOf(numbers.first())) { index, previousVariations, nextNumber ->
        if (index == 0) previousVariations else previousVariations.flatMap { next(it, nextNumber) }
    }

fun listValid(input: Map.Entry<Long, List<Long>>, next: (Long, Long) -> List<Long>) =
    findLastVariation(input.value, next).any { it == input.key }


fun firstPart(input: Map<Long, List<Long>>) =
    input.findCorrectResults { first, second -> listOf(first + second, first * second) }
        .fold(0L) { acc, next -> acc + next }

fun secondPart(input: Map<Long, List<Long>>) = input.findCorrectResults { first, second ->
    listOf(first + second, first * second, "$first$second".toLong())
}.fold(0L) { acc, next -> acc + next }


private fun Map<Long, List<Long>>.findCorrectResults(nextVariationGenerator: (Long, Long) -> List<Long>) =
    this.filter { listValid(it, nextVariationGenerator) }.keys
