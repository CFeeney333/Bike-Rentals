package utils

const val LINES_TO_SKIP = 40

/**
 * Return the next line from the console
 *
 * Returns null if EOF has been reached before the function has been called
 */
fun getLine(prompt: String): String? {
    print(prompt)
    return readlnOrNull()
}

/**
 * Return the next integer value from the console
 *
 * Returns null if the input is empty or cannot be converted to an Int
 */
fun getInt(prompt: String): Int? {
    print(prompt)
    val input: String = readlnOrNull() ?: return null
    val output: Int
    try {
        output = input.toInt()
        return output
    } catch (e: NumberFormatException) {
        return null
    }
}

/**
 * Return the next double value from the console
 *
 * Returns null if the input is empty or cannot be converted to a Double
 */
fun getDouble(prompt: String): Double? {
    print(prompt)
    val input: String = readlnOrNull() ?: return null
    val output: Double
    try {
        output = input.toDouble()
        return output
    } catch (e: NumberFormatException) {
        return null
    }
}

/**
 * Clear the console screen by skipping a certain amount of lines
 */
fun clear() {
    for (i in 0 until LINES_TO_SKIP) {
        println()
    }
}