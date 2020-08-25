package fabrication.pizza

class PizzaTomateSansStyle : Pizza() {
    override var nom: String = "Pizza tomate"
    override var pate: String = "fine"
    override var sauce: String = "tomate"
    override var garnitures: List<String> = listOf("fromage")
}