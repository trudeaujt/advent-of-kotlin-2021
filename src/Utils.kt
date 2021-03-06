import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = File("input", "$name.txt").readLines()

/**
 * Reads lines from the given input txt file.
 */
fun readInputAsInt(name: String) = File("input", "$name.txt").readLines().map { it.toInt() }

/**
 * Converts string to md5 hash.
 */
fun String.md5(): String = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray())).toString(16)

/**
 * Converts string to a List<Int> of digits.
 */
fun String.digits(): List<Int> = this.toString().map { Character.getNumericValue(it) }