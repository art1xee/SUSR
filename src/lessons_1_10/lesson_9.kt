package lessons_1_10

fun main() {
    // list есть повторения, нахождение по индексу
    // set нет повторений, разный порядок
    // map пары ключ-значение, ключи уникальны

    // фикс размер у массива
    // array<T>, List<T>
    // array оптимизированы для примитивов
    // отличается процесс сравнение элементов

    val list: List<Int> = listOf(4, 4, 2)
    val list2: MutableList<Int> = mutableListOf(1, 2, 3)


    val mutableList: MutableList<Int> = mutableListOf(11, 15, 20, 12, 9, 14)
//    println(mutableList)
    mutableList.add(42)
//    println(mutableList)
    mutableList.add(0, 42)
    println(mutableList)


//    println(mutableList.contains(42))

//    println(mutableList.isEmpty())
//    println(mutableList.isNotEmpty())

    println(mutableList.indexOf(42))
    println(mutableList.lastIndexOf(42))

    mutableList.sort()
    mutableList.sortedDescending()
//    mutableList.reverse()
//    println(mutableList)


    mutableList.forEach() { num: Int ->
//        println(num)
    }

    //interval -> for
    //collection -> forEach
    //break, continue -> for

    val mutableList2 = mutableList.filter {
        it == 42
    }

//    mutableList2.forEach {
//        println(it)
//    }


    val mutableList3 = mutableList2.map {
        it * 2
    }

    mutableList3.forEach {
        println(it)
    }
}