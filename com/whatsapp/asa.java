package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.DeleteBroadcastListDialogFragment;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class asa implements OnClickListener {
    private static final String z;
    final m8 a;
    final DeleteBroadcastListDialogFragment b;

    static {
        char[] toCharArray = "CURGdRI]EhOTO\u001eeEVYEd\rYS_uAYH".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 32;
                    break;
                case ay.f /*1*/:
                    i2 = 58;
                    break;
                case ay.n /*2*/:
                    i2 = 60;
                    break;
                case ay.p /*3*/:
                    i2 = 49;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    asa(DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment, m8 m8Var) {
        this.b = deleteBroadcastListDialogFragment;
        this.a = m8Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        App.a(this.a.e);
        App.g(this.a.e);
        ConversationsFragment.d(ConversationsFragment.g() + 1);
        this.b.dismiss();
    }
}
