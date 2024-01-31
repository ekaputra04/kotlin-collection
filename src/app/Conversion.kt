package app

// konversi collection menjadi tipe lain menggunakan method to...
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()
    val mutableSet = array.toMutableSet()
    val mutableList = array.toMutableList()

    val listToMutableList = list.toMutableList()
    val setToMutableSet = set.toMutableSet()
}