package fabrication.pizzeria

import fabrication.pizza.Pizza
import fabrication.pizza.PizzaFromageStyleBrest
import fabrication.pizza.PizzaPoivronStyleBrest
import fabrication.pizza.PizzaTomateSansStyle

class PizzeriaBrest : Pizzeria() {
    override fun creePizza(type: String): Pizza =
        when (type) {
            "fromage" -> PizzaFromageStyleBrest()
            "poivron" -> PizzaPoivronStyleBrest()
            else -> PizzaTomateSansStyle()
        }
}