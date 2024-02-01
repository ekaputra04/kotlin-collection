package app

fun main() {
    val range = (1..10).toList()

    println(range.contains(8))
    println(range.containsAll(listOf(3, 4, 5, 11)))

    println(range.isEmpty())
    println(range.isNotEmpty())
}