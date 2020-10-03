package proxy.serveur

import proxy.DistributeurDistant
import java.rmi.server.UnicastRemoteObject


class Distributeur(private val nombre: Int, private val emplacement: String) : UnicastRemoteObject(),
    DistributeurDistant {

    init {
        println("Distributeur deployé à $emplacement avec un stock de $nombre bonbons.")
    }

    override fun getNombre(): Int = nombre
    override fun getEmplacement(): String = emplacement
}
