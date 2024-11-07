package model

/**
 * A Customer is anyone who makes a booking outside the system
 */
data class Customer(override val details: Details) : Person
