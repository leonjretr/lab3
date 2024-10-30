fun main() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    var alreadySorted = true

    for (i in 1 until n) {
        val key = arr[i]
        var j = i - 1

        if (arr[i] < arr[i - 1]) {
            alreadySorted = false
        }

        var hasChanged = false
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]
            j--
            hasChanged = true
        }
        arr[j + 1] = key

        if (hasChanged) {
            println(arr.joinToString(" "))
        }
    }

    if (alreadySorted) {
        println("The array is already sorted")
    }
}
