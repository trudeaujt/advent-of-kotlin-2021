fun main() {
    fun part1(input: List<String>): Int {
        class Submarine (var position: Int, var depth: Int) {
            fun move(direction: String, distance: Int) {
                when (direction) {
                    "forward" -> position += distance
                    "down" -> depth += distance
                    "up" -> depth -= distance
                }
            }
            fun multiplyPosAndDepth(): Int {
                return position * depth
            }
        }
        val sub = Submarine(0, 0)
        val list = input
            .map{ it.split(" ") }

        list.forEach {
            sub.move(it[0], it[1].toInt())
        }
        return sub.multiplyPosAndDepth()
    }

    fun part2(input: List<String>): Int {
        return 0
    }

    val testInput = readInput("Day02_test")
    check(part1(testInput) == 150)
//    check(part2(testInput) == 0)

    val input = readInput("Day02")
    println(part1(input))
//    println(part2(input))
}