package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class rg implements OnClickListener {
    private static final String z;
    final Conversation a;

    static {
        char[] toCharArray = "c\u0017c".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 9;
                    break;
                case ay.f /*1*/:
                    i2 = 126;
                    break;
                case ay.n /*2*/:
                    i2 = 7;
                    break;
                case ay.p /*3*/:
                    i2 = 79;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    rg(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        Conversation.o(this.a).dismiss();
        Class cls = null;
        if (App.H()) {
            cls = LocationPicker2.class;
        } else if (App.t()) {
            cls = LocationPicker.class;
        } else if (App.ag()) {
            cls = LocationPicker.class;
        }
        if (cls != null) {
            Intent intent = new Intent(this.a, cls);
            intent.putExtra(z, this.a.r.e);
            this.a.startActivity(intent);
            Conversation.T = false;
            if (App.az == 0) {
                return;
            }
        }
        App.d(this.a, this.a.r.e);
    }
}
