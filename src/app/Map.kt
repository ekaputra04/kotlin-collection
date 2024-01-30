package app

fun main() {
    val map: Map<String, String> = mapOf(
        Pair("buah1", "Apel"),
        "buah2" to "Pisang",
        "buah3" to "Rambutan",
        "buah4" to "Semangka",
        "buah4" to "Nanas" // jika key sama, maka value lama akan digantikan oleh value baru
    )

    println(map.keys)
    println(map.values)
    println(map.entries)

    for ((key, value) in map) {
        println("$key to $value")
    }
}