package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class HeadsetPlugBroadcastReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u000b\u0018s^{\u0003\u00129Ez\u001e\u0013yX:\u000b\u0015cE{\u0004X_iU.%RxK::Bk";
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
                        i3 = 106;
                        break;
                    case ay.f /*1*/:
                        i3 = 118;
                        break;
                    case ay.n /*2*/:
                        i3 = 23;
                        break;
                    case ay.p /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = 20;
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
                    str = "\u000b\u0006g\u0003|\u000f\u0017s_q\u001eY";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0019\u0002vXq";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(Context context) {
        context.registerReceiver(this, new IntentFilter(z[0]));
    }

    public void onReceive(Context context, Intent intent) {
        boolean z = true;
        int intExtra = intent.getIntExtra(z[1], 0);
        if (App.ae && intExtra < 1) {
            cb.e();
        }
        if (intExtra < 1) {
            z = false;
        }
        App.ae = z;
        Log.i(z[2] + intExtra);
    }

    HeadsetPlugBroadcastReceiver() {
    }
}
