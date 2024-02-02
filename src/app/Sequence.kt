package app

fun main() {
    val words = "burung kakak tua hinggap di jendela nenek sudah tua giginya tinggal dua".split(" ")

    val result = words
        .filter {
            println("Filter $it")
            it.length > 5
        }
        .map {
            println("Map $it")
            it.uppercase()
        }
        .take(4)

    println(result)
    println("================")

    val sequence = words.asSequence()
    val resultSequence = sequence
        .filter {
            println("Filter $it")
            it.length > 5
        }
        .map {
            println("Map $it")
            it.uppercase()
        }
        .take(4)
    println(resultSequence.toList())
}