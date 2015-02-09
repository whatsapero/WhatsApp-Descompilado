package com.whatsapp;

import android.os.Handler;

final class akb extends Handler {
    private static final String[] z;

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
        r4 = 1;
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "h@*s;iMlb1tQ-b*i";
        r0 = -1;
        r5 = r3;
        r6 = r3;
        r3 = r1;
    L_0x000b:
        r2 = r2.toCharArray();
        r7 = r2.length;
        r8 = r7;
        r9 = r1;
        r7 = r2;
    L_0x0013:
        if (r8 > r9) goto L_0x002f;
    L_0x0015:
        r2 = new java.lang.String;
        r2.<init>(r7);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0021;
        };
    L_0x0021:
        r5[r3] = r2;
        r0 = "}W#t.:\bls;|W)r6:F#o*{F8r";
        r2 = r0;
        r3 = r4;
        r5 = r6;
        r0 = r1;
        goto L_0x000b;
    L_0x002a:
        r5[r3] = r2;
        z = r6;
        return;
    L_0x002f:
        r10 = r7[r9];
        r2 = r9 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0046;
            case 3: goto L_0x0049;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 94;
    L_0x0038:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0013;
    L_0x0040:
        r2 = 26;
        goto L_0x0038;
    L_0x0043:
        r2 = 37;
        goto L_0x0038;
    L_0x0046:
        r2 = 76;
        goto L_0x0038;
    L_0x0049:
        r2 = r4;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.akb.<clinit>():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r3) {
        /*
        r2_this = this;
        r0 = r3.what;
        if (r0 != 0) goto L_0x0010;
    L_0x0004:
        r0 = z;
        r1 = 1;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0022;
    L_0x0010:
        r0 = com.whatsapp.App.P;
        r0.b();
        r0 = com.whatsapp.App.Z;
        r0.b();
        r0 = z;
        r1 = 0;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
    L_0x0022:
        com.whatsapp.App.a8();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.akb.handleMessage(android.os.Message):void");
    }

    akb() {
    }
}
