package com.aravindh.androidcore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aravindh.androidcore.ui.theme.MyApplicationTheme
import com.aravindh.androidcore.ui.theme.MyTheme


class ProfileCardActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray
    ) {
        Column {
            ProfileCard()
        }
    }
}

@Composable
fun ProfileCard() {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top),
        elevation = CardDefaults.cardElevation(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            ProfileImage()
            Spacer(modifier = Modifier.width(10.dp))
            ProfileContent()
        }
    }
}

@Composable
fun ProfileImage() {
    Card(
        modifier = Modifier
            .size(56.dp)
            .padding(2.dp),
        shape = CircleShape,
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        border = BorderStroke(width = 1.dp, color = MyTheme.colors.profileCircle),
    ) {
        Image(
            painterResource(MyTheme.icons.ic_profile),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Composable
fun ProfileContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Text(
            text = "Aravindh Samidurai",
            style = MyTheme.typography.title4,
            color = Color.Black
        )

        Text(
            text = "Active now",
            style = MyTheme.typography.body3,
            color = Color.DarkGray
        )
    }

}

@Preview
@Composable
fun MainPreview() {
    MyApplicationTheme {
        MainScreen()
    }
}