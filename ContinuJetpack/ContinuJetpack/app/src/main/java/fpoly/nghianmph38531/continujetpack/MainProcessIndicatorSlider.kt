package fpoly.nghianmph38531.continujetpack/*package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var sliderPosition by remember { mutableStateOf(0f) }
    var sliderPosition2 by remember { mutableStateOf(0.2f..0.6f) }
    Column {
        CircularProgressIndicator()
        CircularProgressIndicator(
            progress = 0.6f,
            color = Color.Red,
            trackColor = Color.Green,
            strokeCap = StrokeCap.Round,
            strokeWidth = 10.dp
        )
        LinearProgressIndicator()
        Spacer(modifier = Modifier.height(10.dp))
        LinearProgressIndicator(
            progress = 0.3f,
            color = Color.Red,
            trackColor = Color.Blue,
            modifier = Modifier.height(20.dp)
        )
        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            steps = 10,
            valueRange = 0f..5f,
            colors = SliderDefaults.colors(thumbColor = Color.Red)
        )
        Text("$sliderPosition")
        RangeSlider(
            value = sliderPosition2,
            onValueChange = { sliderPosition2 = it },
            valueRange = 0.1f..4f,
        )
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