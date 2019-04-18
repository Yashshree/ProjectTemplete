package com.app.projecttemplete.utils

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.widget.Toast
import com.app.projecttemplete.listeners.OnAlertDialogRespondListener
import java.time.Duration
import android.support.v4.view.accessibility.AccessibilityEventCompat.setAction
import android.graphics.Color
import android.support.design.widget.Snackbar
import android.view.View
import com.app.projecttemplete.R
import com.app.projecttemplete.listeners.OnSnackbarButtonClicked


fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

fun Context.showAlertDialog(
    title: String, message: String, isPositiveButtonEnabled: Boolean = true,
    isNegativeButtonEnabled: Boolean = true, isNeutralButtonEnabled: Boolean = false,
    positiveButtonMessage: String = getString(R.string.txt_ok),
    negativeButtonMessage: String = getString(R.string.txt_Cancel),
    neutralButtonMessage: String = getString(R.string.txt_no),
    listener: OnAlertDialogRespondListener
) {
    val builder = AlertDialog.Builder(this)
    builder.setTitle(title)
    builder.setMessage(message)

    if (isPositiveButtonEnabled) {
        builder.setPositiveButton(
            positiveButtonMessage
        ) { dialog, which -> listener.onPositiveButtonClicked() }
    }

    if (isNegativeButtonEnabled) {
        builder.setNegativeButton(
            negativeButtonMessage
        ) { dialog, which -> listener.onNegativeButtonClicked() }
    }

    if (isNeutralButtonEnabled) {
        builder.setNeutralButton(
            neutralButtonMessage
        ) { dialog, which -> listener.onNeutralButtonClicked() }
    }
    builder.show()
}

fun showSnackBar(
    view: View,
    color: Int,
    message: String,
    actionString: String? = null,
    listener: OnSnackbarButtonClicked,
    duration: Int = Snackbar.LENGTH_INDEFINITE
) {
    val snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG)
    if (actionString != null) {
        snackbar.setAction(actionString) {
            listener.onSnackbarButtonClicked(actionString)
        }
    }
    snackbar.setActionTextColor(color).setDuration(duration)
        .show()
}

fun showView(view: View) {
    view.visibility = View.VISIBLE
}

fun hideView(view: View) {
    view.visibility = View.GONE
}
