package app

fun main() {
    val list1 = listOf("Pisang", "Mangga", "Nanas")
//    val list2 = list1.associate { value -> Pair(value, value.length) }
    val list2 = list1.associate { Pair(it, it.length) }
    println(list2)

//    untuk mengisi value
    val list3 = list1.associateWith { it.length }
    println(list3)

//    untuk mengisi key
//    key harus unik, jika key sama, maka value yang dipakai adalah value terakhir
    val list4 = list1.associateBy { it.length }
    println(list4)
}