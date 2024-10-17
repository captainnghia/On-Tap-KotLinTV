package fpoly.nghianmph38531.continujetpack/*package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.sharp.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Card(
            Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(4.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Yellow),
            border = BorderStroke(2.dp, Color.Green)
        ) {
            Text(text = "Hello", modifier = Modifier.padding(8.dp))
            ListItem(
                leadingContent = {
                    Icon(
                        imageVector = Icons.Sharp.Delete,
                        contentDescription = null
                    )
                },
                //overlineContent = { Text(text = "overlineContent") },
                headlineContent = { Text(text = "headlineContent") },
                supportingContent = { Text(text = "supportingContent") },
                trailingContent = {
                    Icon(
                        imageVector = Icons.Rounded.Delete,
                        contentDescription = null
                    )
                },
                colors = ListItemDefaults.colors(Color.Red)
            )
        }

        Card(
            Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Hello", modifier = Modifier.padding(8.dp))
        }

        ElevatedCard(
            Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Hello", modifier = Modifier.padding(8.dp))
        }

        OutlinedCard(
            Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Hello", modifier = Modifier.padding(8.dp))
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