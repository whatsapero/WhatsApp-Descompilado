package com.whatsapp;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a1x implements s4 {
    private static final String z;
    final CallsFragment a;

    static {
        char[] toCharArray = "Bc:\u0005%\u000em8*7Mn\u001a\u00061eg:\f\"Df".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 33;
                    break;
                case ay.f /*1*/:
                    i2 = 2;
                    break;
                case ay.n /*2*/:
                    i2 = 86;
                    break;
                case ay.p /*3*/:
                    i2 = 105;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a1x(CallsFragment callsFragment) {
        this.a = callsFragment;
    }

    public void a() {
        Log.i(z);
        CallsFragment.a(this.a);
    }
}
