package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class a1 extends w {
    private static final String[] z;
    final String a;
    final j b;
    final int c;

    static {
        String[] strArr = new String[13];
        String str = "gsS?";
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
                        i3 = 19;
                        break;
                    case ay.f /*1*/:
                        i3 = 1;
                        break;
                    case ay.n /*2*/:
                        i3 = 38;
                        break;
                    case ay.p /*3*/:
                        i3 = 90;
                        break;
                    default:
                        i3 = 105;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u007f`U.";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "edT)\u0000|o";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "q`E1\u0006ug";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "pnB?";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "vsT5\u001b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "`xH9";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "zoP;\u0005ze";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "frC(";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "yhB";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "zo";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "|tR";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "d`O.";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a1(j jVar, String str, int i) {
        this.b = jVar;
        this.a = str;
        this.c = i;
    }

    public void a(bi biVar) {
        int i;
        bi d = biVar.d(z[6]);
        int i2 = 0;
        long j = -1;
        if (d != null) {
            String b = d.b(z[5]);
            if (b != null) {
                i2 = Integer.parseInt(b);
            }
            String b2 = d.b(z[4]);
            if (b2 != null) {
                j = 1000 * Long.parseLong(b2);
                i = i2;
                j.a(this.b).a(this.a, this.c, i, j);
            }
        }
        i = i2;
        j.a(this.b).a(this.a, this.c, i, j);
    }

    public void a(bi biVar, String str) {
        int i = 0;
        boolean z = b.n;
        bi d = biVar.d(z[7]);
        if (d != null) {
            int length;
            bi[] biVarArr = d.e;
            if (biVarArr != null) {
                length = biVarArr.length;
            } else {
                length = 0;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                if (biVarArr[i2].e != null) {
                    i3 += biVarArr[i2].e.length;
                }
                i2++;
                if (z) {
                    break;
                }
            }
            bh[] bhVarArr = new bh[i3];
            i3 = 0;
            while (i < length) {
                i3 += a(bhVarArr, i3, biVarArr[i]);
                i++;
                if (z) {
                    break;
                }
            }
            a(d, bhVarArr);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(com.whatsapp.protocol.bh[] r9, int r10, com.whatsapp.protocol.bi r11) {
        /*
        r8_this = this;
        r1 = 0;
        r2 = com.whatsapp.protocol.b.n;
        r3 = r11.e;
        if (r3 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = z;
        r4 = 11;
        r0 = r0[r4];
        r0 = com.whatsapp.protocol.bi.a(r11, r0);
        if (r0 == 0) goto L_0x0016;
    L_0x0014:
        if (r2 == 0) goto L_0x005f;
    L_0x0016:
        r0 = z;
        r4 = 12;
        r0 = r0[r4];
        r0 = com.whatsapp.protocol.bi.a(r11, r0);
        if (r0 == 0) goto L_0x0025;
    L_0x0022:
        r0 = 1;
        if (r2 == 0) goto L_0x002f;
    L_0x0025:
        r0 = z;
        r4 = 8;
        r0 = r0[r4];
        com.whatsapp.protocol.bi.b(r11, r0);
        r0 = 2;
    L_0x002f:
        r4 = r3.length;
        if (r1 >= r4) goto L_0x0007;
    L_0x0032:
        r4 = r3[r1];
        r5 = z;
        r6 = 9;
        r5 = r5[r6];
        com.whatsapp.protocol.bi.b(r4, r5);
        r5 = new com.whatsapp.protocol.bh;
        r5.<init>();
        r6 = z;
        r7 = 10;
        r6 = r6[r7];
        r6 = r4.b(r6);
        r5.a = r6;
        r4 = r4.a();
        r5.c = r4;
        r5.b = r0;
        r4 = r10 + r1;
        r9[r4] = r5;
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x002f;
    L_0x005e:
        goto L_0x0007;
    L_0x005f:
        r0 = r1;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.a1.a(com.whatsapp.protocol.bh[], int, com.whatsapp.protocol.bi):int");
    }

    private void a(bi biVar, bh[] bhVarArr) {
        j.a(this.b).a(this.a, this.c, bhVarArr);
        if (z[0].equals(biVar.b(z[2]))) {
            String b = biVar.b(z[3]);
            String b2 = biVar.b(z[1]);
            long j = -1;
            if (b2 != null) {
                j = Long.parseLong(b2) * 1000;
            }
            j.a(this.b).b(this.a, b, j);
        }
    }

    public void a(int i) {
        j.a(this.b).a(this.a, this.c, i, 0);
    }
}
