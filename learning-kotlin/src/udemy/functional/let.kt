package udemy.functional

import java.io.File

fun main(args: Array<String>) {

    // let()

    // scoping
    File("example.txt").bufferedReader().let {
        if (it.ready()) {
            println(it.readLine())
        }
    }

    // reader should not be visible here

    // Working with nullables
    val str: String? = "Kotlin for Android"

    /*if (str?.isNotEmpty()) {
    }*/

    str?.let {
        if (str.isNotEmpty()) {
            str.toLowerCase()
        }
    }
}