package lesson_14

open class SpaceShip(
    val name: String,
    val speed: Int,
    val unnamed: Boolean = false,
) {

    fun switchToWarpMode() {
        println("${name}: Switch to warp mode.")
    }

  open fun runSystemDiagnostic() {
        println("${name}: System diagnostic is run now.")
    }



}