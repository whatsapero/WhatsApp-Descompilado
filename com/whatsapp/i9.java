package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class i9 implements OnClickListener {
    private static final String z;
    final LocationPicker a;

    static {
        char[] toCharArray = "X]+\f\u000ePWa\r\u0004MG&\u0010\u0006J\u001d\u00031\"xg\u00061/f`\u0000+3zv\u0010-$mg\u00060&j".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 57;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 126;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    i9(LocationPicker locationPicker) {
        this.a = locationPicker;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.startActivityForResult(new Intent(z), 0);
        this.a.removeDialog(2);
    }
}
