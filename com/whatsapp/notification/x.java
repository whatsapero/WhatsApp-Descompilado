package com.whatsapp.notification;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class x implements SensorEventListener {
    private static final String z;
    final PopupNotification a;

    static {
        char[] toCharArray = "_]g}wA]caaFQv|n@\\8xu@J~en[K-".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 47;
                    break;
                case ay.f /*1*/:
                    i2 = 50;
                    break;
                case ay.n /*2*/:
                    i2 = 23;
                    break;
                case ay.p /*3*/:
                    i2 = 8;
                    break;
                default:
                    i2 = 7;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    x(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        PopupNotification.a(this.a, sensorEvent.values[0]);
        Log.i(z + PopupNotification.c(this.a));
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
