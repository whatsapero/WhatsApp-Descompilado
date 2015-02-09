package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a80 implements OnClickListener {
    private static final String z;
    final ListChatInfo a;

    static {
        char[] toCharArray = "(\u0001]\u000e#'\u0000O\u000e#-\u0006H\u0015S+\u0006M\u0016\u0015'\u0003q\u0016\u0019%\u001eK=\u000e+\u001d^".toCharArray();
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
                    i2 = 104;
                    break;
                case ay.n /*2*/:
                    i2 = 46;
                    break;
                case ay.p /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 124;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        App.a(ListChatInfo.d(this.a).e);
        App.g(ListChatInfo.d(this.a).e);
        this.a.startActivity(new Intent(App.p.getApplicationContext(), Main.b()).addFlags(603979776));
    }

    a80(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
