package OPP_file

//fun main() {
//    val dog = Dog()
//    println(dog.name)
//
//dog.greetDog()
//    dog.standardName
//}
//
//
//
//class Dog(val name: String?=null) {
//protected val standardName = listOf("Bobik","Sharik","Woodman")
//    fun greetDog(){
//
//        if (name==null){
//            println("Hi${standardName.random()}")
//        }else{
//            println("Hi$name")
//        }
//    }
//}


//fun main() {
//    val coworker = Coworker()
//    coworker.workWithYou()
//}
//
//
//open class Worker() {
//    protected fun work() {
//        println("Work")
//    }
//}
//
//class Coworker : Worker() {
//    fun workWithYou() {
//        work()
//        println("Make a mess")
//    }
//}


//fun main() {
//val behemot = Behemot()
//    behemot.eat()
//    behemot.run()
//    behemot.makeShit()
//
//}
//
//
//open class Animal{
//    fun eat() = println("Animal is eating")
//}
//
//open class Mammal: Animal(){
//    fun run() = println("Mammal is running")
//}
//
//open class Behemot: Mammal(){
//    fun makeShit() = println("hippo make a shit :)")
//}

//fun main() {
//    val bird = Bird()
//    val fish = Fish()
//    val animalList: List<Animal> = listOf(bird, fish)
//    for (animal in animalList) {
//        animal.move()
//    }
//}
//
//
//open class Animal() {
//    open fun move() = println("animal is moving")
//}
//
//class Bird : Animal() {
//    override fun move() = println("bird is flying")
//}
//
//class Fish : Animal() {
//    override fun move() = println("fish is swimming")
//}


//fun main() {
//    val bird = Bird()
//    val fish = Fish()
//
//    val animalList: List<Animal> = listOf(bird, fish)
//
//    for (animal in animalList) {
//        animal.move()
//        animal.isHaveAFur()
//        animal.voice()
//        animal.food()
//    }
//}
//
//abstract class Animal() {
//    abstract fun move()
//    abstract fun isHaveAFur();
//    abstract fun voice();
//    abstract fun food();
//}
//
//class Bird : Animal() {
//    override fun move() {
//        println("bird is flying")
//    }
//
//    override fun isHaveAFur() {
//        println("does a bird have a fur?${true}")
//    }
//
//    override fun voice() {
//        println("bird make noise: чик-чирик")
//    }
//
//    override fun food() {
//        println("bird usually eat worms")
//    }
//}
//
//class Fish : Animal() {
//    override fun move() {
//        println("Fish is swimming")
//    }
//
//    override fun isHaveAFur() {
//        println("does a fish have a fur?${false}")
//    }
//
//    override fun voice() {
//        println("fish make a noise: буль-буль")
//    }
//
//    override fun food() {
//        println("fish usually eat: worms, small fish")
//    }
//}

//fun main() {
//    val basketballPlayer = BasketballPlayer()
//    val soccerPlayer = SoccerPlayer()
//
//    val sport: List<Sport> = listOf(basketballPlayer,soccerPlayer)
//
//    for (sportUsage in sport){
//        sportUsage.useHand()
//        sportUsage.useFoot()
//    }
//
//}
//
//interface Sport{
//    fun useHand() = println("Yes of course")
//    fun useFoot()
//}
//
//class BasketballPlayer: Sport{
//    override fun useFoot() {
//        println("Basketball: yes we use foot too.")
//    }
//}
//
//
//class SoccerPlayer: Sport{
//    override fun useFoot() {
//        println("Soccer: we only use foot`s for gaming")
//    }
//
//    override fun useHand() {
//        println("Soccer: no we cannot use hands is soccer!")
//    }
//}

//fun main() {
//    val listOfWorkers: List<Worker> = listOf(
//        WorkerIt("Sveta"),
//        WorkerWebCam("Masha"),
//        UniversalWorker("Tolik")
//    )
//    for (worker in listOfWorkers) {
//        if ((worker as? Developer) != null) {
//            println("${worker.name}, make a good thing, reload lending")
//            worker.develop()
//        } else {
//            continue
//        }
//
//    }
//}
//
//interface WebCamable {
//    fun showWebCam() {
//        println("show webcam, earn money")
//    }
//}
//
//interface Developer {
//    fun develop() {
//        println("now make a code for your pc, son")
//    }
//}
//
//open class Worker(val name: String)
//
//class WorkerIt(name: String) : Worker(name), Developer
//class WorkerWebCam(name: String) : Worker(name), WebCamable
//class UniversalWorker(name: String) : Worker(name), Developer, WebCamable

//fun main() {
//  val listOfWorkers: List<Worker> = listOf(
//      WorkIt("Svetlana"),
//      WorkerWebCam("Masha"),
//      UniversalWorker("Oleg"))
//
//      for (worker in listOfWorkers){
//          if((worker as? Developer)!=null){
//              println("${worker.name}, make a good stuff, reload lending")
//              worker.develop()
//          }else{
//              continue
//          }
//      }
//}
//
//interface WebCamModel {
//    fun showWebCam() {
//        println("show webcam, earn some money")
//    }
//}
//
//interface Developer {
//    fun develop() {
//        println("let me cook son")
//    }
//}
//
//open class Worker(val name: String)
//
//class WorkIt(name: String) : Worker(name), Developer
//class WorkerWebCam(name:String): Worker(name), WebCamModel
//class UniversalWorker(name:String): Worker(name), Developer, WebCamModel


//fun main() {
//    val listOfAny: List<Any?> = listOf("1", 2, null)
//    for (value in listOfAny){
//        when(value){
//            is String -> println("$value type: String")
//            is Int -> println("$value type: Int")
//            else -> println("i don`t understand what this type of: $value")
//        }
//
//    }
//}


//fun main() {
//    val listOfAny: List<Any?> = listOf("1", 2, null)
//    for(value in listOfAny){
//        when(value){
//            is String -> println("$value type: String")
//            is Int -> println("$value type: Int")
//            else -> println("i don`t understand what this type of: $value ")
//        }
//    }
//}

//class Calc() {
//    fun add(x: Int, y: Int) = x + y
//
//}
//
//fun main() {
//    val x = 5
//    val y = 2
//    val operation = { value1: Int, value2: Int -> value1 * value2 }
//    calculate(x, y, operation)
//    calculate(3, 2) { value1, value2 -> value1 * value2 }
//    calculate(10, 100) { p1, p2 -> p2 - p1 }
//    calculate(10, 20, getOperation("multi"))
//    calculate(69,21, Calc()::add)
//}
//
//fun calculate(x: Int, y: Int, operation: (value1: Int, value2: Int) -> Int) {
//    println(operation(x, y))
//}
//
//fun getOperation(operation: String): (Int, Int) -> (Int) {
//    return when (operation) {
//        "add" -> { x: Int, y: Int -> x + y }
//        "multi" -> { x: Int, y: Int -> x * y }
//        else -> { _, _ -> 0 }
//    }
//
//}


//fun main() {
//    val person: Person? = Person("Maksym")
//    val name = person?.let { it.name.toUpperCase() } ?: "No name"
//    println(name)
//}
//
//class Person(val name: String) {
//
//}

//fun main() {
//    val inList = mutableListOf(1, 2, 3, 4).apply {
//        add(5)
//        add(6)
//        remove(2)
//        remove(4)
//    }
//    println(inList.toString())
//}

fun main() {
    val person = Person("maksym", 21)
    val description = with(person) {
        "User name $name , age - $age"
    }
    println(description)
}

class Person(val name: String, val age: Int) {}
