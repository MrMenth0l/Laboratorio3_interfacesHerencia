class IceCream(name: String, price: Double) : Food(name, price), IDessert {
    override fun cook(): String {
        return "Cómo enfriar el helado"
    }

    override fun eat(): String {
        return "Cómo comer el helado"
    }
}