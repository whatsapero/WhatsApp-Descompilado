package com.google;

public final class cJ extends cd {
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
        while (i3 < 4 && i2 < d) {
            stringBuilder.append((char) (a(daVar, iArr2, i2, g) + 48));
            int length = iArr2.length;
            int i4 = 0;
            while (i4 < length) {
                i2 += iArr2[i4];
                i4++;
                if (i != 0) {
                    break;
                }
            }
            i4 = i3 + 1;
            if (i != 0) {
                break;
            }
            i3 = i4;
        }
        i2 = a(daVar, i2, true, h)[1];
        i3 = 0;
        while (i3 < 4 && i2 < d) {
            stringBuilder.append((char) (a(daVar, iArr2, i2, g) + 48));
            length = iArr2.length;
            i4 = 0;
            while (i4 < length) {
                i2 += iArr2[i4];
                i4++;
                if (i != 0) {
                    break;
                }
            }
            i4 = i3 + 1;
            if (i != 0) {
                break;
            }
            i3 = i4;
        }
        return i2;
    }

    public cJ() {
        this.i = new int[4];
    }

    R a() {
        return R.EAN_8;
    }
}
