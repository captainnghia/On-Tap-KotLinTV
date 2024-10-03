package fpoly.nghianmph38531.batdongbo_coroutin

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackdemo.ui.theme.JetpackDemoTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("TAG", "Start")
//        GlobalScope.launch {
//            Log.i("TAG", "Start GlobalScope")
//            delay(1000)
//            Log.i("TAG", "End GlobalScope")
//        }
//        GlobalScope.launch {
//            Log.i("TAG", "Start GlobalScope 2")
//            delay(1000)
//            Log.i("TAG", "End GlobalScope 2")
//        }
        //delay(2000)

//        GlobalScope.launch {
//            Log.i("TAG", "Start GlobalScope")
//            var job = launch {
//                Log.i("TAG", "Start launch")
//                delay(3000)
//                Log.i("TAG", "End launch")
//            }
//            //job.join()
//
//            var a = async {
//                Log.i("TAG", "Start async")
//                delay(2000)
//                Log.i("TAG", "End async")
//                compute()
//            }
//            //Log.i("TAG", "async ${a.await()}")
//            joinAll(job, a)
//
//            Log.i("TAG", "End GlobalScope")
//        }

//        CoroutineScope(Dispatchers.IO).launch {
//            Log.i("TAG", "Start io")
//            delay(1000)
//            withContext(Dispatchers.Main) {
//                //update ui
//            }
//            Log.i("TAG", "End io")
//        }

//        GlobalScope.launch {
//            val job = launch {
//                try {
//                    for (i in 0..10) {
//                        println(i)
//                        //Thread.sleep(1000)
//                        delay(1000)    //cancel by check job.isActive to exit or ensureActive ()
//                        //compute()
//                    }
//                } finally {
//                    println("cancelled")
//                }
//            }
//            delay(1500)
//            println("Cancel job")
//            job.cancel()
//        }

//        runBlocking {
//            var job = launch {
//                Log.i("TAG", "Start launch")
//                delay(2000)
//                Log.i("TAG", "End launch")
//            }
//
//            var job2 = launch {
//                Log.i("TAG", "Start launch2")
//                delay(1000)
//                Log.i("TAG", "End launch2")
//            }
//            Log.i("TAG", "End runBlocking")
//        }

//        runBlocking {
//            var job = launch {
//                launch {
//                    Log.i("TAG", "Start launch")
//                    delay(1000)
//                    Log.i("TAG", "End launch")
//                }
//                launch {
//                    Log.i("TAG", "Start launch2")
//                    delay(2000)
//                    Log.i("TAG", "End launch2")
//                }
//
//                GlobalScope.launch {
//                    Log.i("TAG", "Start launch g")
//                    delay(2000)
//                    Log.i("TAG", "End launch g")
//                }
//            }
//            delay(500)
//            job.cancel()
//            Log.i("TAG", "End runBlocking")
//        }

        //viewmodelscope..

        Log.i("TAG", "End")
    }

    suspend fun compute() {
        Log.i("TAG", "Start compute")
        //delay(1000)
        Log.i("TAG", "End compute")
        1
    }
}