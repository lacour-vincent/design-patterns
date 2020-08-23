package observateur

import java.util.*


class AffichageConditions(observable: Observable) : Observer, Affichage {
    private var temperature: Float = 0.0F
    private var humidite: Float = 0.0F

    init {
        observable.addObserver(this)
    }

    override fun afficher() = "Météo : $temperature °C $humidite % d'humidité".also(::println)

    override fun update(o: Observable?, arg: Any?) {
        if (o is DonneesMeteo) {
            this.temperature = o.getTemperature()
            this.humidite = o.getHumidite()
            afficher()
        }
    }


}