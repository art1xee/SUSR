package com.example.susr.CardInfo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.susr.Student
import java.time.LocalDate

open class StudentInfo {

    @Composable
    public fun StudentScreen() {
        var selectedDate by remember { mutableStateOf(LocalDate.now()) }
        val student: List<Student> = getDummyStudents()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = "Выбранная дата: $selectedDate",
                modifier = Modifier.padding(bottom = 8.dp)
            )
            LazyColumn {
                items(student) { student ->
                    StudentItem(student)
                }
            }
        }
    }

    fun getDummyStudents(): List<Student> {
        return listOf(
            Student(
                id = 1,
                fullName = "Иванов Иван Иванович",
                group = "ІПЗ112-К9",
                faculty = "Факультет Інформатики",
                contacts = "ivanov@example.com"
            ),
            Student(
                id = 2,
                fullName = "Петров Петр Петрович",
                group = "ІПЗ112-К9",
                faculty = "Факультет Інформатики",
                contacts = "petrov@example.com"
            ),
            Student(
                id = 3,
                fullName = "Сидоров Сидр Сидорович",
                group = "ІПЗ112-К9",
                faculty = "Факультет Інформатики",
                contacts = "sidorov@example.com"
            )
        )
    }

    @Composable
    fun StudentItem(student: Student) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("ФИО: ${student.fullName}")
                Text("Группа: ${student.group}")
                Text("Факультет: ${student.faculty}")
                Text("Контакты: ${student.contacts}")
            }
        }
    }


}