package lesson_20

import kotlin.random.Random

//import java.util.Calendar
//
//fun main() {
//
//    val calendar: Calendar = Calendar.getInstance()
//
//    val getDaysToEndYear: () -> Int = fun(): Int = 365 - calendar[Calendar.DAY_OF_YEAR]
//
//    println(getDaysToEndYear.invoke())
//
//    val convertEndDaysToMills: (Int) -> Unit = fun(endDays: Int) = println(1000 * 60 * 60 * 24 * endDays)
//    convertEndDaysToMills(getDaysToEndYear())
//
//
//    val printStringWithLambda: (Int) -> String
//
//    printStringWithLambda = { answer: Int ->
//        "print string with lambda $answer"
//    }
//
//    println(printStringWithLambda(32));
//
//    { it: Int -> "print string with lambda 2 $it" }(223)
//
//    val convertLambda = { endDays: Int ->
//        println("convert from lambda: ${1000 * 60 * 60 * 24 * endDays}")
//    }
//
//    convertLambda(getDaysToEndYear())
//}

//class Calc {
//    fun add(x: Int, y: Int) = x + y
//}
//
//
//
//fun main() {
//    val x = 5
//    val y = 2
//    val operation: (Int, Int) -> Int = { value1: Int, value2: Int -> value1 + value2 }
//    calculate(x, y, operation)
//    calculate(2, 3) { value1, value2 -> value1 * value2 }
//    calculate(10, 100) { p1, p2 -> p2 - p1 }
//    calculate(10, 100, getOperation("multi"))
//    calculate(69, 21, Calc()::add)
//
//}
//
//fun calculate(x: Int, y: Int, operation: (value1: Int, value2: Int) -> Int) {
//    println(operation(x, y))
//}
//
//fun getOperation(operation: String): (Int, Int) -> Int {
//    return when (operation) {
//        "add" -> { x: Int, y: Int -> x + y }
//        "multi" -> { x: Int, y: Int -> x * y }
//        else -> { _, _ -> 0 }
//    }
//}

//fun main() {
//    val person: Person? = Person("maksym")
//    val name = person?.let { person1 -> person1.name.toUpperCase() } ?: "No name"
//    println(name)
//}
//
//class Person(val name: String) {
//
//}

//fun main() {
//    val intList: MutableList<Int> = mutableListOf(1,2,3,4).apply {
//        add(5)
//        add(6)
//        remove(2)
//        remove(4)
//    }
//    println(intList.toString())
//}
fun main() {
    val person: Person = Person("maksym", 22)
    val description = with(person) {
        "Name is: $name and age is: $age"
    }
println(description)

}

class Person(val name: String, val age: Int)