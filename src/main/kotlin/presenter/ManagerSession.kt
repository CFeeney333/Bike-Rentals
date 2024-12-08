package presenter

import model.*
import view.Display

class ManagerSession(private val view: Display, private val user: User, private val staff: UserModel) {
    fun run() {
        view.showMessage("MANAGER SESSION", "Not yet implemented!")

        var option: Int
        do {
            option = view.showOptions("MAIN MENU", "Choose an option", listOf("Manage Staff", "Exit"))
            when (option) {
                1 -> manageStaff()
                else -> return
            }
        } while (true)
    }

    fun manageStaff() {
        var option: Int
        do {
            option = view.showOptions(
                "MANAGE STAFF",
                "Choose an option",
                listOf("Add Staff", "View Staff", "Update Staff", "Remove Staff", "Exit")
            )

            when (option) {
                1 -> addStaff()
                2 -> viewStaff()
                3 -> updateStaff()
                4 -> removeStaff()
                else -> return
            }
        } while (true)
    }

    fun addStaff() {
        val TITLE = "ADD STAFF"
        val userName = view.showInput(TITLE, "Enter a username", false)
        val password = view.showInput(TITLE, "Enter a password", false)
        val title = Title.entries[view.showOptions(TITLE, "Enter a title: ", listOf(Title.entries.toTypedArray()))]
        val firstName = view.showInput(TITLE, "Enter first name", false)
        val surName = view.showInput(TITLE, "Enter surname", false)
        val street = view.showInput(TITLE, "Enter street", false)
        val town = view.showInput(TITLE, "Enter town", false)
        val county = view.showInput(TITLE, "Enter county", false)
        val country = view.showInput(TITLE, "Enter country", false)
        val zipcode = view.showInput(TITLE, "Enter zipcode", false)
        val phoneNumber = view.showInput(TITLE, "Enter phone number", false)
        val email = view.showInput(TITLE, "Enter email address", false)

        view.showMessage(
            TITLE, if (staff.add(
                    User(
                        Account(userName, password, AccountType.STAFF), Details(
                            Name(title, firstName, surName),
                            Address(street, town, county, country, zipcode),
                            phoneNumber,
                            email
                        )
                    )
                )
            ) "Staff added Successfully!" else "Something went wrong!"
        )
    }

    fun searchStaff(): List<User>? {
        val TITLE = "SEARCH STAFF"
        val option = view.showOptions(
            TITLE, "Search by:", listOf(
                "All", "Username", "Title", "First Name", "Surname", "Phone Number", "Email Address", "Exit"
            )
            // TODO: Add ability to search by address
        )
        when (option) {
            1 -> return staff.all()
            2 -> {
                return staff.searchByUserName(view.showInput(TITLE, "Enter a username to search for", false))
            }

            3 -> {
                return staff.searchByTitle(
                    Title.entries[view.showOptions(
                        TITLE, "Enter a title: ", listOf(Title.entries.toTypedArray())
                    )]
                )
            }

            4 -> {
                return staff.searchByFirstName(view.showInput(TITLE, "Enter a first name to search for", false))
            }

            5 -> {
                return staff.searchByLastName(view.showInput(TITLE, "Enter a surname to search for", false))
            }

            6 -> {
                return staff.searchByPhone(view.showInput(TITLE, "Enter a phone number to search for", false))
            }

            7 -> {
                return staff.searchByEmail(view.showInput(TITLE, "Enter an email address to search for", false))
            }

            else -> {
                return null
            }
        }

    }

    fun viewStaff() {
        val TITLE = "VIEW STAFF"
        var searchResults: List<User>?
        do {
            searchResults = searchStaff()
            if (searchResults == null) {
                break
            }
            val text = if (searchResults.isEmpty()) {
                "Nothing Found!"
            } else {
                searchResults.joinToString("\n")
            }
            view.showMessage(TITLE, text)
        } while (true)
    }

    fun updateStaff() {
        val TITLE = "UPDATE STAFF"
        var searchResults: List<User>?
        do {
            searchResults = searchStaff()
            if (searchResults == null) {
                break
            }
            val text = if (searchResults.isEmpty()) {
                "Nothing Found!"
            } else {
                searchResults.joinToString("\n")
            }

            do {
                view.showMessage(TITLE, "Not yet implemented!")
            } while (true)
        } while (true)
    }

    fun removeStaff() {
        view.showMessage("REMOVE STAFF", "Not yet implemented!")
    }
}