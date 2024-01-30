package app

fun <T> displayCollection(collection: Collection<T>){
    for (element in collection){
        println(element)
    }
}

fun main() {
    displayCollection(listOf("Pisang", "Mangga","Rambutan"))
    displayCollection(setOf("Pisang", "Mangga","Rambutan"))
    displayCollection(mapOf("buah1" to "Mangga").entries)
//    displayCollection(mapOf("buah1" to "Mangga")) // error, Map bukan turunan Collection
}