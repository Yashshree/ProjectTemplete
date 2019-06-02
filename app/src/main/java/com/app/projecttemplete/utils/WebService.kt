package com.app.projecttemplete.utils

import com.app.projecttemplete.listeners.OnFileProgressListener
import com.app.projecttemplete.listeners.OnWebServiceResponseListener

abstract class WebService {

    companion object {
        lateinit var onWebServiceResponseListener: OnWebServiceResponseListener

        lateinit var onFileProgressListener: OnFileProgressListener


        fun setResponseListener(listener: OnWebServiceResponseListener) {
            onWebServiceResponseListener=listener
        }

        fun setFileProgressListener(listener: OnFileProgressListener)
        {
            onFileProgressListener=listener
        }
    }
}