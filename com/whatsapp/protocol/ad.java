package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class ad extends w {
    private static final String[] z;
    final j a;

    static {
        String[] strArr = new String[8];
        String str = "_\u000bS\u0014|O\n";
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
                        i3 = 44;
                        break;
                    case ay.f /*1*/:
                        i3 = 126;
                        break;
                    case ay.n /*2*/:
                        i3 = 49;
                        break;
                    case ay.p /*3*/:
                        i3 = 126;
                        break;
                    default:
                        i3 = 25;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "_!E";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "_!^";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "@\u0011R\u001fmE\u0011_";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "O\fT\u001fmC\f";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "M\bP\u0017uM\u001c]\u001b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "O\fT\u001fmE\u0011_";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "X\u0007A\u001b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.bi r21, java.lang.String r22) {
        /*
        r20_this = this;
        r2 = 0;
        r0 = r21;
        r2 = r0.a(r2);
        r3 = z;
        r4 = 5;
        r3 = r3[r4];
        r4 = r2.b(r3);
        r3 = z;
        r5 = 7;
        r3 = r3[r5];
        r3 = r2.b(r3);
        r5 = 0;
        r6 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x0099 }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = r6 * r8;
    L_0x0023:
        r7 = z;
        r8 = 0;
        r7 = r7[r8];
        r7 = r2.b(r7);
        r8 = z;
        r9 = 2;
        r8 = r8[r9];
        r10 = r2.b(r8);
        r8 = 0;
        r8 = java.lang.Long.parseLong(r10);	 Catch:{ NumberFormatException -> 0x009b }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 * r10;
    L_0x003e:
        r10 = z;
        r11 = 3;
        r10 = r10[r11];
        r10 = r2.b(r10);
        r11 = z;
        r12 = 1;
        r11 = r11[r12];
        r11 = r2.b(r11);
        r12 = z;
        r13 = 4;
        r12 = r12[r13];
        r14 = r2.b(r12);
        r12 = 0;
        if (r14 == 0) goto L_0x007d;
    L_0x005d:
        r15 = z;	 Catch:{ NumberFormatException -> 0x0097 }
        r16 = 6;
        r15 = r15[r16];	 Catch:{ NumberFormatException -> 0x0097 }
        r14 = r14.equals(r15);	 Catch:{ NumberFormatException -> 0x0097 }
        if (r14 == 0) goto L_0x006f;
    L_0x0069:
        r12 = -1;
        r14 = com.whatsapp.protocol.b.n;
        if (r14 == 0) goto L_0x007d;
    L_0x006f:
        r14 = 0;
        r16 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x009d }
        r18 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r16 = r16 * r18;
        r12 = java.lang.Math.max(r14, r16);	 Catch:{ NumberFormatException -> 0x009d }
    L_0x007d:
        r14 = new java.util.Hashtable;
        r14.<init>();
        r0 = r20;
        r3 = r0.a;
        com.whatsapp.protocol.j.a(r3, r2, r14);
        r0 = r20;
        r2 = r0.a;
        r2 = com.whatsapp.protocol.j.c(r2);
        r3 = r22;
        r2.b(r3, r4, r5, r7, r8, r10, r11, r12, r14);
        return;
    L_0x0097:
        r2 = move-exception;
        throw r2;
    L_0x0099:
        r7 = move-exception;
        goto L_0x0023;
    L_0x009b:
        r10 = move-exception;
        goto L_0x003e;
    L_0x009d:
        r3 = move-exception;
        goto L_0x007d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.ad.a(com.whatsapp.protocol.bi, java.lang.String):void");
    }

    ad(j jVar) {
        this.a = jVar;
    }
}
