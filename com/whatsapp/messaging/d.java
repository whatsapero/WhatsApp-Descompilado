package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import com.whatsapp.protocol.c3;

public class d extends Handler {
    private final MessageService a;

    public static void a(Messenger messenger, boolean z) {
        int i = 0;
        if (z) {
            i = 1;
        }
        try {
            messenger.send(Message.obtain(null, 4, i, 0));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void d(Messenger messenger) {
        try {
            messenger.send(Message.obtain(null, 7));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void a(Messenger messenger, Message message) {
        message.what = 5;
        try {
            messenger.send(message);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void c(Messenger messenger) {
        try {
            messenger.send(Message.obtain(null, 3));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void a(Messenger messenger) {
        try {
            messenger.send(Message.obtain(null, 6));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(Messenger messenger) {
        try {
            messenger.send(Message.obtain(null, 1));
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

    public d(MessageService messageService) {
        this.a = messageService;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r5) {
        /*
        r4_this = this;
        r1 = 1;
        r2 = com.whatsapp.messaging.au.a;
        r0 = r5.what;	 Catch:{ RuntimeException -> 0x004d }
        switch(r0) {
            case 0: goto L_0x0009;
            case 1: goto L_0x0012;
            case 2: goto L_0x0019;
            case 3: goto L_0x0024;
            case 4: goto L_0x002b;
            case 5: goto L_0x0045;
            case 6: goto L_0x0037;
            case 7: goto L_0x003e;
            default: goto L_0x0008;
        };
    L_0x0008:
        return;
    L_0x0009:
        r0 = r4.a;	 Catch:{ RuntimeException -> 0x004f }
        r3 = r5.replyTo;	 Catch:{ RuntimeException -> 0x004f }
        com.whatsapp.messaging.MessageService.a(r0, r3);	 Catch:{ RuntimeException -> 0x004f }
        if (r2 == 0) goto L_0x0008;
    L_0x0012:
        r0 = r4.a;	 Catch:{ RuntimeException -> 0x0051 }
        com.whatsapp.messaging.MessageService.b(r0);	 Catch:{ RuntimeException -> 0x0051 }
        if (r2 == 0) goto L_0x0008;
    L_0x0019:
        r3 = r4.a;	 Catch:{ RuntimeException -> 0x0053 }
        r0 = r5.obj;	 Catch:{ RuntimeException -> 0x0053 }
        r0 = (com.whatsapp.protocol.c3) r0;	 Catch:{ RuntimeException -> 0x0053 }
        com.whatsapp.messaging.MessageService.a(r3, r0);	 Catch:{ RuntimeException -> 0x0053 }
        if (r2 == 0) goto L_0x0008;
    L_0x0024:
        r0 = r4.a;	 Catch:{ RuntimeException -> 0x0055 }
        com.whatsapp.messaging.MessageService.c(r0);	 Catch:{ RuntimeException -> 0x0055 }
        if (r2 == 0) goto L_0x0008;
    L_0x002b:
        r3 = r4.a;	 Catch:{ RuntimeException -> 0x0057 }
        r0 = r5.arg1;	 Catch:{ RuntimeException -> 0x0057 }
        if (r0 != r1) goto L_0x0059;
    L_0x0031:
        r0 = r1;
    L_0x0032:
        com.whatsapp.messaging.MessageService.c(r3, r0);	 Catch:{ RuntimeException -> 0x005b }
        if (r2 == 0) goto L_0x0008;
    L_0x0037:
        r0 = r4.a;	 Catch:{ RuntimeException -> 0x005d }
        com.whatsapp.messaging.MessageService.h(r0);	 Catch:{ RuntimeException -> 0x005d }
        if (r2 == 0) goto L_0x0008;
    L_0x003e:
        r0 = r4.a;	 Catch:{ RuntimeException -> 0x004b }
        com.whatsapp.messaging.MessageService.a(r0);	 Catch:{ RuntimeException -> 0x004b }
        if (r2 == 0) goto L_0x0008;
    L_0x0045:
        r0 = r4.a;	 Catch:{ RuntimeException -> 0x004b }
        com.whatsapp.messaging.MessageService.a(r0, r5);	 Catch:{ RuntimeException -> 0x004b }
        goto L_0x0008;
    L_0x004b:
        r0 = move-exception;
        throw r0;
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        r0 = 0;
        goto L_0x0032;
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x004b }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.d.handleMessage(android.os.Message):void");
    }

    public static void a(Messenger messenger, c3 c3Var) {
        try {
            messenger.send(Message.obtain(null, 2, c3Var));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
