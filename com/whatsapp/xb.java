package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class xb implements OnClickListener {
    private static final String z;
    final RegisterName a;

    static {
        char[] toCharArray = "6]K\u0015v0]^\u0012d)]\u0003\u0018l%TC\u001b*'YB\b('WB\u0012`'L\u0003\u001ep0LC\u0012*'YB\u001f`(".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 68;
                    break;
                case ay.f /*1*/:
                    i2 = 56;
                    break;
                case ay.n /*2*/:
                    i2 = 44;
                    break;
                case ay.p /*3*/:
                    i2 = 124;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        this.a.removeDialog(109);
    }

    xb(RegisterName registerName) {
        this.a = registerName;
    }
}
