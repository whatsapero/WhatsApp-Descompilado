package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.DeleteContactDialogFragment;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class x7 implements OnClickListener {
    private static final String z;
    final DeleteContactDialogFragment a;
    final m8 b;

    static {
        char[] toCharArray = "\rP1@~\u001cL>Br\u0001Q,\u0019\u007f\u000bS:B~C\\0Xo\u000f\\+".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 110;
                    break;
                case ay.f /*1*/:
                    i2 = 63;
                    break;
                case ay.n /*2*/:
                    i2 = 95;
                    break;
                case ay.p /*3*/:
                    i2 = 54;
                    break;
                default:
                    i2 = 27;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        App.a(this.b.e);
        ConversationsFragment.d(ConversationsFragment.g() + 1);
        this.a.dismiss();
    }

    x7(DeleteContactDialogFragment deleteContactDialogFragment, m8 m8Var) {
        this.a = deleteContactDialogFragment;
        this.b = m8Var;
    }
}
