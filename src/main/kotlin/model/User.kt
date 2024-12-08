package model

/**
 * A User is a person with an account on the system
 */
data class User(val account: Account, override val details: Details) : Person
