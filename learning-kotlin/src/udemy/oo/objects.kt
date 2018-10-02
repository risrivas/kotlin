package udemy.oo

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import udemy.oo.House.Companion.getNormalHouse as createHouse

object CountryFactory {
    val a = 4
    fun createCountry() = Country("Australia")
}

object DefaultClickListener: MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        println("Mouse was clicked")
    }
}

fun main(args: Array<String>) {
    CountryFactory.a
    CountryFactory.createCountry()

    createHouse()
}