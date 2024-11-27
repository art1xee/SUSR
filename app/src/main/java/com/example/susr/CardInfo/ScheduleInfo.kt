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
import com.example.susr.Schedule
import com.example.susr.Subject
import com.example.susr.Teacher
import java.time.LocalDate

class ScheduleInfo {

    @Composable
    fun ScheduleScreen() {
        var selectedDate by remember { mutableStateOf(LocalDate.now()) }
        val schedules: List<Schedule> = remember { getDummySchedules() }

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
                items(schedules) { schedule ->
                    ScheduleItem(schedule)
                }
            }
        }
    }

    fun getDummySchedules(): List<Schedule> {
        return listOf(
            Schedule(
                id = 1,
                date = "2024-04-15",
                time = "9:00",
                classroom = "301",
                group = "ІПЗ112-К9",
                subject = Subject(1, "Программирование", 72, 1),
                teacher = Teacher(
                    id = 1,
                    fullName = "Иванов И.И.",
                    department = "Кафедра ИТ",
                    position = "Доцент",
                    contacts = "ivanov@example.com"
                )
            ),
            Schedule(
                id = 2,
                date = "2024-04-15",
                time = "11:00",
                classroom = "305",
                group = "ІПЗ112-К9",
                subject = Subject(2, "Алгоритмы", 64, 2),
                teacher = Teacher(
                    id = 2,
                    fullName = "Петров П.П.",
                    department = "Кафедра ИТ",
                    position = "Ассистент",
                    contacts = "petrov@example.com"
                )
            )
        )
    }

    @Composable
    fun ScheduleItem(schedule: Schedule) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Дата: ${schedule.date}")
                Text("Время: ${schedule.time}")
                Text("Аудитория: ${schedule.classroom}")
                Text("Группа: ${schedule.group}")
            }
        }
    }
}





