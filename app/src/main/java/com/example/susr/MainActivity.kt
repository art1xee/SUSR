package com.example.susr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.susr.CardInfo.AttendanceInfo
import com.example.susr.CardInfo.PerformanceInfo
import com.example.susr.CardInfo.ScheduleInfo
import com.example.susr.CardInfo.StudentInfo
import com.example.susr.CardInfo.SubjectInfo
import com.example.susr.CardInfo.TeachersInfo
import com.example.susr.ui.theme.SUSRTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SUSRTheme {
                MainScreen()
            }
        }
    }
}

data class Student(
    val id: Int,
    val fullName: String,
    val group: String,
    val faculty: String,
    val contacts: String,
) {}

public data class Teacher(
    val id: Int,
    val fullName: String,
    val department: String,
    val position: String,
    val contacts: String,
) {}

public data class Subject(
    val id: Int,
    val name: String,
    val hours: Int,
    val semester: Int,
) {}

public data class Schedule(
    val id: Int,
    val date: String,
    val time: String,
    val classroom: String,
    val group: String,
    val subject: Subject,
    val teacher: Teacher,
) {}

public data class Attendance(
    val id: Int,
    val date: String,
    val student: String,
    val subject: String,
    val status: String,
) {}

public data class Performance(
    val id: String,
    val student: String,
    val subject: String,
    val grade: Float,
    val date: String,
) {}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Students", "Teachers", "Subjects", "Schedule", "Attendance", "Performance")
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("SUSR") }
            )
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            TabRow(selectedTabIndex = selectedTab) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        text = { Text(title) }
                    )
                }
            }
            when (selectedTab) {
                0 -> StudentInfo().StudentScreen()
                1 -> TeachersInfo().TeacherScreen()
                2 -> SubjectInfo().SubjectScreen()
                3 -> ScheduleInfo().ScheduleScreen()
                4 -> AttendanceInfo().AttendanceScreen()
                5 -> PerformanceInfo().PerformanceScreen()
            }
        }
    }
}




