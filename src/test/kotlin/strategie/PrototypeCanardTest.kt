package strategie

import strategie.canard.Canard
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PrototypeCanardTest {

    private val proto: Canard = PrototypeCanard()

    @Test
    fun `Description d'un colvert`() {
        assertEquals("Je suis un prototype de canard", proto.afficher())
        assertEquals("Je sais nager !", proto.nager())
        assertEquals("Silence", proto.effectuerCancan())
        assertEquals("Je vole avec un réacteur !", proto.effectuerVol())
    }
}