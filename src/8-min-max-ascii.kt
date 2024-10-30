fun main() {
    val characters = List(5) { readLine()!!.first() }

    val minChar = characters.minByOrNull { it.toInt() }!!

    val maxChar = characters.maxByOrNull { it.toInt() }!!

    println("${minChar} ${minChar.toInt()}")
    println("${maxChar} ${maxChar.toInt()}")
}
