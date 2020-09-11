package patron_methode

abstract class Boisson {
    fun recette(): String {
        val instructions: List<String> = listOf(bouillir(), preparer(), verser(), ajouterSupplements())
        return instructions.joinToString(separator = " - ")
    }

    private fun bouillir(): String = "Bouillir"
    protected abstract fun preparer(): String
    private fun verser(): String = "Verser"
    protected abstract fun ajouterSupplements(): String
}