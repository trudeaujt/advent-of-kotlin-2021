fun main() {

    fun part1(input: List<String>): Int {
        var bitTotals = Array(input[0].length) { 0 }
        input.map { it.digits() }
            .forEach {
                it.forEachIndexed { index, i ->
                    bitTotals[index] = bitTotals[index] + i } }

        val gamma = bitTotals
            .map { if (it > input.size / 2) 1 else 0 }
            .joinToString("")
            .toInt(2)

        val epsilon = bitTotals
            .map { if (it > input.size / 2) 0 else 1 }
            .joinToString("")
            .toInt(2)
        return gamma * epsilon
    }

    fun part2(input: List<String>): Int {
        var bitTotals = Array(input[0].length) { 0 }
        input.map { it.digits() }
            .forEach {
                it.forEachIndexed { index, i ->
                    bitTotals[index] = bitTotals[index] + i } }

        return 0
    }

    val testInput = readInput("Day03_test")
    check(part1(testInput) == 198)
    check(part2(testInput) == 230)

    val input = readInput("Day03")
    println(part1(input))
//    println(part2(input))
}