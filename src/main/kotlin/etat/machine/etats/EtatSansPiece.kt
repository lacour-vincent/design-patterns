package etat.machine.etats

import etat.machine.Etat
import etat.machine.Machine

class EtatSansPiece(private val machine: Machine) : Etat {
    override fun inserer(): String {
        machine.etat = machine.etatApiece
        return "INSERER : SANS_PIECE - A_PIECE"
    }

    override fun ejecter(): String = "EJECTER : SANS_PIECE - ERREUR"
    override fun tourner(): String = "TOURNER : SANS_PIECE - ERREUR"
    override fun delivrer(): String = "DELIVRER : SANS_PIECE - ERREUR"
}