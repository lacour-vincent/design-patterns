package commande.lampe

import commande.Commande

class AllumerLampe(private val lampe: Lampe) : Commande {
    override fun executer(): String = lampe.marche()
    override fun annuler(): String = lampe.arret()
}

