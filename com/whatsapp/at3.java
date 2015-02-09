package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class at3 implements OnClickListener {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "\u00046@;\u0019<-A(\u0006L+A-\u0005\n'D\u0011\r\u0006(J:\f$6@;\u0019".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 99;
                    break;
                case ay.f /*1*/:
                    i2 = 68;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 78;
                    break;
                default:
                    i2 = 105;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        GroupChatInfo.e(this.a);
    }

    at3(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
