package com.whatsapp;

import com.whatsapp.protocol.c5;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ma implements Runnable {
    private static final String z;
    final String a;
    final String b;
    final ale c;
    final c5 d;

    static {
        char[] toCharArray = "jTW".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 49;
                    break;
                case ay.n /*2*/:
                    i2 = 53;
                    break;
                case ay.p /*3*/:
                    i2 = 103;
                    break;
                default:
                    i2 = 25;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ma(ale com_whatsapp_ale, c5 c5Var, String str, String str2) {
        this.c = com_whatsapp_ale;
        this.d = c5Var;
        this.a = str;
        this.b = str2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r5_this = this;
        r1 = com.whatsapp.App.az;
        r0 = r5.d;
        r0 = r0.h;
        if (r0 == 0) goto L_0x0025;
    L_0x0008:
        r0 = new com.whatsapp.protocol.m;
        r2 = r5.d;
        r2 = r2.b;
        r3 = r5.d;
        r3 = r3.g;
        r4 = r5.d;
        r4 = r4.h;
        r0.<init>(r2, r3, r4);
        r2 = com.whatsapp.App.aJ;
        r3 = r5.d;
        r3 = r3.e;
        r0 = r2.a(r0, r3);
        if (r1 == 0) goto L_0x0047;
    L_0x0025:
        r0 = com.whatsapp.App.aJ;
        r2 = r5.d;
        r2 = r2.b;
        r2 = r0.B(r2);
        if (r2 == 0) goto L_0x0042;
    L_0x0031:
        r0 = r2.e;
        r3 = com.whatsapp.App.aJ;
        r4 = r5.d;
        r4 = r4.e;
        r0 = r3.a(r0, r4);
        r0.add(r2);
        if (r1 == 0) goto L_0x0047;
    L_0x0042:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x0047:
        if (r0 == 0) goto L_0x0050;
    L_0x0049:
        r2 = r5.a;
        com.whatsapp.App.a(r2, r0);
        if (r1 == 0) goto L_0x0057;
    L_0x0050:
        r0 = r5.a;
        r1 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        com.whatsapp.App.d(r0, r1);
    L_0x0057:
        r0 = r5.a;
        r1 = r5.b;
        r2 = z;
        com.whatsapp.App.a(r0, r1, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ma.run():void");
    }
}
