package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class r4 extends Handler {
    private static final String z;
    final VerifySms a;

    static {
        char[] toCharArray = "dQl\u0003>sP".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 22;
                    break;
                case ay.f /*1*/:
                    i2 = 52;
                    break;
                case ay.n /*2*/:
                    i2 = 24;
                    break;
                case ay.p /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case ay.f /*1*/:
                a5w.a(new uc(this.a), new String[]{(String) message.obj, z});
            default:
        }
    }

    r4(VerifySms verifySms, AnonymousClass_1 anonymousClass_1) {
        this(verifySms);
    }

    private r4(VerifySms verifySms) {
        this.a = verifySms;
    }
}
