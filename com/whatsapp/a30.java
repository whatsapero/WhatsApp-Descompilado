package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a30 implements OnClickListener {
    private static final String z;
    final EditText a;
    final Advanced b;

    static {
        char[] toCharArray = "\\\u001a\u007fC)F\u0001\u007fR4A\u0010-Y-Y".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 53;
                    break;
                case ay.f /*1*/:
                    i2 = 117;
                    break;
                case ay.n /*2*/:
                    i2 = 95;
                    break;
                case ay.p /*3*/:
                    i2 = 55;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a30(Advanced advanced, EditText editText) {
        this.b = advanced;
        this.a = editText;
    }

    public void onClick(View view) {
        App.v(z);
        try {
            Advanced.a(this.b, App.aB.b(), Integer.parseInt(this.a.getText().toString()));
        } catch (Throwable e) {
            Log.c(e);
        } catch (Throwable e2) {
            Log.b(e2);
        }
    }
}
