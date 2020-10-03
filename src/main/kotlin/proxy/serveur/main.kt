package proxy.serveur

import java.rmi.Naming

fun main() {
    val nombre = 5
    val emplacement = "Paris"
    try {
        val distributeur = Distributeur(nombre, emplacement)
        Naming.rebind("//$emplacement/distributeur", distributeur)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

