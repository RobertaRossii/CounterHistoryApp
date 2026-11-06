package com.example.imagelocationdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.imagelocationdemo.ui.theme.ImageLocationDemoTheme
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.imagelocationdemo.R


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImageLocationDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ResourceExample()

                }
            }
        }
    }
}


@Composable
fun ResourceExample() {
    Image(
        painter = painterResource(id = R.drawable.geolocation),
        contentDescription = "Geolocation map",
    )
}