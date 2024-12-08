package model

class HelmetModel() : ProductModel<Helmet>() {
    fun updateType(helmet: Helmet, type: HelmetType): Boolean {
        if (helmet.type == type)
            return false
        else
            helmet.type = type
        return true
    }

    fun updateColour(helmet: Helmet, colour: Colour): Boolean {
        if (helmet.colour == colour)
            return false
        else
            helmet.colour = colour
        return true
    }
}