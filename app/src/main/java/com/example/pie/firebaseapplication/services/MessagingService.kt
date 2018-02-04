package com.example.pie.firebaseapplication.services

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MessagingService:FirebaseMessagingService() {
    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        Log.i("MessagingService", "${message.data}")
        Log.i("MessagingService", "${message.notification}")
    }
}
