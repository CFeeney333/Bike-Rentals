package model

import java.util.*

/**
 * A product is something that the customer rents
 */
interface Product {
    var id: Long
    var datePurchased: Date
    var buyingPrice: Double
    var rentalPrice: Double
    var isBroken: Boolean
    var isRented: Boolean
}