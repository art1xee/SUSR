package lesson_15

interface Movable {
    fun startEngine() {
        println("Engine is start.")
    }

    fun prepareForTakeOff() {}
    fun prepareForLanding() {}
}