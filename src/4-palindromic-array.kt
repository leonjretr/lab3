fun main() {
    val n = readLine()!!.toInt()
    val array = readLine()!!.split(" ").map { it.toInt() }

    var k = 0
    var result = emptyList<Int>()

    fun isPalindrome(arr: List<Int>): Boolean {
        for (i in 0 until arr.size / 2) {
            if (arr[i] != arr[arr.size - 1 - i]) return false
        }
        return true
    }

    for (i in array.indices) {
        if (isPalindrome(array.subList(i, array.size))) {
            k = i
            result = array.subList(0, i).reversed()
            break
        }
    }

    println(k)
    if (k > 0) println(result.joinToString(" "))
}
