package com.whatsapp;

import android.telephony.PhoneStateListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a5c extends PhoneStateListener {
    private static final String[] z;
    final App a;

    static {
        String[] strArr = new String[3];
        String str = "\ty(\tbVb3\u0006s\u001c1(\u0001a\u0011~(\f";
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
                        i3 = 121;
                        break;
                    case ay.f /*1*/:
                        i3 = 17;
                        break;
                    case ay.n /*2*/:
                        i3 = 71;
                        break;
                    case ay.p /*3*/:
                        i3 = 103;
                        break;
                    default:
                        i3 = 7;
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
                    str = "\ty(\tbVb3\u0006s\u001c15\u000ei\u001ex)\u0000";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\ty(\tbVb3\u0006s\u001c1.\u0003k\u001c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a5c(App app) {
        this.a = app;
    }

    public void onCallStateChanged(int i, String str) {
        int i2 = App.az;
        switch (i) {
            case PBE.MD5 /*0*/:
                break;
            case ay.f /*1*/:
                Log.i(z[2]);
                cb.e();
                if (i2 == 0) {
                    return;
                }
                break;
            case ay.n /*2*/:
                break;
            default:
                return;
        }
        Log.i(z[0]);
        if (i2 == 0) {
            return;
        }
        Log.i(z[1]);
    }
}
