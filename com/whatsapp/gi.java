package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class gi implements OnClickListener {
    private static final String z;
    final MultipleContactsSelector a;

    static {
        char[] toCharArray = "3UXe\u0006\u0005VMd\u001a5_".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 90;
                    break;
                case ay.f /*1*/:
                    i2 = 59;
                    break;
                case ay.n /*2*/:
                    i2 = 40;
                    break;
                case ay.p /*3*/:
                    i2 = 16;
                    break;
                default:
                    i2 = 114;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    gi(MultipleContactsSelector multipleContactsSelector) {
        this.a = multipleContactsSelector;
    }

    public void onClick(View view) {
        if (this.a.k.size() < this.a.j()) {
            App.a(this.a.getBaseContext(), String.format(App.aX.a(R.plurals.n_contacts_must_be_selected, this.a.j()), new Object[]{Integer.valueOf(this.a.j())}), 0);
            if (App.az == 0) {
                return;
            }
        }
        ((InputMethodManager) this.a.getSystemService(z)).hideSoftInputFromWindow(this.a.r.getWindowToken(), 0);
        this.a.h();
    }
}
