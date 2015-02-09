package com.google;

final class go {
    private static final int[] b;
    private static final int[][] c;
    private final byte a;
    private final Y d;

    static int a(int i, int i2) {
        int i3 = i ^ i2;
        return b[(i3 >>> 28) & 15] + ((((((b[i3 & 15] + b[(i3 >>> 4) & 15]) + b[(i3 >>> 8) & 15]) + b[(i3 >>> 12) & 15]) + b[(i3 >>> 16) & 15]) + b[(i3 >>> 20) & 15]) + b[(i3 >>> 24) & 15]);
    }

    byte a() {
        return this.a;
    }

    private static go c(int i, int i2) {
        int i3 = eB.g;
        int i4 = Integer.MAX_VALUE;
        int[][] iArr = c;
        int length = iArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int[] iArr2 = iArr[i5];
            int i7 = iArr2[0];
            if (i7 != i && i7 != i2) {
                int a = a(i, i7);
                if (a < i4) {
                    i6 = iArr2[1];
                } else {
                    a = i4;
                }
                if (i != i2) {
                    i4 = a(i2, i7);
                    if (i4 < a) {
                        i6 = iArr2[1];
                        a = i5 + 1;
                        if (i3 != 0) {
                            break;
                        }
                        i5 = a;
                    }
                }
                i4 = a;
                a = i5 + 1;
                if (i3 != 0) {
                    break;
                }
                i5 = a;
            } else {
                return new go(iArr2[1]);
            }
        }
        return i4 <= 3 ? new go(i6) : null;
    }

    public int hashCode() {
        return (this.d.ordinal() << 3) | this.a;
    }

    static go b(int i, int i2) {
        go c = c(i, i2);
        return c != null ? c : c(i ^ 21522, i2 ^ 21522);
    }

    static {
        c = new int[][]{new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
        b = new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4};
    }

    Y b() {
        return this.d;
    }

    private go(int i) {
        this.d = Y.forBits((i >> 3) & 3);
        this.a = (byte) (i & 7);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        return this.d == goVar.d && this.a == goVar.a;
    }
}
