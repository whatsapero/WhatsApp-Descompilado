package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class wf implements OnClickListener {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "rpv\u0014YJkw\u0007F:mw\u0002E|ar>Epco\u0004ngml\u0011".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 21;
                    break;
                case ay.f /*1*/:
                    i2 = 2;
                    break;
                case ay.n /*2*/:
                    i2 = 25;
                    break;
                case ay.p /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 41;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    wf(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        GroupChatInfo.q(this.a);
    }
}
