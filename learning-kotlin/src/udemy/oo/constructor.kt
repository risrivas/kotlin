package udemy.oo

class Country(var name: String, var areaSqKm: Int) {
    /*init {
        this.name = name
        this.area = areaSqKm
    }*/

    constructor(name: String) : this(name, 0) {
        println("Constructor called")
    }

    fun print() = "$name, $areaSqKm km^2"

}

fun main(args: Array<String>) {
    val australia = Country("Australia", 7_700_000)

//    println(australia.name)
//    println(australia.areaSqKm)
    println(australia.print())

    val spain = Country("Spain")
//    println(spain.name)
//    println(spain.areaSqKm)
    println(spain.print())
}