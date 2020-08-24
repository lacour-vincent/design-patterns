package decorateur.boissons

class Espresso : Boisson() {
    override fun getDescription(): String = "Espresso"
    override fun cout(): Double = 1.99
}