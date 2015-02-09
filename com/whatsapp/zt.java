package com.whatsapp;

import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ax;
import org.whispersystems.libaxolotl.ay;

class zt implements ax {
    private static final String z;
    final a13 a;

    static {
        char[] toCharArray = "A/iv8T;&w2S$g}2\u00003cy%Y'rs8Nwn{3\u00009i:3A#g!wC>vr2R#cb#\u00008hv.".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 32;
                    break;
                case ay.f /*1*/:
                    i2 = 87;
                    break;
                case ay.n /*2*/:
                    i2 = 6;
                    break;
                case ay.p /*3*/:
                    i2 = 26;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    zt(a13 com_whatsapp_a13) {
        this.a = com_whatsapp_a13;
    }

    public void a(byte[] bArr) {
        if (!this.a.e.e()) {
            Log.i(z);
            this.a.e.b(bArr);
        }
        if (Conversation.r() && !this.a.c.a() && Conversation.t().u.equals(this.a.d) && this.a.a.a == 0) {
            this.a.e.a = 13;
        }
        App.aJ.e(this.a.e, -1);
    }
}
