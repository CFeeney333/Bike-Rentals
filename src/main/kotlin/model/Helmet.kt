package model

import java.util.*

data class Helmet(
    var type: HelmetType,
    var colour: Colour,
    override var id: Long,
    override var datePurchased: Int,
    override var buyingPrice: Double,
    override var rentalPrice: Double,
    override var isBroken: Boolean,
    override var isRented: Boolean
) : Product