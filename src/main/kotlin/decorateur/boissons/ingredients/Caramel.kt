package decorateur.boissons.ingredients

import decorateur.boissons.Boisson

class Caramel(private val boisson: Boisson) : DecorateurIngredient() {
    override fun getDescription(): String = "${boisson.getDescription()}, caramel"
    override fun cout(): Double = 0.15 + boisson.cout()
}