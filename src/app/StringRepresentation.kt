package app

fun main() {
    val list = listOf("Pisang", "Mangga", "Nanas")

//    parameter default
    val string1 = list.joinToString()
    println(string1)

//    separator, prefix, dan postfix custom
    val string2 = list.joinToString("|", "|", "|")
    println(string2)

//    menambahkan lambda
    val string3 = list.joinToString() { it.uppercase() }
    println(string3)

//    jika ingin menggunakan berulang kali
    val builder = StringBuilder()
    list.joinTo(builder, "|", "|", "|")
    list.joinTo(builder, ";", "|", "|")
    list.joinTo(builder, "/", "|", "|")
    val string4 = builder.toString()
    println(string4)
}