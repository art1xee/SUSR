package lessons_1_10

fun main() {
    var couner = 5



    do {
        println("add end`s in ${couner--} sec.")
        Thread.sleep(1000)

    } while (couner < 0)
}