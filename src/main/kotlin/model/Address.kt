package model

/**
 * An Address represents a location in the world
 *
 * An Address has a street name, town name, county name, country name, and zipcode
 */
data class Address(var street: String, var town: String, var county: String, var country: String, var zipCode: String)
