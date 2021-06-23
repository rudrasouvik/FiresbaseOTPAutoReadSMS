package com.webgrity.firebaseotplogin

import android.app.Application


class MyApplication : Application(){

    companion object {
        var storedVerificationId:String = ""
    }
}