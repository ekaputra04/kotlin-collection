package app

class Member(val name: String, val hobbies: List<String>)

fun main() {
    val list: List<List<String>> = listOf(
        listOf("Pisang", "Mangga", "Nanas"),
        listOf("Pepaya", "Rambutan")
    )
    println(list)

    val list2: List<String> = list.flatten()
    println(list2)

    val members = listOf(
        Member("Eka", listOf("Makan", "Minum")),
        Member("Putra", listOf("Reading", "Coding")),
        Member("Juniawan", listOf("Bersepeda", "Main HP", "Memancing")),
    )

//    val hobbies = members.map { it.hobbies }.flatten()
    val hobbies = members.flatMap { it.hobbies }
    println(hobbies)
}