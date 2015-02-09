package com.whatsapp.protocol;

import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class ah extends w {
    private static final String[] z;
    final String[] a;
    final j b;

    static {
        String[] strArr = new String[17];
        String str = "%\"6S_&,eJ_,k*N\u0016=8 R\u0016&$!E";
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
                        i3 = 72;
                        break;
                    case ay.f /*1*/:
                        i3 = 75;
                        break;
                    case ay.n /*2*/:
                        i3 = 69;
                        break;
                    case ay.p /*3*/:
                        i3 = 32;
                        break;
                    default:
                        i3 = 54;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "!/";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "$\"6T";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "<25E";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ";\"\"NW<>7E";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "!/ NB!?<";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ">*)US";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "-97ODh%*DSh8-OC$/eHW>.eNC%.7IUh(*DSh*1TD!)0TSrk";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "+$!E";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "-97OD";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ";  Y";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ">*)US";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\"\"!";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "#.<";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "<25E\u0016&$!E\u0016;#*UZ,k&OX<*,N\u0016-3$CB$2e\u0011\u0016*21E";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = ":.\"IE<9$T_'%";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "!/";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.bi r17, java.lang.String r18) {
        /*
        r16_this = this;
        r9 = com.whatsapp.protocol.b.n;
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r0 = r17;
        r1 = r0.d(r1);
        r10 = com.whatsapp.protocol.bi.a(r1);
        r11 = new java.util.Vector;
        r0 = r16;
        r1 = r0.a;
        r1 = r1.length;
        r11.<init>(r1);
        r12 = new java.util.Hashtable;
        r0 = r16;
        r1 = r0.a;
        r1 = r1.length;
        r12.<init>(r1);
        r1 = r10.e;
        if (r1 == 0) goto L_0x0163;
    L_0x0029:
        r1 = 0;
        r8 = r1;
    L_0x002b:
        r1 = r10.e;
        r1 = r1.length;
        if (r8 >= r1) goto L_0x0163;
    L_0x0030:
        r1 = r10.e;
        r1 = r1[r8];
        r2 = z;
        r3 = 13;
        r2 = r2[r3];
        r2 = r1.b(r2);
        if (r2 != 0) goto L_0x004d;
    L_0x0040:
        r1 = new com.whatsapp.protocol.l;	 Catch:{ NumberFormatException -> 0x004b }
        r2 = z;	 Catch:{ NumberFormatException -> 0x004b }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x004b }
        r1.<init>(r2);	 Catch:{ NumberFormatException -> 0x004b }
        throw r1;	 Catch:{ NumberFormatException -> 0x004b }
    L_0x004b:
        r1 = move-exception;
        throw r1;
    L_0x004d:
        r3 = z;
        r4 = 10;
        r3 = r3[r4];
        r3 = r1.d(r3);
        if (r3 == 0) goto L_0x0074;
    L_0x0059:
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r3 = r1.e(r3);
        r4 = new java.lang.Integer;	 Catch:{ NumberFormatException -> 0x00b4 }
        r5 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x00b4 }
        r4.<init>(r5);	 Catch:{ NumberFormatException -> 0x00b4 }
        r11.addElement(r2);
        r12.put(r2, r4);
        if (r9 == 0) goto L_0x015f;
    L_0x0074:
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r3 = r1.d(r3);
        r3 = com.whatsapp.protocol.bi.a(r3);
        r4 = z;
        r5 = 16;
        r4 = r4[r5];
        r4 = r1.d(r4);
        r4 = com.whatsapp.protocol.bi.a(r4);
        r5 = z;
        r6 = 4;
        r5 = r5[r6];
        r5 = r1.d(r5);
        r5 = com.whatsapp.protocol.bi.a(r5);
        r6 = r5.b;	 Catch:{ NumberFormatException -> 0x00d2 }
        if (r6 == 0) goto L_0x00a6;
    L_0x00a0:
        r6 = r5.b;	 Catch:{ NumberFormatException -> 0x00b2 }
        r6 = r6.length;	 Catch:{ NumberFormatException -> 0x00b2 }
        r7 = 1;
        if (r6 == r7) goto L_0x00d4;
    L_0x00a6:
        r1 = new com.whatsapp.protocol.l;	 Catch:{ NumberFormatException -> 0x00b2 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x00b2 }
        r3 = 15;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x00b2 }
        r1.<init>(r2);	 Catch:{ NumberFormatException -> 0x00b2 }
        throw r1;	 Catch:{ NumberFormatException -> 0x00b2 }
    L_0x00b2:
        r1 = move-exception;
        throw r1;
    L_0x00b4:
        r1 = move-exception;
        r1 = new com.whatsapp.protocol.l;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 8;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x00d2:
        r1 = move-exception;
        throw r1;	 Catch:{ NumberFormatException -> 0x00b2 }
    L_0x00d4:
        r6 = z;
        r7 = 14;
        r6 = r6[r7];
        r6 = r1.d(r6);
        if (r6 == 0) goto L_0x0107;
    L_0x00e0:
        r7 = z;
        r13 = 2;
        r7 = r7[r13];
        r7 = r6.d(r7);
        r7 = com.whatsapp.protocol.bi.a(r7);
        r13 = z;
        r14 = 12;
        r13 = r13[r14];
        r6 = r6.d(r13);
        r13 = com.whatsapp.protocol.bi.a(r6);
        r6 = new com.whatsapp.protocol.cz;
        r7 = r7.b;
        r13 = r13.b;
        r14 = 0;
        r6.<init>(r7, r13, r14);
        if (r9 == 0) goto L_0x0108;
    L_0x0107:
        r6 = 0;
    L_0x0108:
        r7 = z;
        r13 = 11;
        r7 = r7[r13];
        r1 = r1.d(r7);
        r1 = com.whatsapp.protocol.bi.a(r1);
        r7 = z;
        r13 = 1;
        r7 = r7[r13];
        r7 = r1.d(r7);
        r13 = com.whatsapp.protocol.bi.a(r7);
        r7 = z;
        r14 = 7;
        r7 = r7[r14];
        r7 = r1.d(r7);
        r14 = com.whatsapp.protocol.bi.a(r7);
        r7 = z;
        r15 = 5;
        r7 = r7[r15];
        r1 = r1.d(r7);
        r15 = com.whatsapp.protocol.bi.a(r1);
        r0 = r16;
        r1 = r0.b;
        r1 = com.whatsapp.protocol.j.d(r1);
        r3 = r3.b;
        r4 = r4.b;
        r5 = r5.b;
        r7 = 0;
        r5 = r5[r7];
        r7 = new com.whatsapp.protocol.cz;
        r13 = r13.b;
        r14 = r14.b;
        r15 = r15.b;
        r7.<init>(r13, r14, r15);
        r1.a(r2, r3, r4, r5, r6, r7);
        r11.addElement(r2);
    L_0x015f:
        r1 = r8 + 1;
        if (r9 == 0) goto L_0x01c1;
    L_0x0163:
        r1 = 0;
        r2 = r1;
    L_0x0165:
        r0 = r16;
        r1 = r0.a;
        r1 = r1.length;
        if (r2 >= r1) goto L_0x01ba;
    L_0x016c:
        r0 = r16;
        r1 = r0.a;	 Catch:{ NumberFormatException -> 0x01bb }
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x01bb }
        r1 = r11.contains(r1);	 Catch:{ NumberFormatException -> 0x01bb }
        if (r1 != 0) goto L_0x0189;
    L_0x0178:
        r0 = r16;
        r1 = r0.b;	 Catch:{ NumberFormatException -> 0x01bb }
        r1 = com.whatsapp.protocol.j.d(r1);	 Catch:{ NumberFormatException -> 0x01bb }
        r0 = r16;
        r3 = r0.a;	 Catch:{ NumberFormatException -> 0x01bb }
        r3 = r3[r2];	 Catch:{ NumberFormatException -> 0x01bb }
        r1.a(r3);	 Catch:{ NumberFormatException -> 0x01bb }
    L_0x0189:
        r0 = r16;
        r1 = r0.a;	 Catch:{ NumberFormatException -> 0x01bd }
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x01bd }
        r1 = r12.containsKey(r1);	 Catch:{ NumberFormatException -> 0x01bd }
        if (r1 == 0) goto L_0x01b6;
    L_0x0195:
        r0 = r16;
        r1 = r0.b;	 Catch:{ NumberFormatException -> 0x01bd }
        r3 = com.whatsapp.protocol.j.d(r1);	 Catch:{ NumberFormatException -> 0x01bd }
        r0 = r16;
        r1 = r0.a;	 Catch:{ NumberFormatException -> 0x01bd }
        r4 = r1[r2];	 Catch:{ NumberFormatException -> 0x01bd }
        r0 = r16;
        r1 = r0.a;	 Catch:{ NumberFormatException -> 0x01bd }
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x01bd }
        r1 = r12.get(r1);	 Catch:{ NumberFormatException -> 0x01bd }
        r1 = (java.lang.Integer) r1;	 Catch:{ NumberFormatException -> 0x01bd }
        r1 = r1.intValue();	 Catch:{ NumberFormatException -> 0x01bd }
        r3.a(r4, r1);	 Catch:{ NumberFormatException -> 0x01bd }
    L_0x01b6:
        r1 = r2 + 1;
        if (r9 == 0) goto L_0x01bf;
    L_0x01ba:
        return;
    L_0x01bb:
        r1 = move-exception;
        throw r1;
    L_0x01bd:
        r1 = move-exception;
        throw r1;
    L_0x01bf:
        r2 = r1;
        goto L_0x0165;
    L_0x01c1:
        r8 = r1;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.ah.a(com.whatsapp.protocol.bi, java.lang.String):void");
    }

    ah(j jVar, String[] strArr) {
        this.b = jVar;
        this.a = strArr;
    }
}
