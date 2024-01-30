package app

import data.Person

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()

    mutableSet.add(Person("Eka"))
    mutableSet.add(Person("Putra"))
    mutableSet.add(Person("Eka"))
    mutableSet.add(Person("Juniawan"))

    for (person in mutableSet) {
        println(person)
    }
}