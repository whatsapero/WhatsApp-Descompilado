package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class bd {
    private static final String[] z;
    private final gg a;
    private final int[] b;

    static {
        String[] strArr = new String[6];
        String str = "\foQq\u001c\"ixR>$fFgN/e\u001fz\u0001?*Wu\u0018.*Lu\u0003.*xq\u0000.xVw)\r*Y}\u000b'n";
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
                        i3 = 75;
                        break;
                    case ay.f /*1*/:
                        i3 = 10;
                        break;
                    case ay.n /*2*/:
                        i3 = 63;
                        break;
                    case ay.p /*3*/:
                        i3 = 20;
                        break;
                    default:
                        i3 = 110;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "*T";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "k!\u001f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "k'\u001f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\foQq\u001c\"ixR>$fFgN/e\u001fz\u0001?*Wu\u0018.*Lu\u0003.*xq\u0000.xVw)\r*Y}\u000b'n";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "3T";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    int b() {
        return this.b.length - 1;
    }

    bd a(int i, int i2) {
        int i3 = gg.g;
        if (i < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i2 == 0) {
            try {
                return this.a.d();
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int length = this.b.length;
            int[] iArr = new int[(length + i)];
            int i4 = 0;
            while (i4 < length) {
                iArr[i4] = this.a.c(this.b[i4], i2);
                i4++;
                if (i3 != 0) {
                    break;
                }
            }
            return new bd(this.a, iArr);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r7_this = this;
        r6 = 1;
        r2 = com.google.gg.g;
        r3 = new java.lang.StringBuilder;
        r0 = r7.b();
        r0 = r0 * 8;
        r3.<init>(r0);
        r0 = r7.b();
        r1 = r0;
    L_0x0013:
        if (r1 < 0) goto L_0x0077;
    L_0x0015:
        r0 = r7.a(r1);
        if (r0 == 0) goto L_0x0073;
    L_0x001b:
        if (r0 >= 0) goto L_0x0028;
    L_0x001d:
        r4 = z;
        r5 = 4;
        r4 = r4[r5];
        r3.append(r4);
        r0 = -r0;
        if (r2 == 0) goto L_0x0036;
    L_0x0028:
        r4 = r3.length();	 Catch:{ IllegalArgumentException -> 0x0084 }
        if (r4 <= 0) goto L_0x0036;
    L_0x002e:
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0084 }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0084 }
        r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x0084 }
    L_0x0036:
        if (r1 == 0) goto L_0x003a;
    L_0x0038:
        if (r0 == r6) goto L_0x005d;
    L_0x003a:
        r4 = r7.a;
        r0 = r4.b(r0);
        if (r0 != 0) goto L_0x0049;
    L_0x0042:
        r4 = 49;
        r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x0086 }
        if (r2 == 0) goto L_0x005d;
    L_0x0049:
        if (r0 != r6) goto L_0x0052;
    L_0x004b:
        r4 = 97;
        r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x008a }
        if (r2 == 0) goto L_0x005d;
    L_0x0052:
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x008a }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x008a }
        r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x008a }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x008a }
    L_0x005d:
        if (r1 == 0) goto L_0x0073;
    L_0x005f:
        if (r1 != r6) goto L_0x0068;
    L_0x0061:
        r0 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x008c }
        if (r2 == 0) goto L_0x0073;
    L_0x0068:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x008c }
        r4 = 1;
        r0 = r0[r4];	 Catch:{ IllegalArgumentException -> 0x008c }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x008c }
        r3.append(r1);	 Catch:{ IllegalArgumentException -> 0x008c }
    L_0x0073:
        r0 = r1 + -1;
        if (r2 == 0) goto L_0x0090;
    L_0x0077:
        r0 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x008e }
        r1 = com.google.gC.a;	 Catch:{ IllegalArgumentException -> 0x008e }
        if (r1 == 0) goto L_0x0083;
    L_0x007f:
        r1 = r2 + 1;
        com.google.gg.g = r1;	 Catch:{ IllegalArgumentException -> 0x008e }
    L_0x0083:
        return r0;
    L_0x0084:
        r0 = move-exception;
        throw r0;
    L_0x0086:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x008a }
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = move-exception;
        throw r0;
    L_0x008e:
        r0 = move-exception;
        throw r0;
    L_0x0090:
        r1 = r0;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bd.toString():java.lang.String");
    }

    int a(int i) {
        return this.b[(this.b.length - 1) - i];
    }

    boolean a() {
        try {
            return this.b[0] == 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    bd a(bd bdVar) {
        int i = gg.g;
        try {
            if (this.a.equals(bdVar.a)) {
                try {
                    if (a()) {
                        return bdVar;
                    }
                    try {
                        if (bdVar.a()) {
                            return this;
                        }
                        Object obj = this.b;
                        Object obj2 = bdVar.b;
                        if (obj.length <= obj2.length) {
                            Object obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                        }
                        Object obj4 = new Object[obj.length];
                        int length = obj.length - r1.length;
                        System.arraycopy(obj, 0, obj4, 0, length);
                        int i2 = length;
                        while (i2 < obj.length) {
                            obj4[i2] = gg.b(r1[i2 - length], obj[i2]);
                            i2++;
                            if (i != 0) {
                                break;
                            }
                        }
                        return new bd(this.a, obj4);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            throw new IllegalArgumentException(z[5]);
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    bd b(int i) {
        int i2 = gg.g;
        if (i == 0) {
            try {
                return this.a.d();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i == 1) {
            return this;
        } else {
            int length = this.b.length;
            int[] iArr = new int[length];
            int i3 = 0;
            while (i3 < length) {
                iArr[i3] = this.a.c(this.b[i3], i);
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            return new bd(this.a, iArr);
        }
    }

    bd b(bd bdVar) {
        int i = gg.g;
        try {
            if (this.a.equals(bdVar.a)) {
                try {
                    if (!a()) {
                        if (!bdVar.a()) {
                            int[] iArr = this.b;
                            int length = iArr.length;
                            int[] iArr2 = bdVar.b;
                            int length2 = iArr2.length;
                            int[] iArr3 = new int[((length + length2) - 1)];
                            int i2 = 0;
                            while (i2 < length) {
                                int i3 = iArr[i2];
                                int i4 = 0;
                                while (i4 < length2) {
                                    iArr3[i2 + i4] = gg.b(iArr3[i2 + i4], this.a.c(i3, iArr2[i4]));
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
                                return new bd(this.a, iArr3);
                            }
                        }
                    }
                    return this.a.d();
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            throw new IllegalArgumentException(z[0]);
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    bd(gg ggVar, int[] iArr) {
        int i = 1;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = ggVar;
        int length = iArr.length;
        if (length > 1) {
            try {
                if (iArr[0] == 0) {
                    while (i < length) {
                        try {
                            if (iArr[i] != 0) {
                                break;
                            }
                            i++;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    if (i == length) {
                        try {
                            this.b = new int[]{0};
                            return;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    this.b = new int[(length - i)];
                    System.arraycopy(iArr, i, this.b, 0, this.b.length);
                    return;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        this.b = iArr;
    }

    int c(int i) {
        int i2;
        int i3 = 0;
        int i4 = gg.g;
        if (i != 0) {
            int length = this.b.length;
            if (i != 1) {
                i2 = this.b[0];
                i3 = 1;
                while (i3 < length) {
                    i2 = gg.b(this.a.c(i, i2), this.b[i3]);
                    i3++;
                    if (i4 != 0) {
                        break;
                    }
                }
            }
            int[] iArr = this.b;
            int length2 = iArr.length;
            i2 = 0;
            while (i3 < length2) {
                i2 = gg.b(i2, iArr[i3]);
                i3++;
                if (i4 != 0) {
                    break;
                }
            }
        }
        try {
            i2 = a(0);
        } catch (IllegalArgumentException e) {
            throw e;
        }
        return i2;
    }
}
