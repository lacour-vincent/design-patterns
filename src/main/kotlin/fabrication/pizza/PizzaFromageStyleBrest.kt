package fabrication.pizza

class PizzaFromageStyleBrest : Pizza() {
    override var nom: String = "Pizza style Brest au fromage"
    override var pate: String = "epaisse"
    override var sauce: String = "carbonara"
    override var garnitures: List<String> = listOf("mozzarella")
}