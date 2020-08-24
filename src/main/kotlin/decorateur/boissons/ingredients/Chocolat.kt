package decorateur.boissons.ingredients

import decorateur.boissons.Boisson

class Chocolat(private val boisson: Boisson) : DecorateurIngredient() {
    override fun getDescription(): String = "${boisson.getDescription()}, chocolat"
    override fun cout(): Double = 0.20 + boisson.cout()
}