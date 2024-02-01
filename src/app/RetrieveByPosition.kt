package app

fun main() {
    val set = setOf("Pisang", "Mangga", "Nanas")

    println(set.elementAt(0))
    println(set.first())
    println(set.last())
    println(set.elementAtOrNull(10))
    println(set.elementAtOrElse(10, { "Tidak Ada" }))
}