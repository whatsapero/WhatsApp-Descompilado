package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;

public class af extends Handler {
    private final ak a;
    private boolean b;

    public static void a(Messenger messenger) {
        try {
            messenger.send(Message.obtain(null, 1));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void a(Messenger messenger, Message message) {
        message.what = 0;
        try {
            messenger.send(message);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void a() {
        this.b = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r3) {
        /*
        r2_this = this;
        r0 = com.whatsapp.messaging.au.a;
        r1 = r3.what;	 Catch:{ RuntimeException -> 0x003c }
        switch(r1) {
            case 0: goto L_0x0008;
            case 1: goto L_0x000f;
            case 2: goto L_0x001a;
            case 3: goto L_0x0034;
            default: goto L_0x0007;
        };
    L_0x0007:
        return;
    L_0x0008:
        r1 = r2.a;	 Catch:{ RuntimeException -> 0x003e }
        com.whatsapp.messaging.ak.b(r1, r3);	 Catch:{ RuntimeException -> 0x003e }
        if (r0 == 0) goto L_0x0007;
    L_0x000f:
        r1 = r2.b;	 Catch:{ RuntimeException -> 0x0040 }
        if (r1 != 0) goto L_0x0007;
    L_0x0013:
        r1 = r2.a;	 Catch:{ RuntimeException -> 0x0042 }
        com.whatsapp.messaging.ak.e(r1);	 Catch:{ RuntimeException -> 0x0042 }
        if (r0 == 0) goto L_0x0007;
    L_0x001a:
        r1 = r2.b;	 Catch:{ RuntimeException -> 0x0044 }
        if (r1 != 0) goto L_0x0007;
    L_0x001e:
        r1 = r2.a;	 Catch:{ RuntimeException -> 0x0046 }
        r1 = com.whatsapp.messaging.ak.j(r1);	 Catch:{ RuntimeException -> 0x0046 }
        if (r1 == 0) goto L_0x002d;
    L_0x0026:
        r1 = r2.a;	 Catch:{ RuntimeException -> 0x0048 }
        com.whatsapp.messaging.ak.e(r1);	 Catch:{ RuntimeException -> 0x0048 }
        if (r0 == 0) goto L_0x0007;
    L_0x002d:
        r1 = r2.a;	 Catch:{ RuntimeException -> 0x003a }
        com.whatsapp.messaging.ak.c(r1);	 Catch:{ RuntimeException -> 0x003a }
        if (r0 == 0) goto L_0x0007;
    L_0x0034:
        r0 = r2.a;	 Catch:{ RuntimeException -> 0x003a }
        com.whatsapp.messaging.ak.b(r0);	 Catch:{ RuntimeException -> 0x003a }
        goto L_0x0007;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x003a }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.af.handleMessage(android.os.Message):void");
    }

    public static void c(Messenger messenger) {
        try {
            messenger.send(Message.obtain(null, 3));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(Messenger messenger) {
        try {
            messenger.send(Message.obtain(null, 2));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public af(ak akVar) {
        super(akVar.getLooper());
        this.b = false;
        this.a = akVar;
    }
}
