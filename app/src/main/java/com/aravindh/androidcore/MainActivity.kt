package com.aravindh.androidcore

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.aravindh.androidcore.custom.CustomAlertDialog
import com.aravindh.androidcore.navigator.AppNavigator
import com.aravindh.androidcore.navigator.AppNavigatorImpl
import com.aravindh.androidcore.navigator.Screens
import com.aravindh.androidcore.utils.CustomLogger
import com.aravindh.androidcore.utils.showSnackBar
import com.aravindh.androidcore.utils.showToast
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var customAlertDialog: CustomAlertDialog

    @Inject
    lateinit var navigator: AppNavigatorImpl


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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