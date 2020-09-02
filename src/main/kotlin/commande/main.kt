package commande

import commande.lampe.*
import commande.porte_garage.FermerPorteGarage
import commande.porte_garage.OuvrirPorteGarage
import commande.porte_garage.PorteGarage
import commande.telecommande.Telecommande
import commande.ventilateur.AllumerVentilateur
import commande.ventilateur.EteindreVentilateur
import commande.ventilateur.Ventilateur

fun main() {
    val telecommande = Telecommande()

    val lampeSejour: Lampe = LampeSejour()
    val allumerLampeSejour = AllumerLampe(lampeSejour)
    val eteindreLampeSejour = EteindreLampe(lampeSejour)

    val lampeCuisine: Lampe = LampeCuisine()
    val allumerLampeCuisine = AllumerLampe(lampeCuisine)
    val eteindreLampeCuisine = EteindreLampe(lampeCuisine)

    val ventilateur = Ventilateur()
    val allumerVentilateur = AllumerVentilateur(ventilateur)
    val eteindreVentilateur = EteindreVentilateur(ventilateur)

    val porteGarage = PorteGarage()
    val ouvrirPorteGarage = OuvrirPorteGarage(porteGarage)
    val fermerPorteGarage = FermerPorteGarage(porteGarage)

    telecommande.setCommande(0, allumerLampeSejour, eteindreLampeSejour)
    telecommande.setCommande(1, allumerLampeCuisine, eteindreLampeCuisine)
    telecommande.setCommande(2, allumerVentilateur, eteindreVentilateur)
    telecommande.setCommande(3, ouvrirPorteGarage, fermerPorteGarage)

    telecommande.buttonMarchePresse(0).also(::println)
    telecommande.buttonAnnulePressed().also(::println)
    telecommande.buttonArretPresse(0).also(::println)
    telecommande.buttonMarchePresse(1).also(::println)
    telecommande.buttonArretPresse(1).also(::println)
    telecommande.buttonMarchePresse(2).also(::println)
    telecommande.buttonArretPresse(2).also(::println)
    telecommande.buttonMarchePresse(3).also(::println)
    telecommande.buttonArretPresse(3).also(::println)
    telecommande.buttonAnnulePressed().also(::println)

}