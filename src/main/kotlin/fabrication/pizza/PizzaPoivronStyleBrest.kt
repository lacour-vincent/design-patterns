package fabrication.pizza

class PizzaPoivronStyleBrest : Pizza() {
    override var nom: String = "Pizza style Brest aux poivrons"
    override var pate: String = "epaisse"
    override var sauce: String = "tomate"
    override var garnitures: List<String> = listOf("mozzarella")
}