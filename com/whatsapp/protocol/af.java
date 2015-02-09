package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class af extends w {
    private static final String[] z;
    final j a;
    final c1 b;

    static {
        String[] strArr = new String[8];
        String str = "L8\u0011";
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
                        i3 = 120;
                        break;
                    case ay.f /*1*/:
                        i3 = 8;
                        break;
                    case ay.n /*2*/:
                        i3 = 32;
                        break;
                    case ay.p /*3*/:
                        i3 = 19;
                        break;
                    default:
                        i3 = 51;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u000b|AgF\u000b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "L8\u0014";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\r{Ea";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\fqPv";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001eiI\u007f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001bgDv";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "L8\u0013";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(int i) {
        this.b.a(i);
    }

    af(j jVar, c1 c1Var) {
        this.a = jVar;
        this.b = c1Var;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.bi r9, java.lang.String r10) {
        /*
        r8_this = this;
        r0 = 0;
        r6 = 1;
        r5 = 0;
        r2 = com.whatsapp.protocol.b.n;
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r3 = r9.d(r3);
        if (r3 == 0) goto L_0x008a;
    L_0x0011:
        r4 = r3.e;	 Catch:{ NumberFormatException -> 0x0090 }
        if (r4 == 0) goto L_0x008a;
    L_0x0015:
        r4 = r3.e;	 Catch:{ NumberFormatException -> 0x0092 }
        r4 = r4.length;	 Catch:{ NumberFormatException -> 0x0092 }
        if (r4 != r6) goto L_0x008a;
    L_0x001a:
        r3 = r3.e;
        r3 = r3[r5];
        r4 = z;
        r5 = 4;
        r4 = r4[r5];
        com.whatsapp.protocol.bi.b(r3, r4);
        r4 = "t";
        r4 = r3.b(r4);
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r4 != 0) goto L_0x0094;
    L_0x0030:
        r0 = r0 * r6;
    L_0x0031:
        r4 = z;
        r5 = 7;
        r4 = r4[r5];
        r4 = r3.b(r4);
        r5 = z;
        r6 = 5;
        r5 = r5[r6];
        r5 = r3.b(r5);
        r3 = r3.a();
        if (r5 == 0) goto L_0x0083;
    L_0x0049:
        r6 = z;	 Catch:{ NumberFormatException -> 0x0099 }
        r7 = 6;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x0099 }
        r5 = r5.equals(r6);	 Catch:{ NumberFormatException -> 0x0099 }
        if (r5 == 0) goto L_0x0083;
    L_0x0054:
        r5 = z;	 Catch:{ NumberFormatException -> 0x009b }
        r6 = 0;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x009b }
        r5 = r5.equals(r4);	 Catch:{ NumberFormatException -> 0x009b }
        if (r5 != 0) goto L_0x0075;
    L_0x005f:
        r5 = z;	 Catch:{ NumberFormatException -> 0x009d }
        r6 = 1;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x009d }
        r5 = r5.equals(r4);	 Catch:{ NumberFormatException -> 0x009d }
        if (r5 != 0) goto L_0x0075;
    L_0x006a:
        r5 = z;	 Catch:{ NumberFormatException -> 0x009f }
        r6 = 3;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x009f }
        r4 = r5.equals(r4);	 Catch:{ NumberFormatException -> 0x009f }
        if (r4 == 0) goto L_0x007c;
    L_0x0075:
        r4 = r8.b;	 Catch:{ NumberFormatException -> 0x00a1 }
        r4.a();	 Catch:{ NumberFormatException -> 0x00a1 }
        if (r2 == 0) goto L_0x0088;
    L_0x007c:
        r4 = r8.b;	 Catch:{ NumberFormatException -> 0x00a3 }
        r4.b();	 Catch:{ NumberFormatException -> 0x00a3 }
        if (r2 == 0) goto L_0x0088;
    L_0x0083:
        r4 = r8.b;	 Catch:{ NumberFormatException -> 0x00a3 }
        r4.a(r0, r3);	 Catch:{ NumberFormatException -> 0x00a3 }
    L_0x0088:
        if (r2 == 0) goto L_0x008f;
    L_0x008a:
        r0 = r8.b;	 Catch:{ NumberFormatException -> 0x00a5 }
        r0.b();	 Catch:{ NumberFormatException -> 0x00a5 }
    L_0x008f:
        return;
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r0 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x00a7 }
        goto L_0x0030;
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00a3 }
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r4 = move-exception;
        goto L_0x0031;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.af.a(com.whatsapp.protocol.bi, java.lang.String):void");
    }
}
