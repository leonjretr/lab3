fun main() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }

    val sortedArr = arr.sortedWith(compareBy({ Math.abs(it) }, { it }))

    println(sortedArr.joinToString(" "))
}