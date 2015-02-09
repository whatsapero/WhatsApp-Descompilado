package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class r2 implements OnClickListener {
    private static final String z;
    final kc a;

    static {
        char[] toCharArray = "gdl/kQgy.wan".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 14;
                    break;
                case ay.f /*1*/:
                    i2 = 10;
                    break;
                case ay.n /*2*/:
                    i2 = 28;
                    break;
                case ay.p /*3*/:
                    i2 = 90;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    r2(kc kcVar) {
        this.a = kcVar;
    }

    public void onClick(View view) {
        ((InputMethodManager) kc.d(this.a).getSystemService(z)).hideSoftInputFromWindow(kc.e(this.a).getWindowToken(), 0);
        kc.a(this.a).a(this.a.findViewById(R.id.emoji_btn));
    }
}
