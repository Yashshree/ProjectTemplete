package com.app.projecttemplete.listeners

interface OnFileProgressListener {
    fun onProgress(bytesDownloaded:Long,totalBytes: Long)
}