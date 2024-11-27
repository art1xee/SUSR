package lessons_1_10

fun main() {
    val userAge = readln().toInt()


    val resultText = if (userAge >= AGE_OF_MAJORITY)
        "show screen with closed content"
    else if (userAge == 16 || userAge == 17)
        "показать экран с ограниченным контентом"
    else
        "back user to main screen"

    //println(resultText)

    //when
    val consoleNumber = when (userAge) {
        10 -> {
            println("другое действие, если ввели 10")
            ("Input num 10")
        }

        20 -> ("Input num 20")
        40 -> ("Input num 40")
        else -> ("Input another num")
    }

    println(consoleNumber)
}

const val AGE_OF_MAJORITY = 18