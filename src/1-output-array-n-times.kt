fun main() {

    val n = readLine()!!.toInt()
    val array = readLine()!!.split(" ").map { it.toInt() }

    val k = Math.abs(array[0])

    repeat(k) {
        println(array.joinToString(" "))
    }
}