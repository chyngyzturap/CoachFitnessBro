package com.pharos.coachfitnessbro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.Navigator
import com.pharos.main_screen_api.MainScreenApi
import org.koin.compose.koinInject

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val mainScreenFeatureApi = koinInject<MainScreenApi>()
            MaterialTheme {
                Navigator(
                    mainScreenFeatureApi.mainScreen()
                )
            }
        }
    }
}