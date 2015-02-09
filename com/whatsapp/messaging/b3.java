package com.whatsapp.messaging;

import android.os.Handler.Callback;
import android.os.Message;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class b3 implements Callback {
    private static final String z;
    final ak a;

    static {
        char[] toCharArray = "F\n_\u00163M\u0002]\u0010u]\u0002\u0000\nsY\u000eAIhW\nJ\tiJHJ\u001elW\u0015J\u0002".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 62;
                    break;
                case ay.f /*1*/:
                    i2 = 103;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 102;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean handleMessage(Message message) {
        Log.e(z);
        this.a.i();
        return true;
    }

    b3(ak akVar) {
        this.a = akVar;
    }
}
