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
import com.example.susr.Subject
import java.time.LocalDate

class SubjectInfo {

    @Composable
    fun SubjectScreen() {
        val selectedDate by remember { mutableStateOf(LocalDate.now()) }
        var subject: List<Subject> = remember { getDummySubjects() }
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
                items(subject) { subject ->
                    SubjectItem(subject)
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
    fun SubjectItem(subject: Subject) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Название: ${subject.name}")
                Text("Часы: ${subject.hours}")
                Text("Семестр: ${subject.semester}")
            }
        }
    }


}