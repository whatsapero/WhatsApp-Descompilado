package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.DialogToastFragmentActivity.LoginFailedDialogFragment;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a8x implements OnClickListener {
    private static final String z;
    final LoginFailedDialogFragment a;

    static {
        char[] toCharArray = ".IL1E4CS1\r/UU1\u0018".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 38;
                    break;
                case ay.n /*2*/:
                    i2 = 33;
                    break;
                case ay.p /*3*/:
                    i2 = 84;
                    break;
                default:
                    i2 = 106;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        OverlayAlert.a(this.a.getActivity());
    }

    a8x(LoginFailedDialogFragment loginFailedDialogFragment) {
        this.a = loginFailedDialogFragment;
    }
}
