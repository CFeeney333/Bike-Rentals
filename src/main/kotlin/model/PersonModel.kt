package model

/**
 * A PersonModel manages people and their details, and handles validation
 */
interface PersonModel<T : Person> {

    /**
     * The arraylist of all the people managed by this model
     */
    val people: ArrayList<T>

    /**
     * Add a person to the collection
     *
     * Return true if collection changed
     */
    fun add(person: T): Boolean {
        return people.add(person)
    }

    /**
     * Remove a person from the collection
     *
     * Return true if the element was in the collection
     */
    fun remove(person: T): Boolean {
        return people.remove(person)
    }

    /**
     * Update the person's first name
     *
     * Return true if the element changed
     */
    fun updateFirstName(person: T, firstName: String): Boolean {
        if (person.details.name.firstName == firstName)
            return false
        else
            person.details.name.firstName = firstName
        return true
    }

    /**
     * Update the person's last name
     *
     * Return true if the element changed
     */
    fun updateLastName(person: T, lastName: String): Boolean {
        if (person.details.name.lastName == lastName)
            return false
        else
            person.details.name.lastName = lastName
        return true
    }

    /**
     * Update the person's email address
     *
     * Return true if the element changed
     */
    fun updateEmail(person: T, email: String): Boolean {
        if (person.details.email == email)
            return false
        else
            person.details.email = email
        return true
    }

    /**
     * Update the person's phone number
     *
     * Return true if the element changed
     */
    fun updatePhone(person: T, phone: Long): Boolean {
        if (person.details.phone == phone)
            return false
        else
            person.details.phone = phone
        return true
    }

    /**
     * Update the person's address county
     *
     * Return true if the element changed
     */
    fun updateCounty(person: T, county: String): Boolean {
        if (person.details.address.county == county)
            return false
        else
            person.details.address.county = county
        return true
    }

    /**
     * Update the person's address town
     *
     * Return true if the element changed
     */
    fun updateTown(person: T, town: String): Boolean {
        if (person.details.address.town == town)
            return false
        else
            person.details.address.town = town
        return true
    }

    /**
     * Update the person's address country
     *
     * Return true if the element changed
     */
    fun updateCountry(person: T, country: String): Boolean {
        if (person.details.address.country == country)
            return false
        else
            person.details.address.country = country
        return true
    }

    /**
     * Update the person's zip code
     *
     * Return true if the element changed
     */
    fun updateZipCode(person: T, zipCode: String): Boolean {
        if (person.details.address.zipCode == zipCode)
            return false
        else
            person.details.address.zipCode = zipCode
        return true
    }

    /**
     * Update the person's title
     *
     * Return true if the element changed
     */
    fun updateTitle(person: T, title: Title): Boolean {
        if (person.details.name.title == title)
            return false
        else
            person.details.name.title = title
        return true
    }

    /**
     * Return a list of all the people with a given first name
     */
    fun searchByFirstName(firstName: String): List<T> {
        return people.filter { it.details.name.firstName == firstName }
    }

    /**
     * Return a list of all the people with a given last name
     */
    fun searchByLastName(lastName: String): List<T> {
        return people.filter { it.details.name.lastName == lastName }
    }

    /**
     * Return a list of all the people with a given email
     */
    fun searchByEmail(email: String): List<T> {
        return people.filter { it.details.email == email }
    }

    /**
     * Return a list of all the people with a given phone number
     */
    fun searchByPhone(phone: Long): List<T> {
        return people.filter { it.details.phone == phone }
    }

    /**
     * Return a list of all the people with a given county
     */
    fun searchByCounty(county: String): List<T> {
        return people.filter { it.details.address.county == county }
    }

    /**
     * Return a list of all the people with a given town
     */
    fun searchByTown(town: String): List<T> {
        return people.filter { it.details.address.town == town }
    }

    /**
     * Return a list of all the people with a given country
     */
    fun searchByCountry(country: String): List<T> {
        return people.filter { it.details.address.country == country }
    }

    /**
     * Return a list of all the people with a certain zip code
     */
    fun searchByZipCode(zipCode: String): List<T> {
        return people.filter { it.details.address.zipCode == zipCode }
    }

    /**
     * Return a list of all the people with a certain title
     */
    fun searchByTitle(title: Title): List<T> {
        return people.filter { it.details.name.title == title }
    }
}