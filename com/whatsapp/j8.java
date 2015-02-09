package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class j8 implements OnClickListener {
    private static final String z;
    final ll a;

    static {
        char[] toCharArray = "2\u0000gn\n:\n-u\u000b'\u000bmhK2\rwu\n=@UU \u0004".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 83;
                    break;
                case ay.f /*1*/:
                    i2 = 110;
                    break;
                case ay.n /*2*/:
                    i2 = 3;
                    break;
                case ay.p /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 101;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    j8(ll llVar) {
        this.a = llVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(z);
        intent.setData(st.h());
        this.a.c.startActivity(intent);
        this.a.c.finish();
    }
}
