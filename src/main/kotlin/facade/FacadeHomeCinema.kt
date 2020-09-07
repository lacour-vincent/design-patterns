package facade

import facade.ecran.Ecran
import facade.lecteur_dvd.LecteurDvd
import facade.lumieres.Lumieres

class FacadeHomeCinema(private val ecran: Ecran, private val lumieres: Lumieres, private val dvd: LecteurDvd) {

    fun regarderFilm(film: String): String {
        val actions: List<String> = listOf(
            lumieres.arret(),
            ecran.baisser(),
            dvd.allumer(),
            dvd.jouer(film)
        )
        return actions.joinToString(separator = " - ")
    }

    fun arreterFilm(): String {
        val actions: List<String> = listOf(
            lumieres.marche(),
            ecran.monter(),
            dvd.arret(),
            dvd.eteindre()
        )
        return actions.joinToString(separator = " - ")
    }
}