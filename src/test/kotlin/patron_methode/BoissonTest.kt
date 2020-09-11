package patron_methode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BoissonTest {

    @Test
    fun `Prepare un cafe en suivant le patron de boisson`() {
        val cafe: Boisson = Cafe()
        Assertions.assertEquals("Bouillir - Cafe - Verser - Sucre", cafe.recette())
    }


    @Test
    fun `Prepare un the en suivant le patron de boisson`() {
        val the: Boisson = The()
        Assertions.assertEquals("Bouillir - The - Verser - Miel", the.recette())
    }

}