package facade.lecteur_dvd

class LecteurDvd {
    fun allumer(): String = "LecteurDvd ON"
    fun eteindre(): String = "LecteurDvd OFF"
    fun jouer(film: String): String = "Lecture ON: $film"
    fun arret(): String = "Lecture OFF"
}