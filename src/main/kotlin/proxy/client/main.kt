package proxy.client

import proxy.DistributeurDistant
import java.rmi.Naming
import java.rmi.RemoteException

fun main() {
    val emplacement = "rmi://Paris/distributeur"
    try {
        val machine = Naming.lookup(emplacement) as DistributeurDistant
        val controlleur = ControlleurDistributeur(machine)
        controlleur.rapport().also(::println)
    } catch (e: RemoteException) {
        e.printStackTrace()
    }
}