package com.whatsapp.protocol;

class as extends w {
    private static final String[] z;
    final Runnable a;
    final j b;
    final byte[] c;
    final byte[] d;
    final String e;

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
        r6 = 89;
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "Y+U*-U";
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
        r0 = "J8_).U+H";
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
            case 0: goto L_0x0041;
            case 1: goto L_0x0044;
            case 2: goto L_0x0046;
            case 3: goto L_0x0049;
            default: goto L_0x0038;
        };
    L_0x0038:
        r2 = r6;
    L_0x0039:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0014;
    L_0x0041:
        r2 = 58;
        goto L_0x0039;
    L_0x0044:
        r2 = r6;
        goto L_0x0039;
    L_0x0046:
        r2 = 44;
        goto L_0x0039;
    L_0x0049:
        r2 = 90;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.as.<clinit>():void");
    }

    public void a(int i) {
        j.a(this.b).a(i, null, this.e, this.d, this.c, this.a);
    }

    as(j jVar, String str, byte[] bArr, byte[] bArr2, Runnable runnable) {
        this.b = jVar;
        this.e = str;
        this.d = bArr;
        this.c = bArr2;
        this.a = runnable;
    }

    public void a(bi biVar, String str) {
        bi a = biVar.a(0);
        bi.b(a, z[0]);
        j.a(this.b).a(0, a.d(z[1]).b, this.e, this.d, this.c, this.a);
    }
}
