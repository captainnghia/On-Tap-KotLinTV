//package com.example.myapplication
//
//import android.os.Bundle
//import android.util.Log
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextButton
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.DisposableEffect
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
//import kotlinx.coroutines.delay
//import java.util.Timer
//import java.util.TimerTask
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            JetpackComposeTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }
//    }
//}
//
////https://developer.android.com/develop/ui/compose/side-effects
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    var isVisible by remember { mutableStateOf(true) }
//    Column {
//        TextButton(onClick = { isVisible = !isVisible }) {
//            Text(text = if (isVisible) "Hide" else "Show")
//        }
//        Test2(isVisible)
//    }
//}
//
//@Composable
//fun Test2(isVisible: Boolean) {
//    Log.i("TAG", "Start test2")
//    var seconds by remember { mutableStateOf(0) }
//    Text("Show $isVisible")
//    DisposableEffect(key1 = isVisible) {
//        Log.i("TAG", "DisposableEffect")
//        val timer = Timer()
//        timer.schedule(object : TimerTask() {
//            override fun run() {
//                seconds++
//            }
//        }, 0, 2000)
//
//        onDispose {
//            Log.i("TAG", "DisposableEffect onDispose")
//            timer.cancel()
//        }
//    }
//    Text(text = "Seconds: $seconds")
//    Log.i("TAG", "end test2")
//}
//
//@Composable
//fun Test() {
//    Log.i("TAG", "Start test")
//
//    var count by remember { mutableStateOf(0) }
//
//    LaunchedEffect(true) {
//        delay(1000)
//        Log.i("TAG", "LaunchedEffect true")
//    }
//    LaunchedEffect(Unit) {
//        delay(1500)
//        Log.i("TAG", "LaunchedEffect Unit")
//    }
//    LaunchedEffect(count) {
//        delay(500)
//        Log.i("TAG", "LaunchedEffect count $count")
//    }
//
//    TextButton(onClick = { count++ }) {
//        Text(text = "Count: $count")
//    }
//
//    Log.i("TAG", "End test")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    JetpackComposeTheme {
//        Surface(
//            modifier = Modifier.fillMaxSize(),
//            color = MaterialTheme.colorScheme.background
//        ) {
//            Greeting("Android")
//        }
//    }
//}