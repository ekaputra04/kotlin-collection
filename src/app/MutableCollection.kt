package app

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun main() {
//    displayMutableCollection(listOf("Pisang", "Mangga", "Rambutan")) // error, karena bukan turunan mutable list
//    displayMutableCollection(setOf("Pisang", "Mangga", "Rambutan")) // error, karena bukan turunan mutable list
//    displayMutableCollection(mapOf("buah1" to "Mangga").entries) // error, karena bukan turunan mutable list

    displayMutableCollection(mutableListOf("Pisang", "Mangga", "Rambutan"))
    displayMutableCollection(mutableSetOf("Pisang", "Mangga", "Rambutan"))
    displayMutableCollection(mutableMapOf("buah1" to "Pisang").entries)
}