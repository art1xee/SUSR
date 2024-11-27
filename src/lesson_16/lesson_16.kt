package lesson_16

fun main() {


    val guide = HitchHikersGuide()

//    guide.title = "Don`t panic"
//    guide.chooseArticle()

    println(guide.getNumberOfPages())
    guide.setNumberOfPages(1999)
    println(guide.getNumberOfPages())
//    Support().printInfo()
}