package com.whatsapp;

import android.os.Bundle;
import android.os.Parcelable;
import com.actionbarsherlock.R;
import com.whatsapp.util.undobar.d;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class anj implements Runnable {
    private static final String z;
    final amb a;

    static {
        char[] toCharArray = "x\u001av".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 115;
                    break;
                case ay.n /*2*/:
                    i2 = 18;
                    break;
                case ay.p /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 106;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    anj(amb com_whatsapp_amb) {
        this.a = com_whatsapp_amb;
    }

    public void run() {
        App.aJ.b(ConversationsFragment.d(this.a.a), true);
        Parcelable bundle = new Bundle();
        bundle.putString(z, ConversationsFragment.d(this.a.a));
        new d(this.a.a.getActivity()).a((int) R.string.conversation_archived_confirmation).a(new qm(this)).a(bundle).a();
        ConversationsFragment.c(this.a.a).getViewTreeObserver().addOnGlobalLayoutListener(new a1c(this));
    }
}
