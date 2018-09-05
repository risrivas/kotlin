package safari.classes

import java.util.*

class Customer(val id: Int, var name: String = "", val yearOfBirth: Int) {
//    init {
//        name = name.toUpperCase()
//    }
//
//    constructor(email: String) : this(0, "")

    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security number should start with SN")
            }
            field = value
        }
}

fun main(args: Array<String>) {
    val customer = Customer(10, "Rishi", 1982)
    // val customer2 = Customer(11)

    customer.id
    customer.name
    customer.socialSecurityNumber = "SN1234"

    println(customer.name)
    println(customer.age)
    println(customer.socialSecurityNumber)

}