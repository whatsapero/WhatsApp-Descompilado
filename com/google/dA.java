package com.google;

import java.util.Arrays;

public final class da implements Cloneable {
    public static boolean b;
    private int[] a;
    private int c;

    da(int[] iArr, int i) {
        this.a = iArr;
        this.c = i;
    }

    public int[] a() {
        return this.a;
    }

    public int hashCode() {
        return (this.c * 31) + Arrays.hashCode(this.a);
    }

    public int d(int i) {
        boolean z = b;
        try {
            if (i >= this.c) {
                return this.c;
            }
            int i2 = i / 32;
            int i3 = (this.a[i2] ^ -1) & (((1 << (i & 31)) - 1) ^ -1);
            while (i3 == 0) {
                i2++;
                try {
                    if (i2 != this.a.length) {
                        i3 = this.a[i2] ^ -1;
                        if (z) {
                            break;
                        }
                    }
                    return this.c;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            i3 = Integer.numberOfTrailingZeros(i3) + (i2 * 32);
            try {
                return i3 > this.c ? this.c : i3;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public Object clone() {
        return c();
    }

    public da(int i) {
        this.c = i;
        this.a = b(i);
    }

    private static int[] b(int i) {
        return new int[((i + 31) / 32)];
    }

    public int d() {
        return this.c;
    }

    public void b() {
        boolean z = b;
        int[] iArr = new int[this.a.length];
        int i = (this.c - 1) / 32;
        int i2 = i + 1;
        int i3 = 0;
        while (i3 < i2) {
            long j = (long) this.a[i3];
            j = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            j = ((j & 858993459) << 2) | ((j >> 2) & 858993459);
            j = ((j & 252645135) << 4) | ((j >> 4) & 252645135);
            j = ((j & 16711935) << 8) | ((j >> 8) & 16711935);
            iArr[i - i3] = (int) (((j & 65535) << 16) | ((j >> 16) & 65535));
            i3++;
            if (z) {
                break;
            }
        }
        if (this.c != i2 * 32) {
            int i4 = (i2 * 32) - this.c;
            i3 = 1;
            i = 0;
            while (i < 31 - i4) {
                i3 = (i3 << 1) | 1;
                i++;
                if (z) {
                    break;
                }
            }
            i = (iArr[0] >> i4) & i3;
            int i5 = 1;
            while (i5 < i2) {
                int i6 = iArr[i5];
                iArr[i5 - 1] = i | (i6 << (32 - i4));
                i = (i6 >> i4) & i3;
                i5++;
                if (z) {
                    break;
                }
            }
            iArr[i2 - 1] = i;
        }
        this.a = iArr;
    }

    public boolean equals(Object obj) {
        try {
            if (!(obj instanceof da)) {
                return false;
            }
            da daVar = (da) obj;
            try {
                if (this.c == daVar.c) {
                    return Arrays.equals(this.a, daVar.a);
                } else {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void e(int i) {
        int[] iArr = this.a;
        int i2 = i / 32;
        iArr[i2] = iArr[i2] | (1 << (i & 31));
    }

    public int a(int i) {
        boolean z = b;
        try {
            if (i >= this.c) {
                return this.c;
            }
            int i2 = i / 32;
            int i3 = this.a[i2] & (((1 << (i & 31)) - 1) ^ -1);
            while (i3 == 0) {
                i2++;
                try {
                    if (i2 != this.a.length) {
                        i3 = this.a[i2];
                        if (z) {
                            break;
                        }
                    }
                    return this.c;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            i3 = Integer.numberOfTrailingZeros(i3) + (i2 * 32);
            try {
                return i3 > this.c ? this.c : i3;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r13, int r14, boolean r15) {
        /*
        r12_this = this;
        r3 = 31;
        r4 = 1;
        r1 = 0;
        r8 = b;
        if (r14 >= r13) goto L_0x0010;
    L_0x0008:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x000e }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x000e }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x000e }
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        if (r14 != r13) goto L_0x0014;
    L_0x0012:
        r1 = r4;
    L_0x0013:
        return r1;
    L_0x0014:
        r9 = r14 + -1;
        r7 = r13 / 32;
        r10 = r9 / 32;
        r6 = r7;
    L_0x001b:
        if (r6 > r10) goto L_0x0042;
    L_0x001d:
        if (r6 <= r7) goto L_0x0044;
    L_0x001f:
        r0 = r1;
    L_0x0020:
        if (r6 >= r10) goto L_0x0047;
    L_0x0022:
        r2 = r3;
    L_0x0023:
        if (r0 != 0) goto L_0x002a;
    L_0x0025:
        if (r2 != r3) goto L_0x002a;
    L_0x0027:
        r5 = -1;
        if (r8 == 0) goto L_0x0050;
    L_0x002a:
        r5 = r0;
        r0 = r1;
    L_0x002c:
        if (r5 > r2) goto L_0x0035;
    L_0x002e:
        r11 = r4 << r5;
        r0 = r0 | r11;
        r5 = r5 + 1;
        if (r8 == 0) goto L_0x002c;
    L_0x0035:
        r2 = r12.a;	 Catch:{ IllegalArgumentException -> 0x004a }
        r2 = r2[r6];	 Catch:{ IllegalArgumentException -> 0x004a }
        r2 = r2 & r0;
        if (r15 == 0) goto L_0x004c;
    L_0x003c:
        if (r2 != r0) goto L_0x0013;
    L_0x003e:
        r0 = r6 + 1;
        if (r8 == 0) goto L_0x004e;
    L_0x0042:
        r1 = r4;
        goto L_0x0013;
    L_0x0044:
        r0 = r13 & 31;
        goto L_0x0020;
    L_0x0047:
        r2 = r9 & 31;
        goto L_0x0023;
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = r1;
        goto L_0x003c;
    L_0x004e:
        r6 = r0;
        goto L_0x001b;
    L_0x0050:
        r0 = r5;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.da.a(int, int, boolean):boolean");
    }

    public void e() {
        boolean z = b;
        int length = this.a.length;
        int i = 0;
        while (i < length) {
            this.a[i] = 0;
            i++;
            if (z) {
                return;
            }
        }
    }

    public String toString() {
        boolean z = b;
        StringBuilder stringBuilder = new StringBuilder(this.c);
        int i = 0;
        while (i < this.c) {
            if ((i & 7) == 0) {
                try {
                    stringBuilder.append(' ');
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            try {
                char c;
                if (c(i)) {
                    c = 'X';
                } else {
                    c = '.';
                }
                stringBuilder.append(c);
                i++;
                if (z) {
                    break;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return stringBuilder.toString();
    }

    public da() {
        this.c = 0;
        this.a = new int[1];
    }

    public da c() {
        return new da((int[]) this.a.clone(), this.c);
    }

    public void a(int i, int i2) {
        this.a[i / 32] = i2;
    }

    public boolean c(int i) {
        try {
            return (this.a[i / 32] & (1 << (i & 31))) != 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
