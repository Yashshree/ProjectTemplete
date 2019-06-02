package com.app.projecttemplete.listeners

interface OnWebServiceResponseListener {
    fun onSuccess(response:String)

    fun onError(error:String)
}