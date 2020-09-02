package commande.ventilateur

import commande.Commande

class AllumerVentilateur(private val ventilateur: Ventilateur) : Commande {
    private var derniereVitesse = Ventilateur.ARRET

    override fun executer(): String {
        derniereVitesse = ventilateur.vitesse
        return ventilateur.rapide()
    }

    override fun annuler(): String = when (derniereVitesse) {
        Ventilateur.LENT -> ventilateur.lent()
        Ventilateur.MOYEN -> ventilateur.moyen()
        Ventilateur.RAPIDE -> ventilateur.rapide()
        else -> ventilateur.lent()
    }
    
}