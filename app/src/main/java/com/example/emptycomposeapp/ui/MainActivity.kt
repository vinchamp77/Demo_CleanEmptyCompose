package com.example.emptycomposeapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.emptycomposeapp.ui.screens.MainScreen
import com.example.emptycomposeapp.ui.theme.EmptyComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmptyComposeAppTheme {
                MainScreen()
            }
        }
    }
}