package etat.machine

interface Etat {
    fun inserer(): String
    fun ejecter(): String
    fun tourner(): String
    fun delivrer(): String
}