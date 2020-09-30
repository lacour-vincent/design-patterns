package etat.machine.etats

import etat.machine.Etat
import etat.machine.Machine

class EtatAPiece(private val machine: Machine) : Etat {
    override fun tourner(): String {
        machine.etat = machine.etatVendu
        return "TOURNER : A_PIECE - VENDU"
    }

    override fun ejecter(): String {
        machine.etat = machine.etatSansPiece
        return "EJECTER : A_PIECE - SANS_PIECE"
    }

    override fun inserer(): String = "INSERER : A_PIECE - ERREUR"
    override fun delivrer(): String = "DELIVRER : A_PIECE - ERREUR"

}