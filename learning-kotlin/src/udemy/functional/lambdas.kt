package udemy.functional

fun Int.even() = this % 2 == 0
fun Int.timesTwo() = this * 2
fun isEven(i: Int) = i % 2 == 0

fun main(args: Array<String>) {
    // val timesTwo: (Int) -> Int = { x: Int -> x * 2 }
    val add: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    val list = (1..100).toList()
    println(list.filter { it % 2 == 0 })
    println(list.filter { it.even() })
    println(list.filter(::isEven))

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
    // println(notFlattened)

    val flattened = nestedList.flatMap { it.sortedDescending() }
    // println(flattened)
}