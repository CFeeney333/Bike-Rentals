package presenter

import model.User
import view.Display

class StaffSession(private val view: Display, private val user: User) {
    fun run() {
        view.showMessage("MANAGER SESSION", "Not yet implemented!")
    }
}