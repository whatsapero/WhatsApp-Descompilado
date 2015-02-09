package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class fz {
    private static final String z;
    private final U a;
    private final C b;
    private final C c;

    static {
        char[] toCharArray = "bk\u0019u7Uk\u001b~yIdTr0RO\u0015b0^\"\u0019e*R\"\u0019q-EjTd1C\"\u0002u+Uk\u001b~yUk\u000eu".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 38;
                    break;
                case ay.f /*1*/:
                    i2 = 2;
                    break;
                case ay.n /*2*/:
                    i2 = 116;
                    break;
                case ay.p /*3*/:
                    i2 = 16;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    int b(int i, int i2, int i3, int i4) {
        int i5;
        boolean z = false;
        int i6 = U.g;
        if (a(i - 2, i2 - 2, i3, i4)) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        i5 <<= 1;
        if (a(i - 2, i2 - 1, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (a(i - 1, i2 - 2, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (a(i - 1, i2 - 1, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (a(i - 1, i2, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (a(i, i2 - 2, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (a(i, i2 - 1, i3, i4)) {
            i5 |= 1;
        }
        i5 <<= 1;
        if (a(i, i2, i3, i4)) {
            i5 |= 1;
        }
        if (i6 != 0) {
            try {
                if (!gC.a) {
                    z = true;
                }
                gC.a = z;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return i5;
    }

    boolean a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i < 0) {
            i5 = i + i3;
            i6 = (4 - ((i3 + 4) & 7)) + i2;
        } else {
            i6 = i2;
            i5 = i;
        }
        if (i6 < 0) {
            i6 += i4;
            i5 += 4 - ((i4 + 4) & 7);
        }
        this.c.c(i6, i5);
        return this.b.a(i6, i5);
    }

    fz(C c) {
        int f = c.f();
        if (f < 8 || f > 144 || (f & 1) != 0) {
            try {
                throw ga.a();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.a = a(c);
        this.b = b(c);
        this.c = new C(this.b.b(), this.b.f());
    }

    int c(int i, int i2) {
        int i3;
        int i4 = U.g;
        if (a(i - 1, 0, i, i2)) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        i3 <<= 1;
        if (a(i - 1, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(0, i2 - 3, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(1, i2 - 3, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(1, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(1, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        try {
            if (gC.a) {
                U.g = i4 + 1;
            }
            return i3;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    C b(C c) {
        int i = U.g;
        int e = this.a.e();
        int c2 = this.a.c();
        try {
            if (c.f() != e) {
                throw new IllegalArgumentException(z);
            }
            int h = this.a.h();
            int g = this.a.g();
            int i2 = e / h;
            int i3 = c2 / g;
            C c3 = new C(i3 * g, i2 * h);
            int i4 = 0;
            while (i4 < i2) {
                int i5 = i4 * h;
                int i6 = 0;
                while (i6 < i3) {
                    int i7 = i6 * g;
                    c2 = 0;
                    while (c2 < h) {
                        int i8 = (((h + 2) * i4) + 1) + c2;
                        int i9 = i5 + c2;
                        e = 0;
                        while (e < g) {
                            if (c.a((((g + 2) * i6) + 1) + e, i8)) {
                                c3.c(i7 + e, i9);
                            }
                            e++;
                            if (i != 0) {
                                break;
                            }
                        }
                        e = c2 + 1;
                        if (i != 0) {
                            break;
                        }
                        c2 = e;
                    }
                    e = i6 + 1;
                    if (i != 0) {
                        break;
                    }
                    i6 = e;
                }
                e = i4 + 1;
                if (i != 0) {
                    break;
                }
                i4 = e;
            }
            return c3;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    int b(int i, int i2) {
        int i3;
        if (a(i - 3, 0, i, i2)) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        i3 <<= 1;
        if (a(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(i - 1, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(0, i2 - 4, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(0, i2 - 3, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        return a(1, i2 + -1, i, i2) ? i3 | 1 : i3;
    }

    U a() {
        return this.a;
    }

    int d(int i, int i2) {
        int i3;
        if (a(i - 3, 0, i, i2)) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        i3 <<= 1;
        if (a(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(i - 1, 0, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(1, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(2, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        return a(3, i2 + -1, i, i2) ? i3 | 1 : i3;
    }

    private static U a(C c) {
        return U.a(c.f(), c.b());
    }

    byte[] b() {
        int i;
        int i2 = U.g;
        byte[] bArr = new byte[this.a.b()];
        int i3 = 4;
        int i4 = 0;
        int f = this.b.f();
        int b = this.b.b();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        int i5 = 0;
        while (true) {
            if (i3 == f && i4 == 0 && r3 == null) {
                i = i5 + 1;
                bArr[i5] = (byte) a(f, b);
                i3 -= 2;
                i4 += 2;
                obj = 1;
                if (i2 != 0) {
                    i5 = i;
                }
                if (i3 < f || r4 < b) {
                    i5 = i;
                } else {
                    try {
                        break;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            if (i3 == f - 2 && i4 == 0 && (b & 3) != 0 && r2 == null) {
                i = i5 + 1;
                bArr[i5] = (byte) b(f, b);
                i3 -= 2;
                i4 += 2;
                obj2 = 1;
                if (i2 != 0) {
                    i5 = i;
                }
                if (i3 < f) {
                }
                i5 = i;
            }
            if (i3 == f + 4 && i4 == 2 && (b & 7) == 0 && r1 == null) {
                i = i5 + 1;
                bArr[i5] = (byte) c(f, b);
                i3 -= 2;
                i4 += 2;
                obj3 = 1;
                if (i2 != 0) {
                    i5 = i;
                }
                if (i3 < f) {
                }
                i5 = i;
            }
            if (i3 == f - 2 && i4 == 0 && (b & 7) == 4 && r0 == null) {
                i = i5 + 1;
                bArr[i5] = (byte) d(f, b);
                i3 -= 2;
                i4 += 2;
                obj4 = 1;
                if (i2 != 0) {
                    i5 = i3;
                    i3 = i4;
                    i4 = i;
                }
                if (i3 < f) {
                }
                i5 = i;
            } else {
                int i6 = i4;
                i4 = i5;
                i5 = i3;
                i3 = i6;
            }
            while (true) {
                if (i5 < f && i3 >= 0) {
                    try {
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                    if (!this.c.a(i3, i5)) {
                        i = i4 + 1;
                        bArr[i4] = (byte) b(i5, i3, f, b);
                        i5 -= 2;
                        i4 = i3 + 2;
                        if (i5 < 0 || i4 >= b) {
                            i5++;
                            i3 = i4 + 3;
                            i4 = i;
                        } else {
                            i3 = i4;
                            i4 = i;
                        }
                    }
                }
                i = i4;
                i5 -= 2;
                i4 = i3 + 2;
                if (i5 < 0) {
                    break;
                }
                break;
            }
            i5++;
            i3 = i4 + 3;
            i4 = i;
            while (true) {
                if (i5 >= 0 && i3 < b) {
                    try {
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                    if (!this.c.a(i3, i5)) {
                        i = i4 + 1;
                        bArr[i4] = (byte) b(i5, i3, f, b);
                        i5 += 2;
                        i4 = i3 - 2;
                        if (i5 >= f || i4 < 0) {
                            i3 = i5 + 3;
                            i4++;
                        } else {
                            i3 = i4;
                            i4 = i;
                        }
                    }
                }
                i = i4;
                i5 += 2;
                i4 = i3 - 2;
                if (i5 >= f) {
                    break;
                }
                break;
            }
            i3 = i5 + 3;
            i4++;
            if (i3 < f) {
            }
            i5 = i;
        }
        if (i == this.a.b()) {
            return bArr;
        }
        throw ga.a();
    }

    int a(int i, int i2) {
        int i3;
        if (a(i - 1, 0, i, i2)) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        i3 <<= 1;
        if (a(i - 1, 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(i - 1, 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(0, i2 - 2, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(0, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(1, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        if (a(2, i2 - 1, i, i2)) {
            i3 |= 1;
        }
        i3 <<= 1;
        return a(3, i2 + -1, i, i2) ? i3 | 1 : i3;
    }
}
