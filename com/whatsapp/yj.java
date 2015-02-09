package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class yj implements OnClickListener {
    private static final String z;
    final DeleteAccount a;

    static {
        char[] toCharArray = "\u0016y9,\u000f\u001714*\u0018\u001di;=T\u0011t4'\u001c\u0017r $\u0019\u0017n".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 114;
                    break;
                case ay.f /*1*/:
                    i2 = 28;
                    break;
                case ay.n /*2*/:
                    i2 = 85;
                    break;
                case ay.p /*3*/:
                    i2 = 73;
                    break;
                default:
                    i2 = 123;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    yj(DeleteAccount deleteAccount) {
        this.a = deleteAccount;
    }

    public void onClick(View view) {
        Log.i(z);
        this.a.startActivity(new Intent(this.a, ChangeNumberOverview.class));
    }
}
