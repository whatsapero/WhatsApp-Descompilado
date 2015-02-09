package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;

class ay extends w {
    private static final String[] z;
    final cd a;
    final j b;
    final Runnable c;

    static {
        String[] strArr = new String[11];
        String str = ":N";
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
                        i3 = 83;
                        break;
                    case org.whispersystems.libaxolotl.ay.f /*1*/:
                        i3 = 42;
                        break;
                    case org.whispersystems.libaxolotl.ay.n /*2*/:
                        i3 = 57;
                        break;
                    case org.whispersystems.libaxolotl.ay.p /*3*/:
                        i3 = 104;
                        break;
                    default:
                        i3 = 34;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "2\\X\u0001N2HU\r";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case org.whispersystems.libaxolotl.ay.f /*1*/:
                    strArr2[i] = str;
                    str = "0X\\\tV<X";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case org.whispersystems.libaxolotl.ay.n /*2*/:
                    strArr2[i] = str;
                    str = " uM";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case org.whispersystems.libaxolotl.ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "4XV\u001dR";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "?EZ\tV:EW";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = " uV";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "0X\\\tV:EW";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "4XV\u001dR ";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = " _[\u0002G0^";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "'SI\r";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ay(j jVar, Runnable runnable, cd cdVar) {
        this.b = jVar;
        this.c = runnable;
        this.a = cdVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.bi r27, java.lang.String r28) {
        /*
        r26_this = this;
        r16 = com.whatsapp.protocol.b.n;
        r17 = new java.util.Vector;
        r17.<init>();
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r0 = r27;
        r2 = r0.d(r2);
        if (r2 == 0) goto L_0x00dc;
    L_0x0015:
        r3 = z;
        r4 = 5;
        r3 = r3[r4];
        r18 = r2.f(r3);
        r2 = 0;
        r15 = r2;
    L_0x0020:
        r2 = r18.size();
        if (r15 >= r2) goto L_0x00dc;
    L_0x0026:
        r0 = r18;
        r2 = r0.elementAt(r15);
        r2 = (com.whatsapp.protocol.bi) r2;
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        r3 = r2.b(r3);
        r0 = r26;
        r4 = r0.b;
        r3 = com.whatsapp.protocol.j.a(r4, r3);
        r4 = z;
        r5 = 3;
        r4 = r4[r5];
        r4 = r2.b(r4);
        r5 = z;
        r6 = 8;
        r5 = r5[r6];
        r14 = r2.b(r5);
        r5 = 0;
        r6 = java.lang.Long.parseLong(r14);	 Catch:{ NumberFormatException -> 0x00fb }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = r6 * r8;
    L_0x005c:
        r7 = z;
        r8 = 10;
        r7 = r7[r8];
        r7 = r2.b(r7);
        r8 = z;
        r9 = 4;
        r8 = r8[r9];
        r10 = r2.b(r8);
        r8 = 0;
        r8 = java.lang.Long.parseLong(r10);	 Catch:{ NumberFormatException -> 0x00fe }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 * r10;
    L_0x0078:
        r10 = z;
        r11 = 7;
        r10 = r10[r11];
        r10 = r2.b(r10);
        r11 = z;
        r12 = 1;
        r11 = r11[r12];
        r11 = r2.b(r11);
        r12 = 0;
        r19 = z;
        r20 = 6;
        r19 = r19[r20];
        r0 = r19;
        r19 = r2.b(r0);
        if (r19 == 0) goto L_0x00b8;
    L_0x009a:
        r20 = z;	 Catch:{ NumberFormatException -> 0x00f7 }
        r21 = 2;
        r20 = r20[r21];	 Catch:{ NumberFormatException -> 0x00f7 }
        r19 = r19.equals(r20);	 Catch:{ NumberFormatException -> 0x00f7 }
        if (r19 == 0) goto L_0x00aa;
    L_0x00a6:
        r12 = -1;
        if (r16 == 0) goto L_0x00b8;
    L_0x00aa:
        r20 = 0;
        r22 = java.lang.Long.parseLong(r14);	 Catch:{ NumberFormatException -> 0x0101 }
        r24 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r22 = r22 * r24;
        r12 = java.lang.Math.max(r20, r22);	 Catch:{ NumberFormatException -> 0x0101 }
    L_0x00b8:
        r14 = new java.util.Hashtable;
        r14.<init>();
        r0 = r26;
        r0 = r0.b;
        r19 = r0;
        r0 = r19;
        com.whatsapp.protocol.j.a(r0, r2, r14);
        r0 = r26;
        r2 = r0.b;
        r2 = com.whatsapp.protocol.j.c(r2);
        r2.a(r3, r4, r5, r7, r8, r10, r11, r12, r14);
        r0 = r17;
        r0.addElement(r3);
        r2 = r15 + 1;
        if (r16 == 0) goto L_0x0103;
    L_0x00dc:
        r0 = r26;
        r2 = r0.b;	 Catch:{ NumberFormatException -> 0x00f9 }
        r2 = com.whatsapp.protocol.j.c(r2);	 Catch:{ NumberFormatException -> 0x00f9 }
        r0 = r17;
        r2.a(r0);	 Catch:{ NumberFormatException -> 0x00f9 }
        r0 = r26;
        r2 = r0.c;	 Catch:{ NumberFormatException -> 0x00f9 }
        if (r2 == 0) goto L_0x00f6;
    L_0x00ef:
        r0 = r26;
        r2 = r0.c;	 Catch:{ NumberFormatException -> 0x00f9 }
        r2.run();	 Catch:{ NumberFormatException -> 0x00f9 }
    L_0x00f6:
        return;
    L_0x00f7:
        r2 = move-exception;
        throw r2;
    L_0x00f9:
        r2 = move-exception;
        throw r2;
    L_0x00fb:
        r7 = move-exception;
        goto L_0x005c;
    L_0x00fe:
        r10 = move-exception;
        goto L_0x0078;
    L_0x0101:
        r14 = move-exception;
        goto L_0x00b8;
    L_0x0103:
        r15 = r2;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.ay.a(com.whatsapp.protocol.bi, java.lang.String):void");
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
