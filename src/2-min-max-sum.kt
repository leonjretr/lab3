fun main() {
    val n = readLine()!!.toInt()
    val array = readLine()!!.split(" ").map { it.toInt() }

    fun digitSum(num: Int): Int {
        return num.toString().map { it.toString().toIntOrNull() ?: 0 }.sum()
    }

    var minElement = array[0]
    var maxElement = array[0]
    var minDigitSum = digitSum(array[0])
    var maxDigitSum = digitSum(array[0])

    for (element in array) {
        val currentDigitSum = digitSum(element)

        if (currentDigitSum < minDigitSum || (currentDigitSum == minDigitSum && element < minElement)) {
            minElement = element
            minDigitSum = currentDigitSum
        }

        if (currentDigitSum > maxDigitSum || (currentDigitSum == maxDigitSum && element > maxElement)) {
            maxElement = element
            maxDigitSum = currentDigitSum
        }
    }

    println(minElement)
    println(maxElement)
}