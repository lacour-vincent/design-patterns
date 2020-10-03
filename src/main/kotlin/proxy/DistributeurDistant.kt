package proxy

import java.rmi.Remote
import java.rmi.RemoteException

interface DistributeurDistant : Remote {

    @Throws(RemoteException::class)
    fun getNombre(): Int

    @Throws(RemoteException::class)
    fun getEmplacement(): String
}