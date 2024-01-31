package app

fun main() {
    val list1 = listOf("buah1", "buah2", "buah3")
    val list2 = listOf("Pepaya", "Rambutan", "Melon", "Nangka") // nangka tidak digabungkan, karena tidak punya key
    val list3 = list1.zip(list2)
    println(list3)

//    kita bisa menambahkan lambda untuk memanipulasi value
    val list4 = list1.zip(list2) { value1, value2 ->
        value1 to "$value1 $value2"
    }

    println(list4)
}