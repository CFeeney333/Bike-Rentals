package model

class BikeModel() : ProductModel<Bike>() {
    fun updateType(bike: Bike, type: BikeType): Boolean {
        if (bike.type == type)
            return false
        else
            bike.type = type
        return true
    }

    fun updateFrontGears(bike: Bike, frontGears: Int):Boolean {
        if (bike.frontGears == frontGears)
            return false
        else
            bike.frontGears = frontGears
        return true
    }

    fun updateBackGears(bike: Bike, backGears: Int):Boolean {
        if (bike.backGears == backGears)
            return false
        else
            bike.backGears = backGears
        return true
    }

    fun searchByType(bikeType: BikeType): List<Bike> {
        return products.filter{it.type == bikeType}
    }

    fun searchByFrontGears(frontGears: Int): List<Bike> {
        return products.filter{it.frontGears == frontGears}
    }

    fun searchByBackGears(backGears: Int): List<Bike> {
        return products.filter{it.backGears == backGears}
    }
}