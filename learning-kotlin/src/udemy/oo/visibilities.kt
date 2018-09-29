package udemy.oo

// private - same as in Java
// protected - same as in Java
// internal - visible inside the same module
// public - same as in Java

private val i = 42
fun a() = 17

open class Car(val brand: String, private val model: String) {
    protected fun tellMeYourModel()  = model
}

fun main(args: Array<String>) {
    val car = Car("BRAND", "MODEL")
    car.brand
//    car.tellMeYourModel()
    println(i)
}