package udemy.functional

fun main(args: Array<String>) {
    val possiblePrimesAfter2 = generateSequence(3) { it + 2 }
    val primes = generateSequence(2 to possiblePrimesAfter2) {

        // Next prime number
        val p = it.second.first()
        null
    }
}