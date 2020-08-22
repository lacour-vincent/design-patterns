package introduction

import introduction.canard.Canard
import introduction.canard.comportements_cancan.CancanMuet
import introduction.canard.comportements_cancan.ComportementCancan
import introduction.canard.comportements_vol.ComportementVol
import introduction.canard.comportements_vol.PropulsionAReaction

class PrototypeCanard : Canard() {
    override var comportementCancan: ComportementCancan = CancanMuet()
    override var comportementVol: ComportementVol = PropulsionAReaction()
    override fun afficher() = "Je suis un prototype de canard"
}