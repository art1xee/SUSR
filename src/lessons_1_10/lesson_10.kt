package lessons_1_10//fun main() {
//    printNameAndAge(userName = getName(), userAge = getAge())
//}
//
//fun getName(): String {
//    println("Enter a name")
//    return readln().toString()
//}
//
//fun getAge(): Int {
//    println("Enter a age")
//    return readln().toInt()
//}
//
//fun printNameAndAge(userName: String?, userAge: Int?) {
//    println("User info: $userName, $userAge age")
//}

fun main() {
printNameAndAge(userName = getName(), userAge = getAge())
}

fun getName(): String {
    println("enter a your name:")
    return readln()
}
fun getAge(): Int {
    println("enter a your age:")
    return readln().toInt()
}

fun printNameAndAge(userName:String, userAge:Int){
    println("User info: $userName, $userAge")
}