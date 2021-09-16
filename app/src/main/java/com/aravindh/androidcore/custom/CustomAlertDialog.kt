package com.aravindh.androidcore.custom

import android.content.Context
import android.content.DialogInterface
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.aravindh.androidcore.utils.CustomLogger
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import java.lang.NullPointerException
import javax.inject.Inject

class CustomAlertDialog {


    fun showCustomDialog(
        context: Context,
        title: String,
        message: String,
        positiveButtonClickListener: DialogInterface.OnClickListener? = null,
        negativeButtonClickListener: DialogInterface.OnClickListener? = null,
        cancelable: Boolean = true
    ) {
        AlertDialog.Builder(context)
            .setTitle(title)
            .setMessage(message)
            .setCancelable(cancelable)
            .setPositiveButton("Ok") { dialog, which ->
                CustomLogger.d("Positive Button Clicked...")
                positiveButtonClickListener?.onClick(dialog, which)
            }
            .setNegativeButton("Cancel") { dialog, which ->
                CustomLogger.d("Negative Button Clicked...")
                negativeButtonClickListener?.onClick(dialog, which)
            }
            .show()
    }


    fun testMethod(): String {
        return "Working...."
    }

}

