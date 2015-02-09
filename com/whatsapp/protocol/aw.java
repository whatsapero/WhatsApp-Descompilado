package com.whatsapp.protocol;

import java.util.Hashtable;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class aw extends w {
    private static final String[] z;
    final cs a;
    final j b;
    final cd c;

    static {
        String[] strArr = new String[10];
        String str = "#\u0018QX\u0019$\u0017I\u0010\u0018/\u0004SX\u0019g\u0013WO\u00048";
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
                        i3 = 74;
                        break;
                    case ay.f /*1*/:
                        i3 = 118;
                        break;
                    case ay.n /*2*/:
                        i3 = 37;
                        break;
                    case ay.p /*3*/:
                        i3 = 61;
                        break;
                    default:
                        i3 = 107;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ">\u000fUX";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "9)Q";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "9\u0003GW\u000e)\u0002";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "-\u0004JH\u001b";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ")\u0004@\\\u001f#\u0019K";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "-\u0004JH\u001b";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "#\u0012";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "9)J";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ")\u0004@\\\u001f%\u0004";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r3, java.lang.String r4) {
        /*
        r2_this = this;
        r0 = r2.c;	 Catch:{ NumberFormatException -> 0x001d }
        if (r0 == 0) goto L_0x001c;
    L_0x0004:
        r0 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r3 != r0) goto L_0x0017;
    L_0x0008:
        if (r4 == 0) goto L_0x0017;
    L_0x000a:
        r0 = z;	 Catch:{ NumberFormatException -> 0x0021 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0021 }
        r0 = r4.equals(r0);	 Catch:{ NumberFormatException -> 0x0021 }
        if (r0 == 0) goto L_0x0017;
    L_0x0015:
        r3 = -500; // 0xfffffffffffffe0c float:NaN double:NaN;
    L_0x0017:
        r0 = r2.c;
        r0.a(r3);
    L_0x001c:
        return;
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.aw.a(int, java.lang.String):void");
    }

    aw(j jVar, cs csVar, cd cdVar) {
        this.b = jVar;
        this.a = csVar;
        this.c = cdVar;
    }

    public void a(bi biVar, String str) {
        bi a = biVar.a(0);
        bi.b(a, z[5]);
        String a2 = j.a(this.b, a.b(z[8]));
        String b = a.b(z[1]);
        long j = 0;
        try {
            j = Long.parseLong(a.b(z[6])) * 1000;
        } catch (NumberFormatException e) {
        }
        String b2 = a.b(z[4]);
        long j2 = 0;
        try {
            j2 = Long.parseLong(a.b(z[3])) * 1000;
        } catch (NumberFormatException e2) {
        }
        String b3 = a.b(z[9]);
        String b4 = a.b(z[2]);
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        try {
            j.a(this.b, biVar, hashtable, hashtable2, z[7]);
            j.c(this.b).a(a2, b, j, b2, j2, b3, b4, hashtable, hashtable2);
            if (this.a != null) {
                this.a.a(a2);
            }
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }
}
