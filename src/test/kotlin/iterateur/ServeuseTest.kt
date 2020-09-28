package iterateur

import iterateur.cafeteria.Cafeteria
import iterateur.cafeteria.Serveuse
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ServeuseTest {

    private val cafeteria = Cafeteria()

    @Test
    fun `La serveuse affiche le menu de la cafeteria`() {
        val serveuse = Serveuse(cafeteria)
        assertEquals("Fromage-1.3;Charcuterie-4.0", serveuse.afficherMenu())
    }

}