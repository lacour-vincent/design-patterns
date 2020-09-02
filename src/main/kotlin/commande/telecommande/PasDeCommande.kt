package commande.telecommande

import commande.Commande

class PasDeCommande : Commande {
    override fun executer(): String = "Pas de commande"
    override fun annuler(): String = "Pas de commande"
}