package com.whatsapp;

import android.content.Intent;
import android.view.View;
import com.whatsapp.util.ar;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class qe extends ar {
    private static final String z;
    final ConversationsFragment b;

    static {
        char[] toCharArray = ".\r'2\u00115".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 93;
                    break;
                case ay.f /*1*/:
                    i2 = 104;
                    break;
                case ay.n /*2*/:
                    i2 = 70;
                    break;
                case ay.p /*3*/:
                    i2 = 64;
                    break;
                default:
                    i2 = 114;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(View view) {
        Intent intent = new Intent(this.b.getActivity(), ContactPicker.class);
        intent.putExtra(z, __.a(ConversationsFragment.f(this.b)));
        this.b.startActivityForResult(intent, 1);
    }

    qe(ConversationsFragment conversationsFragment) {
        this.b = conversationsFragment;
    }
}
