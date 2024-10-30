fun main() {
    val n = readLine()!!.toInt()
    val points = readLine()!!.split(" ").map { it.toInt() }

    val participants = points.mapIndexed { index, score -> Pair(index + 1, score) }

    val sortedParticipants = participants.sortedWith(compareByDescending<Pair<Int, Int>> { it.second }.thenBy { it.first })

    println(sortedParticipants.joinToString(" ") { it.first.toString() })
}