package utils

const val LINES_TO_SKIP = 40

fun getLine(prompt: String): String? {
    print(prompt)
    return readlnOrNull()
}

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

fun clear() {
    for (i in 0 until LINES_TO_SKIP) {
        println()
    }
}