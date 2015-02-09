package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class fi implements OnClickListener {
    private static final String z;
    final RegisterName a;

    static {
        char[] toCharArray = "Kv#4\u000eMv63\u001cTvk>\u0011Pp/8\u0019".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 57;
                    break;
                case ay.f /*1*/:
                    i2 = 19;
                    break;
                case ay.n /*2*/:
                    i2 = 68;
                    break;
                case ay.p /*3*/:
                    i2 = 93;
                    break;
                default:
                    i2 = 125;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Log.i(z);
        RegisterName.k(this.a);
    }

    fi(RegisterName registerName) {
        this.a = registerName;
    }
}
