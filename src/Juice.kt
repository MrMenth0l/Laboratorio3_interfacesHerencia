class Juice(name: String, price: Double) : Drink(name, price) {
    override fun pour(): String {
        return "Cómo verter el jugo"
    }

    override fun cook(): String {
        return "Cómo exprimir el jugo"
    }
}