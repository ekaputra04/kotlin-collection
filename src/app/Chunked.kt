package app

fun main() {
    val numbers = (1..95).toList()
    println(numbers)

    val list1 = numbers.chunked(10)
    println(list1)

    val list2 = numbers.chunked(10) { values ->
        var total = 0
        for (value in values) {
            total += value
        }
        total
    }
    println(list2)
}