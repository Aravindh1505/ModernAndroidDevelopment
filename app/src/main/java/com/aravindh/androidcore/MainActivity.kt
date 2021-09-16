package com.aravindh.androidcore

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.aravindh.androidcore.custom.CustomAlertDialog
import com.aravindh.androidcore.navigator.AppNavigator
import com.aravindh.androidcore.navigator.AppNavigatorImpl
import com.aravindh.androidcore.navigator.Screens
import com.aravindh.androidcore.utils.CustomLogger
import com.aravindh.androidcore.utils.Resource
import com.aravindh.androidcore.utils.showSnackBar
import com.aravindh.androidcore.utils.showToast
import com.aravindh.androidcore.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var customAlertDialog: CustomAlertDialog

    @Inject
    lateinit var navigator: AppNavigatorImpl

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.data.observe(this, {
            CustomLogger.d(it?.status?.name)

            when (it.status) {
                Resource.Status.LOADING -> {

                }
                Resource.Status.SUCCESS -> {

                }
                Resource.Status.ERROR -> {
                    CustomLogger.d(it.message)
                }
            }
        })
    }

    fun ClickMe(view: View) {
        customAlertDialog.showCustomDialog(this, "Main Activity", "This is My Message",
            positiveButtonClickListener = { dialog, which ->
                navigator.navigateTo(Screens.BUTTONS)
            }, negativeButtonClickListener = { dialog, which ->
                navigator.navigateTo(Screens.LOGS)
            })
    }
}