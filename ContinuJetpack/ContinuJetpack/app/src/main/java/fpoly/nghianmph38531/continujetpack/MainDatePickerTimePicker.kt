package fpoly.nghianmph38531.continujetpack/*package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TimePicker
import androidx.compose.material3.TimePickerDefaults
import androidx.compose.material3.TimePickerLayoutType
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var datePickerState = rememberDatePickerState()
    var datePickerState2 = rememberDatePickerState()
    var showDatePicker by remember { mutableStateOf(false) }


    var timePickerState = rememberTimePickerState()
    var timePickerState2 = rememberTimePickerState()
    var showTimePicker by remember { mutableStateOf(false) }

    Column(Modifier.verticalScroll(rememberScrollState())) {
        DatePicker(
            state = datePickerState,
            title = { Text(text = "title") },
            headline = { Text(text = "headline") },
            colors = DatePickerDefaults.colors(weekdayContentColor = Color.Red),
            showModeToggle = true
        )
        Text(
            text = "Date Picker: ${datePickerState.selectedDateMillis}",
            modifier = modifier
        )
        Button(onClick = { showDatePicker = true }) {
            Text(text = "Show Date Picker")
        }
        TimePicker(
            state = timePickerState,
            colors = TimePickerDefaults.colors(),
            layoutType = TimePickerLayoutType.Vertical
        )
        Text(
            text = "Time Picker: ${timePickerState.hour} : ${timePickerState.minute}",
            modifier = modifier
        )
        Button(onClick = { showTimePicker = true }) {
            Text(text = "Show Time Picker")
        }

        if (showDatePicker) {
            DatePickerDialog(
                onDismissRequest = { showDatePicker = false },
                confirmButton = {
                    TextButton(onClick = { showDatePicker = false }) {
                        Text(text = "Confirm")
                    }
                },
            ) {
                DatePicker(state = datePickerState2)
            }
        }
        if (showTimePicker) {
            AlertDialog(
                onDismissRequest = { showTimePicker = false },
            ) {
                Surface {

                    TimePicker(state = timePickerState2)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting("Android")
        }
    }
}
        */