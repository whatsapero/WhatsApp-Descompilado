package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Environment;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class alp implements OnClickListener {
    private static final String[] z;
    final ata a;

    static {
        String[] strArr = new String[3];
        String str = "d\f\u0007$}l\u0007";
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
                        i3 = 9;
                        break;
                    case ay.f /*1*/:
                        i3 = 99;
                        break;
                    case ay.n /*2*/:
                        i3 = 114;
                        break;
                    case ay.p /*3*/:
                        i3 = 74;
                        break;
                    default:
                        i3 = 9;
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
                    str = "d\f\u0007$}l\u0007-8f";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u007f\u0006\u0000#op\u000e\u0001-z}\f\u0000/&m\n\u0013&fnL\u0000/z}\f\u0000/o{\f\u001f(hj\b\u0007:m|\u0006\u0006%l{\u0011\u001d8jh\u0011\u0016$f}\u0005\u001d?gm\u0002\u0001!{l\u0017\u00003&z\u0017\u0013>l4";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    alp(ata com_whatsapp_ata) {
        this.a = com_whatsapp_ata;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ata.b(this.a).removeDialog(107);
        String externalStorageState = Environment.getExternalStorageState();
        if (!(externalStorageState.equals(z[0]) || externalStorageState.equals(z[2]))) {
            Log.v(z[1] + Environment.getExternalStorageState());
            ata.b(this.a).showDialog(107);
            if (App.az == 0) {
                return;
            }
        }
        this.a.b();
    }
}
