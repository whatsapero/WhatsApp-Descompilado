package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import com.actionbarsherlock.R;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class am9 implements OnClickListener {
    private static final String z;
    final NewGroup a;

    static {
        char[] toCharArray = "e\u001dC8\fS\u001eV9\u0010c\u0017".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 12;
                    break;
                case ay.f /*1*/:
                    i2 = 115;
                    break;
                case ay.n /*2*/:
                    i2 = 51;
                    break;
                case ay.p /*3*/:
                    i2 = 77;
                    break;
                default:
                    i2 = 120;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        ((InputMethodManager) this.a.getSystemService(z)).hideSoftInputFromWindow(NewGroup.b(this.a).getWindowToken(), 0);
        NewGroup.d(this.a).a(this.a.findViewById(R.id.emoji_btn));
    }

    am9(NewGroup newGroup) {
        this.a = newGroup;
    }
}
