fun main() {
    // Reading input
    val n = readLine()!!.toInt()
    val array = readLine()!!.split(" ").map { it.toInt() }

    if(n>100){
        return println("N is too big")
    }

    fun sumOfDigits(num: Int): Int {
        return num.toString().map { it.toString().toInt() }.sum()
    }

    val minElement = array.minWithOrNull(compareBy({ sumOfDigits(it) }, { it }))

    val maxElement = array.maxWithOrNull(compareBy({ sumOfDigits(it) }, { it }))

    println(minElement)
    println(maxElement)
}
