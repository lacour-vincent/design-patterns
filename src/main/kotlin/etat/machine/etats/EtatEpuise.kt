package etat.machine.etats

import etat.machine.Etat

class EtatEpuise() : Etat {
    override fun inserer(): String = "INSERER : EPUISE - ERREUR"
    override fun ejecter(): String = "EJECTER : EPUISE - ERREUR"
    override fun tourner(): String = "TOURNER : EPUISE - ERREUR"
    override fun delivrer(): String = "DELIVRER : EPUISE - ERREUR"
}