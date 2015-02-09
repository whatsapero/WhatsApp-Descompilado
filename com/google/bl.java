package com.google;

public final class bL extends bN {
    private static final String[] z;
    private final int c;
    private final int d;
    private final byte[] e;
    private final int f;
    private final int g;

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
        r2 = "\u0019n\f\\P(y\u0000X\u00114{\u000fIP>s\u0006_P4s\u0017\f\u00163hC[\u0019.t\nBP3q\u0002K\u0015zx\u0002X\u0011t";
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
        r0 = "\by\u0012Y\u0015)h\u0006HP(s\u0014\f\u0019)<\fY\u0004)u\u0007IP.t\u0006\f\u00197}\u0004IJz";
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
        r2 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 90;
        goto L_0x0038;
    L_0x0043:
        r2 = 28;
        goto L_0x0038;
    L_0x0046:
        r2 = 99;
        goto L_0x0038;
    L_0x0049:
        r2 = 44;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bL.<clinit>():void");
    }

    public byte[] b() {
        int i = 0;
        int i2 = bm.a;
        int c = c();
        int d = d();
        try {
            if (c == this.f) {
                if (d == this.g) {
                    return this.e;
                }
            }
            int i3 = c * d;
            byte[] bArr = new byte[i3];
            int i4 = (this.d * this.f) + this.c;
            try {
                try {
                    if (c == this.f) {
                        System.arraycopy(this.e, i4, bArr, 0, i3);
                        return bArr;
                    }
                    Object obj = this.e;
                    while (i < d) {
                        System.arraycopy(obj, i4, bArr, i * c, c);
                        i4 += this.f;
                        i++;
                        if (i2 != 0) {
                            return bArr;
                        }
                    }
                    return bArr;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] a(int r5, byte[] r6) {
        /*
        r4_this = this;
        if (r5 < 0) goto L_0x0008;
    L_0x0002:
        r0 = r4.d();	 Catch:{ IllegalArgumentException -> 0x0024 }
        if (r5 < r0) goto L_0x0026;
    L_0x0008:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0024 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0024 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0024 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0024 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0024 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0024 }
        r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x0024 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0024 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0024 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = r4.c();
        if (r6 == 0) goto L_0x002f;
    L_0x002c:
        r1 = r6.length;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r1 >= r0) goto L_0x0031;
    L_0x002f:
        r6 = new byte[r0];
    L_0x0031:
        r1 = r4.d;
        r1 = r1 + r5;
        r2 = r4.f;
        r1 = r1 * r2;
        r2 = r4.c;
        r1 = r1 + r2;
        r2 = r4.e;
        r3 = 0;
        java.lang.System.arraycopy(r2, r1, r6, r3, r0);
        return r6;
    L_0x0041:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bL.a(int, byte[]):byte[]");
    }

    public bL(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            try {
                throw new IllegalArgumentException(z[0]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            this.e = bArr;
            this.f = i;
            this.g = i2;
            this.c = i3;
            this.d = i4;
            if (z) {
                a(i5, i6);
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private void a(int i, int i2) {
        int i3 = bm.a;
        byte[] bArr = this.e;
        int i4 = this.c + (this.d * this.f);
        int i5 = 0;
        while (i5 < i2) {
            int i6 = i4 + (i / 2);
            int i7 = (i4 + i) - 1;
            int i8 = i4;
            while (i8 < i6) {
                byte b = bArr[i8];
                bArr[i8] = bArr[i7];
                bArr[i7] = b;
                i8++;
                i7--;
                if (i3 != 0) {
                    break;
                }
            }
            i7 = i5 + 1;
            i4 += this.f;
            if (i3 == 0) {
                i5 = i7;
            } else {
                return;
            }
        }
    }
}
