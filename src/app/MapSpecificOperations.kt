package app

fun main() {
    val map = mapOf(
        1 to "Pisang",
        2 to "Mangga",
        3 to "Nanas",
        4 to "Rambutan",
        5 to "Apel",
        6 to "Melon",
        7 to "Semangka",
        8 to "Jeruk",
        9 to "Manggis",
        10 to "Alpukat"
    )

    println(map.get(11)) // null
//    println(map.getValue(11)) // exception
    println(map.getOrElse(11) { "Tidak Ada" })
    println(map.filter { (key, value) -> key > 5 })
    println(map.filterKeys { it > 6 })
    println(map.filterValues { it.length > 7 })
}