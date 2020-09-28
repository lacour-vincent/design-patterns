package iterateur.cafeteria

import iterateur.Menu
import iterateur.Plat

class Cafeteria : Menu {
    private val plats: MutableList<Plat> = mutableListOf()
    override fun creeIterateur() = plats.iterator()

    init {
        ajouterPlat("Fromage", 1.30)
        ajouterPlat("Charcuterie", 4.00)
    }

    private fun ajouterPlat(nom: String, prix: Double) = plats.add(Plat(nom, prix))
}

