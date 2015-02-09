package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ip implements OnClickListener {
    private static final String z;
    final ProfilePhotoReminder a;

    static {
        char[] toCharArray = "\u00006lxO65yyS\u0006<".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 105;
                    break;
                case ay.f /*1*/:
                    i2 = 88;
                    break;
                case ay.n /*2*/:
                    i2 = 28;
                    break;
                case ay.p /*3*/:
                    i2 = 13;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ip(ProfilePhotoReminder profilePhotoReminder) {
        this.a = profilePhotoReminder;
    }

    public void onClick(View view) {
        ((InputMethodManager) this.a.getSystemService(z)).hideSoftInputFromWindow(ProfilePhotoReminder.d(this.a).getWindowToken(), 0);
        ProfilePhotoReminder.c(this.a).a(this.a.findViewById(R.id.emoji_btn));
    }
}
