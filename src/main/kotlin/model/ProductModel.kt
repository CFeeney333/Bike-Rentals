package model

import java.util.*

/**
 * A ProductModel manages products and their details, and handles validation
 */
abstract class ProductModel<T : Product> {
    // TODO: write documentation
    protected val products: ArrayList<T> = ArrayList()

    fun add(product: T): Boolean {
        return products.add(product)
    }

    fun remove(product: T): Boolean {
        return products.remove(product)
    }

    fun updateID(product: T, id: Long): Boolean {
        if (product.id == id)
            return false
        else
            product.id = id
        return true
    }

    fun updateDatePurchased(product: T, datePurchased: Date): Boolean {
        if (product.datePurchased == datePurchased)
            return false
        else
            product.datePurchased = datePurchased
        return true
    }

    fun updateBuyingPrice(product: T, buyingPrice: Double): Boolean {
        if (product.buyingPrice == buyingPrice)
            return false
        else
            product.buyingPrice = buyingPrice
        return true
    }

    fun updateRentalPrice(product: T, rentalPrice: Double): Boolean {
        if (product.rentalPrice == rentalPrice)
            return false
        else
            product.rentalPrice = rentalPrice
        return true
    }

    fun updateRentalPriceForAll(newRentalPrice: Double, withCurrentRentalPrice: Double? = null): Boolean {
        var anyChange = false
        for (product in products)
            if (withCurrentRentalPrice != null) {
                if (product.rentalPrice == withCurrentRentalPrice) {
                    anyChange = anyChange || updateRentalPrice(product, newRentalPrice)  // if anyChange is ever set to true, keep it true
                }
            } else {
                anyChange = anyChange || updateRentalPrice(product, newRentalPrice)  // if anyChange is ever set to true, keep it true
            }
        return anyChange
    }

    fun setIsBroken(product: T, isBroken: Boolean): Boolean {
        if (product.isBroken == isBroken)
            return false
        else
            product.isBroken = isBroken
        return true
    }

    fun setIsRented(product: T, isRented: Boolean): Boolean {
        if (product.isRented == isRented)
            return false
        else
            product.isRented = isRented
        return true
    }

    fun searchByID(id: Long): List<T> {
        return products.filter { it.id == id }
    }

    fun searchByDatePurchased(datePurchased: Date): List<T> {
        return products.filter { it.datePurchased == datePurchased }
    }

    fun searchByBuyingPrice(buyingPrice: Double): List<T> {
        return products.filter { it.buyingPrice == buyingPrice }
    }

    fun searchByRentalPrice(rentalPrice: Double): List<T> {
        return products.filter { it.rentalPrice == rentalPrice }
    }

    fun searchIsBroken(isBroken: Boolean): List<T> {
        return products.filter { it.isBroken == isBroken }
    }

    fun searchIsRented(isRented: Boolean): List<T> {
        return products.filter { it.isRented == isRented }
    }
}