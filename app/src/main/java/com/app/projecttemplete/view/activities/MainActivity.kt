package com.app.projecttemplete.view.activities

import android.app.ProgressDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.app.projecttemplete.R
import com.app.projecttemplete.listeners.OnAlertDialogRespondListener
import com.app.projecttemplete.listeners.OnSnackbarButtonClicked
import com.app.projecttemplete.models.LoginResponse
import com.app.projecttemplete.utils.*
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_progressbar.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
        

/*
       val data= LoginResponse(1,"yashshree")

        val loginJson=GsonBuilder().create().toJson(data)

        SharedPreferenceUtil.saveLoginData(loginJson)

        txtHelloWorld.text=SharedPreferenceUtil.getLoginData()?.id.toString() +SharedPreferenceUtil.getLoginData()?.name.toString()

*/

       /* showAlertDialog("error","network connection",listener = object : OnAlertDialogRespondListener{
            override fun onPositiveButtonClicked() {
            }

            override fun onNegativeButtonClicked() {
            }

            override fun onNeutralButtonClicked() {
            }

        })*/

       // showToast("yashuuuuuuuu")

       /* showSnackBar(rootLayout,android.R.color.holo_blue_bright,"this is main ","okayyyy",   object :OnSnackbarButtonClicked{
            override fun onSnackbarButtonClicked(action: String) {
                showToast("clicked")
            }

        })*/


        /*txtHelloWorld.setOnClickListener {
            showToast("hello world clicked!!")
            showView(progressLayout)
        }*/

    }
}
