package com.whatsapp;

import android.os.Handler;

class lc extends Handler {
    final a10 a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r10) {
        /*
        r9_this = this;
        r3 = 0;
        r8 = 2;
        r4 = 1;
        r5 = com.whatsapp.m3.d;
        r0 = r10.what;
        switch(r0) {
            case 1: goto L_0x000b;
            case 2: goto L_0x0027;
            case 3: goto L_0x001a;
            case 4: goto L_0x000a;
            case 5: goto L_0x0070;
            case 6: goto L_0x009e;
            case 7: goto L_0x00cc;
            case 8: goto L_0x00e6;
            case 9: goto L_0x000a;
            case 10: goto L_0x0100;
            case 11: goto L_0x004c;
            case 12: goto L_0x0113;
            default: goto L_0x000a;
        };
    L_0x000a:
        return;
    L_0x000b:
        r0 = r9.a;
        r1 = r0.a;
        r2 = r10.arg1;
        r0 = r10.obj;
        r0 = (com.whatsapp.protocol.b) r0;
        com.whatsapp.l7.a(r1, r2, r0);
        if (r5 == 0) goto L_0x000a;
    L_0x001a:
        r0 = r9.a;
        r1 = r0.a;
        r0 = r10.obj;
        r0 = (com.whatsapp.protocol.b) r0;
        r1.h(r0);
        if (r5 == 0) goto L_0x000a;
    L_0x0027:
        r0 = r10.obj;
        r0 = (com.whatsapp.protocol.b) r0;
        r1 = r9.a;
        r1 = r1.a;
        r2 = r10.arg1;
        r1 = com.whatsapp.l7.a(r1, r0, r2);
        if (r1 == 0) goto L_0x000a;
    L_0x0037:
        r1 = r9.a;
        r1 = r1.a;
        r1 = com.whatsapp.l7.c(r1);
        r2 = r10.arg1;
        r6 = r10.arg2;
        r0 = android.os.Message.obtain(r1, r8, r2, r6, r0);
        r0.sendToTarget();
        if (r5 == 0) goto L_0x000a;
    L_0x004c:
        r0 = r10.obj;
        r0 = (com.whatsapp.protocol.b) r0;
        r1 = r9.a;
        r1 = r1.a;
        r1 = com.whatsapp.l7.a(r1, r0);
        r2 = r9.a;
        r2 = r2.a;
        r6 = com.whatsapp.l7.c(r2);
        r7 = 10;
        if (r1 != 0) goto L_0x0125;
    L_0x0064:
        r2 = r3;
    L_0x0065:
        if (r1 != 0) goto L_0x0128;
    L_0x0067:
        r0 = android.os.Message.obtain(r6, r7, r2, r3, r0);
        r0.sendToTarget();
        if (r5 == 0) goto L_0x000a;
    L_0x0070:
        r0 = r10.obj;
        r0 = (java.lang.String) r0;
        r1 = r9.a;
        r1 = r1.a;
        r1 = com.whatsapp.l7.b(r1);
        r1 = android.os.Message.obtain(r1, r4, r0);
        r1.sendToTarget();
        r1 = r9.a;
        r1 = r1.a;
        r1 = com.whatsapp.l7.a(r1, r0);
        if (r1 == 0) goto L_0x000a;
    L_0x008d:
        r1 = r9.a;
        r1 = r1.a;
        r1 = com.whatsapp.l7.b(r1);
        r0 = android.os.Message.obtain(r1, r8, r0);
        r0.sendToTarget();
        if (r5 == 0) goto L_0x000a;
    L_0x009e:
        r0 = r10.obj;
        r0 = (java.lang.String) r0;
        r1 = r9.a;
        r1 = r1.a;
        r1 = com.whatsapp.l7.b(r1);
        r1 = android.os.Message.obtain(r1, r4, r0);
        r1.sendToTarget();
        r1 = r9.a;
        r1 = r1.a;
        r1 = com.whatsapp.l7.b(r1, r0);
        if (r1 == 0) goto L_0x000a;
    L_0x00bb:
        r1 = r9.a;
        r1 = r1.a;
        r1 = com.whatsapp.l7.b(r1);
        r0 = android.os.Message.obtain(r1, r8, r0);
        r0.sendToTarget();
        if (r5 == 0) goto L_0x000a;
    L_0x00cc:
        r0 = r9.a;
        r0 = r0.a;
        com.whatsapp.l7.h(r0);
        r0 = r9.a;
        r0 = r0.a;
        r0 = com.whatsapp.l7.b(r0);
        r1 = 8;
        r0 = android.os.Message.obtain(r0, r1);
        r0.sendToTarget();
        if (r5 == 0) goto L_0x000a;
    L_0x00e6:
        r0 = r9.a;
        r0 = r0.a;
        com.whatsapp.l7.i(r0);
        r0 = r9.a;
        r0 = r0.a;
        r0 = com.whatsapp.l7.b(r0);
        r1 = 9;
        r0 = android.os.Message.obtain(r0, r1);
        r0.sendToTarget();
        if (r5 == 0) goto L_0x000a;
    L_0x0100:
        r0 = r10.obj;
        r0 = (com.whatsapp.o3) r0;
        r1 = r9.a;
        r1 = r1.a;
        r2 = r0.c;
        r3 = r0.a;
        r0 = r0.b;
        com.whatsapp.l7.a(r1, r2, r3, r0);
        if (r5 == 0) goto L_0x000a;
    L_0x0113:
        r0 = r9.a;
        r0 = r0.a;
        r0 = com.whatsapp.l7.a(r0);
        r1 = 7;
        r0 = android.os.Message.obtain(r0, r1);
        r0.sendToTarget();
        goto L_0x000a;
    L_0x0125:
        r2 = r4;
        goto L_0x0065;
    L_0x0128:
        r0 = r1;
        goto L_0x0067;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lc.handleMessage(android.os.Message):void");
    }

    lc(a10 com_whatsapp_a10) {
        this.a = com_whatsapp_a10;
    }
}
