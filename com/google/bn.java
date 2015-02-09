package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class bN {
    private static final String z;
    private final int a;
    private final int b;

    static {
        char[] toCharArray = "e\fmrR]\u0011ih\u001cP\ngdRB\u000bqs\u0011TD`n\u0017BDjn\u0006\u0011\u0017qq\u0002^\u0016p!\u0000^\u0010eu\u001b^\n$c\u000b\u0011]4!\u0016T\u0003vd\u0017BJ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 49;
                    break;
                case ay.f /*1*/:
                    i2 = 100;
                    break;
                case ay.n /*2*/:
                    i2 = 4;
                    break;
                case ay.p /*3*/:
                    i2 = 1;
                    break;
                default:
                    i2 = 114;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public abstract byte[] a(int i, byte[] bArr);

    public abstract byte[] b();

    public bN e() {
        throw new UnsupportedOperationException(z);
    }

    public final int d() {
        return this.a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
        r8_this = this;
        r1 = 0;
        r5 = com.google.bm.a;
        r0 = r8.b;
        r0 = new byte[r0];
        r6 = new java.lang.StringBuilder;
        r2 = r8.a;
        r3 = r8.b;
        r3 = r3 + 1;
        r2 = r2 * r3;
        r6.<init>(r2);
        r2 = r0;
        r0 = r1;
    L_0x0015:
        r3 = r8.a;
        if (r0 >= r3) goto L_0x0050;
    L_0x0019:
        r2 = r8.a(r0, r2);
        r3 = r1;
    L_0x001e:
        r4 = r8.b;
        if (r3 >= r4) goto L_0x0047;
    L_0x0022:
        r4 = r2[r3];
        r7 = r4 & 255;
        r4 = 64;
        if (r7 >= r4) goto L_0x002e;
    L_0x002a:
        r4 = 35;
        if (r5 == 0) goto L_0x0040;
    L_0x002e:
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r7 >= r4) goto L_0x0036;
    L_0x0032:
        r4 = 43;
        if (r5 == 0) goto L_0x0040;
    L_0x0036:
        r4 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        if (r7 >= r4) goto L_0x003e;
    L_0x003a:
        r4 = 46;
        if (r5 == 0) goto L_0x0040;
    L_0x003e:
        r4 = 32;
    L_0x0040:
        r6.append(r4);
        r3 = r3 + 1;
        if (r5 == 0) goto L_0x001e;
    L_0x0047:
        r3 = 10;
        r6.append(r3);
        r0 = r0 + 1;
        if (r5 == 0) goto L_0x0015;
    L_0x0050:
        r0 = r6.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bN.toString():java.lang.String");
    }

    public final int c() {
        return this.b;
    }

    public boolean a() {
        return false;
    }

    protected bN(int i, int i2) {
        this.b = i;
        this.a = i2;
    }
}
