package fabrication.pizzeria

import fabrication.pizza.Pizza

abstract class Pizzeria {

    fun commanderPizza(type: String): Pizza {
        val pizza: Pizza = creePizza(type)
        pizza.preparer()
        pizza.cuire()
        pizza.couper()
        pizza.cuire()
        return pizza
    }

    protected abstract fun creePizza(type: String): Pizza
}