package lesson_14

class Scout(
    name: String,
    speed: Int,
    val radarRange:Int,
    val afterBurnerSpeed: Int,
) : SpaceShip(name, speed) {

fun handleDataFromRadar(){
    println("$name: info from radar.")
}
fun runAfterBurner(){
    println("$name: after burner is on.")
}

}