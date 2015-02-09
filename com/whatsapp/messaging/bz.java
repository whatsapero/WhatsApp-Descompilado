package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import com.whatsapp.protocol.j;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class bz extends Handler {
    private static final String z;
    private final a3 a;

    static {
        char[] toCharArray = "F\u000fjW\u007fI\u0010sS5LMhB3HMyH>P\u0007yS5Z".toCharArray();
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
                    i2 = 98;
                    break;
                case ay.n /*2*/:
                    i2 = 26;
                    break;
                case ay.p /*3*/:
                    i2 = 39;
                    break;
                default:
                    i2 = 80;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public static void a(Messenger messenger, Message message) {
        message.what = 2;
        try {
            messenger.send(message);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void a(Messenger messenger) {
        try {
            messenger.send(Message.obtain(null, 1));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void a(Messenger messenger, j jVar) {
        try {
            messenger.send(Message.obtain(null, 0, jVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public bz(a3 a3Var) {
        super(a3Var.getLooper());
        this.a = a3Var;
    }

    public void handleMessage(Message message) {
        try {
            switch (message.what) {
                case PBE.MD5 /*0*/:
                    Log.i(z);
                    a3.a(this.a, (j) message.obj);
                case ay.f /*1*/:
                    a3.d(this.a);
                case ay.n /*2*/:
                    a3.a(this.a, message);
                default:
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
