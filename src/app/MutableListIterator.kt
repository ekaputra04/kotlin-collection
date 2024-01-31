package app

fun <T> displayMutableListIterator(mutableListIterator: MutableListIterator<T>) {
    println("Display next")
    while (mutableListIterator.hasNext()) {
        println(mutableListIterator.next())
    }
    println("Display previous")
    while (mutableListIterator.hasPrevious()) {
        println(mutableListIterator.previous())
    }
}

fun removeOddNumber(mutableListIterator: MutableListIterator<Int>) {
    while (mutableListIterator.hasNext()) {
        val value = mutableListIterator.next()
        if (value % 2 == 1) {
            mutableListIterator.remove()
        }
    }
}

fun main() {
    val mutableListIterator = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    removeOddNumber(mutableListIterator.listIterator())
    displayListIterator(mutableListIterator.listIterator())
}