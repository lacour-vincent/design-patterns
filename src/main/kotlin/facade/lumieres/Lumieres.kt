package facade.lumieres

class Lumieres {
    fun marche(): String = "Lumieres ON"
    fun arret(): String = "Lumieres OFF"
    fun attenuer(pourcent: Int): String = "Lumieres $pourcent %"
}