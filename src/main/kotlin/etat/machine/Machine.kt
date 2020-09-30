package etat.machine

import etat.machine.etats.EtatAPiece
import etat.machine.etats.EtatEpuise
import etat.machine.etats.EtatSansPiece
import etat.machine.etats.EtatVendu

class Machine(var bonbons: Int) {
    val etatSansPiece = EtatSansPiece(this)
    val etatApiece = EtatAPiece(this)
    val etatVendu = EtatVendu(this)
    val etatEpuise = EtatEpuise()
    
    var etat: Etat = if (bonbons > 0) etatSansPiece else etatEpuise

    fun inserer(): String = etat.inserer()
    fun ejecter(): String = etat.ejecter()
    fun tourner(): String = etat.tourner()
    fun delivrer(): String = etat.delivrer()
    fun liberer() {
        if (bonbons != 0) bonbons -= 1
    }

}