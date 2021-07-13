package com.example.logger2

import android.util.Log

object CustomLogger {

    fun logDetails(msg:String){
        Log.d("==>","$msg")
    }
}