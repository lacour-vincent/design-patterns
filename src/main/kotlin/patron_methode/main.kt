package patron_methode

fun main() {
    val cafe: Boisson = Cafe()
    cafe.recette().also(::println)

    val the: Boisson = The()
    the.recette().also(::println)
}