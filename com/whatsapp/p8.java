package com.whatsapp;

import android.os.Handler;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class p8 {
    public static final String a;
    public static final Handler b;

    static {
        String str;
        Object obj;
        if (App.aa == 1 && App.G == 0) {
            str = "\u0000:XVw\u0005 AV5\u0004!qQ2\u0017!BG*\u0006{RI7";
            obj = -1;
        } else {
            str = "\u0017;UT5\u001f1\u001cU/\u0006%^T.6\"YG.\u00054AVt\u0015:\\";
            obj = null;
        }
        char[] toCharArray = str.toCharArray();
        int length = toCharArray.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = toCharArray[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 118;
                    break;
                case ay.f /*1*/:
                    i2 = 85;
                    break;
                case ay.n /*2*/:
                    i2 = 49;
                    break;
                case ay.p /*3*/:
                    i2 = 38;
                    break;
                default:
                    i2 = 90;
                    break;
            }
            toCharArray[i] = (char) (i2 ^ c);
        }
        String intern = new String(toCharArray).intern();
        switch (obj) {
        }
        a = intern;
        b = new Handler(new a_1());
    }
}
