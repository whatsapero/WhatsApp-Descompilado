package com.whatsapp;

import com.whatsapp.util.Log;

class mv implements Runnable {
    final LogRotationBroadcastReceiver a;

    public void run() {
        if (Log.h()) {
            Log.g();
        }
        Log.c();
    }

    mv(LogRotationBroadcastReceiver logRotationBroadcastReceiver) {
        this.a = logRotationBroadcastReceiver;
    }
}
