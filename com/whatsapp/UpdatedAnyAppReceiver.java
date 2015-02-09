package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.c2dm.C2DMRegistrar;
import com.whatsapp.c2dm.a;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class UpdatedAnyAppReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "\u007feFd^oqCuZxpA`C|pP*XodW`Y~8P`LxpQm";
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
                        i3 = 10;
                        break;
                    case ay.f /*1*/:
                        i3 = 21;
                        break;
                    case ay.n /*2*/:
                        i3 = 34;
                        break;
                    case ay.p /*3*/:
                        i3 = 5;
                        break;
                    default:
                        i3 = 42;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u007feFd^oqCuZxpA`C|pP*Kze\rkE~8MpXy";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u007feFd^oqCuZxpA`C|pP*Kze\rcE\u007f{F";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u007feFd^oqCuZxpA`C|pP*XovGl\\o";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u007feFd^otRuXovGl\\og\rvAce\u000fwOlgGvB";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void a() {
        a aVar = new a(App.p);
        aVar.b();
        aVar.f();
        if (App.an != null) {
            Log.i(z[0]);
            C2DMRegistrar.a(App.p);
            if (App.az == 0) {
                return;
            }
        }
        Log.i(z[1]);
    }

    public void onReceive(Context context, Intent intent) {
        Log.i(z[4]);
        if (intent.getData().getSchemeSpecificPart().equals(context.getPackageName())) {
            Log.i(z[3]);
            a();
            if (App.az == 0) {
                return;
            }
        }
        Log.i(z[2]);
    }
}
