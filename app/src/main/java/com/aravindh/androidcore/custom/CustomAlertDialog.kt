package com.aravindh.androidcore.custom

import android.content.Context
import androidx.appcompat.app.AlertDialog
import java.lang.NullPointerException

object CustomAlertDialog {

    fun showCustomDialog(context: Context?, cancelable: Boolean = true) {
        if (context == null) {
            throw NullPointerException("Context should be not null")
        }

        AlertDialog.Builder(context)
            .setTitle("This is my Title")
            .setMessage("This is my sample messge")
            .setCancelable(cancelable)
            .show()
    }

}

