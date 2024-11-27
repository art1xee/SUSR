
package lesson_15

fun main() {
    val dog: Dog = Dog("dog")
    val cat: Cat = Cat("cat")
    val bird: Bird = Bird("bird")

    dog.move()
    dog.voice()

    println("")

    cat.move()
    cat.voice()

    println("")

    bird.move()
    bird.voice()

    

}