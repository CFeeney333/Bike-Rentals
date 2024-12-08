package model

import java.util.*

data class Helmet(
    val type: HelmetType,
    val colour: Colour,
    override var id: Long,
    override var datePurchased: Date,
    override var buyingPrice: Double,
    override var rentalPrice: Double,
    override var isBroken: Boolean,
    override var isRented: Boolean
) : Product