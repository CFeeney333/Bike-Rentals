package model

/**
 * A UserModel handles a collection of users of a system
 */
class UserModel() : PersonModel<User>() {

    /**
     * Update the person's account username
     *
     * Return true if the element changed
     */
    fun updateUserName(person: User, userName: String): Boolean {
        if (person.account.userName == userName)
            return false
        else
            person.account.userName = userName
        return true
    }

    /**
     * Update the person's account password
     *
     * Return true if the element changed
     */
    fun updatePassword(person: User, password: String): Boolean {
        if (person.account.password == password)
            return false
        else
            person.account.password = password
        return true
    }

    /**
     * Update the person's account type
     *
     * Return true if the element changed
     */
    fun updateAccountType(person: User, accountType: AccountType): Boolean {
        if (person.account.accountType == accountType)
            return false
        else
            person.account.accountType = accountType
        return true
    }

    /**
     * Return a list of all the people with a given username
     */
    fun searchByUserName(userName: String): List<User> {
        return people.filter {it.account.userName == userName}
    }

    /**
     * Return a list of all the people with a given password
     */
    fun searchByPassword(password: String): List<User> {
        return people.filter {it.account.password == password}
    }

    /**
     * Return a list of all the people with a given account type
     */
    fun searchByAccountType(accountType: AccountType): List<User> {
        return people.filter {it.account.accountType == accountType}
    }
}