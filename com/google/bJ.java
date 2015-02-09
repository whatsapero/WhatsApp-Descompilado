package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bj {
    public static int f;
    private boolean a;
    private final C b;
    private final List c;
    private final int[] d;
    private final bH e;

    public bj(C c, bH bHVar) {
        this.b = c;
        this.c = new ArrayList();
        this.d = new int[5];
        this.e = bHVar;
    }

    private float a(int i, int i2, int i3, int i4) {
        int i5 = f;
        C c = this.b;
        int b = c.b();
        int[] d = d();
        int i6 = i;
        while (i6 >= 0 && c.a(i6, i2)) {
            d[2] = d[2] + 1;
            i6--;
            if (i5 != 0) {
                break;
            }
        }
        if (i6 < 0) {
            return Float.NaN;
        }
        while (i6 >= 0 && !c.a(i6, i2) && d[1] <= i3) {
            d[1] = d[1] + 1;
            i6--;
            if (i5 != 0) {
                break;
            }
        }
        if (i6 < 0 || d[1] > i3) {
            return Float.NaN;
        }
        while (i6 >= 0 && c.a(i6, i2) && d[0] <= i3) {
            d[0] = d[0] + 1;
            i6--;
            if (i5 != 0) {
                break;
            }
        }
        if (d[0] > i3) {
            return Float.NaN;
        }
        i6 = i + 1;
        while (i6 < b && c.a(i6, i2)) {
            d[2] = d[2] + 1;
            i6++;
            if (i5 != 0) {
                break;
            }
        }
        if (i6 == b) {
            return Float.NaN;
        }
        while (i6 < b && !c.a(i6, i2) && d[3] < i3) {
            d[3] = d[3] + 1;
            i6++;
            if (i5 != 0) {
                break;
            }
        }
        if (i6 == b || d[3] >= i3) {
            return Float.NaN;
        }
        while (i6 < b && c.a(i6, i2) && d[4] < i3) {
            d[4] = d[4] + 1;
            i6++;
            if (i5 != 0) {
                break;
            }
        }
        if (d[4] >= i3) {
            return Float.NaN;
        }
        if (Math.abs(((((d[0] + d[1]) + d[2]) + d[3]) + d[4]) - i4) * 5 >= i4) {
            return Float.NaN;
        }
        return a(d) ? a(d, i6) : Float.NaN;
    }

    protected final boolean a(int[] iArr, int i, int i2, boolean z) {
        int i3 = f;
        int i4 = (((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + iArr[4];
        float a = a(iArr, i2);
        float c = c(i, (int) a, iArr[2], i4);
        if (Float.isNaN(c)) {
            return false;
        }
        float a2 = a((int) a, (int) c, iArr[2], i4);
        if (Float.isNaN(a2)) {
            return false;
        }
        if (z && !b((int) c, (int) a2, iArr[2], i4)) {
            return false;
        }
        float f = ((float) i4) / 7.0f;
        i4 = 0;
        int i5 = false;
        while (i4 < this.c.size()) {
            bY bYVar = (bY) this.c.get(i4);
            if (bYVar.a(f, c, a2)) {
                this.c.set(i4, bYVar.b(c, a2, f));
                if (i3 == 0) {
                    i5 = 1;
                    break;
                }
                i5 = true;
            }
            int i6 = i4 + 1;
            if (i3 != 0) {
                break;
            }
            i4 = i6;
        }
        if (i5 == 0) {
            bm bYVar2 = new bY(a2, c, f);
            this.c.add(bYVar2);
            if (this.e != null) {
                this.e.a(bYVar2);
            }
        }
        return true;
    }

    private bY[] a() {
        float f = 0.0f;
        int i = f;
        int size = this.c.size();
        if (size < 3) {
            throw gv.a();
        }
        if (size > 3) {
            float c;
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (bY bYVar : this.c) {
                c = bYVar.c();
                f3 += c;
                c = (c * c) + f2;
                if (i != 0) {
                    break;
                }
                f2 = c;
            }
            c = f2;
            f3 /= (float) size;
            c = (float) Math.sqrt((double) ((c / ((float) size)) - (f3 * f3)));
            Collections.sort(this.c, new fU(f3, null));
            float max = Math.max(0.2f * f3, c);
            int i2 = 0;
            while (i2 < this.c.size() && this.c.size() > 3) {
                if (Math.abs(((bY) this.c.get(i2)).c() - f3) > max) {
                    this.c.remove(i2);
                    i2--;
                }
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
        }
        if (this.c.size() > 3) {
            for (bY bYVar2 : this.c) {
                f += bYVar2.c();
                if (i != 0) {
                    break;
                }
            }
            Collections.sort(this.c, new fM(f / ((float) this.c.size()), null));
            this.c.subList(3, this.c.size()).clear();
        }
        return new bY[]{(bY) this.c.get(0), (bY) this.c.get(1), (bY) this.c.get(2)};
    }

    private static float a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    private int[] d() {
        this.d[0] = 0;
        this.d[1] = 0;
        this.d[2] = 0;
        this.d[3] = 0;
        this.d[4] = 0;
        return this.d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final com.google.bV a(java.util.Map r14) {
        /*
        r13_this = this;
        r6 = f;
        if (r14 == 0) goto L_0x013c;
    L_0x0004:
        r0 = com.google.fm.TRY_HARDER;
        r0 = r14.containsKey(r0);
        if (r0 == 0) goto L_0x013c;
    L_0x000c:
        r0 = 1;
        r2 = r0;
    L_0x000e:
        if (r14 == 0) goto L_0x0140;
    L_0x0010:
        r0 = com.google.fm.PURE_BARCODE;
        r0 = r14.containsKey(r0);
        if (r0 == 0) goto L_0x0140;
    L_0x0018:
        r0 = 1;
    L_0x0019:
        r1 = r13.b;
        r7 = r1.f();
        r1 = r13.b;
        r8 = r1.b();
        r1 = r7 * 3;
        r1 = r1 / 228;
        r3 = 3;
        if (r1 < r3) goto L_0x002e;
    L_0x002c:
        if (r2 == 0) goto L_0x002f;
    L_0x002e:
        r1 = 3;
    L_0x002f:
        r2 = 0;
        r3 = 5;
        r9 = new int[r3];
        r4 = r1 + -1;
        r5 = r1;
    L_0x0036:
        if (r4 >= r7) goto L_0x0127;
    L_0x0038:
        if (r2 != 0) goto L_0x0127;
    L_0x003a:
        r1 = 0;
        r3 = 0;
        r9[r1] = r3;
        r1 = 1;
        r3 = 0;
        r9[r1] = r3;
        r1 = 2;
        r3 = 0;
        r9[r1] = r3;
        r1 = 3;
        r3 = 0;
        r9[r1] = r3;
        r1 = 4;
        r3 = 0;
        r9[r1] = r3;
        r1 = 0;
        r3 = 0;
    L_0x0050:
        if (r3 >= r8) goto L_0x010d;
    L_0x0052:
        r10 = r13.b;
        r10 = r10.a(r3, r4);
        if (r10 == 0) goto L_0x0069;
    L_0x005a:
        r10 = r1 & 1;
        r11 = 1;
        if (r10 != r11) goto L_0x0061;
    L_0x005f:
        r1 = r1 + 1;
    L_0x0061:
        r10 = r9[r1];
        r10 = r10 + 1;
        r9[r1] = r10;
        if (r6 == 0) goto L_0x0109;
    L_0x0069:
        r10 = r1 & 1;
        if (r10 != 0) goto L_0x0103;
    L_0x006d:
        r10 = 4;
        if (r1 != r10) goto L_0x00f9;
    L_0x0070:
        r1 = a(r9);
        if (r1 == 0) goto L_0x015f;
    L_0x0076:
        r1 = r13.a(r9, r4, r3, r0);
        if (r1 == 0) goto L_0x0159;
    L_0x007c:
        r5 = 2;
        r1 = r13.a;
        if (r1 == 0) goto L_0x0156;
    L_0x0081:
        r1 = r13.b();
        if (r6 == 0) goto L_0x00c2;
    L_0x0087:
        r2 = r13.c();
        r10 = 2;
        r10 = r9[r10];
        if (r2 <= r10) goto L_0x0152;
    L_0x0090:
        r3 = 2;
        r3 = r9[r3];
        r2 = r2 - r3;
        r2 = r2 - r5;
        r3 = r4 + r2;
        r2 = r8 + -1;
    L_0x0099:
        if (r6 == 0) goto L_0x014e;
    L_0x009b:
        r4 = r5;
        r12 = r3;
        r3 = r1;
        r1 = r2;
        r2 = r12;
    L_0x00a0:
        r5 = 0;
        r10 = 2;
        r10 = r9[r10];
        r9[r5] = r10;
        r5 = 1;
        r10 = 3;
        r10 = r9[r10];
        r9[r5] = r10;
        r5 = 2;
        r10 = 4;
        r10 = r9[r10];
        r9[r5] = r10;
        r5 = 3;
        r10 = 1;
        r9[r5] = r10;
        r5 = 4;
        r10 = 0;
        r9[r5] = r10;
        r5 = 3;
        if (r6 == 0) goto L_0x0147;
    L_0x00bd:
        r5 = r4;
        r4 = r2;
        r12 = r3;
        r3 = r1;
        r1 = r12;
    L_0x00c2:
        r2 = 0;
        r10 = 0;
        r11 = 0;
        r9[r10] = r11;
        r10 = 1;
        r11 = 0;
        r9[r10] = r11;
        r10 = 2;
        r11 = 0;
        r9[r10] = r11;
        r10 = 3;
        r11 = 0;
        r9[r10] = r11;
        r10 = 4;
        r11 = 0;
        r9[r10] = r11;
        if (r6 == 0) goto L_0x0143;
    L_0x00d9:
        r2 = 0;
        r10 = 2;
        r10 = r9[r10];
        r9[r2] = r10;
        r2 = 1;
        r10 = 3;
        r10 = r9[r10];
        r9[r2] = r10;
        r2 = 2;
        r10 = 4;
        r10 = r9[r10];
        r9[r2] = r10;
        r2 = 3;
        r10 = 1;
        r9[r2] = r10;
        r2 = 4;
        r10 = 0;
        r9[r2] = r10;
        r2 = 3;
        if (r6 == 0) goto L_0x0143;
    L_0x00f6:
        r12 = r2;
        r2 = r1;
        r1 = r12;
    L_0x00f9:
        r1 = r1 + 1;
        r10 = r9[r1];
        r10 = r10 + 1;
        r9[r1] = r10;
        if (r6 == 0) goto L_0x0109;
    L_0x0103:
        r10 = r9[r1];
        r10 = r10 + 1;
        r9[r1] = r10;
    L_0x0109:
        r3 = r3 + 1;
        if (r6 == 0) goto L_0x0050;
    L_0x010d:
        r1 = a(r9);
        if (r1 == 0) goto L_0x0124;
    L_0x0113:
        r1 = r13.a(r9, r4, r8, r0);
        if (r1 == 0) goto L_0x0124;
    L_0x0119:
        r1 = 0;
        r5 = r9[r1];
        r1 = r13.a;
        if (r1 == 0) goto L_0x0124;
    L_0x0120:
        r2 = r13.b();
    L_0x0124:
        r4 = r4 + r5;
        if (r6 == 0) goto L_0x0036;
    L_0x0127:
        r0 = r13.a();
        com.google.bm.a(r0);
        r1 = new com.google.bV;
        r1.<init>(r0);
        r0 = com.google.gC.a;
        if (r0 == 0) goto L_0x013b;
    L_0x0137:
        r0 = r6 + 1;
        f = r0;
    L_0x013b:
        return r1;
    L_0x013c:
        r0 = 0;
        r2 = r0;
        goto L_0x000e;
    L_0x0140:
        r0 = 0;
        goto L_0x0019;
    L_0x0143:
        r12 = r2;
        r2 = r1;
        r1 = r12;
        goto L_0x0109;
    L_0x0147:
        r12 = r1;
        r1 = r5;
        r5 = r4;
        r4 = r2;
        r2 = r3;
        r3 = r12;
        goto L_0x0109;
    L_0x014e:
        r4 = r3;
        r3 = r2;
        goto L_0x00c2;
    L_0x0152:
        r2 = r3;
        r3 = r4;
        goto L_0x0099;
    L_0x0156:
        r1 = r2;
        goto L_0x0087;
    L_0x0159:
        r1 = r3;
        r3 = r2;
        r2 = r4;
        r4 = r5;
        goto L_0x00a0;
    L_0x015f:
        r1 = r2;
        goto L_0x00d9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bj.a(java.util.Map):com.google.bV");
    }

    protected static boolean a(int[] iArr) {
        boolean z = true;
        int i = f;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5) {
            int i4 = iArr[i2];
            if (i4 != 0) {
                i3 += i4;
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return false;
        }
        if (i3 < 7) {
            return false;
        }
        float f = ((float) i3) / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - ((float) iArr[0])) >= f2 || Math.abs(f - ((float) iArr[1])) >= f2 || Math.abs((3.0f * f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
            z = false;
        }
        return z;
    }

    private int c() {
        int i = f;
        if (this.c.size() <= 1) {
            return 0;
        }
        bm bmVar = null;
        for (bm bmVar2 : this.c) {
            if (bmVar2.d() >= 2) {
                if (bmVar == null) {
                    if (i != 0) {
                        bmVar = bmVar2;
                    } else {
                        bmVar = bmVar2;
                        continue;
                    }
                }
                this.a = true;
                return ((int) (Math.abs(bmVar.a() - bmVar2.a()) - Math.abs(bmVar.b() - bmVar2.b()))) / 2;
            }
            if (i != 0) {
                break;
            }
        }
        return 0;
    }

    private boolean b(int i, int i2, int i3, int i4) {
        int i5 = f;
        int[] d = d();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.b.a(i2 - i6, i - i6)) {
            d[2] = d[2] + 1;
            i6++;
            if (i5 != 0) {
                break;
            }
        }
        if (i < i6 || i2 < i6) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.b.a(i2 - i6, i - i6) && d[1] <= i3) {
            d[1] = d[1] + 1;
            i6++;
            if (i5 != 0) {
                break;
            }
        }
        if (i < i6 || i2 < i6 || d[1] > i3) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.b.a(i2 - i6, i - i6) && d[0] <= i3) {
            d[0] = d[0] + 1;
            i6++;
            if (i5 != 0) {
                break;
            }
        }
        if (d[0] > i3) {
            return false;
        }
        int f = this.b.f();
        int b = this.b.b();
        i6 = 1;
        while (i + i6 < f && i2 + i6 < b && this.b.a(i2 + i6, i + i6)) {
            d[2] = d[2] + 1;
            i6++;
            if (i5 != 0) {
                break;
            }
        }
        if (i + i6 >= f || i2 + i6 >= b) {
            return false;
        }
        while (i + i6 < f && i2 + i6 < b && !this.b.a(i2 + i6, i + i6) && d[3] < i3) {
            d[3] = d[3] + 1;
            i6++;
            if (i5 != 0) {
                break;
            }
        }
        if (i + i6 >= f || i2 + i6 >= b || d[3] >= i3) {
            return false;
        }
        while (i + i6 < f && i2 + i6 < b && this.b.a(i2 + i6, i + i6) && d[4] < i3) {
            d[4] = d[4] + 1;
            i6++;
            if (i5 != 0) {
                break;
            }
        }
        if (d[4] >= i3) {
            return false;
        }
        return Math.abs(((((d[0] + d[1]) + d[2]) + d[3]) + d[4]) - i4) < i4 * 2 && a(d);
    }

    private float c(int i, int i2, int i3, int i4) {
        int i5 = f;
        C c = this.b;
        int f = c.f();
        int[] d = d();
        int i6 = i;
        while (i6 >= 0 && c.a(i2, i6)) {
            d[2] = d[2] + 1;
            i6--;
            if (i5 != 0) {
                break;
            }
        }
        if (i6 < 0) {
            return Float.NaN;
        }
        while (i6 >= 0 && !c.a(i2, i6) && d[1] <= i3) {
            d[1] = d[1] + 1;
            i6--;
            if (i5 != 0) {
                break;
            }
        }
        if (i6 < 0 || d[1] > i3) {
            return Float.NaN;
        }
        while (i6 >= 0 && c.a(i2, i6) && d[0] <= i3) {
            d[0] = d[0] + 1;
            i6--;
            if (i5 != 0) {
                break;
            }
        }
        if (d[0] > i3) {
            return Float.NaN;
        }
        i6 = i + 1;
        while (i6 < f && c.a(i2, i6)) {
            d[2] = d[2] + 1;
            i6++;
            if (i5 != 0) {
                break;
            }
        }
        if (i6 == f) {
            return Float.NaN;
        }
        while (i6 < f && !c.a(i2, i6) && d[3] < i3) {
            d[3] = d[3] + 1;
            i6++;
            if (i5 != 0) {
                break;
            }
        }
        if (i6 == f || d[3] >= i3) {
            return Float.NaN;
        }
        while (i6 < f && c.a(i2, i6) && d[4] < i3) {
            d[4] = d[4] + 1;
            i6++;
            if (i5 != 0) {
                break;
            }
        }
        if (d[4] >= i3) {
            return Float.NaN;
        }
        if (Math.abs(((((d[0] + d[1]) + d[2]) + d[3]) + d[4]) - i4) * 5 >= i4 * 2) {
            return Float.NaN;
        }
        return a(d) ? a(d, i6) : Float.NaN;
    }

    private boolean b() {
        float f = 0.0f;
        int i = f;
        int size = this.c.size();
        float f2 = 0.0f;
        int i2 = 0;
        for (bY bYVar : this.c) {
            float c;
            int i3;
            if (bYVar.d() >= 2) {
                c = bYVar.c() + f2;
                i3 = i2 + 1;
            } else {
                c = f2;
                i3 = i2;
            }
            if (i != 0) {
                i2 = i3;
                f2 = c;
                break;
            }
            i2 = i3;
            f2 = c;
        }
        if (i2 < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (bY bYVar2 : this.c) {
            f += Math.abs(bYVar2.c() - f3);
            if (i != 0) {
                break;
            }
        }
        return f <= 0.05f * f2;
    }
}
