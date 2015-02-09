package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class y0 implements OnClickListener {
    private static final String z;
    final ProfileInfoActivity a;

    static {
        char[] toCharArray = "=ul".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 87;
                    break;
                case ay.f /*1*/:
                    i2 = 28;
                    break;
                case ay.n /*2*/:
                    i2 = 8;
                    break;
                case ay.p /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    y0(ProfileInfoActivity profileInfoActivity) {
        this.a = profileInfoActivity;
    }

    public void onClick(View view) {
        if (ProfileInfoActivity.b(this.a)) {
            Intent intent = new Intent(this.a, ViewProfilePhoto.class);
            intent.putExtra(z, ProfileInfoActivity.c(this.a).e);
            this.a.startActivity(intent);
            if (App.az == 0) {
                return;
            }
        }
        zv.a(ProfileInfoActivity.c(this.a), this.a, 12);
    }
}
