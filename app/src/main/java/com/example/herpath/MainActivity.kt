package com.example.herpath

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import android.view.LayoutInflater
import com.example.herpath.ui.theme.HerpathTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HerpathTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ShowLoginScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ShowLoginScreen(modifier: Modifier = Modifier) {
    // Inflate your layout XML
    AndroidView(factory = { context ->
        LayoutInflater.from(context).inflate(R.layout.activity_main, null)
    }, modifier = modifier)
}
