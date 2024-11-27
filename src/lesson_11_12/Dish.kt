package lesson_11_12

class Dish(
    private var id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false,
) {
    fun addToFavorites() {
        println("Dish $name add in favorite")
        inFavorites = true
    }

    fun removeFromFavorites() {
        println("Dish $name remove from favorite")
        inFavorites = false
    }

    fun startCooking() {
        println("User launch screen for starting cook the dish $name")
    }

    fun downloadIngredients(): List<String> {
        return ingredients
    }

}