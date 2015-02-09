package com.google.android.gms.internal;

import java.util.Arrays;

public final class qu {
    public static final Object azg;

    static {
        azg = new Object();
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        return (iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2);
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        boolean z = qw.a;
        boolean length = objArr == null ? false : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (z2 < length && objArr[z2] == null) {
                z2++;
                if (!z) {
                    continue;
                }
            }
            boolean z3 = z2;
            while (i < length2 && objArr2[i] == null) {
                i++;
                if (z) {
                    break;
                }
            }
            int i2 = i;
            z2 = z3 >= length;
            boolean z4 = i2 >= length2;
            if (z2 && z4) {
                return true;
            }
            if (z2 != z4 || !objArr[z3].equals(objArr2[i2])) {
                return false;
            }
            z2 = z3 + 1;
            i = i2 + 1;
        }
    }

    public static int hashCode(int[] iArr) {
        return (iArr == null || iArr.length == 0) ? 0 : Arrays.hashCode(iArr);
    }

    public static int hashCode(Object[] objArr) {
        int i = 0;
        boolean z = qw.a;
        int length = objArr == null ? 0 : objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
            i2++;
            if (z) {
                break;
            }
        }
        return i;
    }
}
