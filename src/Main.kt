// Extension function for discounted price
fun Food.discountedPrice(percent: Double): Double {
    return price * (1 - percent / 100)
}

fun main() {
    // Crear instancias
    val burger = Burger("Hamburguesa clásica", 50.0)
    val pizza = Pizza("Pizza margarita", 80.0)
    val iceCream = IceCream("Helado de vainilla", 30.0)
    val juice = Juice("Jugo de naranja", 20.0)

    // Llamadas a cook() y pour()/eat()
    println(burger.cook())        // Cómo asar la hamburguesa
    println(pizza.cook())         // Cómo hornear la pizza
    println(iceCream.cook())      // Cómo enfriar el helado
    println(iceCream.eat())       // Cómo comer el helado
    println(juice.cook())         // Cómo exprimir el jugo
    println(juice.pour())         // Cómo verter el jugo

    // Precio con descuento (10%)
    val discounted = burger.discountedPrice(10.0)
    println("Precio con descuento: $discounted")
}