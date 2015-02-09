package com.whatsapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

class t implements SensorEventListener {
    final cb a;

    t(cb cbVar) {
        this.a = cbVar;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        int i = App.az;
        if (cb.n == null) {
            this.a.a(false);
            cb.d(this.a);
            if (i == 0) {
                return;
            }
        }
        if (cb.n != this.a) {
            cb.d(this.a);
            if (i == 0) {
                return;
            }
        }
        float f = sensorEvent.values[0];
        if (f >= 5.0f || f == cb.e(this.a).getMaximumRange()) {
            this.a.a(false);
            if (i == 0) {
                return;
            }
        }
        this.a.a(true);
    }
}
