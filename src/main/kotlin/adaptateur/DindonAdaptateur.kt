package adaptateur

import adaptateur.canard.Canard
import adaptateur.dindon.Dindon

class DindonAdaptateur(val dindon: Dindon) : Canard {
    override fun cancaner(): String = dindon.glouglouter()
    override fun voler(): String = dindon.voler()
}