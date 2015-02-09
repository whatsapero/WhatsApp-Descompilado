package com.whatsapp.util;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

class bc implements SensorEventListener {
    private boolean a;
    final p b;
    final bn c;

    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = false;
        float f = sensorEvent.values[0];
        if (f < 5.0f && f != bn.a(this.c).getMaximumRange()) {
            z = true;
        }
        if (z != this.a) {
            this.a = z;
            this.b.a(z);
        }
    }

    bc(bn bnVar, p pVar) {
        this.c = bnVar;
        this.b = pVar;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
