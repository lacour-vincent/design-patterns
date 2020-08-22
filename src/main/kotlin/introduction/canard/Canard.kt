package introduction.canard

import introduction.canard.comportements_cancan.ComportementCancan
import introduction.canard.comportements_vol.ComportementVol

abstract class Canard {

    open lateinit var comportementVol: ComportementVol
    open lateinit var comportementCancan: ComportementCancan

    fun effectuerVol() = comportementVol.voler()
    fun effectuerCancan() = comportementCancan.cancaner()
    fun nager() = "Je sais nager !"
    abstract fun afficher(): String

}
