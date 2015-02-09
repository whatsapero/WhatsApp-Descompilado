package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class al4 implements OnClickListener {
    private static final String z;
    final LocationPicker2 a;

    static {
        char[] toCharArray = "\tKA\f\u001d\u0001A\u000b\r\u0017\u001cQL\u0010\u0015\u001b\u000bi11)ql1<7vj+ +`z-7<ql05;".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 104;
                    break;
                case ay.f /*1*/:
                    i2 = 37;
                    break;
                case ay.n /*2*/:
                    i2 = 37;
                    break;
                case ay.p /*3*/:
                    i2 = 126;
                    break;
                default:
                    i2 = 114;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.startActivityForResult(new Intent(z), 0);
        this.a.removeDialog(2);
    }

    al4(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
