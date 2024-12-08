package model

import java.util.*

data class Rental(
    val helmets: HelmetModel = HelmetModel(),
    val bikes: BikeModel = BikeModel(),
    var customer: Customer,
    var user: User,
    var dateStart: Int,
    var dateDue: Int,
    var dateEnd: Int,
)
