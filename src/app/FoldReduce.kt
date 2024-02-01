package app

fun main() {
    val numbers = (1..10).toList().shuffled()

    val max = numbers.reduce { first, second ->
        if (first > second) first
        else second
    }

    val min = numbers.reduce { first, second ->
        if (first < second) first
        else second
    }

    val sum = numbers.fold(0) { first, second ->
        first + second
    }

    println(numbers)
    println(max)
    println(min)
    println(sum)
}