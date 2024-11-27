package lesson_18

import java.util.Date

open class NotesAppItem() {
    open fun getItemData():String = ""
}

class MessageItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: String,
) : NotesAppItem() {
    override fun getItemData(): String {
        return ("Item: $title - added in the cell - $creationDate\n Type of item: $type \n Data: $data")
    }
}

class PhoneItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: Long,
) : NotesAppItem() {
    override fun getItemData(): String {
        return ("Item: $title - added in the cell - $creationDate\n Type of item: $type \n Data: $data")
    }

}

class ListItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: List<String>,
) : NotesAppItem() {
    override fun getItemData(): String {
        return ("Item: $title - added in the cell - $creationDate\n Type of item: $type \n Data: $data")
    }
}
