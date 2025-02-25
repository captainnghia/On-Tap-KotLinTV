package fpoly.nghianmph38531.composemaps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.rememberCameraPositionState
import fpoly.nghianmph38531.composemaps.ui.theme.ComposeMapsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMapsTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { paddingValues ->
                    MapScreen(modifier = Modifier.padding(paddingValues))
                }

            }
        }
    }
}

@Composable
fun MapScreen(modifier: Modifier = Modifier) {

    val vietnamPosition = LatLng(21.0285, 105.8542) // Hà Nội
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(vietnamPosition, 10f)
    }

    GoogleMap(
        modifier = modifier.fillMaxSize(),
        cameraPositionState = cameraPositionState
    )
}
