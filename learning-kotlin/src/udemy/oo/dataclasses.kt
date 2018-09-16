package udemy.oo

// generates hashcode(), equals(), toString(), copy(), destructuring operator
data class Address(val street: String, val number: Int, val postCode: String, val city: String)

fun main(args: Array<String>) {
    val residence = Address("Main street", 42, "1234", "New York")
    val residence2 = Address("Main street", 42, "1234", "New York")

    println(residence)

    println(residence === residence2)
    println(residence == residence2)

    val neighbor = residence.copy(number = 43)
    println(neighbor)

    residence.component1()
    val (street, number, postcode, city) = residence
    println("$street $number, $postcode $city")
}