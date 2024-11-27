package lesson_16

private val supportInfo = "support info"

class HitchHikersGuide {

    var title = ""
    private var numberOfPages = 888888


    private fun chooseArticle() {
        println("open catalog")
    }

    fun getNumberOfPages() = numberOfPages

    fun setNumberOfPages(number: Int) {
        numberOfPages = number
    }
}

class Support() {
    fun printInfo() {
        println(HitchHikersGuide::class.simpleName)
        println(HitchHikersGuide().title)
        println(supportInfo)
    }
}