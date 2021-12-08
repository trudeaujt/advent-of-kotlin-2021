fun main() {
    fun part1(input: List<Int>): Int {
        return input.windowed(2, 1) //split into pairs
            .count{ it[1] > it[0] } //count pairs where second is greater than first
    }

    fun part2(input: List<Int>): Int {
        return input.windowed(3, 1) //split into sets of 3
             { it.sum() } //sum each set
            .windowed(2, 1) //split into pairs
            .count{ it[1] > it[0] } //count pairs where second is greater than first
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInputAsInt("Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInputAsInt("Day01")
    println(part1(input))
    println(part2(input))
}
