package app

fun main() {
    val list = listOf("Pisang", "Mangga", "Nanas")

//    cara manual tanpa extension function
//    val temp = mutableListOf<String>()
//    for (value in list) {
//        temp.add(value.uppercase())
//    }
//    val list2 = temp.toList()

//    cara menggunakan extension function
    val list2 = list.map { value -> value.uppercase() }
    println(list2)

    val list3 = list.map { it.lowercase() }
    println(list3)

    val list4 = listOf("Pisang", "Mangga", "Nanas", "Rambutan")
    val list4Ganjil = list4.mapIndexedNotNull { index, s ->
        if (index % 2 == 1) null
        else s
    }
    println(list4Ganjil)
}