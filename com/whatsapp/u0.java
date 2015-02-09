package com.whatsapp;

import android.location.LocationManager;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class u0 implements Runnable {
    private static final String[] z;
    final LocationPicker2 a;

    static {
        String[] strArr = new String[3];
        String str = "q\nT";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 22;
                        break;
                    case ay.f /*1*/:
                        i3 = 122;
                        break;
                    case ay.n /*2*/:
                        i3 = 39;
                        break;
                    case ay.p /*3*/:
                        i3 = 57;
                        break;
                    default:
                        i3 = 94;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "z\u0015DX*\u007f\u0015I";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "x\u001fSN1d\u0011";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        LocationPicker2.b(this.a, true);
        if (LocationPicker2.x(this.a) != null && LocationPicker2.s(this.a) == null) {
            LocationPicker2.a(this.a, LocationPicker2.x(this.a), Math.max((int) LocationPicker2.x(this.a).getAccuracy(), 100), null, true);
        }
        if (LocationPicker2.x(this.a) == null || LocationPicker2.x(this.a).getAccuracy() > 200.0f) {
            LocationManager locationManager = (LocationManager) this.a.getSystemService(z[2]);
            if (!locationManager.isProviderEnabled(z[0]) || !locationManager.isProviderEnabled(z[1])) {
                this.a.showDialog(2);
            }
        }
    }

    u0(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
