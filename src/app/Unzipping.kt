package app

fun main() {
    val list = listOf(
        1 to "Pisang",
        2 to "Mangga",
        3 to "Nanas"
    )

    val pair = list.unzip()
    println(pair)

    val (list1, list2) = pair
    println(list1)
    println(list2)
}