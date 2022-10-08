package com.aravindh.androidcore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.aravindh.androidcore.ui.theme.MyApplicationTheme


class ProfileCardActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                ProfileCard()
            }
        }
    }
}

@Composable
fun ProfileCard() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Text(text = "Hello")
    }
}

@Preview
@Composable
fun ProfileCardPreview() {
    ProfileCard()
}