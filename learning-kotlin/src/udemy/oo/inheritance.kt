package udemy.oo

open class Base
class Child : Base()

open class Shape(val name: String) {
    open fun area() = 0.0
}

class Circle(name: String, val radius: Double) : Shape(name) {
    override fun area() = Math.PI * Math.pow(radius, 2.0)
}

fun main(args: Array<String>) {
    val smallCircle = Circle("Small Circle", 3.0)

    println(smallCircle.name)
    println(smallCircle.radius)
    println(smallCircle.area())

}