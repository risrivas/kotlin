package safari.classes

data class CustomerKotlin(var id: Int, var name: String, var email: String) {
    override fun toString(): String {
        //language=JSON
        return "{\"id\": \"$id\", \"name\": \"$name\"}"
    }
}

fun main(args: Array<String>) {
    val customer1 = CustomerKotlin(123, "Rishi", "mail@google.com")
    val customer2 = CustomerKotlin(123, "Rishi", "mail@google.com")

    println(customer1)
    if (customer1 == customer2) {
        println("equal customers")
    }

    val customer3 = customer1
    println(customer3.id)

    val customer4 = customer1.copy(email = "rishisrivasta@gmail.com")
    println(customer4)
}