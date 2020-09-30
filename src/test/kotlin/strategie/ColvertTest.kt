package strategie

import strategie.canard.Canard
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ColvertTest {

    private val colvert: Canard = Colvert()

    @Test
    fun `Description d'un colvert`() {
        assertEquals("Je suis un vrai colvert", colvert.afficher())
        assertEquals("Je sais nager !", colvert.nager())
        assertEquals("Cancan", colvert.effectuerCancan())
        assertEquals("Je vole !!", colvert.effectuerVol())
    }
}