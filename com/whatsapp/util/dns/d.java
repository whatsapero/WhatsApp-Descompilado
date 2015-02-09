package com.whatsapp.util.dns;

import java.io.OutputStream;

class d {
    private static final String[] z;
    private final short a;
    private final h b;
    private final short c;
    private final int d;

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
        r2 = "_J\u000b\bCPM\u001b\u0014@XPX\u0019DBE";
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
        r0 = "T]\f\u0018V\u0016I\u0019\u0004\u0005XK\f]GS\u0004\u0016\bIZ";
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
        r2 = 37;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 54;
        goto L_0x0038;
    L_0x0043:
        r2 = 36;
        goto L_0x0038;
    L_0x0046:
        r2 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        goto L_0x0038;
    L_0x0049:
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.dns.d.<clinit>():void");
    }

    private d(h hVar, short s, short s2, int i) {
        this.b = hVar;
        this.c = s;
        this.a = s2;
        this.d = i;
    }

    static d a(h hVar, short s, short s2) {
        return new d(hVar, s, s2, hVar.c() + 4);
    }

    int a() {
        return this.d;
    }

    void a(OutputStream outputStream) {
        this.b.a(outputStream);
        a.a(outputStream, this.c);
        a.a(outputStream, this.a);
    }

    static d a(byte[] bArr, int i) {
        if (bArr == null) {
            try {
                throw new NullPointerException(z[1]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        h a = h.a(bArr, i);
        int c = a.c() + i;
        try {
            if (bArr.length >= c + 4) {
                return new d(a, a.a(bArr, c), a.a(bArr, c + 2), a.c() + 4);
            }
            throw new IllegalArgumentException(z[0]);
        } catch (NullPointerException e2) {
            throw e2;
        }
    }
}
