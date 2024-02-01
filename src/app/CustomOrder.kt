package app

data class Fruit(val name: String, val quantity: Int)

fun main() {
    val fruits = listOf(
        Fruit("Apel", 10),
        Fruit("Jeruk", 15),
        Fruit("Semangka", 5),
        Fruit("Nanas", 7),
        Fruit("Pisang", 2)
    )
    println(fruits)

    println(fruits.sortedBy { it.name })
    println(fruits.sortedBy { it.quantity })

    println(fruits.sortedByDescending { it.name })
    println(fruits.sortedByDescending { it.quantity })
}