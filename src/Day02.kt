fun main() {
    class Submarine (var position: Int, var depth: Int, var aim: Int) {
        fun move(direction: String, distance: Int) {
            when (direction) {
                "forward" -> position += distance
                "down" -> depth += distance
                "up" -> depth -= distance
            }
        }
        fun aimAndMove(direction: String, distance: Int) {
            when (direction) {
                "down" -> aim += distance
                "up" -> aim -= distance
                "forward" -> {
                    position += distance
                    depth += aim * distance
                }
            }
        }
        fun multiplyPosAndDepth(): Int {
            return position * depth
        }
    }

    fun part1(input: List<String>): Int {
        val sub = Submarine(0, 0, 0)
        input
            .map{ it.split(" ") }
            .forEach { sub.move(it[0], it[1].toInt()) }
        return sub.multiplyPosAndDepth()
    }

    fun part2(input: List<String>): Int {
        val sub = Submarine(0, 0, 0)
        input
            .map{ it.split(" ") }
            .forEach { sub.aimAndMove(it[0], it[1].toInt()) }
        return sub.multiplyPosAndDepth()
    }

    val testInput = readInput("Day02_test")
    check(part1(testInput) == 150)
    check(part2(testInput) == 900)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}