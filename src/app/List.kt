package app

fun main() {
    val list: List<String> = listOf("Eka", "Putra", "Juniawan")

    println(list[0])
    println(list[1])
    println(list[2])

    println(list.indexOf("Eka"))
    println(list.indexOf("Putra"))
    println(list.indexOf("Juniawan"))
    println(list.indexOf("Tidak Ada"))

    println(list.contains("Tidak Ada"))
    println(list.contains("Eka"))

    println(list.containsAll(listOf("Juniawan", "Putra")))
    println(list.containsAll(listOf("Eka", "Tidak Ada")))

    println(list.isEmpty())
    println(list.isNotEmpty())
}