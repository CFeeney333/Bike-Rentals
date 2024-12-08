import model.*
import presenter.End
import presenter.Login
import presenter.ManagerSession
import presenter.StaffSession
import view.CLDisplay

fun main() {
    val view = CLDisplay()
    val staff = UserModel()  // load the users here
    // TODO ADD PERSISTENCE
    staff.add(
        User(
            Account("JDoe", "pwd", AccountType.STAFF), Details(
                Name(Title.MR, "John", "Doe"),
                Address("Bridge Street", "Waterford", "Waterford", "Ireland", "X91 KE83"),
                "051 123 4567",
                "j.doe@gmail.com"
            )
        )
    )
    staff.add(
        User(
            Account("MJones", "securepwd", AccountType.STAFF), Details(
                Name(Title.MRS, "Mary", "Jones"),
                Address("High Street", "Cork", "Cork", "Ireland", "T12 ABC1"),
                "021 654 7890",
                "m.jones@gmail.com"
            )
        )
    )

    staff.add(
        User(
            Account("ARyan", "pass123", AccountType.STAFF), Details(
                Name(Title.MS, "Anna", "Ryan"),
                Address("Park Avenue", "Dublin", "Dublin", "Ireland", "D04 Y2E8"),
                "01 345 6789",
                "a.ryan@gmail.com"
            )
        )
    )

    staff.add(
        User(
            Account("BWoods", "woodspass", AccountType.STAFF), Details(
                Name(Title.MR, "Brian", "Woods"),
                Address("Oak Drive", "Galway", "Galway", "Ireland", "H91 D3F9"),
                "091 456 1230",
                "b.woods@gmail.com"
            )
        )
    )


    val managers = UserModel()  // load the users here
    managers.add(
        User(
            Account("CSmith", "mypassword", AccountType.MANAGER), Details(
                Name(Title.MS, "Clara", "Jones"),
                Address("Elm Lane", "Limerick", "Limerick", "Ireland", "V94 R56C"),
                "061 789 4561",
                "c.jones@gmail.com"
            )
        )
    )


    // Main Loop
    do {
        val user: User = Login(view, staff, managers).run() ?: break
        when (user.account.accountType) {
            AccountType.MANAGER -> ManagerSession(view, user).run()
            AccountType.STAFF -> StaffSession(view, user).run()
        }
    } while (true)
    End(view).run()
}
