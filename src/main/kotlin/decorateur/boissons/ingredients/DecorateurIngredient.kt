package decorateur.boissons.ingredients

import decorateur.boissons.Boisson

abstract class DecorateurIngredient : Boisson() {
    abstract override fun getDescription(): String
}