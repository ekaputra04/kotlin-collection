package app

fun main() {
    val list1 = listOf("Pisang", "Mangga", "Nanas", "Pepaya", "Apel", "Jeruk", "Semangka")
    println(list1)

    println(list1.any())
    println(list1.none())
    println(list1.any { it.length > 5 })
    println(list1.none { it.length > 5 })
    println(list1.all { it.length > 5 })
}