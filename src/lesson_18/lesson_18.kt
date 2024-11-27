package lesson_18

import java.util.Date

fun main() {

    val creationDate: Date = Date()
    val note: NotesAppItem = NotesAppItem()


    val messageItem: NotesAppItem = MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congrats",
    )
    println()
    val phoneItem: NotesAppItem = PhoneItem(
        "sister`s number",
        creationDate,
        "phone",
        987654321,
    )
    println()
    val listItem: NotesAppItem = ListItem(
        "todoList",
        creationDate,
        "list",
        listOf("wash dog", "watch anime", "do homework"),
    )

//    println(messageItem.getItemData())
//    println()
//    println(phoneItem.getItemData())
//    println()
//    println(listItem.getItemData())

    val arrayOfNotes = arrayOf<NotesAppItem>(messageItem, phoneItem, listItem)
    showAllNotes(arrayOfNotes)
}

fun showAllNotes(notes: Array<NotesAppItem>) {
    notes.forEach {
        println(it.getItemData())
    }
}