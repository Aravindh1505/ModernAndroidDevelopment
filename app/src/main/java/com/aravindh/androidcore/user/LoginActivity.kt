package com.aravindh.androidcore.user

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.aravindh.androidcore.MyApplication
import com.aravindh.androidcore.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    //private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val appContainer = (application as MyApplication).appContainer

        CoroutineScope(Dispatchers.IO).launch {
            val loginViewModel = LoginViewModel(appContainer.userRepository)
            val status = loginViewModel.accessData()
            println(status.body())
        }

    }
}