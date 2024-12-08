package model

import java.time.LocalDate

/**
 * A product is something that the customer rents
 */
interface Product {
    var id: Long
    var datePurchased: LocalDate
    var buyingPrice: Double
    var rentalPrice: Double
    var isBroken: Boolean
    var isRented: Boolean
}