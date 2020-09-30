package strategie

import strategie.canard.Canard
import strategie.canard.comportements_cancan.CancanMuet
import strategie.canard.comportements_cancan.ComportementCancan
import strategie.canard.comportements_vol.ComportementVol
import strategie.canard.comportements_vol.PropulsionAReaction

class PrototypeCanard : Canard() {
    override var comportementCancan: ComportementCancan = CancanMuet()
    override var comportementVol: ComportementVol = PropulsionAReaction()
    override fun afficher() = "Je suis un prototype de canard"
}