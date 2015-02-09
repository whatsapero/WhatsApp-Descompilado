package com.whatsapp;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class avv extends Handler {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = ">\u0018\u0001YF:\u001c\\\u0004P<\u0007\u0007\u0013G&E\u0005\u0019^:\u0006^\u0010T6\u0004";
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
                        i3 = 95;
                        break;
                    case ay.f /*1*/:
                        i3 = 104;
                        break;
                    case ay.n /*2*/:
                        i3 = 113;
                        break;
                    case ay.p /*3*/:
                        i3 = 118;
                        break;
                    default:
                        i3 = 53;
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
                    str = "-\u000b";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "-\u000b;\u001fQ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    avv() {
    }

    public void handleMessage(Message message) {
        Bundle bundle = (Bundle) message.obj;
        if (!a54.c(bundle.getByteArray(z[2]), bundle.getString(z[1]))) {
            Log.e(z[0]);
        }
    }
}
