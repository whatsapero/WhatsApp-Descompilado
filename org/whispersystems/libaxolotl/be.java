package org.whispersystems.libaxolotl;

import java.text.ParseException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class be {
    private static final String[] z;
    private final SecretKeySpec a;
    private final IvParameterSpec b;
    private final SecretKeySpec c;

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
        r2 = "-w\u0001";
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
        r0 = "$_3_s$s`\t\u0016";
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
        r2 = 32;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        goto L_0x0038;
    L_0x0043:
        r2 = 50;
        goto L_0x0038;
    L_0x0046:
        r2 = 82;
        goto L_0x0038;
    L_0x0049:
        r2 = 60;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.be.<clinit>():void");
    }

    public SecretKeySpec c() {
        return this.c;
    }

    public be(byte[] bArr) {
        boolean z = false;
        boolean z2 = aZ.a;
        try {
            byte[][] a = aE.a(bArr, 32, 32, 16);
            this.a = new SecretKeySpec(a[0], z[0]);
            this.c = new SecretKeySpec(a[1], z[1]);
            this.b = new IvParameterSpec(a[2]);
            if (z2) {
                try {
                    if (!bD.m) {
                        z = true;
                    }
                    bD.m = z;
                } catch (ParseException e) {
                    throw e;
                }
            }
        } catch (ParseException e2) {
            throw new AssertionError(e2);
        }
    }

    public IvParameterSpec a() {
        return this.b;
    }

    public SecretKeySpec b() {
        return this.a;
    }
}
