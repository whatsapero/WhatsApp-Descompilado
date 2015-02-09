package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class bv extends w {
    private static final String[] z;
    final b2 a;
    final j b;

    static {
        String[] strArr = new String[10];
        String str = "K\u0006&-\u000b_\u001f.";
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
                        i3 = 38;
                        break;
                    case ay.f /*1*/:
                        i3 = 111;
                        break;
                    case ay.n /*2*/:
                        i3 = 75;
                        break;
                    case ay.p /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 127;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "R\u0016;-";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "O\u001f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "T\n8=\u0012C";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "U\u00061-";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "S\u001d'";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "B\u001a9)\u000bO\u0000%";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "B\u001a;$\u0016E\u000e?-";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "S\u001d'";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "K\n/!\u001e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.bi r8, java.lang.String r9) {
        /*
        r7_this = this;
        r1 = 0;
        r2 = n;
        r0 = z;
        r3 = 1;
        r0 = r0[r3];
        r0 = r8.d(r0);
        if (r0 == 0) goto L_0x0038;
    L_0x000e:
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r3 = r0.b(r3);
        r4 = z;
        r5 = 3;
        r4 = r4[r5];
        r4 = r0.b(r4);
        r5 = z;
        r6 = 4;
        r5 = r5[r6];
        r0 = r0.b(r5);
        if (r0 != 0) goto L_0x00d2;
    L_0x002c:
        r0 = r1;
    L_0x002d:
        r5 = r7.a;	 Catch:{ NumberFormatException -> 0x00dc }
        if (r5 == 0) goto L_0x0036;
    L_0x0031:
        r5 = r7.a;	 Catch:{ NumberFormatException -> 0x00dc }
        r5.a(r3, r4, r0);	 Catch:{ NumberFormatException -> 0x00dc }
    L_0x0036:
        if (r2 == 0) goto L_0x00d1;
    L_0x0038:
        r0 = z;
        r3 = 8;
        r0 = r0[r3];
        r0 = r8.d(r0);
        if (r0 == 0) goto L_0x00d1;
    L_0x0044:
        r3 = r0.c;	 Catch:{ NumberFormatException -> 0x00de }
        if (r3 == 0) goto L_0x00d1;
    L_0x0048:
        r3 = new com.whatsapp.protocol.cm;
        r3.<init>();
    L_0x004d:
        r4 = r0.c;
        r4 = r4.length;
        if (r1 >= r4) goto L_0x00c8;
    L_0x0052:
        r4 = z;	 Catch:{ NumberFormatException -> 0x00e0 }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x00e0 }
        r5 = r0.c;	 Catch:{ NumberFormatException -> 0x00e0 }
        r5 = r5[r1];	 Catch:{ NumberFormatException -> 0x00e0 }
        r5 = r5.b;	 Catch:{ NumberFormatException -> 0x00e0 }
        r4 = r4.equals(r5);	 Catch:{ NumberFormatException -> 0x00e0 }
        if (r4 == 0) goto L_0x0071;
    L_0x0063:
        r4 = r0.c;	 Catch:{ NumberFormatException -> 0x00e0 }
        r4 = r4[r1];	 Catch:{ NumberFormatException -> 0x00e0 }
        r4 = r4.a;	 Catch:{ NumberFormatException -> 0x00e0 }
        r4 = com.whatsapp.protocol.b.a(r4);	 Catch:{ NumberFormatException -> 0x00e0 }
        r3.f = r4;	 Catch:{ NumberFormatException -> 0x00e0 }
        if (r2 == 0) goto L_0x00c4;
    L_0x0071:
        r4 = z;	 Catch:{ NumberFormatException -> 0x00e2 }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x00e2 }
        r5 = r0.c;	 Catch:{ NumberFormatException -> 0x00e2 }
        r5 = r5[r1];	 Catch:{ NumberFormatException -> 0x00e2 }
        r5 = r5.b;	 Catch:{ NumberFormatException -> 0x00e2 }
        r4 = r4.equals(r5);	 Catch:{ NumberFormatException -> 0x00e2 }
        if (r4 == 0) goto L_0x008c;
    L_0x0082:
        r4 = r0.c;	 Catch:{ NumberFormatException -> 0x00e4 }
        r4 = r4[r1];	 Catch:{ NumberFormatException -> 0x00e4 }
        r4 = r4.a;	 Catch:{ NumberFormatException -> 0x00e4 }
        r3.e = r4;	 Catch:{ NumberFormatException -> 0x00e4 }
        if (r2 == 0) goto L_0x00c4;
    L_0x008c:
        r4 = z;	 Catch:{ NumberFormatException -> 0x00e6 }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x00e6 }
        r5 = r0.c;	 Catch:{ NumberFormatException -> 0x00e6 }
        r5 = r5[r1];	 Catch:{ NumberFormatException -> 0x00e6 }
        r5 = r5.b;	 Catch:{ NumberFormatException -> 0x00e6 }
        r4 = r4.equals(r5);	 Catch:{ NumberFormatException -> 0x00e6 }
        if (r4 == 0) goto L_0x00a7;
    L_0x009d:
        r4 = r0.c;	 Catch:{ NumberFormatException -> 0x00e8 }
        r4 = r4[r1];	 Catch:{ NumberFormatException -> 0x00e8 }
        r4 = r4.a;	 Catch:{ NumberFormatException -> 0x00e8 }
        r3.a = r4;	 Catch:{ NumberFormatException -> 0x00e8 }
        if (r2 == 0) goto L_0x00c4;
    L_0x00a7:
        r4 = z;	 Catch:{ NumberFormatException -> 0x00ea }
        r5 = 5;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x00ea }
        r5 = r0.c;	 Catch:{ NumberFormatException -> 0x00ea }
        r5 = r5[r1];	 Catch:{ NumberFormatException -> 0x00ea }
        r5 = r5.b;	 Catch:{ NumberFormatException -> 0x00ea }
        r4 = r4.equals(r5);	 Catch:{ NumberFormatException -> 0x00ea }
        if (r4 == 0) goto L_0x00ef;
    L_0x00b8:
        r4 = r0.c;	 Catch:{ NumberFormatException -> 0x00ec }
        r4 = r4[r1];	 Catch:{ NumberFormatException -> 0x00ec }
        r4 = r4.a;	 Catch:{ NumberFormatException -> 0x00ec }
        r4 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x00ec }
        r3.d = r4;	 Catch:{ NumberFormatException -> 0x00ec }
    L_0x00c4:
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x004d;
    L_0x00c8:
        r0 = r7.a;	 Catch:{ NumberFormatException -> 0x0111 }
        if (r0 == 0) goto L_0x00d1;
    L_0x00cc:
        r0 = r7.a;	 Catch:{ NumberFormatException -> 0x0111 }
        r0.a(r3);	 Catch:{ NumberFormatException -> 0x0111 }
    L_0x00d1:
        return;
    L_0x00d2:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00d8 }
        goto L_0x002d;
    L_0x00d8:
        r0 = move-exception;
        r0 = r1;
        goto L_0x002d;
    L_0x00dc:
        r0 = move-exception;
        throw r0;
    L_0x00de:
        r0 = move-exception;
        throw r0;
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e8 }
    L_0x00e8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00ea }
    L_0x00ea:
        r0 = move-exception;
        throw r0;
    L_0x00ec:
        r4 = move-exception;
        if (r2 == 0) goto L_0x00c4;
    L_0x00ef:
        r4 = z;	 Catch:{ NumberFormatException -> 0x010f }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x010f }
        r5 = r0.c;	 Catch:{ NumberFormatException -> 0x010f }
        r5 = r5[r1];	 Catch:{ NumberFormatException -> 0x010f }
        r5 = r5.b;	 Catch:{ NumberFormatException -> 0x010f }
        r4 = r4.equals(r5);	 Catch:{ NumberFormatException -> 0x010f }
        if (r4 == 0) goto L_0x00c4;
    L_0x0100:
        r4 = r0.c;	 Catch:{ NumberFormatException -> 0x010d }
        r4 = r4[r1];	 Catch:{ NumberFormatException -> 0x010d }
        r4 = r4.a;	 Catch:{ NumberFormatException -> 0x010d }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x010d }
        r3.c = r4;	 Catch:{ NumberFormatException -> 0x010d }
        goto L_0x00c4;
    L_0x010d:
        r4 = move-exception;
        goto L_0x00c4;
    L_0x010f:
        r0 = move-exception;
        throw r0;
    L_0x0111:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.bv.a(com.whatsapp.protocol.bi, java.lang.String):void");
    }

    bv(j jVar, b2 b2Var) {
        this.b = jVar;
        this.a = b2Var;
    }

    public void a(int i) {
        try {
            if (this.a != null) {
                this.a.a(i);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }
}
