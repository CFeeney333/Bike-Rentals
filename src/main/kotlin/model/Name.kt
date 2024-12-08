package model

/**
 * A Name represents the full name of a person
 *
 * A Name has a title, first name, and last name
 */
data class Name(var title: Title, var firstName: String, var lastName: String)
