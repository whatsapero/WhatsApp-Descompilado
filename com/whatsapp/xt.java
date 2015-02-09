package com.whatsapp;

import android.os.Handler.Callback;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class xt implements Callback {
    private static final String[] z;

    static {
        String[] strArr = new String[7];
        String str = "\b:=5~\u000e+<5%\u001d:*#c\u0019:-f*\u00056-{/\u001c\u007f:2k\u001b*:{/\u001c\u007f=/g\n,='g\u001fbl\"";
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
                        i3 = 111;
                        break;
                    case ay.f /*1*/:
                        i3 = 95;
                        break;
                    case ay.n /*2*/:
                        i3 = 73;
                        break;
                    case ay.p /*3*/:
                        i3 = 70;
                        break;
                    default:
                        i3 = 10;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u001c+(2\u007f\u001c";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\b:=5~\u000e+<5%\u000b:%#~\n\u007f#/nRz:";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u001b6$#y\u001b>$6";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u00056-";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\b:=5~\u000e+<5%\t> *o\u000b\u007f#/nRz:fi\u0000;,{/\u000b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\b:=5~\u000e+<5%\u00010*.k\u00018,f`\u0006;tcy";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r14) {
        /*
        r13_this = this;
        r12 = 3;
        r11 = 2;
        r10 = 0;
        r9 = 0;
        r8 = 1;
        r1 = com.whatsapp.App.az;
        r0 = r14.obj;
        r0 = (android.os.Bundle) r0;
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r2 = r0.getString(r2);
        r3 = com.whatsapp.App.P;
        r3 = r3.d(r2);
        if (r3 == 0) goto L_0x0021;
    L_0x001c:
        r4 = r14.what;
        switch(r4) {
            case 0: goto L_0x0022;
            case 1: goto L_0x0038;
            case 2: goto L_0x006e;
            case 3: goto L_0x007b;
            default: goto L_0x0021;
        };
    L_0x0021:
        return r8;
    L_0x0022:
        r4 = z;
        r5 = 6;
        r4 = r4[r5];
        r5 = new java.lang.Object[r11];
        r5[r9] = r2;
        r6 = r14.arg1;
        r6 = java.lang.Integer.valueOf(r6);
        r5[r8] = r6;
        com.whatsapp.util.Log.c(r4, r10, r5);
        if (r1 == 0) goto L_0x0021;
    L_0x0038:
        r4 = z;
        r4 = r4[r11];
        r4 = r0.getString(r4);
        r3.b = r4;
        r4 = z;
        r5 = 4;
        r4 = r4[r5];
        r4 = r0.getLong(r4);
        r3.c = r4;
        r0 = z;
        r0 = r0[r9];
        r4 = new java.lang.Object[r12];
        r4[r9] = r2;
        r5 = r3.b;
        r4[r8] = r5;
        r6 = r3.c;
        r5 = java.lang.Long.valueOf(r6);
        r4[r11] = r5;
        com.whatsapp.util.Log.a(r0, r10, r4);
        r0 = com.whatsapp.App.P;
        r0.b(r3);
        com.whatsapp.App.q(r2);
        if (r1 == 0) goto L_0x0021;
    L_0x006e:
        r0 = z;
        r0 = r0[r8];
        r4 = new java.lang.Object[r8];
        r4[r9] = r2;
        com.whatsapp.util.Log.a(r0, r10, r4);
        if (r1 == 0) goto L_0x0021;
    L_0x007b:
        r0 = z;
        r0 = r0[r12];
        r1 = new java.lang.Object[r8];
        r1[r9] = r2;
        com.whatsapp.util.Log.a(r0, r10, r1);
        r3.b = r10;
        r0 = 0;
        r3.c = r0;
        r0 = com.whatsapp.App.P;
        r0.b(r3);
        com.whatsapp.App.q(r2);
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xt.handleMessage(android.os.Message):boolean");
    }

    xt() {
    }
}
