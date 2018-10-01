package udemy.oo

interface HouseFactory {
    fun createHouse(): House
}

class House(val numberOfRooms: Int, val price: Double) {

    companion object : HouseFactory {
        override fun createHouse() = getNormalHouse()

        val HOUSES_FOR_SALE = 10
        fun getNormalHouse() = House(6, 199_999.0)
        fun getLuxuryHouse() = House(42, 7_000_000.0)
    }

    fun main(args: Array<String>) {
        val luxuryHouse = House.getLuxuryHouse()
        println(luxuryHouse.price)

        println(House.HOUSES_FOR_SALE)
    }

}