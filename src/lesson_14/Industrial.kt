package lesson_14

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int,
) : SpaceShip(name, speed, unnamed = true) {

    fun launchScanningDrones() {
        println("$name: scanner drones is launched.")
    }

    override fun runSystemDiagnostic() {
        super.runSystemDiagnostic()
        println("$name: launching diagnostic of drones and miners ")
    }

}