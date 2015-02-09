package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class ep {
    private static final String[] z;
    private final cQ[] a;
    private final int b;
    private c4 c;
    private final e7 d;

    static {
        String[] strArr = new String[5];
        String str = "\u0016\u001azQ\u0007\u0016\u001az";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 54;
                        break;
                    case ay.f /*1*/:
                        i3 = 58;
                        break;
                    case ay.n /*2*/:
                        i3 = 90;
                        break;
                    case ay.p /*3*/:
                        i3 = 113;
                        break;
                    default:
                        i3 = 123;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0016\u001azQ\u0007\u0016\u001az";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "umzTHR\u0000";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0016\u001fi\u0015\u0007\u0013\t>";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0013T";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    void a(int i, cQ cQVar) {
        this.a[i] = cQVar;
    }

    int e() {
        return this.d.d();
    }

    ep(e7 e7Var, c4 c4Var) {
        this.d = e7Var;
        this.b = e7Var.a();
        this.c = c4Var;
        this.a = new cQ[(this.b + 2)];
    }

    private int f() {
        int i = fZ.a;
        if (this.a[this.b + 1] == null) {
            return 0;
        }
        cC[] b = this.a[this.b + 1].b();
        int i2 = 0;
        int i3 = 0;
        while (i2 < b.length) {
            if (!(b[i2] == null && i == 0)) {
                int h = b[i2].h();
                int i4 = this.b + 1;
                int i5 = 0;
                while (i4 > 0 && i5 < 2) {
                    cC cCVar = this.a[i4].b()[i2];
                    if (cCVar != null) {
                        i5 = a(h, i5, cCVar);
                        if (!cCVar.f()) {
                            i3++;
                        }
                    }
                    i4--;
                    if (i != 0) {
                        break;
                    }
                }
            }
            i2++;
            if (i != 0) {
                break;
            }
        }
        return i3;
    }

    private int h() {
        i();
        return j() + f();
    }

    int g() {
        return this.d.b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r12_this = this;
        r11 = 2;
        r10 = 1;
        r2 = 0;
        r4 = com.google.fZ.a;
        r0 = r12.a;
        r0 = r0[r2];
        if (r0 != 0) goto L_0x0013;
    L_0x000b:
        r0 = r12.a;
        r1 = r12.b;
        r1 = r1 + 1;
        r0 = r0[r1];
    L_0x0013:
        r5 = new java.util.Formatter;
        r5.<init>();
        r1 = r2;
    L_0x0019:
        r3 = r0.b();
        r3 = r3.length;
        if (r1 >= r3) goto L_0x008e;
    L_0x0020:
        r3 = z;
        r6 = 3;
        r3 = r3[r6];
        r6 = new java.lang.Object[r10];
        r7 = java.lang.Integer.valueOf(r1);
        r6[r2] = r7;
        r5.format(r3, r6);
        r3 = r2;
    L_0x0031:
        r6 = r12.b;
        r6 = r6 + 2;
        if (r3 >= r6) goto L_0x0081;
    L_0x0037:
        r6 = r12.a;
        r6 = r6[r3];
        if (r6 != 0) goto L_0x0048;
    L_0x003d:
        r6 = z;
        r6 = r6[r2];
        r7 = new java.lang.Object[r2];
        r5.format(r6, r7);
        if (r4 == 0) goto L_0x007d;
    L_0x0048:
        r6 = r12.a;
        r6 = r6[r3];
        r6 = r6.b();
        r6 = r6[r1];
        if (r6 != 0) goto L_0x005f;
    L_0x0054:
        r7 = z;
        r7 = r7[r11];
        r8 = new java.lang.Object[r2];
        r5.format(r7, r8);
        if (r4 == 0) goto L_0x007d;
    L_0x005f:
        r7 = z;
        r8 = 4;
        r7 = r7[r8];
        r8 = new java.lang.Object[r11];
        r9 = r6.h();
        r9 = java.lang.Integer.valueOf(r9);
        r8[r2] = r9;
        r6 = r6.b();
        r6 = java.lang.Integer.valueOf(r6);
        r8[r10] = r6;
        r5.format(r7, r8);
    L_0x007d:
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x0031;
    L_0x0081:
        r3 = z;
        r3 = r3[r10];
        r6 = new java.lang.Object[r2];
        r5.format(r3, r6);
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x0019;
    L_0x008e:
        r0 = r5.toString();
        r5.close();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ep.toString():java.lang.String");
    }

    private int a() {
        int i = fZ.a;
        int h = h();
        if (h == 0) {
            return 0;
        }
        int i2 = 1;
        while (i2 < this.b + 1) {
            cC[] b = this.a[i2].b();
            int i3 = 0;
            while (i3 < b.length) {
                if (!((b[i3] == null && i == 0) || b[i3].f())) {
                    a(i2, i3, b);
                }
                i3++;
                if (i != 0) {
                    break;
                }
            }
            i2++;
            if (i != 0) {
                break;
            }
        }
        return h;
    }

    private void a(cQ cQVar) {
        if (cQVar != null) {
            ((cH) cQVar).a(this.d);
        }
    }

    private static boolean a(cC cCVar, cC cCVar2) {
        if (cCVar2 == null || !cCVar2.f() || cCVar2.a() != cCVar.a()) {
            return false;
        }
        cCVar.b(cCVar2.h());
        return true;
    }

    private void i() {
        int i = 0;
        int i2 = fZ.a;
        if (this.a[0] != null && this.a[this.b + 1] != null) {
            cC[] b = this.a[0].b();
            cC[] b2 = this.a[this.b + 1].b();
            while (i < b.length) {
                if (!(b[i] == null || b2[i] == null || b[i].h() != b2[i].h())) {
                    int i3 = 1;
                    while (i3 <= this.b) {
                        cC cCVar = this.a[i3].b()[i];
                        if (!(cCVar == null && i2 == 0)) {
                            cCVar.b(b[i].h());
                            if (!cCVar.f()) {
                                this.a[i3].b()[i] = null;
                            }
                        }
                        i3++;
                        if (i2 != 0) {
                            break;
                        }
                    }
                }
                i++;
                if (i2 != 0) {
                    return;
                }
            }
        }
    }

    private int j() {
        int i = fZ.a;
        if (this.a[0] == null) {
            return 0;
        }
        cC[] b = this.a[0].b();
        int i2 = 0;
        int i3 = 0;
        while (i2 < b.length) {
            if (!(b[i2] == null && i == 0)) {
                int h = b[i2].h();
                int i4 = i3;
                i3 = 1;
                int i5 = 0;
                while (i3 < this.b + 1 && i5 < 2) {
                    cC cCVar = this.a[i3].b()[i2];
                    if (cCVar != null) {
                        i5 = a(h, i5, cCVar);
                        if (!cCVar.f()) {
                            i4++;
                        }
                    }
                    i3++;
                    if (i != 0) {
                        break;
                    }
                }
                i3 = i4;
            }
            i2++;
            if (i != 0) {
                break;
            }
        }
        return i3;
    }

    private static int a(int i, int i2, cC cCVar) {
        if (cCVar == null || cCVar.f()) {
            return i2;
        }
        if (cCVar.a(i)) {
            cCVar.b(i);
            i2 = 0;
            if (fZ.a == 0) {
                return 0;
            }
        }
        return i2 + 1;
    }

    private void a(int i, int i2, cC[] cCVarArr) {
        cC[] b;
        int i3 = fZ.a;
        cC cCVar = cCVarArr[i2];
        cC[] b2 = this.a[i - 1].b();
        if (this.a[i + 1] != null) {
            b = this.a[i + 1].b();
        } else {
            b = b2;
        }
        cC[] cCVarArr2 = new cC[14];
        cCVarArr2[2] = b2[i2];
        cCVarArr2[3] = b[i2];
        if (i2 > 0) {
            cCVarArr2[0] = cCVarArr[i2 - 1];
            cCVarArr2[4] = b2[i2 - 1];
            cCVarArr2[5] = b[i2 - 1];
        }
        if (i2 > 1) {
            cCVarArr2[8] = cCVarArr[i2 - 2];
            cCVarArr2[10] = b2[i2 - 2];
            cCVarArr2[11] = b[i2 - 2];
        }
        if (i2 < cCVarArr.length - 1) {
            cCVarArr2[1] = cCVarArr[i2 + 1];
            cCVarArr2[6] = b2[i2 + 1];
            cCVarArr2[7] = b[i2 + 1];
        }
        if (i2 < cCVarArr.length - 2) {
            cCVarArr2[9] = cCVarArr[i2 + 2];
            cCVarArr2[12] = b2[i2 + 2];
            cCVarArr2[13] = b[i2 + 2];
        }
        int length = cCVarArr2.length;
        int i4 = 0;
        while (i4 < length && !a(cCVar, cCVarArr2[i4])) {
            i4++;
            if (i3 != 0) {
                return;
            }
        }
    }

    c4 d() {
        return this.c;
    }

    int b() {
        return this.b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    com.google.cQ[] c() {
        /*
        r2_this = this;
        r0 = r2.a;
        r1 = 0;
        r0 = r0[r1];
        r2.a(r0);
        r0 = r2.a;
        r1 = r2.b;
        r1 = r1 + 1;
        r0 = r0[r1];
        r2.a(r0);
        r0 = 928; // 0x3a0 float:1.3E-42 double:4.585E-321;
    L_0x0015:
        r1 = r2.a();
        if (r1 <= 0) goto L_0x001d;
    L_0x001b:
        if (r1 < r0) goto L_0x0020;
    L_0x001d:
        r0 = r2.a;
        return r0;
    L_0x0020:
        r0 = r1;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ep.c():com.google.cQ[]");
    }

    public void a(c4 c4Var) {
        this.c = c4Var;
    }

    cQ a(int i) {
        return this.a[i];
    }
}
