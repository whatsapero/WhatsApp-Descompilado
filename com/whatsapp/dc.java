package com.whatsapp;

import com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class dc implements OnMenuVisibilityListener {
    private static final String z;
    final Conversation a;

    static {
        char[] toCharArray = "a\u001aVf\"p\u0006Yd.m\u001b\u0017\u007f)O\u0010Ve\u0011k\u0006Qr.n\u001cLi\u0004j\u0014Vw\"fU".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 2;
                    break;
                case ay.f /*1*/:
                    i2 = 117;
                    break;
                case ay.n /*2*/:
                    i2 = 56;
                    break;
                case ay.p /*3*/:
                    i2 = 16;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    dc(Conversation conversation) {
        this.a = conversation;
    }

    public void onMenuVisibilityChanged(boolean z) {
        Log.i(z + z);
        if (z && Conversation.n(this.a) != null) {
            if (Conversation.V(this.a) != null) {
                Conversation.n(this.a).setEnabled(Conversation.V(this.a).booleanValue());
                if (App.az == 0) {
                    return;
                }
            }
            Conversation.n(this.a).setEnabled(false);
            a5w.a(new cw(this), new Void[0]);
        }
    }
}
