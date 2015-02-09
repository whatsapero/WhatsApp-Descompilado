package com.whatsapp;

import java.util.List;

final class a_h implements Runnable {
    final List a;
    final boolean b;
    final l3 c;
    final int d;
    final String e;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r8_this = this;
        r2 = 0;
        r3 = com.whatsapp.App.az;
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0099 }
        r4.<init>();	 Catch:{ all -> 0x0099 }
        r0 = r8.a;	 Catch:{ all -> 0x0099 }
        if (r0 == 0) goto L_0x005e;
    L_0x000c:
        r0 = r8.a;	 Catch:{ all -> 0x0099 }
        r5 = r0.iterator();	 Catch:{ all -> 0x0099 }
    L_0x0012:
        r0 = r5.hasNext();	 Catch:{ all -> 0x0099 }
        if (r0 == 0) goto L_0x005e;
    L_0x0018:
        r0 = r5.next();	 Catch:{ all -> 0x0099 }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ all -> 0x0099 }
        r1 = r0.a;	 Catch:{ all -> 0x0099 }
        r6 = 6;
        if (r1 != r6) goto L_0x0029;
    L_0x0023:
        r1 = com.whatsapp.bd.b(r0);	 Catch:{ all -> 0x0099 }
        if (r3 == 0) goto L_0x00a0;
    L_0x0029:
        r1 = new com.whatsapp.protocol.c5;	 Catch:{ all -> 0x0099 }
        r1.<init>();	 Catch:{ all -> 0x0099 }
        r1.d = r0;	 Catch:{ all -> 0x0099 }
        r6 = r0.J;	 Catch:{ all -> 0x0099 }
        if (r6 != 0) goto L_0x0056;
    L_0x0034:
        r6 = r0.e;	 Catch:{ all -> 0x0099 }
        r6 = r6.c;	 Catch:{ all -> 0x0099 }
        r6 = com.whatsapp.v.b(r6);	 Catch:{ all -> 0x0099 }
        r6 = r6.w();	 Catch:{ all -> 0x0099 }
        if (r6 == 0) goto L_0x0056;
    L_0x0042:
        r6 = r0.F;	 Catch:{ all -> 0x0099 }
        if (r6 == 0) goto L_0x0095;
    L_0x0046:
        r6 = com.whatsapp.App.P;	 Catch:{ all -> 0x0099 }
        r0 = r0.F;	 Catch:{ all -> 0x0099 }
        r0 = r6.a(r0);	 Catch:{ all -> 0x0099 }
    L_0x004e:
        r6 = r1.d;	 Catch:{ all -> 0x0099 }
        if (r0 == 0) goto L_0x0097;
    L_0x0052:
        r0 = r0.t;	 Catch:{ all -> 0x0099 }
    L_0x0054:
        r6.J = r0;	 Catch:{ all -> 0x0099 }
    L_0x0056:
        r0 = r1;
    L_0x0057:
        if (r0 == 0) goto L_0x005c;
    L_0x0059:
        r4.add(r0);	 Catch:{ all -> 0x0099 }
    L_0x005c:
        if (r3 == 0) goto L_0x0012;
    L_0x005e:
        r0 = r8.c;	 Catch:{ all -> 0x0099 }
        r0.b();	 Catch:{ all -> 0x0099 }
        r1 = new com.whatsapp.a15;	 Catch:{ all -> 0x0099 }
        r0 = new com.whatsapp.aa;	 Catch:{ all -> 0x0099 }
        r2 = r8.e;	 Catch:{ all -> 0x0099 }
        r5 = r8.a;	 Catch:{ all -> 0x0099 }
        r6 = r8.d;	 Catch:{ all -> 0x0099 }
        r7 = r8.b;	 Catch:{ all -> 0x0099 }
        r0.<init>(r2, r5, r6, r7);	 Catch:{ all -> 0x0099 }
        r1.<init>(r0);	 Catch:{ all -> 0x0099 }
        r0 = r8.e;	 Catch:{ all -> 0x0099 }
        if (r0 != 0) goto L_0x0081;
    L_0x0079:
        r0 = r8.d;	 Catch:{ all -> 0x0099 }
        r0 = com.whatsapp.messaging.au.a(r0, r4, r1);	 Catch:{ all -> 0x0099 }
        if (r3 == 0) goto L_0x0088;
    L_0x0081:
        r0 = r8.e;	 Catch:{ all -> 0x0099 }
        r2 = 4;
        r0 = com.whatsapp.messaging.au.b(r0, r4, r2, r1);	 Catch:{ all -> 0x0099 }
    L_0x0088:
        r1 = com.whatsapp.App.Q();	 Catch:{ all -> 0x0099 }
        r1.b(r0);	 Catch:{ all -> 0x0099 }
        r0 = r8.c;
        r0.a();
        return;
    L_0x0095:
        r0 = r2;
        goto L_0x004e;
    L_0x0097:
        r0 = r2;
        goto L_0x0054;
    L_0x0099:
        r0 = move-exception;
        r1 = r8.c;
        r1.a();
        throw r0;
    L_0x00a0:
        r0 = r1;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a_h.run():void");
    }

    a_h(List list, l3 l3Var, String str, int i, boolean z) {
        this.a = list;
        this.c = l3Var;
        this.e = str;
        this.d = i;
        this.b = z;
    }
}
