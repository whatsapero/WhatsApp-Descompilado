package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class w6 implements OnCancelListener {
    private static final String z;
    final RegisterName a;

    static {
        char[] toCharArray = "\u0003\u001d-\u0000\u0004\u0005\u001d8\u0007\u0016\u001c\u001de\r\u001e\u0010\u0014%\u000eX\u0012\u0019$\u001dZ\u0012\u0017$\u0007\u0012\u0012\fe\n\u0016\u001f\u001b/\u0005".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 113;
                    break;
                case ay.f /*1*/:
                    i2 = 120;
                    break;
                case ay.n /*2*/:
                    i2 = 74;
                    break;
                case ay.p /*3*/:
                    i2 = 105;
                    break;
                default:
                    i2 = 119;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.i(z);
    }

    w6(RegisterName registerName) {
        this.a = registerName;
    }
}
