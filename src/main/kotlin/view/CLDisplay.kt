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
        var input: Int? = null
        var invalid: Boolean = false
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

            input = getInt();
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

    override fun showMessage(title: String, content: String) {
        // TODO("Again, this is just a simpler form of a general message. All messages can have a title, content, invalid message, options, prompt. Generalize.")
        clear()
        println(title)
        println()
        println(content)
        pressEnter()
    }

    override fun showOptions(title: String, content: String, options: Array<String>): Int {
        TODO("Not yet implemented")
    }

    fun pressEnter() {
        print("Press the ENTER key to continue... ")
        getLine()
    }

}