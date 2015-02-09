package com.whatsapp.accountsync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class AccountAuthenticatorService extends Service {
    private static c a;
    private static final String z;

    private c a() {
        if (a == null) {
            a = new c(this);
        }
        return a;
    }

    public IBinder onBind(Intent intent) {
        return intent.getAction().equals(z) ? a().getIBinder() : null;
    }

    static {
        char[] toCharArray = "\u001aZ;A.\u0012PqR\"\u0018[*]5\b\u001a\u001eP\"\u0014A1G\u0000\u000e@7V/\u000f]<R5\u0014F".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 123;
                    break;
                case ay.f /*1*/:
                    i2 = 52;
                    break;
                case ay.n /*2*/:
                    i2 = 95;
                    break;
                case ay.p /*3*/:
                    i2 = 51;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        a = null;
    }
}
