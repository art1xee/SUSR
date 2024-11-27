package lesson_19


//fun main() {
//
//    val statusesFromServer = listOf(101, 102, 103)
//
//    for (i in statusesFromServer) {
//        when (i) {
//            Status.NEW.id -> setStatus(Status.NEW)
//            Status.COOKING.id -> setStatus(Status.COOKING)
//            Status.COMPLETED.id -> setStatus(Status.COMPLETED)
//            else -> setStatus(Status.ERROR)
//        }
//        Thread.sleep(1000)
//    }
//
//    println()
//    println(Status.NEW.name)
//    println(Status.NEW.ordinal)
//    for (i in Status.values()) println(i)
//
//    println(Status.NEW.getStatusDescription())
//    println(Status.COOKING.getStatusDescription())
//    println(Status.COMPLETED.getStatusDescription())
//}
//
//
//enum class Status(val id: Int) {
//    NEW(101) {
//        override fun getStatusDescription(): String {
//            return "Order is apply and wait for pay"
//        }
//    },
//    COOKING(102) {
//        override fun getStatusDescription(): String {
//            return "Order is cooking"
//        }
//    },
//    COMPLETED(103) {
//        override fun getStatusDescription(): String {
//            return "Order is ready, enjoy!"
//        }
//    },
//    ERROR(0) {
//        override fun getStatusDescription(): String {
//            return "Oops.. Something went wrong, please try again"
//        }
//    };
//
//    abstract fun getStatusDescription(): String
//
//}
//
//fun setStatus(status: Status) {
//    when (status) {
//        Status.NEW -> println("Order is apply")
//        Status.COOKING -> println("Order is cooking")
//        Status.COMPLETED -> println("Order is completed")
//        Status.ERROR -> println("Error, please try again")
//    }
//}

fun main() {

  /* <- or you can do like this
     val statusesFromServer = listOf(101, 102, 103)
    for (i in statusesFromServer) {
        when (i) {
            Status.NEW.id -> setStatus(Status.NEW)
            Status.COOKING.id -> setStatus(Status.COOKING)
            Status.COMPLETED.id -> setStatus(Status.COMPLETED)
            else -> setStatus(Status.ERROR)
        }
        Thread.sleep(1000)
    }
   */

    val statusesFromServer = listOf(Status.NEW, Status.COOKING, Status.COMPLETED)

    for (status in statusesFromServer) {
        setStatus(status)
        Thread.sleep(1000)
    }
    println(Status.NEW.getStatusDescription())
    println(Status.COOKING.getStatusDescription())
    println(Status.COMPLETED.getStatusDescription())

}

enum class Status(val id: Int) {
    NEW(101) {
        override fun getStatusDescription(): String {
            return "Order is apply please pay him"
        }
    },
    COOKING(102) {
        override fun getStatusDescription(): String {
            return "Order is cooking"

        }
    },
    COMPLETED(103) {
        override fun getStatusDescription(): String {
            return "Order ready, enjoy yourself!"

        }
    },
    ERROR(0) {
        override fun getStatusDescription(): String {
            return "Oops... something went wrong, please try again"
        }
    };

    abstract fun getStatusDescription(): String
}

fun setStatus(status: Status) {
    when (status) {
        Status.NEW -> println("Order is apply")
        Status.COOKING -> println("Order is cooking")
        Status.COMPLETED -> println("Order is ready")
        Status.ERROR -> println("Error")
    }
}
