package observateur

import java.util.*

class DonneesMeteo : Observable() {
    private var temperature: Float = 0.0F
    private var humidite: Float = 0.0F
    private var pression: Float = 0.0F

    private fun actualiserMesures() {
        setChanged()
        notifyObservers()
    }

    fun setMesures(temperature: Float, humidite: Float, pression: Float) {
        this.temperature = temperature
        this.humidite = humidite
        this.pression = pression
        actualiserMesures()
    }

    fun getTemperature() = this.temperature
    fun getHumidite() = this.humidite
    fun getPression() = this.pression
}

