package commande.ventilateur

class Ventilateur {
    var vitesse: Int = ARRET

    companion object {
        const val ARRET = 0
        const val LENT = 1
        const val MOYEN = 2
        const val RAPIDE = 3
    }

    fun rapide(): String {
        vitesse = RAPIDE
        return "ventilateur rapide"
    }

    fun moyen(): String {
        vitesse = MOYEN
        return "ventilateur moyen"
    }

    fun lent(): String {
        vitesse = LENT
        return "ventilateur lent"
    }

    fun arret(): String {
        vitesse = ARRET
        return "ventilateur arret"
    }


}