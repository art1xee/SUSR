package additional

fun main() {
    val word1: Word = Word("red", " красный")
    val word2: Word = Word("red", " красный")
//    val word2: Word = Word("white", " белый")
    val word3: Word = Word("black", " чёрный")

//    println(word1 === word2)
//    println(word2 === word3)


//    val word4 = word3.copy(translate = "Correct translate is: Black")
//    println(word3)
//    println(word4)
    println(word1.hashCode())
    println(word2.hashCode())
}

data class Word(
    val text: String,
    val translate: String,
)