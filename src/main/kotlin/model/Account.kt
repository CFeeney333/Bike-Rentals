package model

/**
 * An Account represents an account on the system
 *
 * Each system user has an account, with a username and password
 */
data class Account(var userName: String, var password: String, var accountType: AccountType)
