package basics

import java.util.*

fun main(args: Array<String>) {
    val random = Random()

    val listOfNums = mutableListOf<Int>()

    for (i in 1..100) {
        listOfNums.add(random.nextInt(100) + 1)
    }

    var j = 0
    while (j < listOfNums.size && listOfNums[j] > 10) {
        println(listOfNums[j++])
    }

}

