package com.whatsapp.util;

import android.os.SystemClock;

public class y {
    private static final String[] z;
    private String a;
    private final boolean b;
    private boolean c;
    private long d;

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
        r6 = 2;
        r1 = 0;
        r3 = new java.lang.String[r6];
        r2 = "vt8\\\b-n!V\n8=";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r7 = r2.length;
        r8 = r7;
        r9 = r1;
        r7 = r2;
    L_0x0012:
        if (r8 > r9) goto L_0x002f;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r7);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "-i<T\u001fp2&M\u0015r'u";
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
        r10 = r7[r9];
        r2 = r9 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0042;
            case 2: goto L_0x0045;
            case 3: goto L_0x0048;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
    L_0x0038:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = r6;
        goto L_0x0038;
    L_0x0042:
        r2 = 29;
        goto L_0x0038;
    L_0x0045:
        r2 = 85;
        goto L_0x0038;
    L_0x0048:
        r2 = 57;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.y.<clinit>():void");
    }

    public long b(String str) {
        long c = c();
        a(str);
        return c;
    }

    public void a(String str) {
        this.a = str;
        this.c = true;
        b();
    }

    public y(boolean z) {
        this.c = false;
        this.a = null;
        this.d = 0;
        this.b = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long c() {
        /*
        r8_this = this;
        r7 = 0;
        r0 = 0;
        r2 = r8.d;
        r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r2 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r2 = r8.a();
        r4 = r8.d;
        r2 = r2 - r4;
        r4 = r8.c;
        if (r4 == 0) goto L_0x0054;
    L_0x0015:
        r4 = r8.a;
        if (r4 == 0) goto L_0x003c;
    L_0x0019:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = r8.a;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 1;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r2);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = com.whatsapp.util.Log.e;
        if (r4 == 0) goto L_0x0054;
    L_0x003c:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r5 = r5[r7];
        r4 = r4.append(r5);
        r4 = r4.append(r2);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
    L_0x0054:
        r8.d = r0;
        r8.c = r7;
        r0 = 0;
        r8.a = r0;
        r0 = r2;
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.y.c():long");
    }

    private long a() {
        return this.b ? SystemClock.elapsedRealtime() : SystemClock.uptimeMillis();
    }

    public y() {
        this(false);
    }

    public void b() {
        if (this.c && this.a == null) {
            this.d = a();
        } else {
            this.d = a();
        }
    }

    public y(String str) {
        this(false);
        a(str);
    }
}
