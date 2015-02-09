package com.whatsapp.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class MessageNotificationDismissedReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "\f\u007f{fI\u0007qb;_\u001f`I8L\nvs:[\u0001ss;";
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
                        i3 = 111;
                        break;
                    case ay.f /*1*/:
                        i3 = 16;
                        break;
                    case ay.n /*2*/:
                        i3 = 22;
                        break;
                    case ay.p /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 62;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0001\u007fb!X\u0006sw<W\u0000~I _\u001cx";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0001\u007fb!X\u0006sw<W\u0000~9,W\u001c}\u007f;MO";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0001\u007fb!X\u0006sw<W\u0000~I _\u001cx";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(z[1]);
        App.p.getSharedPreferences(z[0], 0).edit().putString(z[2], stringExtra).commit();
        Log.i(z[3] + stringExtra);
    }
}
