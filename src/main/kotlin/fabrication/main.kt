package fabrication

import fabrication.pizzeria.Pizzeria
import fabrication.pizzeria.PizzeriaBrest
import fabrication.pizzeria.PizzeriaRouen

fun main() {
    val boutiqueRouen: Pizzeria = PizzeriaRouen()
    val boutiqueBrest: Pizzeria = PizzeriaBrest()

    val pizzaFromage = boutiqueRouen.commanderPizza("fromage")
    println("Luc recupère sa ${pizzaFromage.nom}")

    val pizzaPoivron = boutiqueBrest.commanderPizza("poivron")
    println("Anne recupère sa ${pizzaPoivron.nom}")
}