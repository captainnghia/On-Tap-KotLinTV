package com.example.jetpackdemo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.supervisorScope

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        var l = listOf(1,2,3)
//        try {
//            var r = l[5]
//        } catch (e: IllegalAccessException) {
//
//        } catch (e: Exception){
//            when (e) {
//                is ArrayIndexOutOfBoundsException -> Log.i("TAG","catch $e")
//                is AssertionError -> Log.i("TAG","catch 2 $e")
//                else -> throw e
//            }
//        } finally {
//            Log.i("TAG","finally")
//        }

        val handler = CoroutineExceptionHandler { c, t ->
            Log.i("TAG", "Catch error from handler $t")
        }
        CoroutineScope(Dispatchers.Default).launch(handler) {

            supervisorScope {
                launch {
                    //try catch for each launch
                    Log.i("TAG", "Start 1")
                    delay(100)
                    throw Exception("test ex")
                    Log.i("TAG", "End 1")
                }
                launch {
                    Log.i("TAG", "Start 2")
                    delay(200)
                    Log.i("TAG", "End 2")
                }
            }
        }
    }
}