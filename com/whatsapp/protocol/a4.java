package com.whatsapp.protocol;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a4 extends w {
    private static final String[] z;
    final cd a;
    final j b;
    final cd c;

    static {
        String[] strArr = new String[3];
        String str = "iG9s9zO;f>m";
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
                        i3 = 25;
                        break;
                    case ay.f /*1*/:
                        i3 = 38;
                        break;
                    case ay.n /*2*/:
                        i3 = 75;
                        break;
                    case ay.p /*3*/:
                        i3 = 7;
                        break;
                    default:
                        i3 = 80;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "}S9f$pI%";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "sO/";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.bi r11, java.lang.String r12) {
        /*
        r10_this = this;
        r2 = 0;
        r3 = com.whatsapp.protocol.b.n;
        r0 = r10.a;
        if (r0 == 0) goto L_0x0077;
    L_0x0007:
        r4 = r11.a(r2);
        if (r4 == 0) goto L_0x0070;
    L_0x000d:
        r0 = r4.a(r2);
        if (r0 == 0) goto L_0x0061;
    L_0x0013:
        r1 = z;
        r1 = r1[r2];
        r5 = r0.f(r1);
        if (r5 == 0) goto L_0x0061;
    L_0x001d:
        r0 = r5.size();
        r6 = new com.whatsapp.protocol.cn[r0];
        r1 = r2;
    L_0x0024:
        r0 = r5.size();
        if (r1 >= r0) goto L_0x0058;
    L_0x002a:
        r0 = r5.elementAt(r1);
        r0 = (com.whatsapp.protocol.bi) r0;
        r7 = r0.a(r2);
        if (r7 == 0) goto L_0x0040;
    L_0x0036:
        r8 = r10.b;
        r7 = com.whatsapp.protocol.j.a(r8, r7);
        r6[r1] = r7;
        if (r3 == 0) goto L_0x0047;
    L_0x0040:
        r7 = new com.whatsapp.protocol.cn;
        r7.<init>();
        r6[r1] = r7;
    L_0x0047:
        r7 = r6[r1];
        r8 = z;
        r9 = 1;
        r8 = r8[r9];
        r0 = r0.b(r8);
        r7.h = r0;
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x0078;
    L_0x0058:
        r0 = r10.b;
        r0 = com.whatsapp.protocol.j.b(r0);
        r0.a(r12, r6);
    L_0x0061:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        r0 = r4.b(r0);
        if (r0 == 0) goto L_0x0070;
    L_0x006c:
        r2 = java.lang.Integer.parseInt(r0);
    L_0x0070:
        r0 = r10.a;
        r1 = r2 * 1000;
        r0.a(r1);
    L_0x0077:
        return;
    L_0x0078:
        r1 = r0;
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.a4.a(com.whatsapp.protocol.bi, java.lang.String):void");
    }

    a4(j jVar, cd cdVar, cd cdVar2) {
        this.b = jVar;
        this.a = cdVar;
        this.c = cdVar2;
    }

    public void a(int i) {
        if (this.c != null) {
            this.c.a(i);
        }
    }
}
