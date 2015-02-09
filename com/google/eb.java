package com.google;

public final class eB {
    private static final eB[] b;
    private static final int[] d;
    public static int g;
    private final dI[] a;
    private final int c;
    private final int[] e;
    private final int f;

    C e() {
        int i = g;
        int a = a();
        C c = new C(a);
        c.a(0, 0, 9, 9);
        c.a(a - 8, 0, 8, 9);
        c.a(0, a - 8, 9, 8);
        int length = this.e.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = this.e[i2] - 2;
            int i4 = 0;
            while (i4 < length) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0 && i == 0))) {
                    try {
                        c.a(this.e[i4] - 2, i3, 5, 5);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                i4++;
                if (i != 0) {
                    break;
                }
            }
            i4 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i4;
        }
        try {
            c.a(6, 9, 1, a - 17);
            c.a(9, 6, a - 17, 1);
            if (this.c > 6) {
                c.a(a - 11, 0, 3, 6);
                c.a(0, a - 11, 6, 3);
            }
            try {
                if (gC.a) {
                    g = i + 1;
                }
                return c;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    static {
        d = new int[]{31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
        b = f();
    }

    public int[] d() {
        return this.e;
    }

    public int c() {
        return this.c;
    }

    public String toString() {
        return String.valueOf(this.c);
    }

    public static eB b(int i) {
        try {
            if (i % 4 != 1) {
                throw ga.a();
            }
            try {
                return c((i - 17) / 4);
            } catch (IllegalArgumentException e) {
                throw ga.a();
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int b() {
        return this.f;
    }

    private eB(int i, int[] iArr, dI[] dIVarArr) {
        int i2 = 0;
        this.c = i;
        this.e = iArr;
        this.a = dIVarArr;
        int b = dIVarArr[0].b();
        cV[] a = dIVarArr[0].a();
        int length = a.length;
        int i3 = 0;
        while (i2 < length) {
            cV cVVar = a[i2];
            i3 += (cVVar.a() + b) * cVVar.b();
            i2++;
        }
        this.f = i3;
    }

    public dI a(Y y) {
        return this.a[y.ordinal()];
    }

    public int a() {
        return (this.c * 4) + 17;
    }

    private static eB[] f() {
        r0 = new eB[40];
        int[] iArr = new int[0];
        dI[] dIVarArr = new dI[4];
        dIVarArr[0] = new dI(7, new cV[]{new cV(1, 19)});
        dIVarArr[1] = new dI(10, new cV[]{new cV(1, 16)});
        dIVarArr[2] = new dI(13, new cV[]{new cV(1, 13)});
        dIVarArr[3] = new dI(17, new cV[]{new cV(1, 9)});
        r0[0] = new eB(1, iArr, dIVarArr);
        iArr = new int[]{6, 18};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(10, new cV[]{new cV(1, 34)});
        dIVarArr[1] = new dI(16, new cV[]{new cV(1, 28)});
        dIVarArr[2] = new dI(22, new cV[]{new cV(1, 22)});
        dIVarArr[3] = new dI(28, new cV[]{new cV(1, 16)});
        r0[1] = new eB(2, iArr, dIVarArr);
        iArr = new int[]{6, 22};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(15, new cV[]{new cV(1, 55)});
        dIVarArr[1] = new dI(26, new cV[]{new cV(1, 44)});
        dIVarArr[2] = new dI(18, new cV[]{new cV(2, 17)});
        dIVarArr[3] = new dI(22, new cV[]{new cV(2, 13)});
        r0[2] = new eB(3, iArr, dIVarArr);
        iArr = new int[]{6, 26};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(20, new cV[]{new cV(1, 80)});
        dIVarArr[1] = new dI(18, new cV[]{new cV(2, 32)});
        dIVarArr[2] = new dI(26, new cV[]{new cV(2, 24)});
        dIVarArr[3] = new dI(16, new cV[]{new cV(4, 9)});
        r0[3] = new eB(4, iArr, dIVarArr);
        iArr = new int[]{6, 30};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(26, new cV[]{new cV(1, 108)});
        dIVarArr[1] = new dI(24, new cV[]{new cV(2, 43)});
        dIVarArr[2] = new dI(18, new cV[]{new cV(2, 15), new cV(2, 16)});
        dIVarArr[3] = new dI(22, new cV[]{new cV(2, 11), new cV(2, 12)});
        r0[4] = new eB(5, iArr, dIVarArr);
        iArr = new int[]{6, 34};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(18, new cV[]{new cV(2, 68)});
        dIVarArr[1] = new dI(16, new cV[]{new cV(4, 27)});
        dIVarArr[2] = new dI(24, new cV[]{new cV(4, 19)});
        dIVarArr[3] = new dI(28, new cV[]{new cV(4, 15)});
        r0[5] = new eB(6, iArr, dIVarArr);
        iArr = new int[]{6, 22, 38};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(20, new cV[]{new cV(2, 78)});
        dIVarArr[1] = new dI(18, new cV[]{new cV(4, 31)});
        dIVarArr[2] = new dI(18, new cV[]{new cV(2, 14), new cV(4, 15)});
        dIVarArr[3] = new dI(26, new cV[]{new cV(4, 13), new cV(1, 14)});
        r0[6] = new eB(7, iArr, dIVarArr);
        iArr = new int[]{6, 24, 42};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(24, new cV[]{new cV(2, 97)});
        dIVarArr[1] = new dI(22, new cV[]{new cV(2, 38), new cV(2, 39)});
        dIVarArr[2] = new dI(22, new cV[]{new cV(4, 18), new cV(2, 19)});
        dIVarArr[3] = new dI(26, new cV[]{new cV(4, 14), new cV(2, 15)});
        r0[7] = new eB(8, iArr, dIVarArr);
        iArr = new int[]{6, 26, 46};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(2, 116)});
        dIVarArr[1] = new dI(22, new cV[]{new cV(3, 36), new cV(2, 37)});
        dIVarArr[2] = new dI(20, new cV[]{new cV(4, 16), new cV(4, 17)});
        dIVarArr[3] = new dI(24, new cV[]{new cV(4, 12), new cV(4, 13)});
        r0[8] = new eB(9, iArr, dIVarArr);
        iArr = new int[]{6, 28, 50};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(18, new cV[]{new cV(2, 68), new cV(2, 69)});
        dIVarArr[1] = new dI(26, new cV[]{new cV(4, 43), new cV(1, 44)});
        dIVarArr[2] = new dI(24, new cV[]{new cV(6, 19), new cV(2, 20)});
        dIVarArr[3] = new dI(28, new cV[]{new cV(6, 15), new cV(2, 16)});
        r0[9] = new eB(10, iArr, dIVarArr);
        iArr = new int[]{6, 30, 54};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(20, new cV[]{new cV(4, 81)});
        dIVarArr[1] = new dI(30, new cV[]{new cV(1, 50), new cV(4, 51)});
        dIVarArr[2] = new dI(28, new cV[]{new cV(4, 22), new cV(4, 23)});
        dIVarArr[3] = new dI(24, new cV[]{new cV(3, 12), new cV(8, 13)});
        r0[10] = new eB(11, iArr, dIVarArr);
        iArr = new int[]{6, 32, 58};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(24, new cV[]{new cV(2, 92), new cV(2, 93)});
        dIVarArr[1] = new dI(22, new cV[]{new cV(6, 36), new cV(2, 37)});
        dIVarArr[2] = new dI(26, new cV[]{new cV(4, 20), new cV(6, 21)});
        dIVarArr[3] = new dI(28, new cV[]{new cV(7, 14), new cV(4, 15)});
        r0[11] = new eB(12, iArr, dIVarArr);
        iArr = new int[]{6, 34, 62};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(26, new cV[]{new cV(4, 107)});
        dIVarArr[1] = new dI(22, new cV[]{new cV(8, 37), new cV(1, 38)});
        dIVarArr[2] = new dI(24, new cV[]{new cV(8, 20), new cV(4, 21)});
        dIVarArr[3] = new dI(22, new cV[]{new cV(12, 11), new cV(4, 12)});
        r0[12] = new eB(13, iArr, dIVarArr);
        iArr = new int[]{6, 26, 46, 66};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(3, 115), new cV(1, 116)});
        dIVarArr[1] = new dI(24, new cV[]{new cV(4, 40), new cV(5, 41)});
        dIVarArr[2] = new dI(20, new cV[]{new cV(11, 16), new cV(5, 17)});
        dIVarArr[3] = new dI(24, new cV[]{new cV(11, 12), new cV(5, 13)});
        r0[13] = new eB(14, iArr, dIVarArr);
        iArr = new int[]{6, 26, 48, 70};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(22, new cV[]{new cV(5, 87), new cV(1, 88)});
        dIVarArr[1] = new dI(24, new cV[]{new cV(5, 41), new cV(5, 42)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(5, 24), new cV(7, 25)});
        dIVarArr[3] = new dI(24, new cV[]{new cV(11, 12), new cV(7, 13)});
        r0[14] = new eB(15, iArr, dIVarArr);
        iArr = new int[]{6, 26, 50, 74};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(24, new cV[]{new cV(5, 98), new cV(1, 99)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(7, 45), new cV(3, 46)});
        dIVarArr[2] = new dI(24, new cV[]{new cV(15, 19), new cV(2, 20)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(3, 15), new cV(13, 16)});
        r0[15] = new eB(16, iArr, dIVarArr);
        iArr = new int[]{6, 30, 54, 78};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(28, new cV[]{new cV(1, 107), new cV(5, 108)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(10, 46), new cV(1, 47)});
        dIVarArr[2] = new dI(28, new cV[]{new cV(1, 22), new cV(15, 23)});
        dIVarArr[3] = new dI(28, new cV[]{new cV(2, 14), new cV(17, 15)});
        r0[16] = new eB(17, iArr, dIVarArr);
        iArr = new int[]{6, 30, 56, 82};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(5, 120), new cV(1, 121)});
        dIVarArr[1] = new dI(26, new cV[]{new cV(9, 43), new cV(4, 44)});
        dIVarArr[2] = new dI(28, new cV[]{new cV(17, 22), new cV(1, 23)});
        dIVarArr[3] = new dI(28, new cV[]{new cV(2, 14), new cV(19, 15)});
        r0[17] = new eB(18, iArr, dIVarArr);
        iArr = new int[]{6, 30, 58, 86};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(28, new cV[]{new cV(3, 113), new cV(4, 114)});
        dIVarArr[1] = new dI(26, new cV[]{new cV(3, 44), new cV(11, 45)});
        dIVarArr[2] = new dI(26, new cV[]{new cV(17, 21), new cV(4, 22)});
        dIVarArr[3] = new dI(26, new cV[]{new cV(9, 13), new cV(16, 14)});
        r0[18] = new eB(19, iArr, dIVarArr);
        iArr = new int[]{6, 34, 62, 90};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(28, new cV[]{new cV(3, 107), new cV(5, 108)});
        dIVarArr[1] = new dI(26, new cV[]{new cV(3, 41), new cV(13, 42)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(15, 24), new cV(5, 25)});
        dIVarArr[3] = new dI(28, new cV[]{new cV(15, 15), new cV(10, 16)});
        r0[19] = new eB(20, iArr, dIVarArr);
        iArr = new int[]{6, 28, 50, 72, 94};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(28, new cV[]{new cV(4, 116), new cV(4, 117)});
        dIVarArr[1] = new dI(26, new cV[]{new cV(17, 42)});
        dIVarArr[2] = new dI(28, new cV[]{new cV(17, 22), new cV(6, 23)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(19, 16), new cV(6, 17)});
        r0[20] = new eB(21, iArr, dIVarArr);
        iArr = new int[]{6, 26, 50, 74, 98};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(28, new cV[]{new cV(2, 111), new cV(7, 112)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(17, 46)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(7, 24), new cV(16, 25)});
        dIVarArr[3] = new dI(24, new cV[]{new cV(34, 13)});
        r0[21] = new eB(22, iArr, dIVarArr);
        iArr = new int[]{6, 30, 54, 78, 102};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(4, 121), new cV(5, 122)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(4, 47), new cV(14, 48)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(11, 24), new cV(14, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(16, 15), new cV(14, 16)});
        r0[22] = new eB(23, iArr, dIVarArr);
        iArr = new int[]{6, 28, 54, 80, 106};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(6, 117), new cV(4, 118)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(6, 45), new cV(14, 46)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(11, 24), new cV(16, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(30, 16), new cV(2, 17)});
        r0[23] = new eB(24, iArr, dIVarArr);
        iArr = new int[]{6, 32, 58, 84, 110};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(26, new cV[]{new cV(8, 106), new cV(4, 107)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(8, 47), new cV(13, 48)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(7, 24), new cV(22, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(22, 15), new cV(13, 16)});
        r0[24] = new eB(25, iArr, dIVarArr);
        iArr = new int[]{6, 30, 58, 86, 114};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(28, new cV[]{new cV(10, 114), new cV(2, 115)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(19, 46), new cV(4, 47)});
        dIVarArr[2] = new dI(28, new cV[]{new cV(28, 22), new cV(6, 23)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(33, 16), new cV(4, 17)});
        r0[25] = new eB(26, iArr, dIVarArr);
        iArr = new int[]{6, 34, 62, 90, 118};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(8, 122), new cV(4, 123)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(22, 45), new cV(3, 46)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(8, 23), new cV(26, 24)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(12, 15), new cV(28, 16)});
        r0[26] = new eB(27, iArr, dIVarArr);
        iArr = new int[]{6, 26, 50, 74, 98, 122};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(3, 117), new cV(10, 118)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(3, 45), new cV(23, 46)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(4, 24), new cV(31, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(11, 15), new cV(31, 16)});
        r0[27] = new eB(28, iArr, dIVarArr);
        iArr = new int[]{6, 30, 54, 78, 102, 126};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(7, 116), new cV(7, 117)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(21, 45), new cV(7, 46)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(1, 23), new cV(37, 24)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(19, 15), new cV(26, 16)});
        r0[28] = new eB(29, iArr, dIVarArr);
        iArr = new int[]{6, 26, 52, 78, 104, 130};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(5, 115), new cV(10, 116)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(19, 47), new cV(10, 48)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(15, 24), new cV(25, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(23, 15), new cV(25, 16)});
        r0[29] = new eB(30, iArr, dIVarArr);
        iArr = new int[]{6, 30, 56, 82, 108, 134};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(13, 115), new cV(3, 116)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(2, 46), new cV(29, 47)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(42, 24), new cV(1, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(23, 15), new cV(28, 16)});
        r0[30] = new eB(31, iArr, dIVarArr);
        iArr = new int[]{6, 34, 60, 86, 112, 138};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(17, 115)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(10, 46), new cV(23, 47)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(10, 24), new cV(35, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(19, 15), new cV(35, 16)});
        r0[31] = new eB(32, iArr, dIVarArr);
        iArr = new int[]{6, 30, 58, 86, 114, 142};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(17, 115), new cV(1, 116)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(14, 46), new cV(21, 47)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(29, 24), new cV(19, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(11, 15), new cV(46, 16)});
        r0[32] = new eB(33, iArr, dIVarArr);
        iArr = new int[]{6, 34, 62, 90, 118, 146};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(13, 115), new cV(6, 116)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(14, 46), new cV(23, 47)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(44, 24), new cV(7, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(59, 16), new cV(1, 17)});
        r0[33] = new eB(34, iArr, dIVarArr);
        iArr = new int[]{6, 30, 54, 78, 102, 126, 150};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(12, 121), new cV(7, 122)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(12, 47), new cV(26, 48)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(39, 24), new cV(14, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(22, 15), new cV(41, 16)});
        r0[34] = new eB(35, iArr, dIVarArr);
        iArr = new int[]{6, 24, 50, 76, 102, 128, 154};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(6, 121), new cV(14, 122)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(6, 47), new cV(34, 48)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(46, 24), new cV(10, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(2, 15), new cV(64, 16)});
        r0[35] = new eB(36, iArr, dIVarArr);
        iArr = new int[]{6, 28, 54, 80, 106, 132, 158};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(17, 122), new cV(4, 123)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(29, 46), new cV(14, 47)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(49, 24), new cV(10, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(24, 15), new cV(46, 16)});
        r0[36] = new eB(37, iArr, dIVarArr);
        iArr = new int[]{6, 32, 58, 84, 110, 136, 162};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(4, 122), new cV(18, 123)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(13, 46), new cV(32, 47)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(48, 24), new cV(14, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(42, 15), new cV(32, 16)});
        r0[37] = new eB(38, iArr, dIVarArr);
        iArr = new int[]{6, 26, 54, 82, 110, 138, 166};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(20, 117), new cV(4, 118)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(40, 47), new cV(7, 48)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(43, 24), new cV(22, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(10, 15), new cV(67, 16)});
        r0[38] = new eB(39, iArr, dIVarArr);
        iArr = new int[]{6, 30, 58, 86, 114, 142, 170};
        dIVarArr = new dI[4];
        dIVarArr[0] = new dI(30, new cV[]{new cV(19, 118), new cV(6, 119)});
        dIVarArr[1] = new dI(28, new cV[]{new cV(18, 47), new cV(31, 48)});
        dIVarArr[2] = new dI(30, new cV[]{new cV(34, 24), new cV(34, 25)});
        dIVarArr[3] = new dI(30, new cV[]{new cV(20, 15), new cV(61, 16)});
        r0[39] = new eB(40, iArr, dIVarArr);
        return r0;
    }

    static eB a(int i) {
        int i2 = 0;
        int i3 = g;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        while (i2 < d.length) {
            int i6 = d[i2];
            if (i6 != i) {
                i6 = go.a(i, i6);
                if (i6 < i4) {
                    i5 = i2 + 7;
                    i4 = i6;
                }
                i2++;
                if (i3 != 0) {
                    break;
                }
            }
            try {
                return c(i2 + 7);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        if (i4 > 3) {
            return null;
        }
        try {
            return c(i5);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static eB c(int i) {
        if (i >= 1 && i <= 40) {
            return b[i - 1];
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
