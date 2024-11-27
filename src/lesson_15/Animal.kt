package lesson_15

interface Animal{
    fun voice()
    fun move()
}

class Dog(val name: String): Animal{
    override fun move() {
        println("$name is:run")
    }

    override fun voice() {
        println("$name make voice: Bark-bark")
    }
}


class Bird(val name: String):Animal{
    override fun move() {
        println("$name is: Flying")
    }

    override fun voice() {
        println("$name make voice: Chik-chirik")
    }
}


class Cat(val name:String):Animal{
    override fun move() {
        println("$name is: run")
    }

    override fun voice() {
        println("$name make voice: meow meow")
    }
}