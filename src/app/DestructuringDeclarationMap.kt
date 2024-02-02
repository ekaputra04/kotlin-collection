package app

fun main() {
    val map = mapOf(
        1 to "Pisang",
        2 to "Mangga",
        3 to "Nanas",
        4 to "Apel",
        5 to "Jeruk"
    )

    for (entry in map) {
        println("${entry.component1()} : ${entry.component2()}")
    }

    for ((key, value) in map) {
        println("$key : $value")
    }

    map.forEach { entry ->
        println("${entry.component1()} : ${entry.component2()}")
    }

    map.forEach { (key, value) ->
        println("$key : $value")
    }

}