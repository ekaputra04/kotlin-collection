package app

fun main() {
    val pair1: Pair<String, String> = Pair("buah1", "Apel")

    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "buah2" to "Pisang"
    println(pair2.first)
    println(pair2.second)
}