class Burger(name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "Cómo asar la hamburguesa"
    }
}