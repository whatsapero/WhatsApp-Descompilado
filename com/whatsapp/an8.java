package com.whatsapp;

import android.provider.ContactsContract.Data;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class an8 implements OnClickListener {
    private static final String[] z;
    final Advanced a;

    static {
        String[] strArr = new String[3];
        String str = "\u007f\u0006P)fo\u001fP";
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
                        i3 = 27;
                        break;
                    case ay.f /*1*/:
                        i3 = 103;
                        break;
                    case ay.n /*2*/:
                        i3 = 36;
                        break;
                    case ay.p /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 72;
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
                    str = "\u007f\u0012I8h\u007f\u0006P)hy\u0002C!&";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u007f\u0012I8h\u007f\u0006P)h~\t@";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(View view) {
        App.v(z[2]);
        Advanced.a(Data.CONTENT_URI, z[0]);
        App.v(z[1]);
    }

    an8(Advanced advanced) {
        this.a = advanced;
    }
}
