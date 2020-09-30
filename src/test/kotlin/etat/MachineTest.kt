package etat

import etat.machine.Machine
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MachineTest {

    @Test
    fun `La machine doit delivrer un bonbon`() {
        val machine = Machine(5)
        Assertions.assertEquals("INSERER : SANS_PIECE - A_PIECE", machine.inserer())
        Assertions.assertEquals("TOURNER : A_PIECE - VENDU", machine.tourner())
        Assertions.assertEquals("DELIVRER : VENDU - SANS_PIECE", machine.delivrer())
    }

    @Test
    fun `La machine doit delivrer le dernier bonbon`() {
        val machine = Machine(1)
        Assertions.assertEquals("INSERER : SANS_PIECE - A_PIECE", machine.inserer())
        Assertions.assertEquals("TOURNER : A_PIECE - VENDU", machine.tourner())
        Assertions.assertEquals("DELIVRER : VENDU - EPUISE", machine.delivrer())
    }

    @Test
    fun `La machine doit ejecter la piece`() {
        val machine = Machine(5)
        Assertions.assertEquals("INSERER : SANS_PIECE - A_PIECE", machine.inserer())
        Assertions.assertEquals("EJECTER : A_PIECE - SANS_PIECE", machine.ejecter())
    }

    @Test
    fun `La machine doit retourner les erreurs pour l'etat "sans_piece"`() {
        val machine = Machine(1)
        Assertions.assertEquals("EJECTER : SANS_PIECE - ERREUR", machine.ejecter())
        Assertions.assertEquals("TOURNER : SANS_PIECE - ERREUR", machine.tourner())
        Assertions.assertEquals("DELIVRER : SANS_PIECE - ERREUR", machine.delivrer())
    }

    @Test
    fun `La machine doit retourner les erreurs pour l'etat "a_piece"`() {
        val machine = Machine(1)
        machine.inserer()
        Assertions.assertEquals("INSERER : A_PIECE - ERREUR", machine.inserer())
        Assertions.assertEquals("DELIVRER : A_PIECE - ERREUR", machine.delivrer())
    }

    @Test
    fun `La machine doit retourner les erreurs pour l'etat "vendu"`() {
        val machine = Machine(1)
        machine.inserer()
        machine.tourner()
        Assertions.assertEquals("INSERER : VENDU - ERREUR", machine.inserer())
        Assertions.assertEquals("EJECTER : VENDU - ERREUR", machine.ejecter())
        Assertions.assertEquals("TOURNER : VENDU - ERREUR", machine.tourner())
    }

    @Test
    fun `La machine doit retourner les erreurs pour l'etat "epuise"`() {
        val machine = Machine(0)
        Assertions.assertEquals("INSERER : EPUISE - ERREUR", machine.inserer())
        Assertions.assertEquals("EJECTER : EPUISE - ERREUR", machine.ejecter())
        Assertions.assertEquals("TOURNER : EPUISE - ERREUR", machine.tourner())
        Assertions.assertEquals("DELIVRER : EPUISE - ERREUR", machine.delivrer())
    }


}