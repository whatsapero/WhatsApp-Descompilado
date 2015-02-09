package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class s_ implements OnClickListener {
    private static final String z;
    final RegisterName a;

    static {
        char[] toCharArray = "/\"V-]\u0019!C,A)(".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 70;
                    break;
                case ay.f /*1*/:
                    i2 = 76;
                    break;
                case ay.n /*2*/:
                    i2 = 38;
                    break;
                case ay.p /*3*/:
                    i2 = 88;
                    break;
                default:
                    i2 = 41;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        ((InputMethodManager) this.a.getSystemService(z)).hideSoftInputFromWindow(RegisterName.a(this.a).getWindowToken(), 0);
        RegisterName.h(this.a).a(this.a.findViewById(R.id.emoji_btn));
    }

    s_(RegisterName registerName) {
        this.a = registerName;
    }
}
