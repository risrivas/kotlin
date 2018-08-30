package safari.functions

fun hello(): Unit {
    println("Hello")
}

fun throwingException(): Nothing {
    throw Exception("This function throws an Exception")
}

fun returnAFour(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

/*fun sum(x: Int, y: Int): Int {
    return x + y
}*/
fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {
    hello()

    val value = returnAFour()
}