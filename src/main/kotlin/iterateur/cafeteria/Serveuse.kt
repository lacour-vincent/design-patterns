package iterateur.cafeteria

import iterateur.Menu
import iterateur.Plat

class Serveuse(private val menuCafeteria: Menu) {

    fun afficherMenu(): String {
        val iterateurCafet = menuCafeteria.creeIterateur()
        return iterationMenu(iterateurCafet)
    }

    private fun iterationMenu(iterateur: Iterator<Plat>): String {
        val menu: MutableList<String> = mutableListOf()
        while (iterateur.hasNext()) {
            val plat = iterateur.next()
            menu.add("${plat.nom}-${plat.prix}")
        }
        return menu.joinToString(separator = ";")
    }
}