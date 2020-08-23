package observateur

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AffichageConditionsTest {
    private val donneesMeteo = DonneesMeteo()
    private val affichageConditions = AffichageConditions(donneesMeteo)

    @Test
    fun `Affiche les valeurs initiales de temperature et d'humidite`() {
        assertEquals("Météo : 0.0 °C 0.0 % d'humidité", affichageConditions.afficher())
    }

    @Test
    fun `Affiche les valeurs actualisees de temperature et d'humidite`() {
        donneesMeteo.setMesures(26F, 65F, 1020F)
        assertEquals("Météo : 26.0 °C 65.0 % d'humidité", affichageConditions.afficher())
    }
}