package vtsen.hashnode.dev.newemptycomposeapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.emptycomposeapp.ui.screens.MainScreen
import vtsen.hashnode.dev.newemptycomposeapp.ui.theme.NewEmptyComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewEmptyComposeAppTheme {
                MainScreen()
            }
        }
    }
}
