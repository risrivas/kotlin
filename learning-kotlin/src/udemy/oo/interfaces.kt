package udemy.oo

interface Drivable {
    val a: Int
    fun drive() {
        println("Driving (interface)")
    }
}

class Bicycle : Drivable {
    override val a: Int
        get() = 1

    override fun drive() {
        println("Driving bicycle")
    }

    fun a() = 1
}

class Boat : Drivable {
    override val a: Int
        get() = 2

    override fun drive() {
        println("Driving boat")
    }
}

fun main(args: Array<String>) {
    val drivable = Bicycle()
    drivable.drive()
    drivable.a()
}