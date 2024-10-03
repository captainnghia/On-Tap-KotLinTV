package fpoly.nghianmph38531.jetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fpoly.nghianmph38531.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BaseItem(color: Color) {
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(color)
    )
}

@Composable
fun BaseItem2(modifier: Modifier) {
    Box(
        modifier = Modifier
            .size(100.dp)
    )
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    //1. Box and Modifier
    /*  Box(
          modifier = Modifier
              .background(color = Color.LightGray)
              .padding(20.dp)
              .size(200.dp)

      ) {
          Box(
              modifier = modifier

                  .fillMaxWidth()
                  .height(200.dp)
                  .border(
                      border = BorderStroke(4.dp, Color.Blue),
                      shape = RoundedCornerShape(30.dp)
                  )
                  .clip(
                      shape = RoundedCornerShape(
                          topStart = 10.dp,
                          topEnd = 20.dp,
                          bottomEnd = 30.dp,
                          bottomStart = 70.dp
                      )
                  )
                 // .background(Color.Red)
              , contentAlignment = Alignment.Center
          ){
              Box(
                  Modifier
                      .size(100.dp)
                      .shadow(
                          50.dp,
                          RoundedCornerShape(10.dp),
                          spotColor = Color.Green,
                          ambientColor = Color.Green
                      )
                      .background(Color.Blue)
              )
              Box(
                  Modifier
                      .size(50.dp)
                      .shadow(
                          50.dp,
                          RoundedCornerShape(10.dp),
                          spotColor = Color.Green,
                          ambientColor = Color.Green
                      )
                      .background(Color.White)
              )
          }
      }*/

    //2. Row and Column
    /*  Box {
          Row (
              Modifier
                  .background(color = Color.LightGray)
                  .fillMaxWidth()
                  .height(200.dp)
              , horizontalArrangement =   Arrangement.SpaceBetween
              , Alignment.CenterVertically
          ){
  //            BaseItem2(Modifier.background(Color.Red).align( Alignment.TopStart))
              BaseItem(Color.Green)
              BaseItem(Color.Yellow)
          }
      }*/

    //3 Row , Column kết hợp với Weight
    /* Box {
         Row(
             Modifier
                 .fillMaxWidth()
                 .height(200.dp)
                 .background(Color.LightGray), Arrangement.Center, Alignment.CenterVertically
         ) {
             Box(
                 Modifier
                     .size(100.dp)
                     .background(Color.Green)
                     .weight(1f, false)
             )
             Box(
                 Modifier
                     .size(100.dp)
                     .background(Color.Yellow)
                     .weight(1f)
             )
             Box(
                 Modifier
                     .size(100.dp)
                     .background(Color.Magenta)
                     .weight(1f)
             )
         }
     }*/

    // 4.Scroll trong column and row
    /*  Column (Modifier.verticalScroll(rememberScrollState())){
          Row(Modifier.horizontalScroll(rememberScrollState())) {
              repeat(10) {
                  Box(
                      modifier = Modifier
                          .size(100.dp)
                          .padding(10.dp)
                          .background(color = Color.Green)
                  )
              }
          }
          repeat(10){
              Box(
                  modifier = Modifier
                      .size(100.dp)
                      .padding(10.dp)
                      .background(color = Color.Green)
              )
          }
          Row(Modifier.horizontalScroll(rememberScrollState())) {
              repeat(10) {
                  Box(
                      modifier = Modifier
                          .size(100.dp)
                          .padding(10.dp)
                          .background(color = Color.Green)
                  )
              }
          }
      }
      */

    /*var offset by remember { mutableStateOf(Of) }
    Column(
        Modifier.scrollable(
            orientation = Orientation.Vertical,
            state = rememberScrollableState { delta ->
                offset += delta
                delta

            }
        )) {
        Text("")
    }*/

// 5. Text
// 6. Button
   /* Column {
        Button(onClick = { Log.i("TAG", "onClick") }
            , border = BorderStroke(2.dp, Color.Red)
            , colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)) {
            Text(text = "Button ")
            Icon(Icons.Filled.Favorite, "Favorite")
        }
        FilledTonalButton(
            onClick = { /*TODO*/ },
            contentPadding = PaddingValues(30.dp), enabled = false
        ) {
            Text(text = "FilledTonalButton")
        }
        ElevatedButton(
            onClick = { /*TODO*/ },
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 20.dp)
        ) {
            Text(text = "ElevatedButton")
        }
        OutlinedButton(
            onClick = { /*TODO*/ },
            shape = CutCornerShape(15.dp) //RoundedCornerShape(10.dp) , RectangleShape) {
        ) {
            Text(text = "OutlinedButton")
        }
        TextButton(onClick = { /*TODO*/ },
            modifier = Modifier.shadow(elevation = 2.dp, shape = CircleShape)) {
            Text(text = "TextButton")
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Favorite, "Favorite")
        }
    }*/




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