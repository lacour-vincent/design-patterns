package proxy.client

import proxy.DistributeurDistant
import java.rmi.RemoteException

class ControlleurDistributeur(private val machine: DistributeurDistant) {
    fun rapport(): String {
        return try {
            val emplacement: String = machine.getEmplacement()
            val nombre: Int = machine.getNombre()
            "Distributeur à $emplacement - $nombre"
        } catch (e: RemoteException) {
            e.printStackTrace()
            "Erreur"
        }
    }
}