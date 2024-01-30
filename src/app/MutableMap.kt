package app

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()

    mutableMap.put("buah1", "Pisang")
    mutableMap.put("buah2", "Nanas")
    mutableMap.put("buah3", "Semangka")
    mutableMap.put("buah4", "Jeruk")
    mutableMap.put("buah5", "Pepaya")
    mutableMap["buah6"] = "Apel"

    println(mutableMap.get("buah1"))
    println(mutableMap["buah2"])
    println(mutableMap.getOrDefault("buah7", "Nangka"))

    for ((key, value) in mutableMap) {
        println("$key to $value")
    }
}