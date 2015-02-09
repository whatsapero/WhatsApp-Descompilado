package com.google;

public final class br {
    public static int d;
    public static final br e;
    private final aZ a;
    private final aZ b;
    private final int[] c;
    private final int[] f;
    private final int g;

    aZ c() {
        return this.b;
    }

    private br(int i, int i2) {
        int i3;
        this.g = i;
        this.c = new int[i];
        this.f = new int[i];
        int i4 = 1;
        for (i3 = 0; i3 < i; i3++) {
            this.c[i3] = i4;
            i4 = (i4 * i2) % i;
        }
        i3 = 0;
        while (i3 < i - 1) {
            try {
                this.f[this.c[i3]] = i3;
                i3++;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.a = new aZ(this, new int[]{0});
        this.b = new aZ(this, new int[]{1});
    }

    int c(int i, int i2) {
        return ((this.g + i) - i2) % this.g;
    }

    int b(int i) {
        if (i != 0) {
            return this.c[(this.g - this.f[i]) - 1];
        }
        try {
            throw new ArithmeticException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static {
        e = new br(929, 3);
    }

    aZ a(int i, int i2) {
        if (i < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i2 == 0) {
            try {
                return this.a;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new aZ(this, iArr);
        }
    }

    int b(int i, int i2) {
        return (i == 0 || i2 == 0) ? 0 : this.c[(this.f[i] + this.f[i2]) % (this.g - 1)];
    }

    aZ a() {
        return this.a;
    }

    int a(int i) {
        return this.c[i];
    }

    int b() {
        return this.g;
    }

    int c(int i) {
        if (i != 0) {
            return this.f[i];
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    int d(int i, int i2) {
        return (i + i2) % this.g;
    }
}
