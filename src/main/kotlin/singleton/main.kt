package singleton

fun main() {
    val singleton = Singleton.getInstance()
    val singleton2 = Singleton.getInstance()

    singleton.afficher()
    singleton2.afficher()
}