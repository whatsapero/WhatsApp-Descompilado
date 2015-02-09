package com.whatsapp;

import android.provider.ContactsContract.Contacts;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class bx implements Runnable {
    private static final String z;
    final wj a;

    static {
        char[] toCharArray = "5%ZSD,\"[\u0016T;$B\u0016Y4".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 90;
                    break;
                case ay.f /*1*/:
                    i2 = 71;
                    break;
                case ay.n /*2*/:
                    i2 = 41;
                    break;
                case ay.p /*3*/:
                    i2 = 54;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        Log.i(z);
        App.p.getContentResolver().registerContentObserver(Contacts.CONTENT_URI, true, this.a);
    }

    bx(wj wjVar) {
        this.a = wjVar;
    }
}
