package fpoly.nghianmph38531.continujetpack/*package fpoly.nghianmph38531.continujetpack

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import kotlinx.coroutines.launch

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

data class TabItem(val text: String, val icon: ImageVector, val screen: @Composable () -> Unit)

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .background(color = Color.Red)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("HomeScreen")
    }
}

@Composable
fun SettingScreen() {
    Box(
        modifier = Modifier
            .background(color = Color.Green)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("SettingScreen")
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var tabIndex by remember {
        mutableStateOf(0)
    }
    var tabs = listOf(
        TabItem("Home", Icons.Default.Home) {
            HomeScreen()
        },
        TabItem("Setting", Icons.Default.Settings) {
            SettingScreen()
        }
    )
    var pagerState = rememberPagerState(
        pageCount = { tabs.size }
    )
    var coroutineScope = rememberCoroutineScope()

    Log.i("TAG", "start $tabIndex")
    Column {
        TabRow(selectedTabIndex = tabIndex) {
            tabs.forEachIndexed { index, tabItem ->
                Tab(text = { Text(tabItem.text) },
                    icon = { Icon(tabItem.icon, contentDescription = null) },
                    selected = tabIndex == index, onClick = {
                        coroutineScope.launch {
                            Log.i("TAG", "animateScrollToPage $index")
                            tabIndex = index
                            pagerState.animateScrollToPage(index)
                            //pagerState.scrollToPage(index)
                        }
                    })
            }
        }
        //https://m3.material.io/components/navigation-bar/overview
        //https://m3.material.io/components/navigation-drawer/overview
        //https://m3.material.io/components/navigation-rail/overview

        HorizontalPager(state = pagerState) {
            tabs[it].screen()
        }
        //VerticalPager
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
}*/