package observateur

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class DonneesMeteoTest {
    private val donneesMeteo = DonneesMeteo()

    @Test
    fun `Retourne les valeurs initiales de temperature, humidite et pression`() {
        assertAll({ assertEquals(0.0F, donneesMeteo.getTemperature()) },
            { assertEquals(0.0F, donneesMeteo.getHumidite()) },
            { assertEquals(0.0F, donneesMeteo.getPression()) })
    }

    @Test
    fun `Retourne les nouvelles valeurs initiales de temperature, humidite et pression`() {
        donneesMeteo.setMesures(26F, 65F, 1020F)
        assertAll({ assertEquals(26F, donneesMeteo.getTemperature()) },
            { assertEquals(65F, donneesMeteo.getHumidite()) },
            { assertEquals(1020F, donneesMeteo.getPression()) })
    }

}
