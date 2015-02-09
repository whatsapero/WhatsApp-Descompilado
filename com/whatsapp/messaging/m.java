package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.f;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class m extends Handler {
    private static final String z;
    final ak a;

    static {
        char[] toCharArray = "s]P''h_N9mhDI8f$]S0znSE>x\u007f\u001fN8fn".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 11;
                    break;
                case ay.f /*1*/:
                    i2 = 48;
                    break;
                case ay.n /*2*/:
                    i2 = 32;
                    break;
                case ay.p /*3*/:
                    i2 = 87;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private m(ak akVar) {
        this.a = akVar;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case PBE.MD5 /*0*/:
                if (f.a(((b) message.obj).a, 4) < 0) {
                    Log.w(z);
                    removeMessages(0);
                    ak.a(this.a, true);
                }
            default:
        }
    }

    m(ak akVar, b3 b3Var) {
        this(akVar);
    }

    public void a(b bVar, long j) {
        sendMessageDelayed(Message.obtain(this, 0, bVar), j);
    }

    public void a() {
        removeMessages(0);
    }
}
