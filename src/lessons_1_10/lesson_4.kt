package lessons_1_10

fun main() {
//    val a = 1 + 1
//    val b = (1 == 1)

    val userAge = 100
//    var comparisonResult = (userAge >= AGE_OF_MAJORITY) && !(userAge <= RETIREMENT_AGE)
//    var comparisonResult = userAge !in AGE_OF_MAJORITY..RETIREMENT_AGE
// println("A result of checking of user age: $comparisonResult ")

    var comparisonResult = userAge !in AGE_OF_MAJORITY..RETIREMENT_AGE
    println("A result of checking user age: ${comparisonResult}")


//    println(0 < -1) //false
//    println(1 == 1) //true
//    println(2 == 3) //false
//    println(7 != 8) //true


    // && , || , !

    val a = true
    val b = !a
    println(b)
}

//const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65