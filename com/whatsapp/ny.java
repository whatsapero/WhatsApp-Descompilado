package com.whatsapp;

import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ny implements OnClickListener {
    private static final String[] z;
    final Advanced a;

    static {
        String[] strArr = new String[3];
        String str = "\u0010=CN\u0015\u0004 APPT*KY\\\u001a";
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
                        i3 = 116;
                        break;
                    case ay.f /*1*/:
                        i3 = 72;
                        break;
                    case ay.n /*2*/:
                        i3 = 46;
                        break;
                    case ay.p /*3*/:
                        i3 = 62;
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
                    str = "\u0004 APP\u0007fZFA";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0010=CN\u0015\u0004 APPT-@Z";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ny(Advanced advanced) {
        this.a = advanced;
    }

    public void onClick(View view) {
        App.v(z[0]);
        Advanced.a(Phone.CONTENT_URI, z[2]);
        App.v(z[1]);
    }
}
