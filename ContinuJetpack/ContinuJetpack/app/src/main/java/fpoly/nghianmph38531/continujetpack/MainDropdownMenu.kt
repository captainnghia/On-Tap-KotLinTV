package fpoly.nghianmph38531.continujetpack/*package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
    var isExpanded by remember {
        mutableStateOf(false)
    }
    var isExpanded2 by remember {
        mutableStateOf(false)
    }
    var text by remember {
        mutableStateOf("")
    }
    Column {
        Row {
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = { isExpanded = !isExpanded }) {
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
                DropdownMenu(expanded = isExpanded, onDismissRequest = { !isExpanded }) {
                    DropdownMenuItem(
                        text = { Text("Refresh") },
                        onClick = { isExpanded = false },
                        trailingIcon = {
                            Icon(
                                imageVector = Icons.Default.Refresh,
                                contentDescription = null
                            )
                        })
                    Divider()
                    DropdownMenuItem(
                        text = { Text("Setting") },
                        onClick = { isExpanded = false },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Settings,
                                contentDescription = null
                            )
                        })
                }
            }
            Spacer(modifier = Modifier.weight(1f))
        }

        ExposedDropdownMenuBox(expanded = isExpanded2, onExpandedChange = {
            isExpanded2 = !isExpanded2
        }) {
            TextField(value = text, onValueChange = {},
                readOnly = true,
                modifier = Modifier.menuAnchor(),
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded2) })

            ExposedDropdownMenu(expanded = isExpanded2, onDismissRequest = { !isExpanded2 }) {
                for (i in 0..2) {
                    DropdownMenuItem(text = { Text(text = "Choose $i") }, onClick = {
                        isExpanded2 = false
                        text = "$i"
                    })
                }
            }
        }

        Box(
            Modifier
                .fillMaxSize()
                .background(color = Color.Green)
        ) {}
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