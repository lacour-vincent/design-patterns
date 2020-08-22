package introduction

import introduction.canard.Canard

fun main() {
    val colvert: Canard = Colvert()
    println(colvert.afficher())
    println(colvert.effectuerCancan())
    println(colvert.effectuerVol())

    val proto: Canard = PrototypeCanard()
    println(proto.afficher())
    println(colvert.effectuerCancan())
    println(proto.effectuerVol())
}