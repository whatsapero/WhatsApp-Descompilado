package com.google;

abstract class f2 {
    private static final f2[] a;

    abstract boolean a(int i, int i2);

    static f2 a(int i) {
        if (i >= 0 && i <= 7) {
            return a[i];
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private f2() {
    }

    f2(bz bzVar) {
        this();
    }

    static {
        a = new f2[]{new fX(null), new fb(null), new fC(null), new fp(null), new fa(null), new fq(null), new fA(null), new f1(null)};
    }

    final void a(C c, int i) {
        int i2 = eB.g;
        int i3 = 0;
        while (i3 < i) {
            int i4 = 0;
            while (i4 < i) {
                try {
                    if (a(i3, i4)) {
                        c.b(i4, i3);
                    }
                    i4++;
                    if (i2 != 0) {
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            i4 = i3 + 1;
            if (i2 == 0) {
                i3 = i4;
            } else {
                return;
            }
        }
    }
}
