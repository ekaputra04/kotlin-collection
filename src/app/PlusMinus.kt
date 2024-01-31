package app

fun main() {
    val list1 = listOf("Pisang", "Mangga", "Nanas", "Apel", "Rambutan")
    println(list1)

    val list2 = list1 + "Semangka" + "Jeruk"
    println(list2)

    val list3 = list1 - "Apel" - "Manggis" // jika menghapus value yang tidak ada, maka tidak berpengaruh
    println(list3)

    val list4 = list2 - listOf("Pisang", "Mangga")
    println(list4)

    val list5 = mapOf(
        1 to "Pisang",
        2 to "Mangga", 3 to "Nanas",
        4 to "Apel",
        5 to "Rambutan"
    )
    println(list5)

    val list6 = list5 + (6 to "Manggis")
    println(list6)

    val list7 = list6.plus(7 to "Durian")
    println(list7)

//    jika menghapus map, cukup memasukkan key nya saja
    val list8 = list7 - 4
    println(list8)

    val list9 = list7.minus(2)
    println(list9)
}