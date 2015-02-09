package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class hw implements OnClickListener {
    private static final String[] z;
    final RegisterName a;

    static {
        String[] strArr = new String[3];
        String str = "\u0010@Y+b\u0018J\u00130c\u0005KS-#\u0010MI0b\u001f\u0000k\u0010H&";
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
                        i3 = 46;
                        break;
                    case ay.n /*2*/:
                        i3 = 61;
                        break;
                    case ay.p /*3*/:
                        i3 = 89;
                        break;
                    default:
                        i3 = 13;
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
                    str = "\u0019ZI)~K\u0001\u00124b\u0013GQ<#\u0005YT-y\u0014\\\u0013:b\u001c\u0001J8R\u0002Z\\-x\u0002";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0003KZ0~\u0005KO7l\u001cK\u0012=d\u0010BR>\"\u0012OS- \u0012AS7h\u0012Z\u0012;x\u0005ZR7\"\u0012FX:f\u0002Z\\-x\u0002";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    hw(RegisterName registerName) {
        this.a = registerName;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z[1]);
        this.a.removeDialog(109);
        this.a.startActivity(new Intent(z[0], Uri.parse(z[2])));
    }
}
