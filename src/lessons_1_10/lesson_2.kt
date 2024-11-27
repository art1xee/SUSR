package lessons_1_10

fun main() {
    val a = 5
    val b = 7

    val sum = a + b

    val c = 888
    val c2: Int

    //println(a + b)
//    println(sum)
//    println(10/3)

    val intNum: Int = 10
    val intNum2: Int = 3
//    println(intNum/intNum2)

    val floatNum: Float = 10f;
    val floatNum2: Float = 3f;
//    println(floatNum / floatNum2)

    val doubleNum: Double = 10.0;
    val doubleNum2: Double = 3.0;
//    println(doubleNum / doubleNum2)


//    println(10%3)
//    println(10%2)


    val c3 = intNum + floatNum
//    println(c3::class.simpleName)
//
    val d = intNum + floatNum + doubleNum
//    println(d::class.simpleName)

    var counter = 0

    counter = counter + 1
    counter += 1
    counter++

//    println(counter)

    counter -= 1
    counter--


    ++counter
    --counter

    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a == b)
    println(a != b)
}