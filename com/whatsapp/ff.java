package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import com.whatsapp.util.br;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ff implements OnClickListener {
    private static final String z;
    final Conversation a;

    static {
        char[] toCharArray = "\"U\u0018\u0013O3I\u0017\u0011C.TY\u0001C V\u0019\u0002\u0005#V\u0019\u0006AnT\u0019HD$N\u0001\nX*\u0017\u0015\u0004D/U\u0002HH-U\u0015\u000e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 65;
                    break;
                case ay.f /*1*/:
                    i2 = 58;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 101;
                    break;
                default:
                    i2 = 42;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!App.a()) {
            Log.w(z);
            App.b(this.a.getBaseContext(), (int) R.string.no_network_cannot_block, 0);
            if (App.az == 0) {
                return;
            }
        }
        Conversation.h(this.a, true);
        this.a.showDialog(107);
        br.a(new uz(this));
    }

    ff(Conversation conversation) {
        this.a = conversation;
    }
}
