package com.whatsapp;

import android.os.Handler.Callback;

class lk implements Callback {
    private static final String[] z;
    final SetStatus a;

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
        r2 = ">o>K\u007f\u001fhc]g\u000e2~Yc";
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
        r0 = "\rhqHb\r";
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
            case 1: goto L_0x0043;
            case 2: goto L_0x0046;
            case 3: goto L_0x0049;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 23;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        goto L_0x0038;
    L_0x0043:
        r2 = 28;
        goto L_0x0038;
    L_0x0046:
        r2 = 16;
        goto L_0x0038;
    L_0x0049:
        r2 = 60;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lk.<clinit>():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r5) {
        /*
        r4_this = this;
        r3 = 1;
        r2 = 0;
        r0 = r5.what;
        if (r0 != 0) goto L_0x002e;
    L_0x0006:
        r0 = com.whatsapp.App.p;
        r1 = 2131624956; // 0x7f0e03fc float:1.8877106E38 double:1.0531626606E-314;
        com.whatsapp.App.b(r0, r1, r2);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = com.whatsapp.App.af();
        r0 = r0.append(r1);
        r1 = z;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.App.q(r0);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x003d;
    L_0x002e:
        r0 = r5.obj;
        r0 = (android.os.Bundle) r0;
        r1 = z;
        r1 = r1[r3];
        r0 = r0.getString(r1);
        com.whatsapp.App.s(r0);
    L_0x003d:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lk.handleMessage(android.os.Message):boolean");
    }

    lk(SetStatus setStatus) {
        this.a = setStatus;
    }
}
