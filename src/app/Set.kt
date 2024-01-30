package app

import data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("Eka"), Person("Putra"), Person("Eka"), Person("Juniawan")
    )

    println(set.size)
    println(set.contains(Person("Eka")))

    for (person in set){
        println(person)
    }
}