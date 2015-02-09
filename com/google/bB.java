package com.google;

import java.util.Map;

public final class bb implements d9 {
    public static boolean a;
    private static final bm[] c;
    private final fE b;

    static {
        c = new bm[0];
    }

    private static C a(C c) {
        boolean z = a;
        int[] c2 = c.c();
        if (c2 == null) {
            throw gv.a();
        }
        int i = c2[0];
        int i2 = c2[1];
        int i3 = c2[2];
        int i4 = c2[3];
        C c3 = new C(30, 33);
        int i5 = 0;
        while (i5 < 33) {
            int i6 = i2 + (((i5 * i4) + (i4 / 2)) / 33);
            int i7 = 0;
            while (i7 < 30) {
                if (c.a(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                    c3.c(i7, i5);
                }
                i7++;
                if (z) {
                    break;
                }
            }
            i7 = i5 + 1;
            if (z) {
                break;
            }
            i5 = i7;
        }
        return c3;
    }

    public bb() {
        boolean z = a;
        this.b = new fE();
        if (gC.a) {
            a = !z;
        }
    }

    public void a() {
    }

    public cu a(W w, Map map) {
        boolean z = a;
        if (map != null && map.containsKey(fm.PURE_BARCODE)) {
            gd a = this.b.a(a(w.d()), map);
            if (z) {
                gC.a = !gC.a;
            } else {
                cu cuVar = new cu(a.e(), a.a(), c, R.MAXICODE);
                String c = a.c();
                if (c != null) {
                    cuVar.a(bU.ERROR_CORRECTION_LEVEL, c);
                }
                return cuVar;
            }
        }
        throw gv.a();
    }
}
