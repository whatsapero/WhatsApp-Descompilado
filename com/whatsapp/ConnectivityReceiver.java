package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import de.greenrobot.event.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class ConnectivityReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "jkQ\u007f\u0014jpVg\u0018}}";
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
                        i3 = 9;
                        break;
                    case ay.f /*1*/:
                        i3 = 4;
                        break;
                    case ay.n /*2*/:
                        i3 = 63;
                        break;
                    case ay.p /*3*/:
                        i3 = 17;
                        break;
                    default:
                        i3 = 113;
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
                    str = "hj[c\u001e``\u0011\u007f\u0014}*\\~\u001fg*|^?GA|E8_MkH.JL~_6L";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "jkQ\u007f\u0014jpVg\u0018}}";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(Context context) {
        context.registerReceiver(this, new IntentFilter(z[2]));
        g.b().c(ju.a(((ConnectivityManager) context.getSystemService(z[1])).getActiveNetworkInfo()));
    }

    public void onReceive(Context context, Intent intent) {
        g.b().c(ju.a(((ConnectivityManager) context.getSystemService(z[0])).getActiveNetworkInfo()));
    }
}
