package org;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class j implements d, b {
    static final byte[] e;
    private static final byte[] f;
    private static final byte[] l;
    private static final byte[] o;
    private static final String z;
    private int a;
    private int b;
    private int c;
    private final byte[] d;
    private final int g;
    private byte[] h;
    private int i;
    private boolean j;
    private final int k;
    private final int m;
    private final byte[] n;
    private int p;

    void a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            try {
                if (bArr.length == i2) {
                    this.h = bArr;
                    this.i = i;
                    this.p = i;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public j(int i, byte[] bArr, boolean z) {
        int i2 = 0;
        boolean z2 = f.a;
        if (bArr == null) {
            bArr = e;
            i = 0;
        }
        if (i > 0) {
            try {
                i2 = (i / 4) * 4;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            byte[] bArr2;
            this.k = i2;
            this.n = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.n, 0, bArr.length);
            if (i > 0) {
                this.g = bArr.length + 4;
                if (z2) {
                    h.a++;
                }
                this.m = this.g - 1;
                if (c(bArr)) {
                    if (z) {
                        bArr2 = f;
                    } else {
                        try {
                            bArr2 = l;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    this.d = bArr2;
                    return;
                }
                throw new IllegalArgumentException(new StringBuffer().append(z).append(f.a(bArr)).append("]").toString());
            }
            this.g = 4;
            this.m = this.g - 1;
            if (c(bArr)) {
                if (z) {
                    bArr2 = f;
                } else {
                    bArr2 = l;
                }
                this.d = bArr2;
                return;
            }
            throw new IllegalArgumentException(new StringBuffer().append(z).append(f.a(bArr)).append("]").toString());
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public byte[] a(byte[] bArr) {
        try {
            b();
            if (bArr == null) {
                return bArr;
            }
            try {
                if (bArr.length == 0) {
                    return bArr;
                }
                byte[] bArr2 = new byte[((int) ((long) ((bArr.length * 3) / 4)))];
                a(bArr2, 0, bArr2.length);
                c(bArr, 0, bArr.length);
                c(bArr, 0, -1);
                bArr = new byte[this.i];
                b(bArr, 0, bArr.length);
                return bArr;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(byte r2) {
        /*
        r0 = 61;
        if (r2 == r0) goto L_0x0012;
    L_0x0004:
        if (r2 < 0) goto L_0x0018;
    L_0x0006:
        r0 = o;	 Catch:{ IllegalArgumentException -> 0x0014 }
        r0 = r0.length;	 Catch:{ IllegalArgumentException -> 0x0014 }
        if (r2 >= r0) goto L_0x0018;
    L_0x000b:
        r0 = o;	 Catch:{ IllegalArgumentException -> 0x0016 }
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x0016 }
        r1 = -1;
        if (r0 == r1) goto L_0x0018;
    L_0x0012:
        r0 = 1;
    L_0x0013:
        return r0;
    L_0x0014:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0016 }
    L_0x0016:
        r0 = move-exception;
        throw r0;
    L_0x0018:
        r0 = 0;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.j.a(byte):boolean");
    }

    public j() {
        this(false);
    }

    public static byte[] b(byte[] bArr) {
        return new j().a(bArr);
    }

    private void b() {
        this.h = null;
        this.i = 0;
        this.p = 0;
        this.b = 0;
        this.a = 0;
        this.j = false;
    }

    static {
        char[] toCharArray = "8[;\u0011s1B0\u0006A ]'TM!A!TN;Fu\u0017O:F4\u001dNtP4\u0007Eb\u0006u\u0017H5@4\u0017T1@&N\u0000\u000f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 84;
                    break;
                case ay.f /*1*/:
                    i2 = 50;
                    break;
                case ay.n /*2*/:
                    i2 = 85;
                    break;
                case ay.p /*3*/:
                    i2 = 116;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        e = new byte[]{(byte) 13, (byte) 10};
        f = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};
        l = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 45, (byte) 95};
        o = new byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 62, (byte) -1, (byte) 62, (byte) -1, (byte) 63, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14, (byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23, (byte) 24, (byte) 25, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 63, (byte) -1, (byte) 26, (byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35, (byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44, (byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51};
    }

    public j(boolean z) {
        this(76, e, z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void c(byte[] r7, int r8, int r9) {
        /*
        r6_this = this;
        r2 = org.f.a;
        r0 = r6.j;	 Catch:{ IllegalArgumentException -> 0x0007 }
        if (r0 == 0) goto L_0x0009;
    L_0x0006:
        return;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        if (r9 >= 0) goto L_0x000e;
    L_0x000b:
        r0 = 1;
        r6.j = r0;	 Catch:{ IllegalArgumentException -> 0x00da }
    L_0x000e:
        r0 = 0;
    L_0x000f:
        if (r0 >= r9) goto L_0x0086;
    L_0x0011:
        r1 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00dc }
        if (r1 == 0) goto L_0x001f;
    L_0x0015:
        r1 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00de }
        r1 = r1.length;	 Catch:{ IllegalArgumentException -> 0x00de }
        r3 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00de }
        r1 = r1 - r3;
        r3 = r6.m;	 Catch:{ IllegalArgumentException -> 0x00de }
        if (r1 >= r3) goto L_0x0022;
    L_0x001f:
        r6.c();	 Catch:{ IllegalArgumentException -> 0x00de }
    L_0x0022:
        r1 = r8 + 1;
        r3 = r7[r8];
        r4 = 61;
        if (r3 != r4) goto L_0x002f;
    L_0x002a:
        r4 = 1;
        r6.j = r4;	 Catch:{ IllegalArgumentException -> 0x00e0 }
        if (r2 == 0) goto L_0x0086;
    L_0x002f:
        if (r3 < 0) goto L_0x0082;
    L_0x0031:
        r4 = o;	 Catch:{ IllegalArgumentException -> 0x00e2 }
        r4 = r4.length;	 Catch:{ IllegalArgumentException -> 0x00e2 }
        if (r3 >= r4) goto L_0x0082;
    L_0x0036:
        r4 = o;
        r3 = r4[r3];
        if (r3 < 0) goto L_0x0082;
    L_0x003c:
        r4 = r6.a;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r4 = r4 + 1;
        r6.a = r4;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r4 = r4 % 4;
        r6.a = r4;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r4 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r4 = r4 << 6;
        r3 = r3 + r4;
        r6.c = r3;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r3 = r6.a;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        if (r3 != 0) goto L_0x0082;
    L_0x0051:
        r3 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r4 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r5 = r4 + 1;
        r6.i = r5;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r5 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r5 = r5 >> 16;
        r5 = r5 & 255;
        r5 = (byte) r5;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r3[r4] = r5;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r3 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r4 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r5 = r4 + 1;
        r6.i = r5;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r5 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r5 = r5 >> 8;
        r5 = r5 & 255;
        r5 = (byte) r5;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r3[r4] = r5;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r3 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r4 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r5 = r4 + 1;
        r6.i = r5;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r5 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r5 = r5 & 255;
        r5 = (byte) r5;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        r3[r4] = r5;	 Catch:{ IllegalArgumentException -> 0x00e4 }
    L_0x0082:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x00ec;
    L_0x0086:
        r0 = r6.j;	 Catch:{ IllegalArgumentException -> 0x00e6 }
        if (r0 == 0) goto L_0x0006;
    L_0x008a:
        r0 = r6.a;	 Catch:{ IllegalArgumentException -> 0x00e8 }
        if (r0 == 0) goto L_0x0006;
    L_0x008e:
        r0 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00ea }
        r0 = r0 << 6;
        r6.c = r0;	 Catch:{ IllegalArgumentException -> 0x00ea }
        r0 = r6.a;	 Catch:{ IllegalArgumentException -> 0x00ea }
        switch(r0) {
            case 2: goto L_0x009b;
            case 3: goto L_0x00b4;
            default: goto L_0x0099;
        };
    L_0x0099:
        goto L_0x0006;
    L_0x009b:
        r0 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r0 = r0 << 6;
        r6.c = r0;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r0 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r1 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r3 = r1 + 1;
        r6.i = r3;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r3 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r3 = r3 >> 16;
        r3 = r3 & 255;
        r3 = (byte) r3;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r0[r1] = r3;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        if (r2 == 0) goto L_0x0006;
    L_0x00b4:
        r0 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r1 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r2 = r1 + 1;
        r6.i = r2;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r2 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r2 = r2 >> 16;
        r2 = r2 & 255;
        r2 = (byte) r2;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r0[r1] = r2;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r0 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r1 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r2 = r1 + 1;
        r6.i = r2;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r2 = r6.c;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r2 = r2 >> 8;
        r2 = r2 & 255;
        r2 = (byte) r2;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r0[r1] = r2;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        goto L_0x0006;
    L_0x00d8:
        r0 = move-exception;
        throw r0;
    L_0x00da:
        r0 = move-exception;
        throw r0;
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;
    L_0x00e4:
        r0 = move-exception;
        throw r0;
    L_0x00e6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e8 }
    L_0x00e8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ea }
    L_0x00ea:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d8 }
    L_0x00ec:
        r8 = r1;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.j.c(byte[], int, int):void");
    }

    private static boolean c(byte[] bArr) {
        boolean z = f.a;
        int i = 0;
        while (i < bArr.length) {
            try {
                if (a(bArr[i])) {
                    return true;
                }
                i++;
                if (z) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int b(byte[] r5, int r6, int r7) {
        /*
        r4_this = this;
        r0 = 0;
        r2 = org.f.a;
        r1 = r4.h;
        if (r1 == 0) goto L_0x0034;
    L_0x0007:
        r0 = r4.a();
        r0 = java.lang.Math.min(r0, r7);
        r1 = r4.h;	 Catch:{ IllegalArgumentException -> 0x002e }
        if (r1 == r5) goto L_0x002a;
    L_0x0013:
        r1 = r4.h;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r3 = r4.p;	 Catch:{ IllegalArgumentException -> 0x0030 }
        java.lang.System.arraycopy(r1, r3, r5, r6, r0);	 Catch:{ IllegalArgumentException -> 0x0030 }
        r1 = r4.p;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r1 = r1 + r0;
        r4.p = r1;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r1 = r4.p;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r3 = r4.i;	 Catch:{ IllegalArgumentException -> 0x0030 }
        if (r1 < r3) goto L_0x002d;
    L_0x0025:
        r1 = 0;
        r4.h = r1;	 Catch:{ IllegalArgumentException -> 0x0032 }
        if (r2 == 0) goto L_0x002d;
    L_0x002a:
        r1 = 0;
        r4.h = r1;	 Catch:{ IllegalArgumentException -> 0x0032 }
    L_0x002d:
        return r0;
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r1 = r4.j;	 Catch:{ IllegalArgumentException -> 0x0043 }
        if (r1 == 0) goto L_0x0045;
    L_0x0038:
        r1 = -1;
    L_0x0039:
        r3 = org.h.a;	 Catch:{ IllegalArgumentException -> 0x0047 }
        if (r3 == 0) goto L_0x0041;
    L_0x003d:
        if (r2 == 0) goto L_0x004b;
    L_0x003f:
        org.f.a = r0;
    L_0x0041:
        r0 = r1;
        goto L_0x002d;
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r1 = r0;
        goto L_0x0039;
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        r0 = 1;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.j.b(byte[], int, int):int");
    }

    int a() {
        try {
            return this.h != null ? this.i - this.p : 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void c() {
        try {
            if (this.h == null) {
                this.h = new byte[8192];
                this.i = 0;
                this.p = 0;
                if (!f.a) {
                    return;
                }
            }
            Object obj = new Object[(this.h.length * 2)];
            System.arraycopy(this.h, 0, obj, 0, this.h.length);
            this.h = obj;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
