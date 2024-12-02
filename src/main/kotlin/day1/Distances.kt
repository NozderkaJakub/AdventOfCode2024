package aoc.day1

import kotlin.math.abs

fun firstPart(first: List<Int>, second: List<Int>) =
    first.sorted().let { firstSorted ->
        second.sorted().let { secondSorted ->
            firstSorted.withIndex().fold(0) { acc, next -> acc + abs(next.value - secondSorted[next.index]) }
        }
    }

fun secondPart(first: List<Int>, second: List<Int>) =
    first.map { number ->
        number * second.count { it == number }
    }.sum()
