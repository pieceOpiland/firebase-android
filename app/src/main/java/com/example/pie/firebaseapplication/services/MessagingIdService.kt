package com.example.pie.firebaseapplication.services

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class MessagingIdService : FirebaseInstanceIdService() {
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        Log.i("MessagingIdService", "${FirebaseInstanceId.getInstance().token}")
    }
}
