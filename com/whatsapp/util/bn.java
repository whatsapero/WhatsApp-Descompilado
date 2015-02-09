package com.whatsapp.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class bn {
    private static final String z;
    private final Sensor a;
    private final SensorManager b;
    private SensorEventListener c;

    static {
        char[] toCharArray = "K\u0007/H9J".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 56;
                    break;
                case ay.f /*1*/:
                    i2 = 98;
                    break;
                case ay.n /*2*/:
                    i2 = 65;
                    break;
                case ay.p /*3*/:
                    i2 = 59;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public bn(Context context) {
        this.b = (SensorManager) context.getSystemService(z);
        this.a = this.b.getDefaultSensor(8);
    }

    static Sensor a(bn bnVar) {
        return bnVar.a;
    }

    public void a(p pVar) {
        if (this.c != null) {
            this.b.unregisterListener(this.c, this.a);
            this.c = null;
        }
        if (pVar != null) {
            this.c = new bc(this, pVar);
            this.b.registerListener(this.c, this.a, 2);
        }
    }
}
