package commande.lampe

import commande.Commande

class EteindreLampe(private val lampe: Lampe) : Commande {
    override fun executer(): String = lampe.arret()
    override fun annuler(): String = lampe.marche()
}