package lessons_1_10

fun main() {
    val arrayOfIngredient: Array<String> = arrayOf("egg", "cheese", "salt", "milk", "watermelon")

    val intArray1: IntArray = intArrayOf(1, 2, 3, 4)

    val charArray: CharArray = charArrayOf('a', 'b', 's')

//    val intArray2 = arrayOf()
    var intArray3 = intArrayOf(1, 2, 3, 4, 5)
    intArray3 = intArrayOf(2, 4, 6, 8)

//    println("Size of array with ingredient: ${arrayOfIngredient.size}")

//    println(arrayOfIngredient.indexOf("salt"))
//    println(arrayOfIngredient[2])
//    println(arrayOfIngredient[4])

//    arrayOfIngredient[2] = "sugar"
//    println(arrayOfIngredient[2])
//
//    arrayOfIngredient.set(1,"melon")
//    arrayOfIngredient.get(1)

//    for (i in arrayOfIngredient) {
//        println("ingredient ${arrayOfIngredient.indexOf(i) + 1}: ${i}")
//    }

    for (i in arrayOfIngredient){
        println("ingredient ${arrayOfIngredient.indexOf(i) + 1}: $i")
    }


}