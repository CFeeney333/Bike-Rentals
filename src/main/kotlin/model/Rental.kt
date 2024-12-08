package model

import java.time.LocalDate

data class Rental(
    val helmets: HelmetModel = HelmetModel(),
    val bikes: BikeModel = BikeModel(),
    var customer: Customer,
    var user: User,
    var dateStart: LocalDate,
    var dateDue: LocalDate,
    var dateEnd: LocalDate,
)
