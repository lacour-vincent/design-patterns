package fabrication.pizza

class PizzaFromageStyleRouen : Pizza() {
    override var nom: String = "Pizza style Rouen au fromage"
    override var pate: String = "fine"
    override var sauce: String = "marinara"
    override var garnitures: List<String> = listOf("parmigiano")
}