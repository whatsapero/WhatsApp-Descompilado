package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class ck extends cd {
    private static final int[][] j;
    private static final int[] k;
    private static final String[] z;
    private final int[] i;

    protected int a(da daVar, int[] iArr, StringBuilder stringBuilder) {
        int i = bT.a;
        int[] iArr2 = this.i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = daVar.d();
        int i2 = iArr[1];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 6 && i2 < d) {
            int a = a(daVar, iArr2, i2, b);
            stringBuilder.append((char) ((a % 10) + 48));
            int length = iArr2.length;
            int i5 = 0;
            while (i5 < length) {
                i2 += iArr2[i5];
                i5++;
                if (i != 0) {
                    break;
                }
            }
            if (a >= 10) {
                i4 |= 1 << (5 - i3);
            }
            i5 = i3 + 1;
            if (i != 0) {
                break;
            }
            i3 = i5;
        }
        a(stringBuilder, i4);
        return i2;
    }

    protected boolean a(String str) {
        return super.a(a(str));
    }

    private static void a(StringBuilder stringBuilder, int i) {
        int i2 = bT.a;
        int i3 = 0;
        while (i3 <= 1) {
            int i4 = 0;
            while (i4 < 10) {
                if (i != j[i3][i4]) {
                    i4++;
                    if (i2 != 0) {
                        break;
                    }
                }
                stringBuilder.insert(0, (char) (i3 + 48));
                stringBuilder.append((char) (i4 + 48));
                return;
            }
            i4 = i3 + 1;
            if (i2 != 0) {
                break;
            }
            i3 = i4;
        }
        throw gv.a();
    }

    public ck() {
        this.i = new int[4];
    }

    static {
        String[] strArr = new String[4];
        String str = "c!Z%";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 83;
                        break;
                    case ay.f /*1*/:
                        i4 = 17;
                        break;
                    case ay.n /*2*/:
                        i4 = 106;
                        break;
                    case ay.p /*3*/:
                        i4 = 21;
                        break;
                    default:
                        i4 = 93;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "c!Z%m";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "c!Z%m";
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    k = new int[]{1, 1, 1, 1, 1, 1};
                    j = new int[][]{new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
                default:
                    strArr2[i2] = str;
                    str = "c!Z%";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r10) {
        /*
        r9 = 4;
        r8 = 1;
        r7 = 3;
        r6 = 2;
        r5 = 0;
        r0 = com.google.bT.a;
        r1 = 6;
        r1 = new char[r1];
        r2 = 7;
        r10.getChars(r8, r2, r1, r5);
        r2 = new java.lang.StringBuilder;
        r3 = 12;
        r2.<init>(r3);
        r3 = r10.charAt(r5);
        r2.append(r3);
        r3 = 5;
        r3 = r1[r3];
        switch(r3) {
            case 48: goto L_0x003d;
            case 49: goto L_0x003d;
            case 50: goto L_0x003d;
            case 51: goto L_0x004f;
            case 52: goto L_0x005e;
            default: goto L_0x0022;
        };
    L_0x0022:
        r0 = 5;
        r2.append(r1, r5, r0);
        r0 = z;
        r0 = r0[r8];
        r2.append(r0);
        r2.append(r3);
    L_0x0030:
        r0 = 7;
        r0 = r10.charAt(r0);
        r2.append(r0);
        r0 = r2.toString();
        return r0;
    L_0x003d:
        r2.append(r1, r5, r6);
        r2.append(r3);
        r4 = z;
        r4 = r4[r5];
        r2.append(r4);
        r2.append(r1, r6, r7);
        if (r0 == 0) goto L_0x0030;
    L_0x004f:
        r2.append(r1, r5, r7);
        r4 = z;
        r4 = r4[r7];
        r2.append(r4);
        r2.append(r1, r7, r6);
        if (r0 == 0) goto L_0x0030;
    L_0x005e:
        r2.append(r1, r5, r9);
        r4 = z;
        r4 = r4[r6];
        r2.append(r4);
        r4 = r1[r9];
        r2.append(r4);
        if (r0 == 0) goto L_0x0030;
    L_0x006f:
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ck.a(java.lang.String):java.lang.String");
    }

    R a() {
        return R.UPC_E;
    }

    protected int[] a(da daVar, int i) {
        return a(daVar, i, true, k);
    }
}
