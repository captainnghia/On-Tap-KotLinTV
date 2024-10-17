package fpoly.nghianmph38531.continujetpack/*package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var openAlertDialog by remember { mutableStateOf(false) }
    var openBottomSheet by remember { mutableStateOf(false) }

    Column {
        ElevatedButton(onClick = { openAlertDialog = true }) {
            Text("Alert dialog")
        }
        ElevatedButton(onClick = { openBottomSheet = true }) {
            Text("Bottom sheet dialog")
        }
    }

    if (openAlertDialog) {
        AlertDialog(
            onDismissRequest = { openAlertDialog = false },
            title = { Text("Alert dialog") },
            text = { Text("This is an alert dialog") },
            confirmButton = {
                ElevatedButton(onClick = { openAlertDialog = false }) {
                    Text("Confirm")
                }
            },
            dismissButton = {
                ElevatedButton(onClick = { openAlertDialog = false }) {
                    Text("Dismiss")
                }
            }
        )
    }

    if (openBottomSheet) {
        ModalBottomSheet(
            onDismissRequest = { /*TODO*/ },
            shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
            scrimColor = Color.Yellow,
            containerColor = Color.Blue
        ) {
            Text(text = "Bottom sheet dialog")
            ElevatedButton(onClick = { openBottomSheet = false }) {
                Text(text = "Close bottom sheet")
            }
        }
    }
}

@Preview(showBackground = true, heightDp = 500)
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