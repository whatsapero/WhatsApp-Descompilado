package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class aff implements Runnable {
    private static final String z;
    final ans a;

    static {
        char[] toCharArray = "_\\r]6[VxQ!MVi_&MZtL6J\\iZ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 41;
                    break;
                case ay.f /*1*/:
                    i2 = 51;
                    break;
                case ay.n /*2*/:
                    i2 = 27;
                    break;
                case ay.p /*3*/:
                    i2 = 62;
                    break;
                default:
                    i2 = 83;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        Throwable e;
        ans.a(this.a, true);
        try {
            ans.a(this.a);
        } catch (IOException e2) {
            e = e2;
            Log.b(z, e);
            ans.a(this.a, false);
        } catch (IllegalStateException e3) {
            e = e3;
            Log.b(z, e);
            ans.a(this.a, false);
        }
        ans.a(this.a, false);
    }

    aff(ans com_whatsapp_ans) {
        this.a = com_whatsapp_ans;
    }
}
