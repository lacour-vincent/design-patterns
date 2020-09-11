package patron_methode

class Cafe : Boisson() {
    override fun preparer(): String = "Cafe"
    override fun ajouterSupplements(): String = "Sucre"
}