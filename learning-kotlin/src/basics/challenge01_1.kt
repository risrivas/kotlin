package basics

fun main(args: Array<String>) {
    print("Enter your name: ")
    var name: String? = readLine()

    if (name == null || name.isEmpty())
        name = "Default"

    if (name == "Default")
        println("you did not enter your name")
    else
        println("Hello $name")

}