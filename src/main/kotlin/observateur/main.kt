package observateur

fun main() {
    val donneesMeteo = DonneesMeteo()
    val affichageConditions = AffichageConditions(donneesMeteo)

    donneesMeteo.setMesures(26F, 65F, 1020F)
    donneesMeteo.setMesures(28F, 70F, 1012F)
    donneesMeteo.setMesures(22F, 90F, 1012F)
}