package app

fun main() {
    val map: Map<Int, String> = mapOf(
        1 to "Pisang",
        2 to "Mangga",
        3 to "Rambutan"
    )

    val map2 = map.mapKeys { it.key * 10 }
    println(map2)

    val map3 = map.mapValues { it.value.uppercase() }
    println(map3)
}