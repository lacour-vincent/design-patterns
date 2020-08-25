package fabrication

import fabrication.pizza.*
import fabrication.pizzeria.Pizzeria
import fabrication.pizzeria.PizzeriaBrest
import fabrication.pizzeria.PizzeriaRouen
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class PizzeriaTest {

    @Test
    fun `La pizzeria de Rouen cree des pizzas`() {
        val pizzeriaRouen: Pizzeria = PizzeriaRouen()
        val pizzaFromage = pizzeriaRouen.commanderPizza("fromage")
        val pizzaPoivron = pizzeriaRouen.commanderPizza("poivron")
        val pizzaBasique = pizzeriaRouen.commanderPizza("basique")
        assertAll(
            { assertTrue(pizzaFromage is PizzaFromageStyleRouen) },
            { assertTrue(pizzaPoivron is PizzaPoivronStyleRouen) },
            { assertTrue(pizzaBasique is PizzaTomateSansStyle) })
    }

    @Test
    fun `La pizzeria de Brest cree des pizzas`() {
        val pizzeriaBrest: Pizzeria = PizzeriaBrest()
        val pizzaFromage = pizzeriaBrest.commanderPizza("fromage")
        val pizzaPoivron = pizzeriaBrest.commanderPizza("poivron")
        val pizzaBasique = pizzeriaBrest.commanderPizza("basique")
        assertAll(
            { assertTrue(pizzaFromage is PizzaFromageStyleBrest) },
            { assertTrue(pizzaPoivron is PizzaPoivronStyleBrest) },
            { assertTrue(pizzaBasique is PizzaTomateSansStyle) })
    }
    
}