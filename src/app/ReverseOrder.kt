package app

fun main() {
    val fruits = mutableListOf("Pisang", "Mangga", "Nanas")

    val listReverse = fruits.reversed()
    val listAsReverse = fruits.asReversed()

    fruits.add("Jeruk")

    println(listReverse)
    println(listAsReverse)
}