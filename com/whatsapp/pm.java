package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class pm implements asc {
    private static final String z;
    final as8 a;

    static {
        char[] toCharArray = "]]\u0017".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 55;
                    break;
                case ay.f /*1*/:
                    i2 = 52;
                    break;
                case ay.n /*2*/:
                    i2 = 115;
                    break;
                case ay.p /*3*/:
                    i2 = 78;
                    break;
                default:
                    i2 = 21;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a() {
        if (this.a.a.getIntent().getStringExtra(z) != null) {
            this.a.a.finish();
            if (App.az == 0) {
                return;
            }
        }
        AccountInfoActivity.a(this.a.a);
    }

    pm(as8 com_whatsapp_as8) {
        this.a = com_whatsapp_as8;
    }
}
