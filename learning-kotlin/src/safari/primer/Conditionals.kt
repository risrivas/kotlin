package safari.primer

fun main(args: Array<String>) {
    var myString = "Not Empty"

    val result = if (myString != "") {
        println("Not Empty")
        20
    } else {
        "Empty"
    }

    var whenResult = when (result) {
        is String -> "Is a String"
        is Number -> {
            println("Inside when isNumber")
            "Is a Number"
        }
        else -> "Don't know"
    }

    println(whenResult)
}