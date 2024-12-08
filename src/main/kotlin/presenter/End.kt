package presenter

import view.Display

class End(private val view: Display) {
    fun run() {
        view.showMessage("BIKE RENTAL SYSTEM", "Thank you for using the Greenway Bike Rental System!")
    }
}