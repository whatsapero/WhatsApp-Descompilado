package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class jc implements OnClickListener {
    private static final String z;
    final ContactInfo a;

    static {
        char[] toCharArray = "M;\u0015".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 39;
                    break;
                case ay.f /*1*/:
                    i2 = 82;
                    break;
                case ay.n /*2*/:
                    i2 = 113;
                    break;
                case ay.p /*3*/:
                    i2 = 38;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    jc(ContactInfo contactInfo) {
        this.a = contactInfo;
    }

    public void onClick(View view) {
        if (ContactInfo.e(this.a).B) {
            Intent intent = new Intent(this.a, ViewProfilePhoto.class);
            intent.putExtra(z, ContactInfo.e(this.a).e);
            this.a.startActivity(intent);
            if (App.az == 0) {
                return;
            }
        }
        App.b(this.a, (int) R.string.no_profile_photo, 0);
        App.a(ContactInfo.e(this.a).e, ContactInfo.e(this.a).A, 2);
    }
}
