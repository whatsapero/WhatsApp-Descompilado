package com.whatsapp;

import android.location.LocationManager;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class x3 implements Runnable {
    private static final String[] z;
    final LocationPicker a;

    static {
        String[] strArr = new String[3];
        String str = "\u0002ZS";
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
                        i3 = 101;
                        break;
                    case ay.f /*1*/:
                        i3 = 42;
                        break;
                    case ay.n /*2*/:
                        i3 = 32;
                        break;
                    case ay.p /*3*/:
                        i3 = 76;
                        break;
                    default:
                        i3 = 98;
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
                    str = "\tEC-\u0016\fEN";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u000bOT;\r\u0017A";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    x3(LocationPicker locationPicker) {
        this.a = locationPicker;
    }

    public void run() {
        LocationPicker.a(this.a, true);
        if (LocationPicker.c(this.a) != null && LocationPicker.p(this.a) == null) {
            LocationPicker.a(this.a, LocationPicker.c(this.a), Math.max((int) LocationPicker.c(this.a).getAccuracy(), 100), null, true);
        }
        if (LocationPicker.c(this.a) == null || LocationPicker.c(this.a).getAccuracy() > 200.0f) {
            LocationManager locationManager = (LocationManager) this.a.getSystemService(z[2]);
            if (!locationManager.isProviderEnabled(z[0]) || !locationManager.isProviderEnabled(z[1])) {
                this.a.showDialog(2);
            }
        }
    }
}
