package com.app.projecttemplete.utils

import android.content.Context
import com.app.projecttemplete.models.LoginResponse
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.google.gson.GsonBuilder
import org.jetbrains.annotations.NotNull

abstract class SharedPreferenceUtil {

    companion object {
        /* @Volatile
         var INSTANCE: SharedPreferenceUtil? = null
 */

        private var sharedPreference: SharedPreferences? = null

        fun initialize(context: Context) {
            if (sharedPreference == null)
                sharedPreference = context.getSharedPreferences("", Context.MODE_PRIVATE)
        }


        fun saveLoginData(data: String) {
            sharedPreference!!.edit()
                .putString(SharedPreferenceConstants.LOGIN_DATA, data).apply()
        }

        fun getLoginData(): LoginResponse? {

            val data = sharedPreference!!
                .getString(SharedPreferenceConstants.LOGIN_DATA, "")

            /*     if (data != "")
                     return GsonBuilder().create().fromJson(data, LoginResponse::class.java)
                 else
                     return null*/

            return if (data != "") GsonBuilder().create().fromJson(data, LoginResponse::class.java)
            else
                null
        }





    }


}