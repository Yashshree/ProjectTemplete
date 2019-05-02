package com.app.projecttemplete.application

import android.app.Application
import com.app.projecttemplete.utils.SharedPreferenceUtil

class Application: Application() {
    override fun onCreate() {
        super.onCreate()
        SharedPreferenceUtil.initialize(applicationContext)
    }
}