package app

fun main() {
    val list = listOf("a", "a", "b", "b", "b", "c", "c", "c", "c", "aa", "aa", "bb", "aaa", "ccc", "dddd", "aaaa", "bb")
    println(list)

    val map = list.groupBy { it }
    println(map)

    val map2 = list.groupBy { it.length }
    println(map2)

    val grouping = list.groupingBy { it }
    println(grouping)
}