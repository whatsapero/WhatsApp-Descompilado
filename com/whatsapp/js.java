package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class js implements OnClickListener {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "\u000051E\u00188.0V\u0007H(0S\u0004\u000e$5o\r\t#\u0019B\u0007\u00127".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 103;
                    break;
                case ay.f /*1*/:
                    i2 = 71;
                    break;
                case ay.n /*2*/:
                    i2 = 94;
                    break;
                case ay.p /*3*/:
                    i2 = 48;
                    break;
                default:
                    i2 = 104;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        GroupChatInfo.a(this.a);
    }

    js(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
