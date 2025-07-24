class Pizza(name: String, price: Double) : Food(name, price) {
    override fun cook(): String {
        return "Cómo hornear la pizza"
    }
}