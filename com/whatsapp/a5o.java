package com.whatsapp;

import android.provider.ContactsContract.Contacts;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a5o implements OnClickListener {
    private static final String[] z;
    final Advanced a;

    static {
        String[] strArr = new String[3];
        String str = "r\u0017;G+w\u00062Ene\u0011vUnq\u000b8";
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
                        i3 = 22;
                        break;
                    case ay.f /*1*/:
                        i3 = 98;
                        break;
                    case ay.n /*2*/:
                        i3 = 86;
                        break;
                    case ay.p /*3*/:
                        i3 = 55;
                        break;
                    default:
                        i3 = 11;
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
                    str = "r\u0017;G+w\u00062Ene\u0011vRer";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "u\r8Cju\u0016%\u0019\u007fn\u0016";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a5o(Advanced advanced) {
        this.a = advanced;
    }

    public void onClick(View view) {
        App.v(z[0]);
        Advanced.a(Contacts.CONTENT_URI, z[1]);
        App.v(z[2]);
    }
}
