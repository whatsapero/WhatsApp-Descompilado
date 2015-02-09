package com.whatsapp;

import android.os.RemoteException;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class avk implements Runnable {
    private static final String z;
    final t0 a;
    rj b;

    static {
        char[] toCharArray = "^\bp[^@\u001d$[Z@\bnSI\u0001\u001bl[TZ\f$SCM\fyBRA\u0007)".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 46;
                    break;
                case ay.f /*1*/:
                    i2 = 105;
                    break;
                case ay.n /*2*/:
                    i2 = 9;
                    break;
                case ay.p /*3*/:
                    i2 = 54;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        if (t0.c(this.a) == 1) {
            try {
                this.b.a();
                t0.e(this.a).removeMessages(5);
                t0.e(this.a).sendEmptyMessageDelayed(5, 60000);
                return;
            } catch (RemoteException e) {
                Log.e(z + e.toString());
                t0.e(this.a).sendMessageAtFrontOfQueue(t0.e(this.a).obtainMessage(3, 0, 0, this));
                t0.e(this.a).sendMessageAtFrontOfQueue(t0.e(this.a).obtainMessage(4, 0, 0, null));
                if (App.az == 0) {
                    return;
                }
            }
        }
        t0.e(this.a).sendMessageAtFrontOfQueue(t0.e(this.a).obtainMessage(3, 0, 0, this));
    }

    avk(t0 t0Var, rj rjVar) {
        this.a = t0Var;
        this.b = rjVar;
    }
}
