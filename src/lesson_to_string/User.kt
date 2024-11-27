package lesson_to_string

class User(
    private val firstName: String,
    private val lastName: String,
    private val age: Int,
) {
    override fun toString(): String {
        return "First name: $firstName\n Last name: $lastName\n Age:$age"
    }
}