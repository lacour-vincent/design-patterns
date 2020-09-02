package commande.porte_garage

import commande.Commande

class FermerPorteGarage(private val porteGarage: PorteGarage) : Commande {
    override fun executer(): String {
        val actions = listOf(porteGarage.lampeEteinte(), porteGarage.fermer())
        return actions.joinToString(separator = " - ")
    }

    override fun annuler(): String {
        val actions = listOf(porteGarage.ouvrir(), porteGarage.lampeAllume())
        return actions.joinToString(separator = " - ")
    }
}