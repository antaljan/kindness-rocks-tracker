package com.antaljan.kindnessrockstracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.antaljan.kindnessrockstracker.screens.HomeScreen   // Beimportáljuk a screens mappából
import com.antaljan.kindnessrockstracker.screens.MapScreen    // Beimportáljuk a screens mappából
import com.antaljan.kindnessrockstracker.screens.CameraScreen // Beimportáljuk a screens mappából
import com.antaljan.kindnessrockstracker.ui.theme.KindnessRocksTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KindnessRocksTrackerTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination = "home") {
                        composable("home") {
                            HomeScreen(
                                onNavigateToMap = { navController.navigate("map") },
                                onNavigateToCamera = { navController.navigate("camera") }
                            )
                        }
                        composable("map") { MapScreen() }
                        composable("camera") { CameraScreen() }
                    }
                }
            }
        }
    }
}
