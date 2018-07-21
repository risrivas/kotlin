package basics

fun main(args: Array<String>) {
    val list = (1..100).toList()
    // println(list)

    val doubled = list.map { i -> i * 2 }
    // println(doubled)

    list.map { it * 2 }
    // println(list)

    val average = list.average()
    // println(average)

    val shifted = list.map { it - average }
    // println(shifted)


    // flatmap

    val nestedList = listOf(
            (1..10).toList(),
            (11..20).toList(),
            (21..30).toList()
    )

    val notFlattened = nestedList.map { it.sortedDescending() }
    println(notFlattened)

    val flattened = nestedList.flatMap { it.sortedDescending() }
    println(flattened)
}