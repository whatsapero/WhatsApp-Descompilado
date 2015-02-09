package com.whatsapp.util;

import android.content.Context;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aW;
import org.whispersystems.libaxolotl.ay;

final class ak implements aW {
    private static final String[] z;
    final Context a;

    static {
        String[] strArr = new String[3];
        String str = "\u0010)&9r\u0005=i9t\u0013#('dQ=&4y\u0018?.u{\u00108%0yJq='d\u0018?.u\u007f\u00102\" mQ<,!u\u001e5:";
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
                        i3 = 113;
                        break;
                    case ay.f /*1*/:
                        i3 = 81;
                        break;
                    case ay.n /*2*/:
                        i3 = 73;
                        break;
                    case ay.p /*3*/:
                        i3 = 85;
                        break;
                    default:
                        i3 = 29;
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
                    str = "Q' 4=\u00130*>h\u0001q$0i\u0019>-&";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0004?(7q\u0014q=:=\u001d>(1=\u001d8+'|\u0003(i";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(UnsatisfiedLinkError unsatisfiedLinkError, String str) {
        Log.i(z[0]);
        try {
            WhatsAppLibLoader.a(this.a, new String[]{str});
        } catch (Throwable e) {
            Log.b(z[1] + str + z[2], e);
            throw unsatisfiedLinkError;
        }
    }

    ak(Context context) {
        this.a = context;
    }
}
