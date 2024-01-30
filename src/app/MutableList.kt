package app

fun main() {
    val mutableList: MutableList<String> = mutableListOf()

    mutableList.add("Pisang")
    mutableList.add("Mangga")
    mutableList.add("Nanas")
    mutableList.add("Apel")
    mutableList.add("Manggis")
    mutableList.add("Rambutan")


    for (item in mutableList) {
        println("Index ke ${mutableList.indexOf(item)} = $item")
    }

    mutableList.set(0, "Pepaya")
    mutableList[0] = "Pepaya"

    println("=========================")
    for (item in mutableList) {
        println("Index ke ${mutableList.indexOf(item)} = $item")
    }

    mutableList.removeAt(0)
    mutableList.remove("Nanas")
    mutableList.removeFirst()
    mutableList.removeLast()

    println("=========================")
    for (item in mutableList) {
        println("Index ke ${mutableList.indexOf(item)} = $item")
    }
}