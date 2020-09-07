package adaptateur

import adaptateur.canard.Canard
import adaptateur.canard.Colvert
import adaptateur.dindon.Dindon
import adaptateur.dindon.DindonSauvage

fun main() {
    val canard: Canard = Colvert()
    val dindon: Dindon = DindonSauvage()
    val adaptateurDindon: Canard = DindonAdaptateur(dindon)

    println("Dindin dit : ")
    dindon.glouglouter().also(::println)
    dindon.voler().also(::println)

    println("Colvert dit : ")
    canard.cancaner().also(::println)
    canard.voler().also(::println)

    println("Dindon adaptateur dit : ")
    adaptateurDindon.cancaner().also(::println)
    adaptateurDindon.voler().also(::println)

}