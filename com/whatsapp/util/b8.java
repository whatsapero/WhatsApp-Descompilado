package com.whatsapp.util;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class b8 extends Thread {
    private static final String z;
    final bw a;

    static {
        char[] toCharArray = "F\u0016\u0016.\u0018C\u0014\u0016-RK\u0012\u00049\u0011N\u0002W".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 47;
                    break;
                case ay.f /*1*/:
                    i2 = 123;
                    break;
                case ay.n /*2*/:
                    i2 = 119;
                    break;
                case ay.p /*3*/:
                    i2 = 73;
                    break;
                default:
                    i2 = 125;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    b8(bw bwVar) {
        this.a = bwVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r7_this = this;
        r2 = com.whatsapp.util.Log.e;
    L_0x0002:
        r0 = r7.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r0 = r0.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r0 = com.whatsapp.util.aa.a(r0);	 Catch:{ InterruptedException -> 0x00b7 }
        r0 = r0.size();	 Catch:{ InterruptedException -> 0x00b7 }
        if (r0 != 0) goto L_0x0025;
    L_0x0010:
        r0 = r7.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r0 = r0.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r1 = com.whatsapp.util.aa.a(r0);	 Catch:{ InterruptedException -> 0x00b7 }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x00b7 }
        r0 = r7.a;	 Catch:{ all -> 0x00b4 }
        r0 = r0.a;	 Catch:{ all -> 0x00b4 }
        r0 = com.whatsapp.util.aa.a(r0);	 Catch:{ all -> 0x00b4 }
        r0.wait();	 Catch:{ all -> 0x00b4 }
        monitor-exit(r1);	 Catch:{ all -> 0x00b4 }
    L_0x0025:
        r0 = r7.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r0 = r0.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r0 = com.whatsapp.util.aa.a(r0);	 Catch:{ InterruptedException -> 0x00b7 }
        r0 = r0.size();	 Catch:{ InterruptedException -> 0x00b7 }
        if (r0 == 0) goto L_0x00ad;
    L_0x0033:
        r0 = r7.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r0 = r0.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r1 = com.whatsapp.util.aa.a(r0);	 Catch:{ InterruptedException -> 0x00b7 }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x00b7 }
        r0 = r7.a;	 Catch:{ all -> 0x00b9 }
        r0 = r0.a;	 Catch:{ all -> 0x00b9 }
        r0 = com.whatsapp.util.aa.a(r0);	 Catch:{ all -> 0x00b9 }
        r0 = r0.pop();	 Catch:{ all -> 0x00b9 }
        r0 = (com.whatsapp.util.i) r0;	 Catch:{ all -> 0x00b9 }
        monitor-exit(r1);	 Catch:{ all -> 0x00b9 }
        r1 = r7.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r3 = com.whatsapp.util.bw.a(r1, r0);	 Catch:{ InterruptedException -> 0x00b7 }
        r1 = r0.d;	 Catch:{ InterruptedException -> 0x00b7 }
        if (r1 != 0) goto L_0x006a;
    L_0x0055:
        r1 = r7.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r1 = com.whatsapp.util.bw.b(r1);	 Catch:{ InterruptedException -> 0x00b7 }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x00b7 }
        r4 = r7.a;	 Catch:{ all -> 0x00bc }
        r4 = com.whatsapp.util.bw.b(r4);	 Catch:{ all -> 0x00bc }
        r5 = r0.e;	 Catch:{ all -> 0x00bc }
        r4.put(r5, r3);	 Catch:{ all -> 0x00bc }
        monitor-exit(r1);	 Catch:{ all -> 0x00bc }
        if (r2 == 0) goto L_0x006f;
    L_0x006a:
        r1 = r0.d;	 Catch:{ InterruptedException -> 0x00bf }
        r1.a(r3);	 Catch:{ InterruptedException -> 0x00bf }
    L_0x006f:
        r1 = r0.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r1 = r1.getTag();	 Catch:{ InterruptedException -> 0x00b7 }
        r1 = (java.lang.String) r1;	 Catch:{ InterruptedException -> 0x00b7 }
        r4 = r0.e;	 Catch:{ InterruptedException -> 0x00b7 }
        r1 = r1.equals(r4);	 Catch:{ InterruptedException -> 0x00b7 }
        if (r1 == 0) goto L_0x00ad;
    L_0x007f:
        r1 = new com.whatsapp.util.bz;	 Catch:{ InterruptedException -> 0x00b7 }
        r4 = r7.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r5 = r0.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r6 = r0.e;	 Catch:{ InterruptedException -> 0x00b7 }
        r1.<init>(r4, r3, r5, r6);	 Catch:{ InterruptedException -> 0x00b7 }
        r3 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x00b7 }
        r3.<init>();	 Catch:{ InterruptedException -> 0x00b7 }
        r4 = z;	 Catch:{ InterruptedException -> 0x00b7 }
        r3 = r3.append(r4);	 Catch:{ InterruptedException -> 0x00b7 }
        r4 = r0.c;	 Catch:{ InterruptedException -> 0x00b7 }
        r3 = r3.append(r4);	 Catch:{ InterruptedException -> 0x00b7 }
        r3 = r3.toString();	 Catch:{ InterruptedException -> 0x00b7 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ InterruptedException -> 0x00b7 }
        r0 = r0.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r0 = r0.getContext();	 Catch:{ InterruptedException -> 0x00b7 }
        r0 = (android.app.Activity) r0;	 Catch:{ InterruptedException -> 0x00b7 }
        r0.runOnUiThread(r1);	 Catch:{ InterruptedException -> 0x00b7 }
    L_0x00ad:
        r0 = java.lang.Thread.interrupted();	 Catch:{ InterruptedException -> 0x00b7 }
        if (r0 == 0) goto L_0x0002;
    L_0x00b3:
        return;
    L_0x00b4:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00b4 }
        throw r0;	 Catch:{ InterruptedException -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        goto L_0x00b3;
    L_0x00b9:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00b9 }
        throw r0;	 Catch:{ InterruptedException -> 0x00b7 }
    L_0x00bc:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00bc }
        throw r0;	 Catch:{ InterruptedException -> 0x00b7 }
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00b7 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.b8.run():void");
    }
}
