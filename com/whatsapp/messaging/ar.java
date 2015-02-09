package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.j;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ar extends Handler {
    private static final String z;
    private final ak a;

    static {
        char[] toCharArray = "s7\u000eGYh5\u0010Y\u0013h.\u0017X\u0018$(\u001bT\u0000$-\f^\u0002n(!C\u001ey?\u001fS)y?\u001fS\u000f".toCharArray();
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
                    i2 = 90;
                    break;
                case ay.n /*2*/:
                    i2 = 126;
                    break;
                case ay.p /*3*/:
                    i2 = 55;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public ar(ak akVar) {
        super(akVar.getLooper());
        this.a = akVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r4) {
        /*
        r3_this = this;
        r1 = com.whatsapp.messaging.au.a;
        r0 = r4.what;	 Catch:{ RuntimeException -> 0x002d }
        switch(r0) {
            case 0: goto L_0x0008;
            case 1: goto L_0x0016;
            case 2: goto L_0x0021;
            default: goto L_0x0007;
        };
    L_0x0007:
        return;
    L_0x0008:
        r0 = z;	 Catch:{ RuntimeException -> 0x002f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x002f }
        r0 = r3.a;	 Catch:{ RuntimeException -> 0x002f }
        r2 = r4.replyTo;	 Catch:{ RuntimeException -> 0x002f }
        com.whatsapp.messaging.ak.a(r0, r2);	 Catch:{ RuntimeException -> 0x002f }
        if (r1 == 0) goto L_0x0007;
    L_0x0016:
        r2 = r3.a;	 Catch:{ RuntimeException -> 0x002b }
        r0 = r4.obj;	 Catch:{ RuntimeException -> 0x002b }
        r0 = (com.whatsapp.protocol.j) r0;	 Catch:{ RuntimeException -> 0x002b }
        com.whatsapp.messaging.ak.a(r2, r0);	 Catch:{ RuntimeException -> 0x002b }
        if (r1 == 0) goto L_0x0007;
    L_0x0021:
        r1 = r3.a;	 Catch:{ RuntimeException -> 0x002b }
        r0 = r4.obj;	 Catch:{ RuntimeException -> 0x002b }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ RuntimeException -> 0x002b }
        com.whatsapp.messaging.ak.a(r1, r0);	 Catch:{ RuntimeException -> 0x002b }
        goto L_0x0007;
    L_0x002b:
        r0 = move-exception;
        throw r0;
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x002f }
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x002b }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ar.handleMessage(android.os.Message):void");
    }

    public static void a(Messenger messenger, b bVar) {
        try {
            messenger.send(Message.obtain(null, 2, bVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void a(Messenger messenger, j jVar) {
        try {
            messenger.send(Message.obtain(null, 1, jVar));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void a(Messenger messenger, Messenger messenger2) {
        Message obtain = Message.obtain(null, 0);
        obtain.replyTo = messenger2;
        try {
            messenger.send(obtain);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
