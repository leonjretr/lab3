fun main() {
    val n = readLine()!!.toInt()
    val array = readLine()!!.split(" ").map { it.toInt() }

    val L = array.indexOfFirst { it % 2 == 0 }

    val R = array.indexOf(array.minOrNull()!!)

    val start = minOf(L, R)
    val end = maxOf(L, R)

    val sum = array.slice(start..end).sum()

    println(sum)
}
