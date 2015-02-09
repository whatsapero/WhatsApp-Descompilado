package com.whatsapp;

import com.whatsapp.util.b4;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class akz implements Runnable {
    private static final String z;
    final App a;

    static {
        char[] toCharArray = "/\u000eziu \u001dx#{:\u001b%'j>\u001c\u007f(~\"\u001b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 126;
                    break;
                case ay.n /*2*/:
                    i2 = 10;
                    break;
                case ay.p /*3*/:
                    i2 = 70;
                    break;
                default:
                    i2 = 26;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        try {
            b4.a(3, z, new File(this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 0).dataDir));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }

    akz(App app) {
        this.a = app;
    }
}
