package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class t_ implements OnClickListener {
    private static final String z;
    final lv a;

    static {
        char[] toCharArray = "\u0010UL'd\u0016UY v\u000fU\u0004=n\fS\u0004*x\fU\u0004-{\u000bS@+s".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 98;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 43;
                    break;
                case ay.p /*3*/:
                    i2 = 78;
                    break;
                default:
                    i2 = 23;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    t_(lv lvVar) {
        this.a = lvVar;
    }

    public void onClick(View view) {
        Log.i(z);
        this.a.g.startActivity(new Intent(this.a.g, Main.class));
        this.a.g.finish();
        RegisterName.a(null);
        this.a.g.removeDialog(0);
        App.p.B.a(App.p);
    }
}
