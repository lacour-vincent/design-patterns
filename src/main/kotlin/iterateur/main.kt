package iterateur

import iterateur.cafeteria.Cafeteria
import iterateur.cafeteria.Serveuse

fun main() {
    val cafeteria = Cafeteria()
    val serveuse = Serveuse(cafeteria)
    println(serveuse.afficherMenu())
}