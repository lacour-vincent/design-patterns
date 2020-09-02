package commande.telecommande

import commande.Commande


class Telecommande {
    private val commandesMarches = Array<Commande>(7) { PasDeCommande() }
    private val commandesArret = Array<Commande>(7) { PasDeCommande() }
    private var commandeAnnulation: Commande = PasDeCommande()

    fun setCommande(empt: Int, comMarche: Commande, comArret: Commande) {
        commandesMarches[empt] = comMarche
        commandesArret[empt] = comArret
    }

    fun buttonMarchePresse(empt: Int): String {
        commandeAnnulation = commandesMarches[empt]
        return commandesMarches[empt].executer()
    }

    fun buttonArretPresse(empt: Int): String {
        commandeAnnulation = commandesArret[empt]
        return commandesArret[empt].executer()
    }

    fun buttonAnnulePressed(): String = commandeAnnulation.annuler()

}
