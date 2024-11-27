package lesson_14

fun main() {

    val ship1 = SpaceShip("ship1", 500)
    ship1.runSystemDiagnostic()
    ship1.switchToWarpMode()

    println()
    val scout1 = Scout("scout1", 800, 6000, 1000)
    val industrial1 = Industrial("industrial1", 300, 9)

    scout1.runSystemDiagnostic()
    scout1.switchToWarpMode()
    scout1.runAfterBurner()
    scout1.handleDataFromRadar()
    println(scout1.unnamed)
    println()

    industrial1.runSystemDiagnostic()
    industrial1.switchToWarpMode()
    industrial1.launchScanningDrones()
    println(industrial1.unnamed)
    println()


}