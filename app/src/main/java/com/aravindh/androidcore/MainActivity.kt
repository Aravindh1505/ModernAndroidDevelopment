package com.aravindh.androidcore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Android")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(color = Color.Yellow)
            .padding(5.dp),
        horizontalAlignment = Alignment.Start,
    ) {
        CustomText(text = "Hello $name!")
        CustomText(text = "Hello $name!")
        CustomText(text = "Hello $name!")
        CustomText(text = "Hello $name!")
        CustomText(text = "Hello $name!")
        CustomText(text = "Hello $name!")

    }

}

@Composable
fun CustomText(text: String) {
    Text(
        text = "Hello $text!",
        modifier = Modifier
            .padding(5.dp)
            .clickable {
                println("Clicked!")
            }
    )
}