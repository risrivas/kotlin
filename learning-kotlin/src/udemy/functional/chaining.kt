package udemy.functional

fun main(args: Array<String>) {
    val inputRows = listOf(
            mapOf("input01.csv" to listOf(3, 5, -12, 7, 11, 166)),
            mapOf("input02.csv" to listOf(1, 3, 4)),
            mapOf("input03.csv" to listOf()),
            mapOf("input04.csv" to listOf(9898, 33, 14, 65, 19))
    )

    val cleaned = inputRows.flatMap { it.values }
            .flatten()
            .filter { it in 1..100 }
            .toIntArray()

    println(cleaned.joinToString())

}