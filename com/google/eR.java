package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class er {
    private static final String[] z;
    private final M a;
    private String[] b;
    private final b4[] c;
    private volatile boolean d;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "g\u001bgPWG\n~FWW\u001ckPW]\u001cz\u0003\u001fR\u0005k\u0003\u0012K\u0007kM\u0004Z\u001c`PY".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 51;
                    break;
                case ay.f /*1*/:
                    i2 = 115;
                    break;
                case ay.n /*2*/:
                    i2 = 14;
                    break;
                case ay.p /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 119;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "u\u001akO\u0013w\u0016}@\u0005Z\u0003zL\u0005\u0013\u0017aF\u0004\u0013\u001daWW^\u0012z@\u001f\u0013\u001ekP\u0004R\u0014k\u0003\u0003J\u0003k\r".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 51;
                    break;
                case ay.f /*1*/:
                    i2 = 115;
                    break;
                case ay.n /*2*/:
                    i2 = 14;
                    break;
                case ay.p /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 119;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public er(M m, String[] strArr) {
        this.a = m;
        this.b = strArr;
        this.c = new b4[m.e().size()];
        this.d = false;
    }

    static M a(er erVar) {
        return erVar.a;
    }

    static b4 a(er erVar, dW dWVar) {
        return erVar.a(dWVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.er a(java.lang.Class r7, java.lang.Class r8) {
        /*
        r6_this = this;
        r2 = com.google.dy.b;
        r0 = r6.d;	 Catch:{ IllegalArgumentException -> 0x0007 }
        if (r0 == 0) goto L_0x0009;
    L_0x0006:
        return r6;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        monitor-enter(r6);
        r0 = r6.d;	 Catch:{ all -> 0x0010 }
        if (r0 == 0) goto L_0x0013;
    L_0x000e:
        monitor-exit(r6);	 Catch:{ all -> 0x0010 }
        goto L_0x0006;
    L_0x0010:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0010 }
        throw r0;
    L_0x0013:
        r0 = 0;
        r1 = r0;
    L_0x0015:
        r0 = r6.c;	 Catch:{ all -> 0x0010 }
        r0 = r0.length;	 Catch:{ all -> 0x0010 }
        if (r1 >= r0) goto L_0x00a8;
    L_0x001a:
        r0 = r6.a;	 Catch:{ all -> 0x0010 }
        r0 = r0.e();	 Catch:{ all -> 0x0010 }
        r0 = r0.get(r1);	 Catch:{ all -> 0x0010 }
        r0 = (com.google.dW) r0;	 Catch:{ all -> 0x0010 }
        r3 = r0.a();	 Catch:{ IllegalArgumentException -> 0x00b1 }
        if (r3 == 0) goto L_0x0069;
    L_0x002c:
        r3 = r0.f();	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r4 = com.google.f0.MESSAGE;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        if (r3 != r4) goto L_0x0043;
    L_0x0034:
        r3 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r4 = new com.google.ae;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r5 = r6.b;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r5 = r5[r1];	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r4.<init>(r0, r5, r7, r8);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r3[r1] = r4;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        if (r2 == 0) goto L_0x00a4;
    L_0x0043:
        r3 = r0.f();	 Catch:{ IllegalArgumentException -> 0x00b5 }
        r4 = com.google.f0.ENUM;	 Catch:{ IllegalArgumentException -> 0x00b5 }
        if (r3 != r4) goto L_0x005a;
    L_0x004b:
        r3 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r4 = new com.google.aW;	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r5 = r6.b;	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r5 = r5[r1];	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r4.<init>(r0, r5, r7, r8);	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r3[r1] = r4;	 Catch:{ IllegalArgumentException -> 0x00b7 }
        if (r2 == 0) goto L_0x00a4;
    L_0x005a:
        r3 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r4 = new com.google.Z;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r5 = r6.b;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r5 = r5[r1];	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r4.<init>(r0, r5, r7, r8);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r3[r1] = r4;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        if (r2 == 0) goto L_0x00a4;
    L_0x0069:
        r3 = r0.f();	 Catch:{ IllegalArgumentException -> 0x00bb }
        r4 = com.google.f0.MESSAGE;	 Catch:{ IllegalArgumentException -> 0x00bb }
        if (r3 != r4) goto L_0x0080;
    L_0x0071:
        r3 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00bd }
        r4 = new com.google.d1;	 Catch:{ IllegalArgumentException -> 0x00bd }
        r5 = r6.b;	 Catch:{ IllegalArgumentException -> 0x00bd }
        r5 = r5[r1];	 Catch:{ IllegalArgumentException -> 0x00bd }
        r4.<init>(r0, r5, r7, r8);	 Catch:{ IllegalArgumentException -> 0x00bd }
        r3[r1] = r4;	 Catch:{ IllegalArgumentException -> 0x00bd }
        if (r2 == 0) goto L_0x00a4;
    L_0x0080:
        r3 = r0.f();	 Catch:{ IllegalArgumentException -> 0x00bf }
        r4 = com.google.f0.ENUM;	 Catch:{ IllegalArgumentException -> 0x00bf }
        if (r3 != r4) goto L_0x0097;
    L_0x0088:
        r3 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r4 = new com.google.dA;	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r5 = r6.b;	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r5 = r5[r1];	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r4.<init>(r0, r5, r7, r8);	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r3[r1] = r4;	 Catch:{ IllegalArgumentException -> 0x00c1 }
        if (r2 == 0) goto L_0x00a4;
    L_0x0097:
        r3 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r4 = new com.google.dq;	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r5 = r6.b;	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r5 = r5[r1];	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r4.<init>(r0, r5, r7, r8);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r3[r1] = r4;	 Catch:{ IllegalArgumentException -> 0x00c3 }
    L_0x00a4:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x00c5;
    L_0x00a8:
        r0 = 1;
        r6.d = r0;	 Catch:{ all -> 0x0010 }
        r0 = 0;
        r6.b = r0;	 Catch:{ all -> 0x0010 }
        monitor-exit(r6);	 Catch:{ all -> 0x0010 }
        goto L_0x0006;
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b9 }
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0010 }
    L_0x00c5:
        r1 = r0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.er.a(java.lang.Class, java.lang.Class):com.google.er");
    }

    private b4 a(dW dWVar) {
        try {
            if (dWVar.g() != this.a) {
                throw new IllegalArgumentException(z[1]);
            }
            try {
                if (!dWVar.n()) {
                    return this.c[dWVar.d()];
                }
                throw new IllegalArgumentException(z[0]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
