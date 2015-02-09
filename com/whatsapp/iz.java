package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class iz implements OnClickListener {
    private static final String z;
    final String a;
    final Activity b;

    static {
        char[] toCharArray = "\\\u0007\u007f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 54;
                    break;
                case ay.f /*1*/:
                    i2 = 110;
                    break;
                case ay.n /*2*/:
                    i2 = 27;
                    break;
                case ay.p /*3*/:
                    i2 = 24;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.b, MediaGallery.class);
        intent.putExtra(z, this.a);
        this.b.startActivity(intent);
    }

    iz(Activity activity, String str) {
        this.b = activity;
        this.a = str;
    }
}
