package basics

import java.util.*

fun main(args: Array<String>) {
    val ints = mutableListOf<Int>()
    val random = Random()

    for (i in 1..100) {
        ints.add(random.nextInt(100) + 1)
    }

    var j = 0
    while (ints[j] >= 10) {
        println(ints[j++])
    }
}