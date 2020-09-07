package facade

import facade.ecran.Ecran
import facade.lecteur_dvd.LecteurDvd
import facade.lumieres.Lumieres
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FacadeHomeCinemaTest {

    private val ecran: Ecran = Ecran()
    private val lumieres: Lumieres = Lumieres()
    private val dvd: LecteurDvd = LecteurDvd()
    private val homeCinema: FacadeHomeCinema = FacadeHomeCinema(ecran, lumieres, dvd)

    @Test
    fun `Le home cinema doit demarrer la lecture du film`() {
        val actions: String = homeCinema.regarderFilm("Avengers")
        val expected = "Lumieres OFF - Ecran OFF - LecteurDvd ON - Lecture ON: Avengers"
        Assertions.assertEquals(expected, actions)
    }

    @Test
    fun `Le home cinema doit arreter la lecture du film`() {
        val actions: String = homeCinema.arreterFilm()
        val expected = "Lumieres ON - Ecran ON - Lecture OFF - LecteurDvd OFF"
        Assertions.assertEquals(expected, actions)
    }


}