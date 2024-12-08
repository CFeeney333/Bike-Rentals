package model

import java.util.*

data class Bike(
    var type: BikeType,
    var frontGears: Int,
    var backGears: Int,
    override var id: Long,
    override var datePurchased: Date,
    override var buyingPrice: Double,
    override var rentalPrice: Double,
    override var isBroken: Boolean,
    override var isRented: Boolean
) : Product