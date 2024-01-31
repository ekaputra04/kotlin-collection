package app

fun main() {
    listOf("Pisang", "Mangga", "Nanas").forEach {
        println(it)
    }

    listOf("Pisang", "Mangga", "Nanas").forEachIndexed { index, s ->
        println("index $index = value $s")
    }
}