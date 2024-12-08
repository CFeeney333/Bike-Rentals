package model

import java.util.*

data class Rental(
    val helmets: HelmetModel = HelmetModel(),
    val bikes: BikeModel = BikeModel(),
    var customer: Customer,
    var user: User,
    var dateStart: Date,
    var dateDue: Date,
    var dateEnd: Date,
)
