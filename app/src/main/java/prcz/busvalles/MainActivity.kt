package prcz.busvalles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import prcz.busvalles.ui.theme.BusVallesTheme
import prcz.busvalles.navigation.NavigationWrapper

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusVallesTheme {
                // PRINCIPAL
                NavigationWrapper()
            }
        }
    }
}

