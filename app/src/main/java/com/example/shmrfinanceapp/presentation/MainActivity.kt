package com.example.shmrfinanceapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.shmrfinanceapp.presentation.navigation.NavScreen
import com.example.shmrfinanceapp.presentation.theme.ShmrFinanceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        installSplashScreen()
        setContent {
            ShmrFinanceAppTheme {
                NavScreen()
            }
        }
    }
}

