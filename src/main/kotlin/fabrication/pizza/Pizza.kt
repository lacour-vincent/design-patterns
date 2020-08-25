package fabrication.pizza

abstract class Pizza {
    open lateinit var nom: String;
    open lateinit var pate: String;
    open lateinit var sauce: String;
    open lateinit var garnitures: List<String>;

    fun preparer() = "Preparation de la pizza $nom".also(::println)
    fun cuire() = "Cuisson 25 min à 180°C".also(::println)
    fun couper() = "Découper en trois".also(::println)
    fun emballer() = "Emballer dans un carton".also(::println)

}