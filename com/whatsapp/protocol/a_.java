package com.whatsapp.protocol;

import java.util.Hashtable;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class a_ extends w {
    private static final String[] z;
    final j a;
    final Hashtable b;

    static {
        String[] strArr = new String[9];
        String str = "HsG";
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
                        i3 = 124;
                        break;
                    case ay.f /*1*/:
                        i3 = 67;
                        break;
                    case ay.n /*2*/:
                        i3 = 115;
                        break;
                    case ay.p /*3*/:
                        i3 = 109;
                        break;
                    default:
                        i3 = 56;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u000f7\u0012\u0019M\u000f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\t0\u0016\u001f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u001f,\u0017\b";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "HsB";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0016*\u0017";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\b:\u0003\b";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001a\"\u001a\u0001";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "Hs@";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.bi r14, java.lang.String r15) {
        /*
        r13_this = this;
        r4 = 0;
        r0 = 0;
        r1 = com.whatsapp.protocol.b.n;
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r6 = r14.d(r2);
        if (r6 == 0) goto L_0x00a7;
    L_0x0010:
        r2 = r6.e;	 Catch:{ NumberFormatException -> 0x00cf }
        if (r2 == 0) goto L_0x00a7;
    L_0x0014:
        r2 = r6.e;
        r2 = r2.length;
        if (r0 >= r2) goto L_0x00a7;
    L_0x0019:
        r2 = r6.e;
        r7 = r2[r0];
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        com.whatsapp.protocol.bi.b(r7, r2);
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r8 = r7.b(r2);
        r2 = "t";
        r2 = r7.b(r2);
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r2 != 0) goto L_0x00d1;
    L_0x0038:
        r2 = r4;
    L_0x0039:
        r2 = r2 * r10;
    L_0x003a:
        r9 = z;
        r10 = 4;
        r9 = r9[r10];
        r9 = r7.b(r9);
        r10 = z;
        r11 = 7;
        r10 = r10[r11];
        r10 = r7.b(r10);
        r7 = r7.a();
        r11 = r13.b;	 Catch:{ NumberFormatException -> 0x00db }
        r11.remove(r8);	 Catch:{ NumberFormatException -> 0x00db }
        if (r10 == 0) goto L_0x009a;
    L_0x0057:
        r11 = z;	 Catch:{ NumberFormatException -> 0x00dd }
        r12 = 8;
        r11 = r11[r12];	 Catch:{ NumberFormatException -> 0x00dd }
        r10 = r10.equals(r11);	 Catch:{ NumberFormatException -> 0x00dd }
        if (r10 == 0) goto L_0x009a;
    L_0x0063:
        r10 = z;	 Catch:{ NumberFormatException -> 0x00df }
        r11 = 5;
        r10 = r10[r11];	 Catch:{ NumberFormatException -> 0x00df }
        r10 = r10.equals(r9);	 Catch:{ NumberFormatException -> 0x00df }
        if (r10 != 0) goto L_0x0084;
    L_0x006e:
        r10 = z;	 Catch:{ NumberFormatException -> 0x00e1 }
        r11 = 1;
        r10 = r10[r11];	 Catch:{ NumberFormatException -> 0x00e1 }
        r10 = r10.equals(r9);	 Catch:{ NumberFormatException -> 0x00e1 }
        if (r10 != 0) goto L_0x0084;
    L_0x0079:
        r10 = z;	 Catch:{ NumberFormatException -> 0x00e3 }
        r11 = 0;
        r10 = r10[r11];	 Catch:{ NumberFormatException -> 0x00e3 }
        r9 = r10.equals(r9);	 Catch:{ NumberFormatException -> 0x00e3 }
        if (r9 == 0) goto L_0x008f;
    L_0x0084:
        r9 = r13.a;	 Catch:{ NumberFormatException -> 0x00e5 }
        r9 = com.whatsapp.protocol.j.a(r9);	 Catch:{ NumberFormatException -> 0x00e5 }
        r9.e(r8);	 Catch:{ NumberFormatException -> 0x00e5 }
        if (r1 == 0) goto L_0x00a3;
    L_0x008f:
        r9 = r13.a;	 Catch:{ NumberFormatException -> 0x00e7 }
        r9 = com.whatsapp.protocol.j.a(r9);	 Catch:{ NumberFormatException -> 0x00e7 }
        r9.c(r8);	 Catch:{ NumberFormatException -> 0x00e7 }
        if (r1 == 0) goto L_0x00a3;
    L_0x009a:
        r9 = r13.a;	 Catch:{ NumberFormatException -> 0x00e7 }
        r9 = com.whatsapp.protocol.j.a(r9);	 Catch:{ NumberFormatException -> 0x00e7 }
        r9.a(r8, r2, r7);	 Catch:{ NumberFormatException -> 0x00e7 }
    L_0x00a3:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0014;
    L_0x00a7:
        r0 = r13.b;
        r2 = r0.keys();
    L_0x00ad:
        r0 = r2.hasMoreElements();
        if (r0 == 0) goto L_0x00c4;
    L_0x00b3:
        r0 = r2.nextElement();
        r0 = (java.lang.String) r0;
        r3 = r13.a;
        r3 = com.whatsapp.protocol.j.a(r3);
        r3.c(r0);
        if (r1 == 0) goto L_0x00ad;
    L_0x00c4:
        r0 = r13.a;
        r0 = com.whatsapp.protocol.j.a(r0);
        r1 = 0;
        r0.b(r1);
        return;
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x00d7 }
        goto L_0x0039;
    L_0x00d7:
        r2 = move-exception;
        r2 = r4;
        goto L_0x003a;
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00dd }
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00df }
    L_0x00df:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e1 }
    L_0x00e1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e3 }
    L_0x00e3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e5 }
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.a_.a(com.whatsapp.protocol.bi, java.lang.String):void");
    }

    a_(j jVar, Hashtable hashtable) {
        this.a = jVar;
        this.b = hashtable;
    }

    public void a(int i) {
        j.a(this.a).b(new Integer(i));
    }
}
