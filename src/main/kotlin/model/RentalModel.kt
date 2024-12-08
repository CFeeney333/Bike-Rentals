package model

import java.util.*

class RentalModel {
    private val rentals = ArrayList<Rental>()

    fun add(rental: Rental): Boolean {
        return rentals.add(rental)
    }

    fun remove(rental: Rental): Boolean {
        return rentals.remove(rental)
    }

    fun updateCustomer(rental: Rental, customer: Customer): Boolean {
        if (rental.customer == customer)
            return false
        else
            rental.customer = customer
        return true
    }

    fun updateUser(rental: Rental, user: User): Boolean {
        if (rental.user == user)
            return false
        else
            rental.user = user
        return true
    }

    fun updateStartDate(rental: Rental, date: Date): Boolean {
        if (rental.dateStart == date)
            return false
        else
            rental.dateStart = date
        return true
    }

    fun updateDueDate(rental: Rental, date: Date): Boolean {
        if (rental.dateDue == date)
            return false
        else
            rental.dateDue = date
        return true
    }

    fun updateEndDate(rental: Rental, date: Date): Boolean {
        if (rental.dateEnd == date)
            return false
        else
            rental.dateEnd = date
        return true
    }

    fun searchByCustomer(customer: Customer): List<Rental> {
        return rentals.filter { rental -> rental.customer == customer }
    }

    fun searchByUser(user: User): List<Rental> {
        return rentals.filter { rental -> rental.user == user }
    }

    fun searchByDateStart(date: Date): List<Rental> {
        return rentals.filter { rental -> rental.dateStart == date }
    }

    fun searchByDateDue(date: Date): List<Rental> {
        return rentals.filter { rental -> rental.dateDue == date }
    }

    fun searchByDateEnd(date: Date): List<Rental> {
        return rentals.filter { rental -> rental.dateEnd == date }
    }

    fun getBikesInRental(rental: Rental): BikeModel {
        return rental.bikes
    }

    fun getHelmetsInRental(rental: Rental): HelmetModel {
        return rental.helmets
    }
}