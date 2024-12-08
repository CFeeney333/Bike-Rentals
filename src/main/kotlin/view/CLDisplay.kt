package view

import utils.clear
import utils.getInt
import utils.getLine

class CLDisplay : Display {

    /**
     * Repeatedly print confirm (yes/no) dialog to the user until valid input
     *
     * Return 1 if yes, and 2 if no
     * Keep prompting user until 1 or 2 selected
     */
    override fun showConfirm(title: String, content: String): Int {
        // TODO("showConfirm is basically specialised showOption. Consider removing")
        var input: Int?
        var invalid = false
        do {
            clear()
            println(title)
            if (invalid) {
                println("Invalid option! Please select 1 or 2")
            }
            println()
            println(content)
            println()
            println("1) Yes")
            println("2) No")
            print(">>> ")

            input = getInt()
            if (input == 1) {
                return 1
            }
            if (input == 2) {
                return 2
            } else {
                invalid = true
            }
        } while (true)
    }

    /**
     * Prompt the user for input
     *
     * Return whatever the user types into the console
     */
    override fun showInput(title: String, content: String, invalid: Boolean): String {
        // TODO("Maybe take in a validation function? - should validation be done here?")
        clear()
        println(title)
        if (invalid) {
            println("Invalid input! Enter a valid value")
        }
        println(content)
        println()
        print(">>> ")
        return getLine() ?: return ""
    }

    /**
     * Show a message to the user
     *
     * A message is shown to the user, also prompting them to press Enter to continue
     * Returns when the user presses Enter
     */
    override fun showMessage(title: String, content: String) {
        // TODO("Again, this is just a simpler form of a general message. All messages can have a title, content, invalid message, options, prompt. Generalize.")
        clear()
        println(title)
        println()
        println(content)
        pressEnter()
    }

    /**
     * Prompt the user to select an option, until valid option entered
     *
     * Returns the number that the user selected, ranging from 1 to the amount of options inclusive
     */
    override fun showOptions(title: String, content: String, options: List<Any>): Int {
        var invalid = false
        do {
            clear()
            println(title)
            if (invalid) {
                println("Invalid option! Please select a number from 1 to ${options.size}")
            }
            println()
            println(content)
            println()
            for (i in options.indices) {
                println("${i + 1}) ${options[i]}")
            }
            print(">>> ")

            val input: Int? = getInt()
            if (input != null) {
                if (input >= 1 && input <= options.size) {
                    return input
                }
            }
            invalid = true
        } while (true)
    }

    /**
     * Prompt the user to press enter, and return the function when they do
     */
    private fun pressEnter() {
        print("Press the ENTER key to continue... ")
        getLine()
    }

}