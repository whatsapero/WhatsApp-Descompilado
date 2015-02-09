package com.whatsapp;

class dx implements Runnable {
    final DeviceInfoAlarmBroadcastReceiver a;

    dx(DeviceInfoAlarmBroadcastReceiver deviceInfoAlarmBroadcastReceiver) {
        this.a = deviceInfoAlarmBroadcastReceiver;
    }

    public void run() {
        DeviceInfoAlarmBroadcastReceiver.a(this.a);
    }
}
