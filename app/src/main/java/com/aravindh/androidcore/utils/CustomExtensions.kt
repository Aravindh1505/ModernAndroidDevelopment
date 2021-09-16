package com.aravindh.androidcore.utils

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.aravindh.androidcore.R
import com.google.android.material.snackbar.Snackbar


fun Activity.showToast(message: String) {
    showToastMessage(this, message)
}

fun Fragment.showToast(message: String) {
    showToastMessage(requireContext(), message)
}

fun Activity.showSnackBar(message: String) {
    showSnackBar(this, message)
}

fun Fragment.showSnackBar(message: String) {
    showSnackBar(requireActivity(), message)
}


fun showToastMessage(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}


fun showSnackBar(
    activity: Activity, message: String, action: String? = null,
    actionListener: View.OnClickListener? = null, duration: Int = Snackbar.LENGTH_SHORT
) {
    val snackBar = Snackbar.make(activity.findViewById(android.R.id.content), message, duration)
    if (action != null && actionListener != null) {
        snackBar.setAction(action, actionListener)
    }
    snackBar.show()
}