package introduction

import introduction.canard.Canard
import introduction.canard.comportements_cancan.Cancan
import introduction.canard.comportements_cancan.ComportementCancan
import introduction.canard.comportements_vol.ComportementVol
import introduction.canard.comportements_vol.VolerAvecDesAiles

class Colvert : Canard() {
    override var comportementCancan: ComportementCancan = Cancan()
    override var comportementVol: ComportementVol = VolerAvecDesAiles()
    override fun afficher() = "Je suis un vrai colvert"
}