package adaptateur

import adaptateur.canard.Canard
import adaptateur.canard.Colvert
import adaptateur.dindon.Dindon
import adaptateur.dindon.DindonSauvage
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DindonAdapteurTest {

    private val canard: Canard = Colvert()
    private val dindon: Dindon = DindonSauvage()
    private val adaptateurDindon: Canard = DindonAdaptateur(dindon)


    @Test
    fun `Description d'un dindon`() {
        Assertions.assertEquals("Glouglou", dindon.glouglouter())
        Assertions.assertEquals("Je ne vole pas loin", dindon.voler())
    }

    @Test
    fun `Description d'un canard a partir d'un dindon`() {
        Assertions.assertEquals("Glouglou", adaptateurDindon.cancaner())
        Assertions.assertEquals("Je ne vole pas loin", adaptateurDindon.voler())
    }

}