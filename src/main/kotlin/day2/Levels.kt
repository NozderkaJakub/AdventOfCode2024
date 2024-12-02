package day2

import kotlin.math.abs


private fun condition(diff: Int, sign: Int) =
    diff * sign > 0 && abs(diff) >= 1 && abs(diff) <= 3

private fun predicate(pair: Pair<Int, Int>, sign: Int) = condition(pair.second - pair.first, sign)
private fun sign(list: List<Int>) = list[1] - list[0]

private fun firstPartPredicate(list: List<Int>): Boolean =
    list.zipWithNext().all { predicate(it, sign(list)) }

private fun secondPartPredicate(list: List<Int>): Boolean =
    list.withIndex().map { list.copyWithoutElementAt(it.index) }
        .any { firstPartPredicate(it) }

private fun countValidLists(input: List<List<Int>>, predicate: (List<Int>) -> Boolean) =
    input.count { predicate(it) }


fun firstPart(input: List<List<Int>>) =
    countValidLists(input) { firstPartPredicate(it) }

fun secondPart(input: List<List<Int>>) =
    countValidLists(input) { secondPartPredicate(it) }


private fun List<Int>.copyWithoutElementAt(n: Int): List<Int> {
    val newList = this.toMutableList()
    newList.removeAt(n)
    return newList
}