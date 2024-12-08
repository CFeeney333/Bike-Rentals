package presenter

import model.User
import model.UserModel
import view.Display

class Login(private val view: Display, private val staff: UserModel, private val managers: UserModel) {
    fun run(): User? {
        do {
            val option: Int = view.showOptions("LOGIN", "Choose account type", listOf("Staff", "Manager", "Exit"))

            when (option) {
                1 -> {
                    if (staff.all().isEmpty()) {
                        view.showMessage("STAFF LOGIN", "There are no Staff to choose from")
                        continue
                    }
                    val user: User = staff.get(
                        view.showOptions("STAFF LOGIN", "Select account", staff.all().map {it.account.userName}) - 1
                    )

                    var input: String
                    for (i in 3 downTo 1) {
                        input = view.showInput(
                            "STAFF LOGIN",
                            "Please enter password for ${user.account.userName}\nYou have $i tries...",
                            false
                        )
                        if (input == user.account.password) {
                            return user
                        }
                    }
                }

                2 -> {
                    if (managers.all().isEmpty()) {
                        view.showMessage("MANAGER LOGIN", "There are no Managers to choose from")
                        continue
                    }
                    val user: User = managers.get(
                        view.showOptions("MANAGER LOGIN", "Select account", managers.all().map {it.account.userName}) - 1
                    )

                    var input: String
                    for (i in 3 downTo 1) {
                        input = view.showInput(
                            "MANAGER LOGIN",
                            "Please enter password for ${user.account.userName}\nYou have $i tries...",
                            false
                        )
                        if (input == user.account.password) {
                            return user
                        }
                    }
                }

                3 -> return null
            }
        } while (true)
    }
}