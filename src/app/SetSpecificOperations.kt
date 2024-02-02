package app

fun main() {
    val numbers1 = (1..10).toSet()
    val numbers2 = (6..15).toSet()

    println(numbers1)
    println(numbers2)

    println("Union")
    println(numbers1.union(numbers2))
    println(numbers2.union(numbers1))

    println("Intersect")
    println(numbers1.intersect(numbers2))
    println(numbers2.intersect(numbers1))

    println("Subtract")
    println(numbers1.subtract(numbers2))
    println(numbers2.subtract(numbers1))
}