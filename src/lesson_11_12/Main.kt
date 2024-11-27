package lesson_11_12

fun main() {

    val dish1: Dish = Dish(
        id = 1,
        name = "Pizza",
        category = "common dish",
        ingredients = listOf("testo", "salami", "tomato", "cheese"),
//        inFavorites = true,
    )

    val dish2: Dish = Dish(
        id = 2,
        name = "Sandwich",
        category = "lunch",
        ingredients = listOf("toasts", "tomato", "salad", "cheese", "salami"),
//        inFavorites = true,
    )

    val ingredient1 = Ingredient("watermelon",4,1)
    val ingredient2 = Ingredient("carrot",1,42, true)
    println(ingredient1.name)
    println(ingredient2.name)

//    println(dish1.id)
//    println(dish1.name)
//    println(dish1.category)
//    println(dish1.ingredients)
//    println()
//    println(dish2.id)
//    println(dish2.name)
//    println(dish2.category)
//    println(dish2.ingredients)


//    dish1.category = "завтрак"
//    dish2.inFavorites = true
//
//    println(dish1.category)
//    println(dish2.inFavorites)

//    println("first dish")
//    dish1.addToFavorites()
//    println(dish1.inFavorites)
//    dish1.startCooking()
//
//    println()
//
//    println("second dish")
//    dish2.addToFavorites()
//    println(dish2.inFavorites)
//    val ingredientForSecondDish = dish2.downloadIngredients()
//    println(ingredientForSecondDish)
//    dish2.removeFromFavorites()
//    println(dish2.inFavorites)



}