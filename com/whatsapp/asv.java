package com.whatsapp;

import com.whatsapp.protocol.bj;
import com.whatsapp.util.Log;

class asv implements Runnable {
    private static final String[] z;
    final mo a;
    final bj b;

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r6 = 25;
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "x\u001c\u000euzm\bAqt}D\u000fv5l\n\u0012|{mD\u0011kpr\u0001\u0018j.9\u0003\u0004wpk\u0005\u0015p{~D\u0012vx|D\u000f|b9\u000b\u000f|f";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000c:
        r2 = r2.toCharArray();
        r7 = r2.length;
        r8 = r7;
        r9 = r1;
        r7 = r2;
    L_0x0014:
        if (r8 > r9) goto L_0x0031;
    L_0x0016:
        r2 = new java.lang.String;
        r2.<init>(r7);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002c;
            default: goto L_0x0022;
        };
    L_0x0022:
        r4[r3] = r2;
        r2 = 1;
        r0 = "x\u001c\u000euzm\bAxei\u0001\u000f}|w\u0003Axq}\r\u0015pzw\u0005\r9ek\u0001\n|lj";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000c;
    L_0x002c:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x0031:
        r10 = r7[r9];
        r2 = r9 % 5;
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0044;
            case 2: goto L_0x0047;
            case 3: goto L_0x004a;
            default: goto L_0x0038;
        };
    L_0x0038:
        r2 = 21;
    L_0x003a:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0014;
    L_0x0042:
        r2 = r6;
        goto L_0x003a;
    L_0x0044:
        r2 = 100;
        goto L_0x003a;
    L_0x0047:
        r2 = 97;
        goto L_0x003a;
    L_0x004a:
        r2 = r6;
        goto L_0x003a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.asv.<clinit>():void");
    }

    asv(mo moVar, bj bjVar) {
        this.a = moVar;
        this.b = bjVar;
    }

    public void run() {
        Log.i(z[1]);
        if (!mo.a(this.a).a6.d()) {
            Log.i(z[0]);
            mo.a(this.a).a6.b();
        }
        mo.a(this.a).U().post(new pv(this, mo.a(this.a).a6.b(), mo.a(this.a).a6.a(), mo.a(this.a).a6.f(), mo.a(this.a).a6.c().a()));
    }
}
