package com.example.emptycomposeapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.emptycomposeapp.R
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