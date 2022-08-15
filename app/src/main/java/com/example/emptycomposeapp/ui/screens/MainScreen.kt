package com.example.emptycomposeapp.ui.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.emptycomposeapp.R
import com.example.emptycomposeapp.ui.theme.EmptyComposeAppTheme

@Composable
fun MainScreen() {
    Text(text = stringResource(id = R.string.hello_android))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EmptyComposeAppTheme(useSystemUIController = false) {
        MainScreen()
    }
}