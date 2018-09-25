package udemy.oo

abstract class Vehicle(open val brand: String = "") {
    open fun drive() {
        println("Driving (abstract class)")
    }

    abstract fun honk()
}

class Sedan(override var brand: String = "BRAND") : Vehicle(), Drivable {
    override val a: Int
        get() = 3

    override fun honk() {
        println("Honking")
    }

    override fun drive() {
        super<Drivable>.drive()
        super<Vehicle>.drive()
    }
}

fun main(args: Array<String>) {
    val sedan = Sedan()
    sedan.drive()
    sedan.honk()
}