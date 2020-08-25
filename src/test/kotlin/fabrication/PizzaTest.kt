package fabrication

import fabrication.pizza.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class PizzaTest {

    @Test
    fun `Creation d'une pizza tomate sans style`() {
        val pizza = PizzaTomateSansStyle()
        assertAll(
            { assertEquals("Pizza tomate", pizza.nom) },
            { assertEquals("fine", pizza.pate) },
            { assertEquals("tomate", pizza.sauce) },
            { assertEquals(listOf("fromage"), pizza.garnitures) })
    }

    @Test
    fun `Creation d'une pizza fromage style Rouen`() {
        val pizza = PizzaFromageStyleRouen()
        assertAll(
            { assertEquals("Pizza style Rouen au fromage", pizza.nom) },
            { assertEquals("fine", pizza.pate) },
            { assertEquals("marinara", pizza.sauce) },
            { assertEquals(listOf("parmigiano"), pizza.garnitures) })
    }

    @Test
    fun `Creation d'une pizza fromage style Brest`() {
        val pizza = PizzaFromageStyleBrest()
        assertAll(
            { assertEquals("Pizza style Brest au fromage", pizza.nom) },
            { assertEquals("epaisse", pizza.pate) },
            { assertEquals("carbonara", pizza.sauce) },
            { assertEquals(listOf("mozzarella"), pizza.garnitures) })
    }

    @Test
    fun `Creation d'une pizza poivron style Brest`() {
        val pizza = PizzaPoivronStyleBrest()
        assertAll(
            { assertEquals("Pizza style Brest aux poivrons", pizza.nom) },
            { assertEquals("epaisse", pizza.pate) },
            { assertEquals("tomate", pizza.sauce) },
            { assertEquals(listOf("mozzarella"), pizza.garnitures) })
    }

    @Test
    fun `Creation d'une pizza poivron style Rouen`() {
        val pizza = PizzaPoivronStyleRouen()
        assertAll(
            { assertEquals("Pizza style Rouen aux poivrons", pizza.nom) },
            { assertEquals("fine", pizza.pate) },
            { assertEquals("tomate", pizza.sauce) },
            { assertEquals(listOf("parmigiano"), pizza.garnitures) })
    }


}