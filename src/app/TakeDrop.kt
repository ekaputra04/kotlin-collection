package app

fun main() {
    val chars = ('a'..'z').toList()
    println(chars)

    println(chars.take(3))
    println(chars.takeLast(6))
    println(chars.takeWhile { it < 'g' })
    println(chars.takeLastWhile { it > 'u' })

    println(chars.drop(23))
    println(chars.dropLast(23))
    println(chars.dropWhile { it < 'x' })
    println(chars.dropLastWhile { it > 'd' })
}