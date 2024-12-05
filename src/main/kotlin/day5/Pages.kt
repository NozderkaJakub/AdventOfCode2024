package day5

import kotlin.math.floor

fun validOrder(rules: Map<Int, List<Int>>, numbers: List<Int>) =
    numbers.withIndex().all { number ->
        (0..number.index).all { rules[number.value]?.contains(numbers[it]) != true }
    }

fun correctOrder(rules: Map<Int, List<Int>>, numbers: List<Int>) =
    numbers.sortedWith { first, second ->
        if (rules[first]?.contains(second) != true) 1 else -1
    }

fun firstPart(rules: Map<Int, List<Int>>, pages: List<List<Int>>) =
    pages.filter { validOrder(rules, it) }.sumMiddle()

fun secondPart(rules: Map<Int, List<Int>>, pages: List<List<Int>>) =
    pages.filterNot { validOrder(rules, it) }
        .map { correctOrder(rules, it) }
        .sumMiddle()

private fun List<List<Int>>.sumMiddle() =
    this.sumOf { it.getMiddle() }

private fun List<Int>.getMiddle() =
    get(floor(size / 2f).toInt())
