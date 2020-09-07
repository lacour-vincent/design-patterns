package facade

import facade.ecran.Ecran
import facade.lecteur_dvd.LecteurDvd
import facade.lumieres.Lumieres

fun main() {
    val ecran: Ecran = Ecran()
    val lumieres: Lumieres = Lumieres()
    val dvd: LecteurDvd = LecteurDvd()
    val homeCinema: FacadeHomeCinema = FacadeHomeCinema(ecran, lumieres, dvd)

    homeCinema.regarderFilm("Avengers").also(::println)
    homeCinema.arreterFilm().also(::println)
}