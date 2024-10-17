//package fpoly.nghianmph38531.hexagon
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.animation.core.FastOutSlowInEasing
//import androidx.compose.animation.core.LinearEasing
//import androidx.compose.animation.core.RepeatMode
//import androidx.compose.animation.core.animateFloat
//import androidx.compose.animation.core.infiniteRepeatable
//import androidx.compose.animation.core.rememberInfiniteTransition
//import androidx.compose.animation.core.tween
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.offset
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Icon
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.draw.rotate
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//
//class PracticeTwoscreen : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MaterialTheme {
//                Surface {
//                    BeeGameScreen() // Call your Compose screen here
//                    BeeAnimationScreen1()
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun BeeGameScreen() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White)
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        // Top bar with hearts and coins
//        TopBar()
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Input box
//        InputBox()
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Bee and hexagonal grid
//        BeeAndHexGrid()
//    }
//}
//
//@Composable
//fun TopBar() {
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Icon(
//            painter = painterResource(id = R.drawable.ic_arrow_back), // replace with actual back arrow resource
//            contentDescription = "Back",
//            modifier = Modifier.size(24.dp)
//        )
//
//        Row(
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text("5", fontSize = 20.sp, color = Color.Red)
//            Icon(
//                painter = painterResource(id = R.drawable.ic_heart), // replace with heart icon resource
//                contentDescription = "Hearts",
//                tint = Color.Red,
//                modifier = Modifier.size(24.dp)
//            )
//
//            Spacer(modifier = Modifier.width(16.dp))
//
//            Text("100", fontSize = 20.sp, color = Color.Yellow)
//            Icon(
//                painter = painterResource(id = R.drawable.ic_coin), // replace with coin icon resource
//                contentDescription = "Coins",
//                tint = Color.Yellow,
//                modifier = Modifier.size(24.dp)
//            )
//        }
//    }
//}
//
//@Composable
//fun InputBox() {
//
//    Spacer(modifier = Modifier.height(50.dp))
//
//    Box(
//        modifier = Modifier
//            .padding(16.dp)
//            .background(Color(android.graphics.Color.parseColor("#FFF192"))) // Nền màu từ mã màu HEX
//            .padding(40.dp) // Padding bên trong box
//            .clip(RoundedCornerShape(30.dp))
//
//    ) {
//        Text(
//            text = "Đây là đoạn văn bản trong khung có viền và nền màu vàng.",
//            color = Color.Black // Màu chữ
//        )
//    }
//}
//
//
//@Composable
//fun BeeAndHexGrid() {
//    Box(
//        contentAlignment = Alignment.TopEnd,
//        modifier = Modifier.fillMaxWidth()
//    ) {
////        Image(
////            painter = painterResource(id = R.drawable.picture_ani), // replace with bee drawable
////            contentDescription = "Bee",
////            contentScale = ContentScale.Fit,
////            modifier = Modifier.size(80.dp)
////        )
//    }
//
//    Spacer(modifier = Modifier.height(50.dp))
//
//    // Hexagonal grid with center hexagon and surrounding ones
//    HexGrid()
//}
//
//// animation
//@Composable
//fun BouncingBeee(modifier: Modifier = Modifier) {
//    val infiniteTransition = rememberInfiniteTransition()
//
//    val verticalOffset by infiniteTransition.animateFloat(
//        initialValue = 0f,
//        targetValue = 30f,
//        animationSpec = infiniteRepeatable(
//            animation = tween(durationMillis = 1000, easing = FastOutSlowInEasing),
//            repeatMode = RepeatMode.Reverse
//        )
//    )
//
//    val horizontalOffset by infiniteTransition.animateFloat(
//        initialValue = 0f,
//        targetValue = 15f,
//        animationSpec = infiniteRepeatable(
//            animation = tween(durationMillis = 2000, easing = LinearEasing),
//            repeatMode = RepeatMode.Reverse
//        )
//    )
//
//    val rotation by infiniteTransition.animateFloat(
//        initialValue = -5f,
//        targetValue = 5f,
//        animationSpec = infiniteRepeatable(
//            animation = tween(durationMillis = 500, easing = LinearEasing),
//            repeatMode = RepeatMode.Reverse
//        )
//    )
//
//
//    Box(modifier = modifier) {
//        Image(
//            painter = painterResource(id = R.drawable.picture_ani), // Replace with your bee image resource
//            contentDescription = "Bouncing Bee",
//            modifier = Modifier
//                .size(100.dp)
//                .offset(x = horizontalOffset.dp, y = -verticalOffset.dp)
//                .rotate(rotation)
//        )
//    }
//}
//@Composable
//fun BeeAnimationScreen1() {
//    Box(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        BouncingBeee(
//            modifier = Modifier
//                .align(Alignment.TopEnd)
//                .padding(end = 16.dp)
//        )
//    }
//}
