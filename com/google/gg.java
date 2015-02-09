package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class gg {
    public static final gg a;
    public static final gg c;
    public static final gg e;
    public static final gg f;
    public static int g;
    public static final gg i;
    public static final gg l;
    public static final gg m;
    public static final gg o;
    private static final String z;
    private final bd b;
    private final int d;
    private final int h;
    private final int[] j;
    private final bd k;
    private final int[] n;
    private final int p;

    public int c() {
        return this.p;
    }

    int b(int i) {
        if (i != 0) {
            return this.n[i];
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    int c(int i) {
        return this.j[i];
    }

    public int b() {
        return this.d;
    }

    bd d() {
        return this.b;
    }

    public String toString() {
        return z + Integer.toHexString(this.h) + ',' + this.d + ')';
    }

    bd a(int i, int i2) {
        if (i < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i2 == 0) {
            try {
                return this.b;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new bd(this, iArr);
        }
    }

    public gg(int i, int i2, int i3) {
        this.h = i;
        this.d = i2;
        this.p = i3;
        this.j = new int[i2];
        this.n = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.j[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        i4 = 0;
        while (i4 < i2 - 1) {
            try {
                this.n[this.j[i4]] = i4;
                i4++;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.b = new bd(this, new int[]{0});
        this.k = new bd(this, new int[]{1});
    }

    static {
        char[] toCharArray = "\u001a\u00190RQ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 93;
                    break;
                case ay.f /*1*/:
                    i2 = 95;
                    break;
                case ay.n /*2*/:
                    i2 = 24;
                    break;
                case ay.p /*3*/:
                    i2 = 98;
                    break;
                default:
                    i2 = 41;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        c = new gg(4201, 4096, 1);
        l = new gg(1033, 1024, 1);
        i = new gg(67, 64, 1);
        a = new gg(19, 16, 1);
        e = new gg(285, 256, 0);
        f = new gg(301, 256, 1);
        m = f;
        o = i;
    }

    int c(int i, int i2) {
        return (i == 0 || i2 == 0) ? 0 : this.j[(this.n[i] + this.n[i2]) % (this.d - 1)];
    }

    bd a() {
        return this.k;
    }

    int a(int i) {
        if (i != 0) {
            return this.j[(this.d - this.n[i]) - 1];
        }
        try {
            throw new ArithmeticException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static int b(int i, int i2) {
        return i ^ i2;
    }
}
