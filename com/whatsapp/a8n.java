package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a8n implements OnClickListener {
    private static final String z;
    final AccountInfoActivity a;

    static {
        char[] toCharArray = "j@i\u000bJWOi\u0006UiOr".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 8;
                    break;
                case ay.f /*1*/:
                    i2 = 44;
                    break;
                case ay.n /*2*/:
                    i2 = 6;
                    break;
                case ay.p /*3*/:
                    i2 = 104;
                    break;
                default:
                    i2 = 33;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.a, ContactPicker.class);
        intent.putExtra(z, true);
        this.a.startActivityForResult(intent, 10002);
    }

    a8n(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }
}
