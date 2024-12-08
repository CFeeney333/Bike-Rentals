package model

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.test.assertEquals

class BikeModelTest {

    private var bike1: Bike? = null
    private var bike2: Bike? = null
    private var bike3: Bike? = null
    private var bike4: Bike? = null
    private var bike5: Bike? = null
    private var bike6: Bike? = null
    private var bike7: Bike? = null
    private var bike8: Bike? = null
    private var bike9: Bike? = null
    private var allBikes: BikeModel? = BikeModel()
    private var noBikes: BikeModel? = BikeModel()

    @BeforeEach
    fun setUp() {
        bike1 = Bike(BikeType.BMX, 1, 1, 12341234L, LocalDate.of(2000, 1, 1), 1200.00, 20.00, false, false)
        bike2 = Bike(BikeType.KIDS, 1, 1, 23452345L, LocalDate.of(2000, 1, 1), 1200.00, 15.00, false, false)
        bike3 = Bike(BikeType.ROAD, 3, 8, 34563456L, LocalDate.of(2000, 1, 1), 1200.00, 30.00, false, false)
        bike4 = Bike(BikeType.RACING, 3, 8, 45674567L, LocalDate.of(2000, 1, 1), 1200.00, 35.00, false, false)
        bike5 = Bike(BikeType.MOUNTAIN, 3, 5, 56875687L, LocalDate.of(2001, 11, 20), 1200.00, 30.00, false, true)
        bike6 = Bike(BikeType.BMX, 1, 1, 78907890L, LocalDate.of(2001, 11, 20), 1200.00, 20.00, false, true)
        bike7 = Bike(BikeType.KIDS, 1, 1, 67896789L, LocalDate.of(2001, 11, 20), 1200.00, 15.00, false, true)
        bike8 = Bike(BikeType.ROAD, 3, 8, 19870987L, LocalDate.of(2001, 11, 20), 1200.00, 30.00, true, false)
        bike9 = Bike(BikeType.RACING, 3, 8, 87658765L, LocalDate.of(2001, 11, 20), 1200.00, 35.00, true, false)

        allBikes!!.add(bike1!!)
        allBikes!!.add(bike2!!)
        allBikes!!.add(bike3!!)
        allBikes!!.add(bike4!!)
        allBikes!!.add(bike5!!)
        allBikes!!.add(bike6!!)
        allBikes!!.add(bike7!!)
        allBikes!!.add(bike8!!)
        allBikes!!.add(bike9!!)
    }

    @AfterEach
    fun tearDown() {
        bike1 = null
        bike2 = null
        bike3 = null
        bike4 = null
        bike5 = null
        bike6 = null
        bike7 = null
        bike8 = null
        bike9 = null
    }

    @Nested
    inner class Updates {
        @Test
        fun updateType() {
            assertEquals(bike1!!.type, BikeType.BMX)
            assertTrue(allBikes!!.updateType(bike1!!, BikeType.ROAD))
            assertEquals(bike1!!.type, BikeType.ROAD)
        }

        @Test
        fun updateFrontGears() {
            assertEquals(bike2!!.frontGears, 1)
            assertTrue(allBikes!!.updateFrontGears(bike2!!, 3))
            assertEquals(bike2!!.frontGears, 3)
        }

        @Test
        fun updateBackGears() {
            assertEquals(bike3!!.backGears, 8)
            assertTrue(allBikes!!.updateBackGears(bike3!!, 4))
            assertEquals(bike3!!.backGears, 4)
        }

        @Test
        fun updateID() {
            assertEquals(bike4!!.id, 45674567L)
            assertTrue(allBikes!!.updateID(bike4!!, 12345678L))
            assertEquals(bike4!!.id, 12345678L)
        }

        @Test
        fun updateDatePurchased() {
            assertEquals(bike5!!.datePurchased, LocalDate.of(2001, 11, 20))
            assertTrue(allBikes!!.updateDatePurchased(bike5!!, LocalDate.of(2024, 12, 8)))
            assertEquals(bike5!!.datePurchased, LocalDate.of(2024, 12, 8))
        }

        @Test
        fun updateBuyingPrice() {
            assertEquals(bike6!!.buyingPrice, 1200.00)
            assertTrue(allBikes!!.updateBuyingPrice(bike6!!, 1234.56))
            assertEquals(bike6!!.buyingPrice, 1234.56)
        }

        @Test
        fun updateRentalPrice() {
            assertEquals(bike7!!.rentalPrice, 15.00)
            assertTrue(allBikes!!.updateRentalPrice(bike7!!, 12.34))
            assertEquals(bike7!!.rentalPrice, 12.34)
        }

        @Test
        fun setIsBroken() {
            assertEquals(bike1!!.isBroken, false)
            assertEquals(bike9!!.isBroken, true)
            assertTrue(allBikes!!.setIsBroken(bike1!!, true))
            assertTrue(allBikes!!.setIsBroken(bike9!!, false))
            assertEquals(bike1!!.isBroken, true)
            assertEquals(bike9!!.isBroken, false)
        }

        @Test
        fun setIsRented() {
            assertEquals(bike1!!.isRented, false)
            assertEquals(bike7!!.isRented, true)
            assertTrue(allBikes!!.setIsRented(bike1!!, true))
            assertTrue(allBikes!!.setIsRented(bike7!!, false))
            assertEquals(bike1!!.isRented, true)
            assertEquals(bike7!!.isRented, false)
        }
    }
    // todo finish testing

    @Test
    fun searchByType() {
    }

    @Test
    fun searchByFrontGears() {
    }

    @Test
    fun searchByBackGears() {
    }

    @Test
    fun searchByID() {

    }

    @Test
    fun searchByDatePurchased() {

    }

    @Test
    fun searchByBuyingPrice() {

    }

    @Test
    fun searchByRentalPrice() {

    }

    @Test
    fun searchIsBroken() {

    }

    @Test
    fun searchIsRented() {

    }

    @Test
    fun add() {

    }

    @Test
    fun remove() {

    }
}