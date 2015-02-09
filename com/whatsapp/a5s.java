package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a5s implements OnClickListener {
    private static final String z;
    final CallLogActivity a;

    static {
        char[] toCharArray = "9R\u0016".toCharArray();
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
                    i2 = 59;
                    break;
                case ay.n /*2*/:
                    i2 = 114;
                    break;
                case ay.p /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        if (CallLogActivity.c(this.a).B) {
            Intent intent = new Intent(this.a, ViewProfilePhoto.class);
            intent.putExtra(z, CallLogActivity.c(this.a).e);
            this.a.startActivity(intent);
            if (App.az == 0) {
                return;
            }
        }
        App.b(this.a, (int) R.string.no_profile_photo, 0);
        App.a(CallLogActivity.c(this.a).e, CallLogActivity.c(this.a).A, 2);
    }

    a5s(CallLogActivity callLogActivity) {
        this.a = callLogActivity;
    }
}
