package commande

import commande.lampe.*
import commande.porte_garage.FermerPorteGarage
import commande.porte_garage.OuvrirPorteGarage
import commande.porte_garage.PorteGarage
import commande.telecommande.Telecommande
import commande.ventilateur.AllumerVentilateur
import commande.ventilateur.EteindreVentilateur
import commande.ventilateur.Ventilateur
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class TelecommandeTest {

    private val lampeSejour: Lampe = LampeSejour()
    private val allumerLampeSejour = AllumerLampe(lampeSejour)
    private val eteindreLampeSejour = EteindreLampe(lampeSejour)

    private val lampeCuisine: Lampe = LampeCuisine()
    private val allumerLampeCuisine = AllumerLampe(lampeCuisine)
    private val eteindreLampeCuisine = EteindreLampe(lampeCuisine)

    private val ventilateur = Ventilateur()
    private val allumerVentilateur = AllumerVentilateur(ventilateur)
    private val eteindreVentilateur = EteindreVentilateur(ventilateur)

    private val porteGarage = PorteGarage()
    private val ouvrirPorteGarage = OuvrirPorteGarage(porteGarage)
    private val fermerPorteGarage = FermerPorteGarage(porteGarage)


    @Test
    fun `La telecommande doit allumer et eteindre la lampe du sejour`() {
        val telecommande = Telecommande()
        telecommande.setCommande(0, allumerLampeSejour, eteindreLampeSejour)
        Assertions.assertEquals("Lampe sejour ON", telecommande.buttonMarchePresse(0))
        Assertions.assertEquals("Lampe sejour OFF", telecommande.buttonArretPresse(0))
    }

    @Test
    fun `La telecommande doit allumer et eteindre la lampe de la cuisine`() {
        val telecommande = Telecommande()
        telecommande.setCommande(0, allumerLampeCuisine, eteindreLampeCuisine)
        Assertions.assertEquals("Lampe cuisine ON", telecommande.buttonMarchePresse(0))
        Assertions.assertEquals("Lampe cuisine OFF", telecommande.buttonArretPresse(0))
    }

    @Test
    fun `La telecommande doit allumer et eteindre le ventilateur`() {
        val telecommande = Telecommande()
        telecommande.setCommande(0, allumerVentilateur, eteindreVentilateur)
        Assertions.assertEquals("ventilateur rapide", telecommande.buttonMarchePresse(0))
        Assertions.assertEquals("ventilateur arret", telecommande.buttonArretPresse(0))
    }

    @Test
    fun `La telecommande doit ouvrir et fermer la porte du garage`() {
        val telecommande = Telecommande()
        telecommande.setCommande(0, ouvrirPorteGarage, fermerPorteGarage)
        Assertions.assertEquals("Garage porte ouverte - Garage lampe ON", telecommande.buttonMarchePresse(0))
        Assertions.assertEquals("Garage lampe OFF - Garage porte ferme", telecommande.buttonArretPresse(0))
    }

    @Test
    fun `La telecommande doit implementer une fonction annuler`() {
        val telecommande = Telecommande()
        telecommande.setCommande(0, allumerLampeSejour, eteindreLampeSejour)
        telecommande.buttonMarchePresse(0)
        Assertions.assertEquals("Lampe sejour OFF", telecommande.buttonAnnulePressed())
    }
}