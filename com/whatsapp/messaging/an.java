package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class an extends Handler {
    private static final String z;
    final ak a;

    static {
        char[] toCharArray = "\u001e/\u0018!Y\u0005-\u0006?\u0013\u00056\u0001>\u0018I#\u000b%\u001f\u0010'G4\u000e\u0016+\u001a4\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 102;
                    break;
                case ay.f /*1*/:
                    i2 = 66;
                    break;
                case ay.n /*2*/:
                    i2 = 104;
                    break;
                case ay.p /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(long j) {
        sendMessageDelayed(Message.obtain(this, 1), j);
    }

    public void a() {
        removeMessages(1);
    }

    an(ak akVar, b3 b3Var) {
        this(akVar);
    }

    private an(ak akVar) {
        this.a = akVar;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case ay.f /*1*/:
                Log.i(z);
                removeMessages(1);
                ak.a(this.a, true);
            default:
        }
    }
}
