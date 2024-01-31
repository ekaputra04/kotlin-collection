package app

fun <T> displayListIterator(listIterator: ListIterator<T>) {
    println("Display next")
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }
    println("Display previous")
    while (listIterator.hasPrevious()) {
        println(listIterator.previous())
    }
}

fun main() {
    displayListIterator(listOf("Pisang", "Mangga", "Nanas").listIterator())
}