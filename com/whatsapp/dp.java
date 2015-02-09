package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.DeleteGroupDialogFragment;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class dp implements OnClickListener {
    private static final String z;
    final m8 a;
    final DeleteGroupDialogFragment b;

    static {
        char[] toCharArray = "E,!|XT0.~TI-<%HU&='YC/*~Xa1 \u007fM".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 38;
                    break;
                case ay.f /*1*/:
                    i2 = 67;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 61;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    dp(DeleteGroupDialogFragment deleteGroupDialogFragment, m8 m8Var) {
        this.b = deleteGroupDialogFragment;
        this.a = m8Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        App.a(this.a.e);
        ConversationsFragment.d(ConversationsFragment.g() + 1);
        this.b.dismiss();
    }
}
