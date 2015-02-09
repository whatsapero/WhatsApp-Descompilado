package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class o4 implements OnClickListener {
    private static final String z;
    final QuickContactActivity a;

    static {
        char[] toCharArray = "?M\f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 85;
                    break;
                case ay.f /*1*/:
                    i2 = 36;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.a.getApplicationContext(), ViewProfilePhoto.class);
        intent.putExtra(z, QuickContactActivity.b(this.a).e);
        this.a.startActivity(intent);
        QuickContactActivity.a(this.a, false);
    }

    o4(QuickContactActivity quickContactActivity) {
        this.a = quickContactActivity;
    }
}
