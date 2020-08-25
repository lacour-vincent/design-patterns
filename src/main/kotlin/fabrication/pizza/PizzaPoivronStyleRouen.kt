package fabrication.pizza

class PizzaPoivronStyleRouen : Pizza() {
    override var nom: String = "Pizza style Rouen aux poivrons"
    override var pate: String = "fine"
    override var sauce: String = "tomate"
    override var garnitures: List<String> = listOf("parmigiano")
}