package safari.inheritance

abstract class StoredEntity {
    val isActive = true
    abstract fun store()
    fun status(): String {
        return isActive.toString()
    }
}

class Employee : StoredEntity() {
    override fun store() {

    }
}

fun main(args: Array<String>) {
    val se = Employee()
    println(se.status())
}