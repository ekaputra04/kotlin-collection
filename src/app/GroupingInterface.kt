package app

fun main() {
    val list = listOf("a", "a", "b", "b", "b", "c", "c", "c", "c")
    val grouping = list.groupingBy { it }

    println(grouping.eachCount())
    println(grouping.fold("") { first, second ->
        "$first $second"
    })
    println(grouping.reduce { key, accumulator, element ->
        "$accumulator $element"
    })
    println(grouping.aggregate { key, accumulator: String?, element, first ->
        if (first) element
        else accumulator + element
    })
}