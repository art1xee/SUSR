package com.example.susr.cardInfo

import android.util.Log
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


data class Attendance(
    val id: Int,
    val date: String,
    val student: String,
    val subject: String,
    val status: String,
)


@Composable
fun AttendanceScreenInfo(
    attendance: List<Attendance>,
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
            items(attendance) { attendance ->
                AttendanceItem(
                    student = attendance.student,
                    date = attendance.date,
                    subject = attendance.subject,
                    status = attendance.status,
                )
            }
        }

    }
}

fun getDummyAttendance(): List<Attendance> {
    return listOf(
        Attendance(
            id = 1,
            date = "2024-04-15",
            student = "Иванов И.И.",
            subject = "Программирование",
            status = "Присутствует"
        ),
        Attendance(
            id = 2,
            date = "2024-04-15",
            student = "Петров П.П.",
            subject = "Алгоритмы",
            status = "Отсутствует"
        ),
        Attendance(
            id = 3,
            date = "2024-04-16",
            student = "Сидоров С.С.",
            subject = "Математика",
            status = "Присутствует"
        ),
        Attendance(
            id = 4,
            date = "2024-04-16",
            student = "Козлов А.А.",
            subject = "Физика",
            status = "Пропуск"
        )
    )
}

@Composable
fun AttendanceItem(
    student: String,
    date: String,
    subject: String,
    status: String,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Студент: $student")
            Text("Дата: $date")
            Text("Предмет: $subject")
            Text("Статус: $status")
        }
    }
}



