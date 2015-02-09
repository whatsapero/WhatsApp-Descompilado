package com.google;

import java.util.List;
import java.util.Map;

public final class gs implements d9 {
    private static final bm[] a;
    public static int b;
    private final gM c;

    public cu a(W w, Map map) {
        gd a;
        bm[] bmVarArr;
        cu cuVar;
        List f;
        String c;
        int i = b;
        if (map != null && map.containsKey(fm.PURE_BARCODE)) {
            a = this.c.a(a(w.d()));
            bmVarArr = a;
            if (i != 0) {
                boolean z;
                if (gC.a) {
                    z = false;
                } else {
                    z = true;
                }
                gC.a = z;
            }
            cuVar = new cu(a.e(), a.a(), bmVarArr, R.DATA_MATRIX);
            f = a.f();
            if (f != null) {
                cuVar.a(bU.BYTE_SEGMENTS, f);
            }
            c = a.c();
            if (c != null) {
                cuVar.a(bU.ERROR_CORRECTION_LEVEL, c);
            }
            return cuVar;
        }
        gq a2 = new aX(w.d()).a();
        a = this.c.a(a2.b());
        bmVarArr = a2.a();
        cuVar = new cu(a.e(), a.a(), bmVarArr, R.DATA_MATRIX);
        f = a.f();
        if (f != null) {
            cuVar.a(bU.BYTE_SEGMENTS, f);
        }
        c = a.c();
        if (c != null) {
            cuVar.a(bU.ERROR_CORRECTION_LEVEL, c);
        }
        return cuVar;
    }

    private static C a(C c) {
        int i = b;
        int[] g = c.g();
        int[] a = c.a();
        if (g == null || a == null) {
            throw gv.a();
        }
        int a2 = a(g, c);
        int i2 = g[1];
        int i3 = a[1];
        int i4 = g[0];
        int i5 = ((a[0] - i4) + 1) / a2;
        i3 = ((i3 - i2) + 1) / a2;
        if (i5 <= 0 || i3 <= 0) {
            throw gv.a();
        }
        int i6 = a2 / 2;
        i2 += i6;
        int i7 = i4 + i6;
        C c2 = new C(i5, i3);
        i6 = 0;
        while (i6 < i3) {
            int i8 = i2 + (i6 * a2);
            i4 = 0;
            while (i4 < i5) {
                if (c.a((i4 * a2) + i7, i8)) {
                    c2.c(i4, i6);
                }
                i4++;
                if (i != 0) {
                    break;
                }
            }
            i4 = i6 + 1;
            if (i != 0) {
                break;
            }
            i6 = i4;
        }
        return c2;
    }

    static {
        a = new bm[0];
    }

    public void a() {
    }

    public gs() {
        int i = b;
        this.c = new gM();
        if (gC.a) {
            b = i + 1;
        }
    }

    private static int a(int[] iArr, C c) {
        int i = b;
        int b = c.b();
        int i2 = iArr[0];
        int i3 = iArr[1];
        while (i2 < b && c.a(i2, i3)) {
            i2++;
            if (i != 0) {
                break;
            }
        }
        if (i2 == b) {
            throw gv.a();
        }
        i2 -= iArr[0];
        if (i2 != 0) {
            return i2;
        }
        throw gv.a();
    }
}
