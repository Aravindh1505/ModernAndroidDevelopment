package com.aravindh.androidcore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.aravindh.androidcore.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(viewModel: MainViewModel = MainViewModel()) {
    val nameList = remember { mutableStateListOf("") }

    val name = viewModel.name.observeAsState("")

    Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GreetingList(
                nameList = nameList, buttonClick = {
                    nameList.add(name.value)
                    viewModel.updateName("")
                }, viewModel = viewModel, name = name
            )
        }
    }
}

@Composable
private fun GreetingList(
    nameList: List<String>, buttonClick: () -> Unit, viewModel: MainViewModel, name: State<String>
) {
    for (names in nameList) {
        Text(text = names)
    }

    BasicTextField(value = name.value, onValueChange = { text -> viewModel.updateName(text) })

    Button(onClick = buttonClick) { Text(text = "Add Name") }
}


@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}
