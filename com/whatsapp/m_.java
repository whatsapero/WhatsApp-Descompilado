package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class m_ implements OnClickListener {
    private static final String z;
    final ContactInfo a;

    static {
        char[] toCharArray = ":\u0018\u000f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 80;
                    break;
                case ay.f /*1*/:
                    i2 = 113;
                    break;
                case ay.n /*2*/:
                    i2 = 107;
                    break;
                case ay.p /*3*/:
                    i2 = 117;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    m_(ContactInfo contactInfo) {
        this.a = contactInfo;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.a, MediaGallery.class);
        intent.putExtra(z, ContactInfo.e(this.a).e);
        this.a.startActivity(intent);
    }
}
