package com.google;

final class fs {
    private final int a;
    private final byte[] b;

    int a() {
        return this.a;
    }

    private fs(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    byte[] b() {
        return this.b;
    }

    static fs[] a(byte[] bArr, U u) {
        int i = U.g;
        eh a = u.a();
        bB[] b = a.b();
        int length = b.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            i3 += b[i2].a();
            i2++;
            if (i != 0) {
                break;
            }
        }
        fs[] fsVarArr = new fs[i3];
        int length2 = b.length;
        int i4 = 0;
        i3 = 0;
        while (i4 < length2) {
            bB bBVar = b[i4];
            i2 = i3;
            i3 = 0;
            while (i3 < bBVar.a()) {
                int b2 = bBVar.b();
                length = i2 + 1;
                fsVarArr[i2] = new fs(b2, new byte[(a.a() + b2)]);
                i3++;
                if (i != 0) {
                    i3 = length;
                    break;
                }
                i2 = length;
            }
            i3 = i2;
            i2 = i4 + 1;
            if (i != 0) {
                break;
            }
            i4 = i2;
        }
        int length3 = fsVarArr[0].b.length - a.a();
        length2 = length3 - 1;
        i4 = 0;
        int i5 = 0;
        while (i4 < length2) {
            length = 0;
            i2 = i5;
            while (length < i3) {
                i5 = i2 + 1;
                fsVarArr[length].b[i4] = bArr[i2];
                i2 = length + 1;
                if (i != 0) {
                    break;
                }
                length = i2;
                i2 = i5;
            }
            i5 = i2;
            i2 = i4 + 1;
            if (i == 0) {
                i4 = i2;
            }
        }
        try {
            break;
            i2 = u.d() == 24 ? 1 : 0;
            if (i2 != 0) {
                length = 8;
            } else {
                length = i3;
            }
            length2 = 0;
            while (length2 < length) {
                i4 = i5 + 1;
                fsVarArr[length2].b[length3 - 1] = bArr[i5];
                i5 = length2 + 1;
                if (i != 0) {
                    length = i4;
                    break;
                }
                length2 = i5;
                i5 = i4;
            }
            length = i5;
            int length4 = fsVarArr[0].b.length;
            i4 = length3;
            while (i4 < length4) {
                length2 = 0;
                length3 = length;
                while (length2 < i3) {
                    if (i2 == 0 || length2 <= 7) {
                        length = i4;
                    } else {
                        length = i4 - 1;
                    }
                    i5 = length3 + 1;
                    fsVarArr[length2].b[length] = bArr[length3];
                    length = length2 + 1;
                    if (i != 0) {
                        length = i5;
                        break;
                    }
                    length2 = length;
                    length3 = i5;
                }
                length = length3;
                i4++;
                if (i != 0) {
                    break;
                }
            }
            try {
                if (length == bArr.length) {
                    return fsVarArr;
                }
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
