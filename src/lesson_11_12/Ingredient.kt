package lesson_11_12

class Ingredient(
    val name: String,
    val weight: Int,
    val count: Int,
) {
    var isNeedToPrepeare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        isNeedToPrepeare: Boolean,
    ) : this(name, weight, count) {

        this.isNeedToPrepeare = isNeedToPrepeare
    }

    init {
        println("Ingredient: $name is created")
    }

    



}