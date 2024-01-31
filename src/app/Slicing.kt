package app

fun main() {
    val numbers = (0..100).toList()

    val list1 = numbers.slice(0..10)
    println(list1)

    val list2 = numbers.slice(0..100 step 7)
    println(list2)

    val list3 = numbers.slice(100 downTo 0 step 9)
    println(list3)
}