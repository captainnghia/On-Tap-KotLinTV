package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var list = listOf("a", "b", "c", "d", "e", "f", "g", "h")

    Column {
//        LazyColumn(  //LazyRow
//            contentPadding = PaddingValues(10.dp),
//            verticalArrangement = Arrangement.spacedBy(5.dp),
//            //horizontalAlignment = Alignment.CenterHorizontally,
//            //reverseLayout = true
//            //userScrollEnabled = false
//            modifier = Modifier.weight(1f)
//        ) {
//            item {
//                Box(
//                    modifier = Modifier
//                        .size(200.dp)
//                        .padding(10.dp)
//                        .background(color = Color.Red),
//                    contentAlignment = Alignment.Center
//                ) {
//                    Text(text = "Header")
//                }
//            }
//            items(list.size) {  //items(list.size, key = { it.id }) {
//                Box(
//                    modifier = Modifier
//                        .size(200.dp)
//                        .padding(10.dp)
//                        .background(color = Color.Green),
//                    contentAlignment = Alignment.Center
//                ) {
//                    Text(text = list[it])
//                }
//            }
//            item {
//                Box(
//                    modifier = Modifier
//                        .size(200.dp)
//                        .padding(10.dp)
//                        .background(color = Color.Blue),
//                    contentAlignment = Alignment.Center
//                ) {
//                    Text(text = "Footer")
//                }
//            }
//        }
//
//        LazyColumn(
//            contentPadding = PaddingValues(10.dp),
//            verticalArrangement = Arrangement.spacedBy(5.dp),
//            //horizontalAlignment = Alignment.CenterHorizontally,
//            //reverseLayout = true
//            //userScrollEnabled = false
//            modifier = Modifier.weight(1f)
//        ) {
//            for (i in 0..2) {
//                stickyHeader {
//                    Box(
//                        modifier = Modifier
//                            .size(200.dp)
//                            .padding(10.dp)
//                            .background(color = Color.Red),
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Text(text = "Header $i")
//                    }
//                }
//                items(list.size) {
//                    Box(
//                        modifier = Modifier
//                            .size(200.dp)
//                            .padding(10.dp)
//                            .background(color = Color.Green),
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Text(text = list[it])
//                    }
//                }
//            }
//        }


        LazyVerticalGrid( //LazyHorizontalGrid
            //columns = GridCells.Fixed(2),
            columns = GridCells.FixedSize(100.dp),
            contentPadding = PaddingValues(10.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp),
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            items(list) {
                Box(
                    modifier = Modifier
                        .size(200.dp)
                        .padding(10.dp)
                        .background(color = Color.Green),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = it)
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