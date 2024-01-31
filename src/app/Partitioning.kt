package app

fun main() {
    val list1 = listOf("Pisang", "Mangga", "Nanas", "Pepaya", "Apel", "Jeruk", "Semangka")
    println(list1)

    val (listMatch, listNotMatch) = list1.partition { it.length > 5 }
    println(listMatch)
    println(listNotMatch)
}