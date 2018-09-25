package udemy.oo

fun Bicycle.replaceWheel() {
    println("replacing wheel...")
}

fun Boat.startEngine(): Boolean {
    println("Starting engine...")
    return true
}

fun main(args: Array<String>) {
    val vehicle: Drivable = Bicycle()

    vehicle.drive()

    if (vehicle is Bicycle) {
        vehicle.replaceWheel()
    } else if (vehicle is Boat) {
        vehicle.startEngine()
    }

    if (vehicle is Boat && vehicle.startEngine()) {
        // ...
    }

    if (vehicle !is Boat || vehicle.startEngine()) {
        // ...
    }

    if (vehicle !is Bicycle) {
        return
    }

    vehicle.replaceWheel()
}