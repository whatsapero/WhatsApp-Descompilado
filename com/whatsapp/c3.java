package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class c3 implements OnClickListener {
    private static final String z;
    final Activity a;

    static {
        char[] toCharArray = "K\u0010]&\u0006C\u001a\u0017=\u0007^\u001bW GK\u001dM=\u0006DPo\u001d,}".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 42;
                    break;
                case ay.f /*1*/:
                    i2 = 126;
                    break;
                case ay.n /*2*/:
                    i2 = 57;
                    break;
                case ay.p /*3*/:
                    i2 = 84;
                    break;
                default:
                    i2 = 105;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    c3(Activity activity) {
        this.a = activity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(115);
        Intent intent = new Intent(z);
        intent.setData(st.h());
        this.a.startActivity(intent);
    }
}
