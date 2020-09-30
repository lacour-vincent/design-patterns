package strategie

import strategie.canard.Canard
import strategie.canard.comportements_cancan.Cancan
import strategie.canard.comportements_cancan.ComportementCancan
import strategie.canard.comportements_vol.ComportementVol
import strategie.canard.comportements_vol.VolerAvecDesAiles

class Colvert : Canard() {
    override var comportementCancan: ComportementCancan = Cancan()
    override var comportementVol: ComportementVol = VolerAvecDesAiles()
    override fun afficher() = "Je suis un vrai colvert"
}