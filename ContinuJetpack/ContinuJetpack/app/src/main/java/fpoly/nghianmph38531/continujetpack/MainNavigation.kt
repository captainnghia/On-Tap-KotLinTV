package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
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
                    Navigation()
                }
            }
        }
    }
}

sealed class Screen(val route: String, val title: String) {
    object Home : Screen("home", "Home")
    object Detail : Screen("detail", "Detail")
}

@Composable
fun Navigation() {
    val navController = rememberNavController()

    //scaffold check back navController.previousBackStackEntry != null

    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(navController, it.savedStateHandle.get<String>("result"))
        }
        // advanced: using json (send object) + base64 (prevent '/' in route)
        composable(
            Screen.Detail.route + "/{arg1}/{arg2}", arguments = listOf(
                navArgument("arg1") { type = NavType.StringType },
                navArgument("arg2") { type = NavType.StringType },
            )
        ) { entry ->
            DetailScreen(
                navController,
                entry.arguments?.getString("arg1"),
                entry.arguments?.getString("arg2")
            )
        }
    }
}

@Composable
fun HomeScreen(navController: NavHostController, result: String?) {
    Column {
        Text("Return result: $result")
        TextButton(onClick = { navController.navigate("${Screen.Detail.route}/A/aa") }) {
            Text("A")
        }
        TextButton(onClick = { navController.navigate("${Screen.Detail.route}/B/bcd") }) {
            Text("B")
        }
    }
}

@Composable
fun DetailScreen(navController: NavHostController, arg1: String?, arg2: String?) {
    Column {
        Text("Detail content: $arg1, $arg2")
        TextButton(onClick = {
            navController.previousBackStackEntry?.savedStateHandle?.set("result", "$arg2$arg1")
            navController.popBackStack()
        }) {
            Text("Back")
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
            Navigation()
        }
    }
}