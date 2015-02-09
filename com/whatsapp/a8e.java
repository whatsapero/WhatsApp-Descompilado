package com.whatsapp;

import com.whatsapp.protocol.bj;
import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;

class a8e implements Runnable {
    private static final String[] z;
    final m a;
    final jg b;
    final bj c;

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
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "bH\u001b\u001a2w\\T\u00128oU\u0000\u001f3d\u0010\u0007\u0013.pY\u001b\u0018.#V\u001b\u0004}";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r6 = r2.length;
        r7 = r6;
        r8 = r1;
        r6 = r2;
    L_0x0012:
        if (r7 > r8) goto L_0x002f;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "#T\u0001\u0013}w_T\u00058qF\u0011\u0004}s\\\u0015\u001f3wU\f\u0002}qU\u0017\u00134sDT\u00102q\u0010";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x002f:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0042;
            case 2: goto L_0x0045;
            case 3: goto L_0x0048;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 93;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 3;
        goto L_0x0038;
    L_0x0042:
        r2 = 48;
        goto L_0x0038;
    L_0x0045:
        r2 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        goto L_0x0038;
    L_0x0048:
        r2 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a8e.<clinit>():void");
    }

    public void run() {
        long a = f_.a(this.a.c);
        Log.i(z[0] + a + z[1] + this.a);
        jg.a(this.b).a6.c(a);
        jg.a(this.b).a6.a(a, null);
        jg.a(this.b).U().post(new na(this));
    }

    a8e(jg jgVar, m mVar, bj bjVar) {
        this.b = jgVar;
        this.a = mVar;
        this.c = bjVar;
    }
}
