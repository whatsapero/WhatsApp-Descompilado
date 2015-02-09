package com.whatsapp;

import android.provider.ContactsContract.RawContacts;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class av implements OnClickListener {
    private static final String[] z;
    final Advanced a;

    static {
        String[] strArr = new String[3];
        String str = "\u0012{:7_\u0004o g\u001a\u0018j";
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
                        i3 = 118;
                        break;
                    case ay.f /*1*/:
                        i3 = 14;
                        break;
                    case ay.n /*2*/:
                        i3 = 87;
                        break;
                    case ay.p /*3*/:
                        i3 = 71;
                        break;
                    default:
                        i3 = 127;
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
                    str = "\u0004o i\u000b\u000ez";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0012{:7_\u0004o g\u001d\u0013i>)";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    av(Advanced advanced) {
        this.a = advanced;
    }

    public void onClick(View view) {
        App.v(z[1]);
        Advanced.a(RawContacts.CONTENT_URI, z[2]);
        App.v(z[0]);
    }
}
