package lessons_1_10

fun main() {
    val range1: IntRange = 42..442
    val range2: IntRange = 42..<442
    val range3: LongRange = 42L..442L
    val range4: CharRange = 'a'..'z'
    val range5: ClosedRange<Double> = 42.1..442.1
    val range6: ClosedRange<Float> = 42.1f..442.1f
    val range7: IntProgression = 42..442 step 2
    val range8: IntProgression = 442 downTo 42 step 2
    val rangeGhoul: IntProgression = 1000 downTo 1 step 7


    val a = 52 in range1
    val b = 52 !in range1

//    println(a)
//    println(b)


    for (i in 5 downTo 1) {
        if (i == 3) {
//            println("user press a button \"skip\".")
//            break
//           println("i==3, i will not print.")
//            continue
            return
        }
        println("add end`s in $i sec.")
        Thread.sleep(1000)
    }

    println("continue program work out loop")

}