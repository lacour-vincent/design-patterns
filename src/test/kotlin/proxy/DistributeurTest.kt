package proxy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import proxy.serveur.Distributeur

class DistributeurTest {

    private val distributeur = Distributeur(5, "Paris")

    @Test
    fun `Le distributeur doit etre a Paris et contenir 5 bonbons`() {
        Assertions.assertEquals("Paris", distributeur.getEmplacement())
        Assertions.assertEquals(5, distributeur.getNombre())
    }
}