package fabrication.pizzeria

import fabrication.pizza.Pizza
import fabrication.pizza.PizzaFromageStyleRouen
import fabrication.pizza.PizzaPoivronStyleRouen
import fabrication.pizza.PizzaTomateSansStyle

class PizzeriaRouen : Pizzeria() {
    override fun creePizza(type: String): Pizza =
        when (type) {
            "fromage" -> PizzaFromageStyleRouen()
            "poivron" -> PizzaPoivronStyleRouen()
            else -> PizzaTomateSansStyle()
        }
}