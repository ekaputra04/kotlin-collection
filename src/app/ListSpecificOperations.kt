package app

fun main() {
    val list = listOf("Pisang", "Mangga", "Nanas", "Apel", "Jeruk")
    println(list.get(1))
//    println(list.get(10)) // Index Out Of Bound
    println(list.getOrNull(10))
    println(list.getOrElse(10) { "Tidak Ada" })
    println(list.subList(0, 5))

    val sortedList = list.sorted()
    println(sortedList)
    println(sortedList.binarySearch("Semangka"))
    println(sortedList.binarySearch("Jeruk"))

    val numbers = listOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5)
    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(2))
    println(numbers.indexOfFirst { it > 3 })
    println(numbers.indexOfLast { it > 3 })
}