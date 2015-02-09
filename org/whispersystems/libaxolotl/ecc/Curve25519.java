package org.whispersystems.libaxolotl.ecc;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.Z;
import org.whispersystems.libaxolotl.ay;
import org.whispersystems.libaxolotl.bD;

public class Curve25519 {
    private static final SecureRandom a;
    private static final String[] z;

    private static native byte[] calculateAgreement(byte[] bArr, byte[] bArr2);

    private static native byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private static native byte[] generatePrivateKey(byte[] bArr);

    private static native byte[] generatePublicKey(byte[] bArr);

    private static native boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 111;
                    break;
                case ay.f /*1*/:
                    i2 = 54;
                    break;
                case ay.n /*2*/:
                    i2 = 7;
                    break;
                case ay.p /*3*/:
                    i2 = 73;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 36);
        }
        return toCharArray;
    }

    static boolean a(f fVar, byte[] bArr, byte[] bArr2) {
        return verifySignature(((b) fVar).a(), bArr, bArr2);
    }

    static f a(byte[] bArr, int i) {
        boolean z = false;
        boolean z2 = d.a;
        int i2 = bArr[i] & 255;
        Object obj = new Object[32];
        System.arraycopy(bArr, i + 1, obj, 0, obj.length);
        if (i2 != 5) {
            throw new Z(z[1] + i2);
        }
        f bVar = new b(obj);
        if (z2) {
            if (!bD.m) {
                z = true;
            }
            bD.m = z;
        }
        return bVar;
    }

    public static a a() {
        byte[] b = b();
        return new a(new b(generatePublicKey(b)), new c(b));
    }

    static byte[] a(f fVar, e eVar) {
        return calculateAgreement(((c) eVar).a(), ((b) fVar).a());
    }

    private static byte[] a(int i) {
        try {
            byte[] bArr = new byte[i];
            SecureRandom.getInstance(z[0]).nextBytes(bArr);
            return bArr;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    static byte[] a(e eVar, byte[] bArr) {
        return calculateSignature(a(64), ((c) eVar).a(), bArr);
    }

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
        r1 = -1;
        r2 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r0 = "<~Fxt=x@";
        r4 = r2;
        r5 = r3;
        r6 = r3;
        r3 = r0;
        r0 = r1;
    L_0x000c:
        r3 = z(r3);
        r3 = z(r3);
        switch(r0) {
            case 0: goto L_0x0021;
            default: goto L_0x0017;
        };
    L_0x0017:
        r5[r4] = r3;
        r3 = 1;
        r0 = "-WciO\nO'=]\u001fS=i";
        r4 = r3;
        r5 = r6;
        r3 = r0;
        r0 = r2;
        goto L_0x000c;
    L_0x0021:
        r5[r4] = r3;
        z = r6;
        r0 = "\fCu?A]\u00032x\u001d";
        r0 = z(r0);
        z(r0);
        r0 = "\fCu?A]\u00032x\u001d";	 Catch:{ UnsatisfiedLinkError -> 0x0042 }
    L_0x0030:
        r0 = z(r0);
        r0 = z(r0);
        switch(r1) {
            case 0: goto L_0x005a;
            default: goto L_0x003b;
        };
    L_0x003b:
        java.lang.System.loadLibrary(r0);	 Catch:{ UnsatisfiedLinkError -> 0x0042 }
    L_0x003e:
        r0 = "<~Fxt=x@";	 Catch:{ NoSuchAlgorithmException -> 0x0061 }
        r1 = r2;
        goto L_0x0030;
    L_0x0042:
        r0 = move-exception;
        r1 = org.whispersystems.libaxolotl.A.a;	 Catch:{ UnsatisfiedLinkError -> 0x0057 }
        if (r1 == 0) goto L_0x0059;	 Catch:{ UnsatisfiedLinkError -> 0x0057 }
    L_0x0047:
        r1 = org.whispersystems.libaxolotl.A.a;	 Catch:{ UnsatisfiedLinkError -> 0x0057 }
        r3 = "\fCu?A]\u00032x\u001d";	 Catch:{ UnsatisfiedLinkError -> 0x0057 }
        r3 = z(r3);
        r3 = z(r3);
        r1.a(r0, r3);	 Catch:{ UnsatisfiedLinkError -> 0x0057 }
        goto L_0x003e;
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        throw r0;
    L_0x005a:
        r0 = java.security.SecureRandom.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0061 }
        a = r0;	 Catch:{ NoSuchAlgorithmException -> 0x0061 }
        return;
    L_0x0061:
        r0 = move-exception;
        r1 = new java.lang.AssertionError;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.libaxolotl.ecc.Curve25519.<clinit>():void");
    }

    private static byte[] b() {
        byte[] bArr = new byte[32];
        a.nextBytes(bArr);
        return generatePrivateKey(bArr);
    }
}
