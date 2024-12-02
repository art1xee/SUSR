package com.example.susr.cardInfo

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


import java.time.LocalDate

data class Teacher(
    val id: Int,
    val fullName: String,
    val department: String,
    val position: String,
    val contacts: String,
)

@Composable
fun TeacherScreen(
    teachers: List<Teacher>
) {
    val selectedDate by remember { mutableStateOf(LocalDate.now()) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Current Date: $selectedDate",
            modifier = Modifier.padding(bottom = 8.dp)
        )
        LazyColumn {
            items(teachers) { teachers ->
                TeacherItem(
                    fullName = teachers.fullName,
                    department = teachers.department,
                    position = teachers.position,
                    contacts = teachers.contacts,
                )
            }
        }
    }
}


fun getDummyTeachers(): List<Teacher> {
    return listOf(
        Teacher(
            id = 1,
            fullName = "Иванов Иван Иванович",
            department = "Факультет Інформатики",
            position = "Доцент",
            contacts = "ivanov@example.com"
        ),
        Teacher(
            id = 2,
            fullName = "Петров Петр Петрович",
            department = "Факультет Інформатики",
            position = "Ассистент",
            contacts = "petrov@example.com"
        ),
        Teacher(
            id = 3,
            fullName = "Сидоров Сидр Сидорович",
            department = "Факультет Інформатики",
            position = "Старший преподаватель",
            contacts = "sidorov@example.com"
        ),
    )
}


@Composable
fun TeacherItem(
    fullName: String,
    department: String,
    position: String,
    contacts: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("ФИО: $fullName")
            Text("Отдел: $department")
            Text("Должность: $position")
            Text("Контакты: $contacts")
        }
    }
}


