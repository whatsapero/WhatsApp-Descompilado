package com.whatsapp;

import android.os.Handler;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.messaging.au;
import java.util.HashMap;

final class pt extends Handler {
    private final HashMap a;

    private void a(String str, boolean z, boolean z2) {
        if (!hasMessages(0, str) && !hasMessages(3, str)) {
            if (!hasMessages(2, str) && App.aV() && z && (z2 || hasMessages(5, str))) {
                App.Q().b(au.k(str));
            }
            removeMessages(4, str);
            removeMessages(5, str);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.lang.String r12, boolean r13, int r14) {
        /*
        r11_this = this;
        r1 = 0;
        r2 = 1;
        r10 = 2;
        r3 = 0;
        r0 = r11.hasMessages(r2, r12);
        if (r0 != 0) goto L_0x008c;
    L_0x000a:
        r0 = 4;
        r0 = r11.hasMessages(r0, r12);
        if (r0 != 0) goto L_0x008c;
    L_0x0011:
        r11.removeMessages(r3, r12);
        r0 = r11.hasMessages(r10, r12);
        if (r0 != 0) goto L_0x0046;
    L_0x001a:
        r0 = 5;
        r0 = r11.hasMessages(r0, r12);
        if (r0 != 0) goto L_0x0046;
    L_0x0021:
        r0 = com.whatsapp.App.aV();
        if (r0 == 0) goto L_0x007d;
    L_0x0027:
        r4 = com.whatsapp.App.Q();
        if (r13 == 0) goto L_0x008d;
    L_0x002d:
        r0 = r12;
    L_0x002e:
        r0 = com.whatsapp.messaging.au.c(r0, r14);
        r4.b(r0);
        r0 = r11.a;
        r4 = java.lang.System.currentTimeMillis();
        r4 = java.lang.Long.valueOf(r4);
        r0.put(r12, r4);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x007d;
    L_0x0046:
        r0 = r11.a;
        r0 = r0.get(r12);
        r0 = (java.lang.Long) r0;
        r4 = java.lang.System.currentTimeMillis();
        if (r0 == 0) goto L_0x007d;
    L_0x0054:
        r6 = r0.longValue();
        r6 = r4 - r6;
        r8 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x007d;
    L_0x0060:
        r0 = com.whatsapp.App.aV();
        if (r0 == 0) goto L_0x007d;
    L_0x0066:
        r0 = com.whatsapp.App.Q();
        if (r13 == 0) goto L_0x006d;
    L_0x006c:
        r1 = r12;
    L_0x006d:
        r1 = com.whatsapp.messaging.au.c(r1, r14);
        r0.b(r1);
        r0 = r11.a;
        r1 = java.lang.Long.valueOf(r4);
        r0.put(r12, r1);
    L_0x007d:
        r11.removeMessages(r10, r12);
        if (r13 == 0) goto L_0x008f;
    L_0x0082:
        r0 = r2;
    L_0x0083:
        r0 = r11.obtainMessage(r10, r0, r3, r12);
        r2 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r11.sendMessageDelayed(r0, r2);
    L_0x008c:
        return;
    L_0x008d:
        r0 = r1;
        goto L_0x002e;
    L_0x008f:
        r0 = r3;
        goto L_0x0083;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.pt.b(java.lang.String, boolean, int):void");
    }

    private void a(String str, boolean z, int i) {
        if (!hasMessages(1, str) && !hasMessages(4, str)) {
            int i2;
            if (!hasMessages(2, str) && App.aV()) {
                String str2;
                MessageService Q = App.Q();
                if (z) {
                    str2 = str;
                } else {
                    str2 = null;
                }
                Q.b(au.c(str2, i));
            }
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            sendMessageDelayed(obtainMessage(5, i2, 0, str), 30000);
        }
    }

    pt() {
        this.a = new HashMap();
    }

    private void a(String str, boolean z) {
        if (!hasMessages(0, str) && !hasMessages(3, str)) {
            if (!hasMessages(5, str) && App.aV() && z) {
                App.Q().b(au.k(str));
            }
            removeMessages(1, str);
            removeMessages(2, str);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r7) {
        /*
        r6_this = this;
        r3 = 0;
        r2 = 1;
        r4 = com.whatsapp.App.az;
        r0 = r7.what;
        switch(r0) {
            case 0: goto L_0x000a;
            case 1: goto L_0x002a;
            case 2: goto L_0x002a;
            case 3: goto L_0x001a;
            case 4: goto L_0x0038;
            case 5: goto L_0x0046;
            default: goto L_0x0009;
        };
    L_0x0009:
        return;
    L_0x000a:
        r0 = r7.obj;
        r0 = (java.lang.String) r0;
        r1 = r7.arg1;
        if (r1 != r2) goto L_0x0053;
    L_0x0012:
        r1 = r2;
    L_0x0013:
        r5 = r7.arg2;
        r6.b(r0, r1, r5);
        if (r4 == 0) goto L_0x0009;
    L_0x001a:
        r0 = r7.obj;
        r0 = (java.lang.String) r0;
        r1 = r7.arg1;
        if (r1 != r2) goto L_0x0055;
    L_0x0022:
        r1 = r2;
    L_0x0023:
        r5 = r7.arg2;
        r6.a(r0, r1, r5);
        if (r4 == 0) goto L_0x0009;
    L_0x002a:
        r0 = r7.obj;
        r0 = (java.lang.String) r0;
        r1 = r7.arg1;
        if (r1 != r2) goto L_0x0057;
    L_0x0032:
        r1 = r2;
    L_0x0033:
        r6.a(r0, r1);
        if (r4 == 0) goto L_0x0009;
    L_0x0038:
        r0 = r7.obj;
        r0 = (java.lang.String) r0;
        r1 = r7.arg1;
        if (r1 != r2) goto L_0x0059;
    L_0x0040:
        r1 = r2;
    L_0x0041:
        r6.a(r0, r1, r3);
        if (r4 == 0) goto L_0x0009;
    L_0x0046:
        r0 = r7.obj;
        r0 = (java.lang.String) r0;
        r1 = r7.arg1;
        if (r1 != r2) goto L_0x004f;
    L_0x004e:
        r3 = r2;
    L_0x004f:
        r6.a(r0, r3, r2);
        goto L_0x0009;
    L_0x0053:
        r1 = r3;
        goto L_0x0013;
    L_0x0055:
        r1 = r3;
        goto L_0x0023;
    L_0x0057:
        r1 = r3;
        goto L_0x0033;
    L_0x0059:
        r1 = r3;
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.pt.handleMessage(android.os.Message):void");
    }
}
