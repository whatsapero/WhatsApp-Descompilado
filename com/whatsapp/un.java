package com.whatsapp;

import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.f;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class un implements OnClickListener {
    private static final String z;
    final Conversation a;

    static {
        char[] toCharArray = "f%#\u0006^n.".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 11;
                    break;
                case ay.f /*1*/:
                    i2 = 74;
                    break;
                case ay.n /*2*/:
                    i2 = 86;
                    break;
                case ay.p /*3*/:
                    i2 = 104;
                    break;
                default:
                    i2 = 42;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Conversation.o(this.a).dismiss();
        if (!Environment.getExternalStorageState().equals(z)) {
            this.a.showDialog(15);
            if (App.az == 0) {
                return;
            }
        }
        f.a(5, this.a);
        Conversation.T = false;
    }

    un(Conversation conversation) {
        this.a = conversation;
    }
}
