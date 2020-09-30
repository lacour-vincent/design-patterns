package etat

import etat.machine.Machine


fun main() {
    val machine = Machine(5)

    println("* INSERER - TOURNER - DELIVRER")
    println(machine.inserer())
    println(machine.tourner())
    println(machine.delivrer())
    println("")

    println("* INSERER - EJECTER - TOURNER")
    println(machine.inserer())
    println(machine.ejecter())
    println(machine.tourner())
    println("")

    println("* INSERER - TOURNER - DELIVRER - INSERER - TOURNER - DELIVRER")
    println(machine.inserer())
    println(machine.tourner())
    println(machine.delivrer())
    println(machine.inserer())
    println(machine.tourner())
    println(machine.delivrer())
    println("")

    println("* INSERER - INSERER - TOURNER - DELIVRER - INSERER - TOURNER - DELIVRER - INSERER - TOURNER - DELIVRER")
    println(machine.inserer())
    println(machine.inserer())
    println(machine.tourner())
    println(machine.delivrer())
    println(machine.inserer())
    println(machine.tourner())
    println(machine.delivrer())
    println(machine.inserer())
    println(machine.tourner())
    println(machine.delivrer())
    println("")
    
}