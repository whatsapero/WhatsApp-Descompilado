package com.google;

public final class e_ {
    private int a;
    private int b;
    private final byte[] c;

    public e_(byte[] bArr) {
        this.c = bArr;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.a;
    }

    public int a() {
        return ((this.c.length - this.b) * 8) - this.a;
    }

    public int a(int i) {
        int i2 = 0;
        boolean z = da.b;
        try {
            if (i >= 1 && i <= 32) {
                if (i <= a()) {
                    int i3;
                    if (this.a > 0) {
                        i3 = 8 - this.a;
                        if (i < i3) {
                            i2 = i;
                        } else {
                            i2 = i3;
                        }
                        i3 -= i2;
                        i3 = (((255 >> (8 - i2)) << i3) & this.c[this.b]) >> i3;
                        i -= i2;
                        try {
                            this.a = i2 + this.a;
                            if (this.a == 8) {
                                this.a = 0;
                                this.b++;
                                i2 = i3;
                                i3 = i;
                            } else {
                                i2 = i3;
                                i3 = i;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    i3 = i;
                    if (i3 <= 0) {
                        return i2;
                    }
                    while (i3 >= 8) {
                        i2 = (i2 << 8) | (this.c[this.b] & 255);
                        this.b++;
                        i3 -= 8;
                        if (z) {
                            break;
                        }
                    }
                    if (i3 <= 0) {
                        return i2;
                    }
                    int i4 = 8 - i3;
                    i2 = (i2 << i3) | ((((255 >> i4) << i4) & this.c[this.b]) >> i4);
                    this.a = i3 + this.a;
                    return i2;
                }
            }
            throw new IllegalArgumentException(String.valueOf(i));
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
