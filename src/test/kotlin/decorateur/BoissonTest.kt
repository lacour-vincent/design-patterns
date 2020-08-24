package decorateur

import decorateur.boissons.Boisson
import decorateur.boissons.Colombia
import decorateur.boissons.Espresso
import decorateur.boissons.ingredients.Caramel
import decorateur.boissons.ingredients.Chocolat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class BoissonTest {

    @Test
    fun `Creation d'une boisson Expresso sans ingredients`() {
        val boisson: Boisson = Espresso()
        assertAll({ assertEquals("Espresso", boisson.getDescription()) }, { assertEquals(1.99, boisson.cout()) })
    }

    @Test
    fun `Creation d'une boisson Colombia sans ingredients`() {
        val boisson: Boisson = Colombia()
        assertAll({ assertEquals("Colombia", boisson.getDescription()) }, { assertEquals(0.89, boisson.cout()) })
    }

    @Test
    fun `Creation d'une boisson Expresso avec 1 ingredient`() {
        var boisson: Boisson = Espresso()
        boisson = Chocolat(boisson)
        assertAll(
            { assertEquals("Espresso, chocolat", boisson.getDescription()) },
            { assertEquals(2.19, boisson.cout()) })
    }

    @Test
    fun `Creation d'une boisson Colombia avec 2 ingredients`() {
        var boisson: Boisson = Espresso()
        boisson = Chocolat(boisson)
        boisson = Caramel(boisson)
        assertAll(
            { assertEquals("Espresso, chocolat, caramel", boisson.getDescription()) },
            { assertEquals(2.34, boisson.cout()) })
    }


}