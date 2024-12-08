package view

interface Display {

    fun showConfirm(title: String, content: String): Int

    fun showInput(title: String, content: String, invalid: Boolean): String

    fun showMessage(title: String, content: String): Unit

    fun showOptions(title: String, content: String, options: List<Any>): Int
}