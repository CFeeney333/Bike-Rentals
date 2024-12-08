package model

/**
 * The details that pertain to a person
 */
data class Details(val name: Name, val address: Address, var phone: String, var email: String)