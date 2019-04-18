package com.app.projecttemplete.utils

import android.content.Context
import android.content.Context.CONNECTIVITY_SERVICE
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.util.Log

fun printLog(tag:String,message:String)
{
    Log.e(tag,message)
}

fun Context.isNetworkConnected():Boolean
{
        val connectivityManager=  getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
}