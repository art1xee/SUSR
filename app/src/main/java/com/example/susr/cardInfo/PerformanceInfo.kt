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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.time.LocalDate

data class Performance(
    val id: String,
    val student: String,
    val subject: String,
    val grade: Float,
    val date: String,
)

@Composable
fun PerformanceScreen(
    performances: List<Performance>,
) {
    val selectedDate by remember { mutableStateOf(LocalDate.now()) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Text(
            text = "Выбранная дата: $selectedDate",
            modifier = Modifier.padding(bottom = 8.dp)
        )
        LazyColumn {
            items(performances) { performances ->
                PerformanceItem(
                    student = performances.student,
                    subject = performances.subject,
                    grade = performances.grade,
                    date = performances.date,
                )
            }
        }
    }
}

fun getDummyPerformances(): List<Performance> {
    return listOf(
        Performance(
            id = "1",
            student = "Иванов Иван Иванович",
            subject = "Математика",
            grade = 4.5f,
            date = "2023-04-15"
        ),
        Performance(
            id = "2",
            student = "Петров Петр Петрович",
            subject = "Русский язык",
            grade = 3.8f,
            date = "2023-04-15"
        ),
        Performance(
            id = "3",
            student = "Сидоров Сидр Сидорович",
            subject = "Информатика",
            grade = 5.0f,
            date = "2023-04-15"
        )
    )
}

@Composable
fun PerformanceItem(
    student: String,
    subject: String,
    grade: Float,
    date: String,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Студент: $student")
            Text("Предмет: $subject")
            Text("Оценка: $grade")
            Text("Дата: $date")
        }
    }

}


