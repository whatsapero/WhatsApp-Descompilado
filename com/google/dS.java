package com.google;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class ds {
    private static final String z;
    private final da a;
    private final StringBuilder b;
    private final b8 c;

    static {
        char[] toCharArray = "\u000bo/~ &d+1-!|-}-+*-}4'k\"d)*x%rd9k d!u*".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 79;
                    break;
                case ay.f /*1*/:
                    i2 = 10;
                    break;
                case ay.n /*2*/:
                    i2 = 76;
                    break;
                case ay.p /*3*/:
                    i2 = 17;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private boolean b(int i) {
        int i2 = f4.a;
        try {
            try {
                if (i + 7 > this.a.d()) {
                    return i + 4 <= this.a.d();
                } else {
                    int i3 = i;
                    while (i3 < i + 3) {
                        try {
                            if (!this.a.c(i3)) {
                                i3++;
                                if (i2 != 0) {
                                    break;
                                }
                            }
                            return true;
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    return this.a.c(i + 3);
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.fK d(int r5) {
        /*
        r4_this = this;
        r3 = 15;
        r0 = 5;
        r1 = com.google.f4.a;
        r2 = r4.a(r5, r0);
        if (r2 != r3) goto L_0x0017;
    L_0x000b:
        r0 = new com.google.fK;	 Catch:{ IllegalStateException -> 0x0015 }
        r1 = r5 + 5;
        r2 = 36;
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0015 }
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
        throw r0;
    L_0x0017:
        if (r2 < r0) goto L_0x002a;
    L_0x0019:
        if (r2 >= r3) goto L_0x002a;
    L_0x001b:
        r0 = new com.google.fK;	 Catch:{ IllegalStateException -> 0x0028 }
        r1 = r5 + 5;
        r2 = r2 + 48;
        r2 = r2 + -5;
        r2 = (char) r2;	 Catch:{ IllegalStateException -> 0x0028 }
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0028 }
        goto L_0x0014;
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r0 = 6;
        r2 = r4.a(r5, r0);
        r0 = 32;
        if (r2 < r0) goto L_0x0044;
    L_0x0033:
        r0 = 58;
        if (r2 >= r0) goto L_0x0044;
    L_0x0037:
        r0 = new com.google.fK;	 Catch:{ IllegalStateException -> 0x0042 }
        r1 = r5 + 6;
        r2 = r2 + 33;
        r2 = (char) r2;	 Catch:{ IllegalStateException -> 0x0042 }
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0042 }
        goto L_0x0014;
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        switch(r2) {
            case 58: goto L_0x0062;
            case 59: goto L_0x0066;
            case 60: goto L_0x006a;
            case 61: goto L_0x006e;
            case 62: goto L_0x0072;
            default: goto L_0x0047;
        };
    L_0x0047:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0060 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0060 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0060 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0060 }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x0060 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0060 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0060 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0060 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r0 = 42;
        if (r1 == 0) goto L_0x0076;
    L_0x0066:
        r0 = 44;
        if (r1 == 0) goto L_0x0076;
    L_0x006a:
        r0 = 45;
        if (r1 == 0) goto L_0x0076;
    L_0x006e:
        r0 = 46;
        if (r1 == 0) goto L_0x0076;
    L_0x0072:
        r0 = 47;
        if (r1 != 0) goto L_0x0047;
    L_0x0076:
        r1 = new com.google.fK;
        r2 = r5 + 6;
        r1.<init>(r2, r0);
        r0 = r1;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ds.d(int):com.google.fK");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    java.lang.String a(java.lang.StringBuilder r6, int r7) {
        /*
        r5_this = this;
        r1 = 0;
        r2 = com.google.f4.a;
        r0 = r1;
    L_0x0004:
        r3 = r5.a(r7, r0);
        r0 = r3.c();
        r0 = com.google.b2.a(r0);
        if (r0 == 0) goto L_0x0015;
    L_0x0012:
        r6.append(r0);
    L_0x0015:
        r0 = r3.d();
        if (r0 == 0) goto L_0x0025;
    L_0x001b:
        r0 = r3.b();
        r0 = java.lang.String.valueOf(r0);
        if (r2 == 0) goto L_0x0026;
    L_0x0025:
        r0 = r1;
    L_0x0026:
        r4 = r3.a();	 Catch:{ IllegalStateException -> 0x0039 }
        if (r7 != r4) goto L_0x002e;
    L_0x002c:
        if (r2 == 0) goto L_0x0034;
    L_0x002e:
        r7 = r3.a();
        if (r2 == 0) goto L_0x0004;
    L_0x0034:
        r0 = r6.toString();
        return r0;
    L_0x0039:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ds.a(java.lang.StringBuilder, int):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e(int r6) {
        /*
        r5_this = this;
        r0 = 0;
        r2 = com.google.f4.a;
        r1 = r6 + 1;
        r3 = r5.a;	 Catch:{ IllegalStateException -> 0x000e }
        r3 = r3.d();	 Catch:{ IllegalStateException -> 0x000e }
        if (r1 <= r3) goto L_0x0010;
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        r1 = r0;
    L_0x0011:
        r3 = 5;
        if (r1 >= r3) goto L_0x002f;
    L_0x0014:
        r3 = r1 + r6;
        r4 = r5.a;	 Catch:{ IllegalStateException -> 0x0031 }
        r4 = r4.d();	 Catch:{ IllegalStateException -> 0x0031 }
        if (r3 >= r4) goto L_0x002f;
    L_0x001e:
        r3 = 2;
        if (r1 != r3) goto L_0x0037;
    L_0x0021:
        r3 = r5.a;	 Catch:{ IllegalStateException -> 0x0035 }
        r4 = r6 + 2;
        r3 = r3.c(r4);	 Catch:{ IllegalStateException -> 0x0035 }
        if (r3 == 0) goto L_0x000d;
    L_0x002b:
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x0011;
    L_0x002f:
        r0 = 1;
        goto L_0x000d;
    L_0x0031:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0033 }
    L_0x0033:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0035 }
    L_0x0035:
        r0 = move-exception;
        throw r0;
    L_0x0037:
        r3 = r5.a;	 Catch:{ IllegalStateException -> 0x0042 }
        r4 = r6 + r1;
        r3 = r3.c(r4);	 Catch:{ IllegalStateException -> 0x0042 }
        if (r3 == 0) goto L_0x002b;
    L_0x0041:
        goto L_0x000d;
    L_0x0042:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ds.e(int):boolean");
    }

    ds(da daVar) {
        this.c = new b8();
        this.b = new StringBuilder();
        this.a = daVar;
    }

    private boolean h(int i) {
        int i2 = f4.a;
        try {
            if (i + 3 > this.a.d()) {
                return false;
            }
            int i3 = i;
            while (i3 < i + 3) {
                try {
                    if (!this.a.c(i3)) {
                        i3++;
                        if (i2 != 0) {
                            break;
                        }
                    }
                    return false;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            return true;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.aY c() {
        /*
        r4_this = this;
        r0 = com.google.f4.a;
    L_0x0002:
        r1 = r4.c;
        r1 = r1.f();
        r1 = r4.g(r1);
        if (r1 == 0) goto L_0x004a;
    L_0x000e:
        r1 = r4.c;
        r1 = r1.f();
        r1 = r4.i(r1);
        r2 = r4.c;
        r3 = r1.a();
        r2.b(r3);
        r2 = r1.a();
        if (r2 == 0) goto L_0x003f;
    L_0x0027:
        r1 = new com.google.fu;
        r0 = r4.c;
        r0 = r0.f();
        r2 = r4.b;
        r2 = r2.toString();
        r1.<init>(r0, r2);
        r0 = new com.google.aY;
        r2 = 1;
        r0.<init>(r1, r2);
    L_0x003e:
        return r0;
    L_0x003f:
        r2 = r4.b;
        r1 = r1.b();
        r2.append(r1);
        if (r0 == 0) goto L_0x0002;
    L_0x004a:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x009e }
        r1 = r1.f();	 Catch:{ IllegalStateException -> 0x009e }
        r1 = r4.h(r1);	 Catch:{ IllegalStateException -> 0x009e }
        if (r1 == 0) goto L_0x0063;
    L_0x0056:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a0 }
        r2 = 3;
        r1.a(r2);	 Catch:{ IllegalStateException -> 0x00a0 }
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a0 }
        r1.d();	 Catch:{ IllegalStateException -> 0x00a0 }
        if (r0 == 0) goto L_0x0097;
    L_0x0063:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a2 }
        r1 = r1.f();	 Catch:{ IllegalStateException -> 0x00a2 }
        r1 = r4.e(r1);	 Catch:{ IllegalStateException -> 0x00a2 }
        if (r1 == 0) goto L_0x0097;
    L_0x006f:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a4 }
        r1 = r1.f();	 Catch:{ IllegalStateException -> 0x00a4 }
        r1 = r1 + 5;
        r2 = r4.a;	 Catch:{ IllegalStateException -> 0x00a4 }
        r2 = r2.d();	 Catch:{ IllegalStateException -> 0x00a4 }
        if (r1 >= r2) goto L_0x0087;
    L_0x007f:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a6 }
        r2 = 5;
        r1.a(r2);	 Catch:{ IllegalStateException -> 0x00a6 }
        if (r0 == 0) goto L_0x0092;
    L_0x0087:
        r0 = r4.c;	 Catch:{ IllegalStateException -> 0x00a6 }
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x00a6 }
        r1 = r1.d();	 Catch:{ IllegalStateException -> 0x00a6 }
        r0.b(r1);	 Catch:{ IllegalStateException -> 0x00a6 }
    L_0x0092:
        r0 = r4.c;
        r0.a();
    L_0x0097:
        r0 = new com.google.aY;
        r1 = 0;
        r0.<init>(r1);
        goto L_0x003e;
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a4 }
    L_0x00a4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a6 }
    L_0x00a6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ds.c():com.google.aY");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.fK i(int r6) {
        /*
        r5_this = this;
        r4 = 90;
        r3 = 15;
        r0 = 5;
        r1 = com.google.f4.a;
        r2 = r5.a(r6, r0);
        if (r2 != r3) goto L_0x0019;
    L_0x000d:
        r0 = new com.google.fK;	 Catch:{ IllegalStateException -> 0x0017 }
        r1 = r6 + 5;
        r2 = 36;
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0017 }
    L_0x0016:
        return r0;
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        if (r2 < r0) goto L_0x002c;
    L_0x001b:
        if (r2 >= r3) goto L_0x002c;
    L_0x001d:
        r0 = new com.google.fK;	 Catch:{ IllegalStateException -> 0x002a }
        r1 = r6 + 5;
        r2 = r2 + 48;
        r2 = r2 + -5;
        r2 = (char) r2;	 Catch:{ IllegalStateException -> 0x002a }
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x002a }
        goto L_0x0016;
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = 7;
        r2 = r5.a(r6, r0);
        r0 = 64;
        if (r2 < r0) goto L_0x0044;
    L_0x0035:
        if (r2 >= r4) goto L_0x0044;
    L_0x0037:
        r0 = new com.google.fK;	 Catch:{ IllegalStateException -> 0x0042 }
        r1 = r6 + 7;
        r2 = r2 + 1;
        r2 = (char) r2;	 Catch:{ IllegalStateException -> 0x0042 }
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0042 }
        goto L_0x0016;
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        if (r2 < r4) goto L_0x0057;
    L_0x0046:
        r0 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r2 >= r0) goto L_0x0057;
    L_0x004a:
        r0 = new com.google.fK;	 Catch:{ IllegalStateException -> 0x0055 }
        r1 = r6 + 7;
        r2 = r2 + 7;
        r2 = (char) r2;	 Catch:{ IllegalStateException -> 0x0055 }
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0055 }
        goto L_0x0016;
    L_0x0055:
        r0 = move-exception;
        throw r0;
    L_0x0057:
        r0 = 8;
        r0 = r5.a(r6, r0);
        switch(r0) {
            case 232: goto L_0x0067;
            case 233: goto L_0x006b;
            case 234: goto L_0x006f;
            case 235: goto L_0x0073;
            case 236: goto L_0x0077;
            case 237: goto L_0x007b;
            case 238: goto L_0x007f;
            case 239: goto L_0x0083;
            case 240: goto L_0x0087;
            case 241: goto L_0x008b;
            case 242: goto L_0x008f;
            case 243: goto L_0x0093;
            case 244: goto L_0x0097;
            case 245: goto L_0x009b;
            case 246: goto L_0x009f;
            case 247: goto L_0x00a3;
            case 248: goto L_0x00a7;
            case 249: goto L_0x00ab;
            case 250: goto L_0x00af;
            case 251: goto L_0x00b3;
            case 252: goto L_0x00b7;
            default: goto L_0x0060;
        };
    L_0x0060:
        r0 = com.google.ga.a();	 Catch:{ IllegalStateException -> 0x0065 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = 33;
        if (r1 == 0) goto L_0x00bb;
    L_0x006b:
        r0 = 34;
        if (r1 == 0) goto L_0x00bb;
    L_0x006f:
        r0 = 37;
        if (r1 == 0) goto L_0x00bb;
    L_0x0073:
        r0 = 38;
        if (r1 == 0) goto L_0x00bb;
    L_0x0077:
        r0 = 39;
        if (r1 == 0) goto L_0x00bb;
    L_0x007b:
        r0 = 40;
        if (r1 == 0) goto L_0x00bb;
    L_0x007f:
        r0 = 41;
        if (r1 == 0) goto L_0x00bb;
    L_0x0083:
        r0 = 42;
        if (r1 == 0) goto L_0x00bb;
    L_0x0087:
        r0 = 43;
        if (r1 == 0) goto L_0x00bb;
    L_0x008b:
        r0 = 44;
        if (r1 == 0) goto L_0x00bb;
    L_0x008f:
        r0 = 45;
        if (r1 == 0) goto L_0x00bb;
    L_0x0093:
        r0 = 46;
        if (r1 == 0) goto L_0x00bb;
    L_0x0097:
        r0 = 47;
        if (r1 == 0) goto L_0x00bb;
    L_0x009b:
        r0 = 58;
        if (r1 == 0) goto L_0x00bb;
    L_0x009f:
        r0 = 59;
        if (r1 == 0) goto L_0x00bb;
    L_0x00a3:
        r0 = 60;
        if (r1 == 0) goto L_0x00bb;
    L_0x00a7:
        r0 = 61;
        if (r1 == 0) goto L_0x00bb;
    L_0x00ab:
        r0 = 62;
        if (r1 == 0) goto L_0x00bb;
    L_0x00af:
        r0 = 63;
        if (r1 == 0) goto L_0x00bb;
    L_0x00b3:
        r0 = 95;
        if (r1 == 0) goto L_0x00bb;
    L_0x00b7:
        r0 = 32;
        if (r1 != 0) goto L_0x0060;
    L_0x00bb:
        r1 = new com.google.fK;
        r2 = r6 + 8;
        r1.<init>(r2, r0);
        r0 = r1;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ds.i(int):com.google.fK");
    }

    private fR c(int i) {
        if (i + 7 > this.a.d()) {
            int a = a(i, 4);
            if (a != 0) {
                return new fR(this.a.d(), a - 1, 10);
            }
            try {
                return new fR(this.a.d(), 10, 10);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        int a2 = a(i, 7);
        return new fR(i + 7, (a2 - 8) / 11, (a2 - 8) % 11);
    }

    private boolean f(int i) {
        boolean z = true;
        try {
            if (i + 5 > this.a.d()) {
                return false;
            }
            int a = a(i, 5);
            if (a >= 5 && a < 16) {
                return true;
            }
            try {
                if (i + 6 > this.a.d()) {
                    return false;
                }
                a = a(i, 6);
                if (a < 16 || a >= 63) {
                    z = false;
                }
                return z;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.fu d() {
        /*
        r5_this = this;
        r3 = com.google.f4.a;
    L_0x0002:
        r0 = r5.c;
        r4 = r0.f();
        r0 = r5.c;
        r0 = r0.b();
        if (r0 == 0) goto L_0x001a;
    L_0x0010:
        r0 = r5.a();
        r1 = r0.b();
        if (r3 == 0) goto L_0x0052;
    L_0x001a:
        r0 = r5.c;	 Catch:{ IllegalStateException -> 0x004c }
        r0 = r0.e();	 Catch:{ IllegalStateException -> 0x004c }
        if (r0 == 0) goto L_0x002c;
    L_0x0022:
        r0 = r5.c();
        r1 = r0.b();
        if (r3 == 0) goto L_0x0052;
    L_0x002c:
        r0 = r5.b();
        r1 = r0.b();
        r2 = r1;
        r1 = r0;
    L_0x0036:
        r0 = r5.c;	 Catch:{ IllegalStateException -> 0x004e }
        r0 = r0.f();	 Catch:{ IllegalStateException -> 0x004e }
        if (r4 == r0) goto L_0x0050;
    L_0x003e:
        r0 = 1;
    L_0x003f:
        if (r0 != 0) goto L_0x0045;
    L_0x0041:
        if (r2 != 0) goto L_0x0045;
    L_0x0043:
        if (r3 == 0) goto L_0x0047;
    L_0x0045:
        if (r2 == 0) goto L_0x0002;
    L_0x0047:
        r0 = r1.a();
        return r0;
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r0 = 0;
        goto L_0x003f;
    L_0x0052:
        r2 = r1;
        r1 = r0;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ds.d():com.google.fu");
    }

    int a(int i, int i2) {
        return a(this.a, i, i2);
    }

    fu a(int i, String str) {
        try {
            this.b.setLength(0);
            if (str != null) {
                this.b.append(str);
            }
            this.c.b(i);
            fu d = d();
            if (d != null) {
                try {
                    if (d.d()) {
                        return new fu(this.c.f(), this.b.toString(), d.b());
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            return new fu(this.c.f(), this.b.toString());
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private boolean g(int i) {
        boolean z = true;
        try {
            if (i + 5 > this.a.d()) {
                return false;
            }
            int a = a(i, 5);
            if (a >= 5 && a < 16) {
                return true;
            }
            try {
                if (i + 7 > this.a.d()) {
                    return false;
                }
                a = a(i, 7);
                if (a >= 64 && a < 116) {
                    return true;
                }
                try {
                    if (i + 8 > this.a.d()) {
                        return false;
                    }
                    a = a(i, 8);
                    if (a < 232 || a >= 253) {
                        z = false;
                    }
                    return z;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.aY b() {
        /*
        r6_this = this;
        r5 = 1;
        r1 = com.google.f4.a;
    L_0x0003:
        r0 = r6.c;
        r0 = r0.f();
        r0 = r6.b(r0);
        if (r0 == 0) goto L_0x0090;
    L_0x000f:
        r0 = r6.c;
        r0 = r0.f();
        r2 = r6.c(r0);
        r0 = r6.c;	 Catch:{ IllegalStateException -> 0x005d }
        r3 = r2.a();	 Catch:{ IllegalStateException -> 0x005d }
        r0.b(r3);	 Catch:{ IllegalStateException -> 0x005d }
        r0 = r2.e();	 Catch:{ IllegalStateException -> 0x005d }
        if (r0 == 0) goto L_0x005f;
    L_0x0028:
        r0 = r2.d();	 Catch:{ IllegalStateException -> 0x005d }
        if (r0 == 0) goto L_0x0041;
    L_0x002e:
        r0 = new com.google.fu;
        r3 = r6.c;
        r3 = r3.f();
        r4 = r6.b;
        r4 = r4.toString();
        r0.<init>(r3, r4);
        if (r1 == 0) goto L_0x0056;
    L_0x0041:
        r0 = new com.google.fu;
        r1 = r6.c;
        r1 = r1.f();
        r3 = r6.b;
        r3 = r3.toString();
        r2 = r2.b();
        r0.<init>(r1, r3, r2);
    L_0x0056:
        r1 = new com.google.aY;
        r1.<init>(r0, r5);
        r0 = r1;
    L_0x005c:
        return r0;
    L_0x005d:
        r0 = move-exception;
        throw r0;
    L_0x005f:
        r0 = r6.b;
        r3 = r2.c();
        r0.append(r3);
        r0 = r2.d();
        if (r0 == 0) goto L_0x0085;
    L_0x006e:
        r1 = new com.google.fu;
        r0 = r6.c;
        r0 = r0.f();
        r2 = r6.b;
        r2 = r2.toString();
        r1.<init>(r0, r2);
        r0 = new com.google.aY;
        r0.<init>(r1, r5);
        goto L_0x005c;
    L_0x0085:
        r0 = r6.b;
        r2 = r2.b();
        r0.append(r2);
        if (r1 == 0) goto L_0x0003;
    L_0x0090:
        r0 = r6.c;	 Catch:{ IllegalStateException -> 0x00ae }
        r0 = r0.f();	 Catch:{ IllegalStateException -> 0x00ae }
        r0 = r6.a(r0);	 Catch:{ IllegalStateException -> 0x00ae }
        if (r0 == 0) goto L_0x00a7;
    L_0x009c:
        r0 = r6.c;	 Catch:{ IllegalStateException -> 0x00ae }
        r0.a();	 Catch:{ IllegalStateException -> 0x00ae }
        r0 = r6.c;	 Catch:{ IllegalStateException -> 0x00ae }
        r1 = 4;
        r0.a(r1);	 Catch:{ IllegalStateException -> 0x00ae }
    L_0x00a7:
        r0 = new com.google.aY;
        r1 = 0;
        r0.<init>(r1);
        goto L_0x005c;
    L_0x00ae:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ds.b():com.google.aY");
    }

    private boolean a(int i) {
        int i2 = f4.a;
        try {
            if (i + 1 > this.a.d()) {
                return false;
            }
            int i3 = 0;
            while (i3 < 4) {
                try {
                    if (i3 + i >= this.a.d()) {
                        break;
                    } else if (!this.a.c(i + i3)) {
                        i3++;
                        if (i2 != 0) {
                            break;
                        }
                    } else {
                        return false;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            return true;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static int a(da daVar, int i, int i2) {
        int i3 = 0;
        int i4 = f4.a;
        int i5 = 0;
        while (i5 < i2) {
            if (daVar.c(i + i5)) {
                i3 |= 1 << ((i2 - i5) - 1);
            }
            i5++;
            if (i4 != 0) {
                break;
            }
        }
        return i3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.aY a() {
        /*
        r4_this = this;
        r0 = com.google.f4.a;
    L_0x0002:
        r1 = r4.c;
        r1 = r1.f();
        r1 = r4.f(r1);
        if (r1 == 0) goto L_0x004a;
    L_0x000e:
        r1 = r4.c;
        r1 = r1.f();
        r1 = r4.d(r1);
        r2 = r4.c;
        r3 = r1.a();
        r2.b(r3);
        r2 = r1.a();
        if (r2 == 0) goto L_0x003f;
    L_0x0027:
        r1 = new com.google.fu;
        r0 = r4.c;
        r0 = r0.f();
        r2 = r4.b;
        r2 = r2.toString();
        r1.<init>(r0, r2);
        r0 = new com.google.aY;
        r2 = 1;
        r0.<init>(r1, r2);
    L_0x003e:
        return r0;
    L_0x003f:
        r2 = r4.b;
        r1 = r1.b();
        r2.append(r1);
        if (r0 == 0) goto L_0x0002;
    L_0x004a:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x009e }
        r1 = r1.f();	 Catch:{ IllegalStateException -> 0x009e }
        r1 = r4.h(r1);	 Catch:{ IllegalStateException -> 0x009e }
        if (r1 == 0) goto L_0x0063;
    L_0x0056:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a0 }
        r2 = 3;
        r1.a(r2);	 Catch:{ IllegalStateException -> 0x00a0 }
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a0 }
        r1.d();	 Catch:{ IllegalStateException -> 0x00a0 }
        if (r0 == 0) goto L_0x0097;
    L_0x0063:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a2 }
        r1 = r1.f();	 Catch:{ IllegalStateException -> 0x00a2 }
        r1 = r4.e(r1);	 Catch:{ IllegalStateException -> 0x00a2 }
        if (r1 == 0) goto L_0x0097;
    L_0x006f:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a4 }
        r1 = r1.f();	 Catch:{ IllegalStateException -> 0x00a4 }
        r1 = r1 + 5;
        r2 = r4.a;	 Catch:{ IllegalStateException -> 0x00a4 }
        r2 = r2.d();	 Catch:{ IllegalStateException -> 0x00a4 }
        if (r1 >= r2) goto L_0x0087;
    L_0x007f:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a6 }
        r2 = 5;
        r1.a(r2);	 Catch:{ IllegalStateException -> 0x00a6 }
        if (r0 == 0) goto L_0x0092;
    L_0x0087:
        r0 = r4.c;	 Catch:{ IllegalStateException -> 0x00a6 }
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x00a6 }
        r1 = r1.d();	 Catch:{ IllegalStateException -> 0x00a6 }
        r0.b(r1);	 Catch:{ IllegalStateException -> 0x00a6 }
    L_0x0092:
        r0 = r4.c;
        r0.c();
    L_0x0097:
        r0 = new com.google.aY;
        r1 = 0;
        r0.<init>(r1);
        goto L_0x003e;
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a4 }
    L_0x00a4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a6 }
    L_0x00a6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ds.a():com.google.aY");
    }
}
