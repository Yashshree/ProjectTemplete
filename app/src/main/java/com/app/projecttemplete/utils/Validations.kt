package com.app.projecttemplete.utils

fun isEmailValid(email:String)= android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()

fun isUrlValid(url:String)=android.util.Patterns.WEB_URL.matcher(url).matches()

fun isPhoneNumberValid(number:String)=android.util.Patterns.WEB_URL.matcher(number).matches()

