package com.google;

public class g3 extends gO {
    private static final byte[] b;
    private final int[] c;
    private byte[] d;

    public gO a(bN bNVar) {
        return new g3(bNVar);
    }

    static {
        b = new byte[0];
    }

    public C c() {
        boolean z = da.b;
        bN b = b();
        int c = b.c();
        int d = b.d();
        C c2 = new C(c, d);
        a(c);
        int[] iArr = this.c;
        int i = 1;
        while (i < 5) {
            byte[] a = b.a((d * i) / 5, this.d);
            int i2 = (c * 4) / 5;
            int i3 = c / 5;
            while (i3 < i2) {
                int i4 = (a[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
                i3++;
                if (z) {
                    break;
                }
            }
            i3 = i + 1;
            if (z) {
                break;
            }
            i = i3;
        }
        int a2 = a(iArr);
        byte[] b2 = b.b();
        i = 0;
        while (i < d) {
            int i5 = i * c;
            i3 = 0;
            while (i3 < c) {
                if ((b2[i5 + i3] & 255) < a2) {
                    c2.c(i3, i);
                }
                i3++;
                if (z) {
                    break;
                }
            }
            i3 = i + 1;
            if (z) {
                break;
            }
            i = i3;
        }
        return c2;
    }

    private void a(int i) {
        boolean z = da.b;
        if (this.d.length < i) {
            this.d = new byte[i];
        }
        int i2 = 0;
        while (i2 < 32) {
            this.c[i2] = 0;
            i2++;
            if (z) {
                return;
            }
        }
    }

    private static int a(int[] iArr) {
        int i = 0;
        boolean z = da.b;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < length) {
            if (iArr[i2] > i3) {
                i3 = iArr[i2];
                i4 = i2;
            }
            if (iArr[i2] > i5) {
                i5 = iArr[i2];
            }
            i2++;
            if (z) {
                break;
            }
        }
        i3 = i5;
        int i6 = 0;
        i2 = 0;
        while (i < length) {
            i5 = i - i4;
            i5 *= iArr[i] * i5;
            if (i5 > i6) {
                i2 = i;
            } else {
                i5 = i6;
            }
            i++;
            if (z) {
                break;
            }
            i6 = i5;
        }
        if (i4 <= i2) {
            int i7 = i2;
            i2 = i4;
            i4 = i7;
        }
        if (i4 - i2 <= length / 16) {
            throw gv.a();
        }
        i5 = i4 - 1;
        i = -1;
        length = i4 - 1;
        while (length > i2) {
            i6 = length - i2;
            i6 = ((i6 * i6) * (i4 - length)) * (i3 - iArr[length]);
            if (i6 > i) {
                i5 = length;
            } else {
                i6 = i;
            }
            length--;
            if (z) {
                break;
            }
            i = i6;
        }
        return i5 << 3;
    }

    public g3(bN bNVar) {
        super(bNVar);
        this.d = b;
        this.c = new int[32];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.da a(int r10, com.google.da r11) {
        /*
        r9_this = this;
        r0 = 1;
        r2 = 0;
        r4 = com.google.da.b;
        r1 = r9.b();
        r5 = r1.c();
        if (r11 == 0) goto L_0x0014;
    L_0x000e:
        r3 = r11.d();
        if (r3 >= r5) goto L_0x001b;
    L_0x0014:
        r11 = new com.google.da;
        r11.<init>(r5);
        if (r4 == 0) goto L_0x001e;
    L_0x001b:
        r11.e();
    L_0x001e:
        r9.a(r5);
        r3 = r9.d;
        r6 = r1.a(r10, r3);
        r3 = r9.c;
        r1 = r2;
    L_0x002a:
        if (r1 >= r5) goto L_0x003c;
    L_0x002c:
        r7 = r6[r1];
        r7 = r7 & 255;
        r7 = r7 >> 3;
        r8 = r3[r7];
        r8 = r8 + 1;
        r3[r7] = r8;
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x002a;
    L_0x003c:
        r7 = a(r3);
        r1 = r6[r2];
        r2 = r1 & 255;
        r1 = r6[r0];
        r1 = r1 & 255;
        r3 = r2;
    L_0x0049:
        r2 = r5 + -1;
        if (r0 >= r2) goto L_0x0063;
    L_0x004d:
        r2 = r0 + 1;
        r2 = r6[r2];
        r2 = r2 & 255;
        r8 = r1 * 4;
        r3 = r8 - r3;
        r3 = r3 - r2;
        r3 = r3 / 2;
        if (r3 >= r7) goto L_0x005f;
    L_0x005c:
        r11.e(r0);
    L_0x005f:
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x0064;
    L_0x0063:
        return r11;
    L_0x0064:
        r3 = r1;
        r1 = r2;
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.g3.a(int, com.google.da):com.google.da");
    }
}
