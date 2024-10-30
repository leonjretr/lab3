fun main() {
    val n = readLine()!!.toInt()
    val array = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    if (array == array.sorted()) {
        println("The array is already sorted")
        return
    }

    for (i in 1 until n) {
        val key = array[i]
        var j = i - 1

        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j]
            j--
        }
        array[j + 1] = key

        println(array.joinToString(" "))
    }
}