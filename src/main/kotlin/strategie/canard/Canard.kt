package strategie.canard

import strategie.canard.comportements_cancan.ComportementCancan
import strategie.canard.comportements_vol.ComportementVol

abstract class Canard {

    abstract var comportementVol: ComportementVol
    abstract var comportementCancan: ComportementCancan

    fun effectuerVol() = comportementVol.voler()
    fun effectuerCancan() = comportementCancan.cancaner()
    fun nager() = "Je sais nager !"
    abstract fun afficher(): String

}
