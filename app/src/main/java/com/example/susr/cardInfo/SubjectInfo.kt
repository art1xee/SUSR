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


data class Subject(
    val id: Int,
    val name: String,
    val hours: Int,
    val semester: Int,
)

@Composable
fun SubjectScreen(
    subject: List<Subject>
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
            items(subject) { subject ->
                SubjectItem(
                    name = subject.name,
                    hours = subject.hours,
                    semester = subject.semester,
                )
            }
        }
    }
}


fun getDummySubjects(): List<Subject> {
    return listOf(
        Subject(
            id = 1,
            name = "Программирование",
            hours = 72,
            semester = 1
        ),
        Subject(
            id = 2,
            name = "Алгоритмы",
            hours = 64,
            semester = 2
        ),
        Subject(
            id = 3,
            name = "Математика",
            hours = 80,
            semester = 1
        ),
        Subject(
            id = 4,
            name = "История",
            hours = 48,
            semester = 3
        )
    )
}


@Composable
fun SubjectItem(
    name: String,
    hours: Int,
    semester: Int,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Название: $name")
            Text("Часы: $hours")
            Text("Семестр: $semester")
        }
    }
}

