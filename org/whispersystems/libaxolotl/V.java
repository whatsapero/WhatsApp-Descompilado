package org.whispersystems.libaxolotl;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import org.whispersystems.libaxolotl.ecc.a;
import org.whispersystems.libaxolotl.ecc.d;

public class v {
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
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "zD\u0010\u0005\t{B\u0016";
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
        r0 = "zD\u0010\u0005\t{B\u0016";
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
        r2 = 89;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 41;
        goto L_0x0038;
    L_0x0043:
        r2 = 12;
        goto L_0x0038;
    L_0x0046:
        r2 = 81;
        goto L_0x0038;
    L_0x0049:
        r2 = 52;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.v.<clinit>():void");
    }

    public static bX a(az azVar, int i) {
        a a = d.a();
        return new bX(i, System.currentTimeMillis(), a, d.a(azVar.a(), a.b().b()));
    }

    public static int a(int i) {
        try {
            return SecureRandom.getInstance(z[0]).nextInt(i);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static az a() {
        a a = d.a();
        return new az(new b2(a.b()), a.a());
    }

    public static int a(boolean z) {
        try {
            SecureRandom instance = SecureRandom.getInstance(z[1]);
            return z ? instance.nextInt(2147483646) + 1 : instance.nextInt(16380) + 1;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static List a(int i, int i2) {
        int i3 = aE.a;
        List linkedList = new LinkedList();
        int i4 = i - 1;
        int i5 = 0;
        while (i5 < i2) {
            linkedList.add(new bo(((i4 + i5) % (a9.a - 1)) + 1, d.a()));
            i5++;
            if (i3 != 0) {
                break;
            }
        }
        return linkedList;
    }
}
