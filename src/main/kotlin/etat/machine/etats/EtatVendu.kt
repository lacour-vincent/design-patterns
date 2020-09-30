package etat.machine.etats

import etat.machine.Etat
import etat.machine.Machine

class EtatVendu(private val machine: Machine) : Etat {
    override fun delivrer(): String {
        machine.liberer()
        machine.etat = if (machine.bonbons != 0) machine.etatSansPiece else machine.etatEpuise
        return "DELIVRER : VENDU - ${if (machine.bonbons != 0) "SANS_PIECE" else "EPUISE"}"
    }

    override fun inserer(): String = "INSERER : VENDU - ERREUR"
    override fun ejecter(): String = "EJECTER : VENDU - ERREUR"
    override fun tourner(): String = "TOURNER : VENDU - ERREUR"
}