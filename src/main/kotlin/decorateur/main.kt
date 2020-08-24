package decorateur

import decorateur.boissons.Boisson
import decorateur.boissons.Colombia
import decorateur.boissons.Espresso
import decorateur.boissons.ingredients.Caramel
import decorateur.boissons.ingredients.Chocolat

fun main() {
    var boisson: Boisson = Espresso()
    boisson = Chocolat(boisson)
    println("${boisson.getDescription()} pour ${boisson.cout()} €")

    var boisson2: Boisson = Colombia()
    boisson2 = Chocolat(boisson2)
    boisson2 = Caramel(boisson2)
    println("${boisson2.getDescription()} pour ${boisson2.cout()} €")
}