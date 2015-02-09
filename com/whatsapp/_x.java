package com.whatsapp;

class _x implements Runnable {
    final LogRotationBroadcastReceiver a;

    _x(LogRotationBroadcastReceiver logRotationBroadcastReceiver) {
        this.a = logRotationBroadcastReceiver;
    }

    public void run() {
        App.aJ.B();
    }
}
