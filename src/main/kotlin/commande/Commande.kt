package commande

interface Commande {
    fun executer(): String
    fun annuler(): String
}