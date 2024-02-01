package app

fun main() {
    val numbers = listOf(1, 3, 5, 2, 1, 8, 5, 5, 3, 2, 4, 6, 8, 9, 4, 2, 1, 2, 4, 5, 6, 7, 4, 1, 3, 1)

    println(numbers.sorted())
    println(numbers.sortedDescending())
}