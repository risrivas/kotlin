package udemy.oo

abstract class Shapes(val name: String) {
    abstract fun area(): Double
    fun a() = 1
}

class Circles(name: String, val radius: Double) : Shapes(name) {
    override fun area() = Math.PI * Math.pow(radius, 2.0)
}

fun main(args: Array<String>) {
    val shapes = Circles("Large circle", 17.0)
    println(shapes.area())
}