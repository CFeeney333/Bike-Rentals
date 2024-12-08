package model

import java.util.*

data class Bike(
    val type: BikeType,
    val frontGears: Int,
    val backGears: Int,
    override var id: Long,
    override var datePurchased: Date,
    override var buyingPrice: Double,
    override var rentalPrice: Double,
    override var isBroken: Boolean,
    override var isRented: Boolean
) : Product