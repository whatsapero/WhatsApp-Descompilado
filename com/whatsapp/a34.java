package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a34 implements OnClickListener {
    private static final String z;
    final lv a;

    static {
        char[] toCharArray = " \u0000-".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 66;
                    break;
                case ay.f /*1*/:
                    i2 = 117;
                    break;
                case ay.n /*2*/:
                    i2 = 84;
                    break;
                case ay.p /*3*/:
                    i2 = 117;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a34(lv lvVar) {
        this.a = lvVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.a.g, AccountInfoActivity.class);
        intent.putExtra(z, true);
        this.a.g.startActivity(intent);
        this.a.g.finish();
        RegisterName.a(null);
        this.a.g.removeDialog(0);
    }
}
