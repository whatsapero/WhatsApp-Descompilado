package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class hd implements OnClickListener {
    private static final String z;
    final EditText a;
    final Advanced b;

    static {
        char[] toCharArray = "x^'zFbE'gMeTu`B}".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 17;
                    break;
                case ay.f /*1*/:
                    i2 = 49;
                    break;
                case ay.n /*2*/:
                    i2 = 7;
                    break;
                case ay.p /*3*/:
                    i2 = 14;
                    break;
                default:
                    i2 = 35;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    hd(Advanced advanced, EditText editText) {
        this.b = advanced;
        this.a = editText;
    }

    public void onClick(View view) {
        App.v(z);
        try {
            Advanced.a(this.b, App.r.b(), Integer.parseInt(this.a.getText().toString()));
        } catch (Throwable e) {
            Log.c(e);
        } catch (Throwable e2) {
            Log.b(e2);
        }
    }
}
