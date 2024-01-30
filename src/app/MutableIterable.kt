package app

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
//    for (value in iterable){
//        println(value)
//    }

    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
//        iterator.remove() // menghapus data di iterasi saat ini
        println(value)
    }
}

fun main() {
    displayMutableCollection(mutableListOf("Pisang", "Mangga", "Nanas"))
    displayMutableCollection(mutableSetOf("Pisang", "Mangga", "Nanas"))

}