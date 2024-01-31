package app

fun main() {
    val list1 = listOf("Pisang", "Mangga", "Nanas", "Pepaya", "Apel", "Jeruk", "Semangka")
    println(list1)

    val list2 = list1.filter { it.length > 5 }
    println(list2)

    val list3 = list1.filterIndexed { index, s ->
        index % 2 == 0
    }
    println(list3)

    val list4 = listOf(null, 1, "Pisang", 10, "Mangga", "Pepaya", true, null, 100) // bentuknya List<Any?>
    println(list4)

    val list5 = list4.filterIsInstance<String>()
    println(list5)

    val list6 = list4.filterIsInstance<Int>()
    println(list6)

    val list7 = list4.filterNotNull()
    println(list7)
}