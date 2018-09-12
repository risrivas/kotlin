package udemy.basics

fun main(args: Array<String>) {
    println("enter your name")

    val userInput: String? = readLine()

    val userName =
            if (userInput != null && userInput.isNotBlank()) {
                userInput
            } else {
                "default"
            }

    val message =
            if (userName == "default") {
                "give your name please"
            } else {
                "Hello Mr $userName"
            }

    println(message)
}