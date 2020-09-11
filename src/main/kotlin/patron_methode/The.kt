package patron_methode

class The : Boisson() {
    override fun preparer(): String = "The"
    override fun ajouterSupplements(): String = "Miel"
}