package com.google;

import java.io.Serializable;
import java.util.Collections;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class em extends dP implements Serializable {
    private static final long serialVersionUID = 1;
    private static final String z;

    static {
        char[] toCharArray = "\u0000\u001cyCr=\u00070C'$\u0004\u007fC70Td_r6\u00110_$1\u0006bY60\u0011~\u00100-TcE07\u0018qC!1\u0007>".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 84;
                    break;
                case ay.f /*1*/:
                    i2 = 116;
                    break;
                case ay.n /*2*/:
                    i2 = 16;
                    break;
                case ay.p /*3*/:
                    i2 = 48;
                    break;
                default:
                    i2 = 82;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void a() {
    }

    protected em() {
    }

    protected boolean a(I i, aC aCVar, int i2) {
        return i.e(i2);
    }

    public static aq a(a1 a1Var, Object obj, a1 a1Var2, gJ gJVar, int i, bJ bJVar) {
        return new aq(a1Var, obj, a1Var2, new e0(gJVar, i, bJVar, false, false, null), null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(com.google.co r8, com.google.a1 r9, com.google.I r10, com.google.aC r11, int r12) {
        /*
        r0 = 0;
        r1 = 1;
        r3 = com.google.dy.b;
        r4 = com.google.aA.a(r12);
        r2 = com.google.aA.b(r12);
        r5 = r11.a(r9, r2);
        if (r5 != 0) goto L_0x015d;
    L_0x0012:
        if (r3 == 0) goto L_0x015a;
    L_0x0014:
        r2 = r1;
    L_0x0015:
        r6 = com.google.aq.a(r5);	 Catch:{ UnsupportedOperationException -> 0x0058 }
        r6 = r6.d();	 Catch:{ UnsupportedOperationException -> 0x0058 }
        r7 = 0;
        r6 = com.google.co.a(r6, r7);	 Catch:{ UnsupportedOperationException -> 0x0058 }
        if (r4 != r6) goto L_0x0026;
    L_0x0024:
        if (r3 == 0) goto L_0x0051;
    L_0x0026:
        r6 = com.google.aq.a(r5);	 Catch:{ UnsupportedOperationException -> 0x005a }
        r6 = com.google.e0.a(r6);	 Catch:{ UnsupportedOperationException -> 0x005a }
        if (r6 == 0) goto L_0x0050;
    L_0x0030:
        r6 = com.google.aq.a(r5);	 Catch:{ UnsupportedOperationException -> 0x005c }
        r6 = com.google.e0.c(r6);	 Catch:{ UnsupportedOperationException -> 0x005c }
        r6 = r6.isPackable();	 Catch:{ UnsupportedOperationException -> 0x005c }
        if (r6 == 0) goto L_0x0050;
    L_0x003e:
        r6 = com.google.aq.a(r5);	 Catch:{ UnsupportedOperationException -> 0x005c }
        r6 = r6.d();	 Catch:{ UnsupportedOperationException -> 0x005c }
        r7 = 1;
        r6 = com.google.co.a(r6, r7);	 Catch:{ UnsupportedOperationException -> 0x005c }
        if (r4 != r6) goto L_0x0050;
    L_0x004d:
        if (r3 == 0) goto L_0x0157;
    L_0x004f:
        r0 = r1;
    L_0x0050:
        r2 = r1;
    L_0x0051:
        if (r2 == 0) goto L_0x0060;
    L_0x0053:
        r1 = r10.e(r12);	 Catch:{ UnsupportedOperationException -> 0x005e }
    L_0x0057:
        return r1;
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        if (r0 == 0) goto L_0x00b7;
    L_0x0062:
        r0 = r10.h();
        r0 = r10.f(r0);
        r2 = com.google.aq.a(r5);	 Catch:{ UnsupportedOperationException -> 0x00f4 }
        r2 = r2.d();	 Catch:{ UnsupportedOperationException -> 0x00f4 }
        r4 = com.google.bJ.ENUM;	 Catch:{ UnsupportedOperationException -> 0x00f4 }
        if (r2 != r4) goto L_0x0097;
    L_0x0076:
        r2 = r10.i();	 Catch:{ UnsupportedOperationException -> 0x00f4 }
        if (r2 <= 0) goto L_0x00b2;
    L_0x007c:
        r2 = r10.c();
        r4 = com.google.aq.a(r5);
        r4 = r4.a();
        r2 = r4.a(r2);
        if (r2 == 0) goto L_0x0057;
    L_0x008e:
        r4 = com.google.aq.a(r5);
        r8.b(r4, r2);
        if (r3 == 0) goto L_0x0076;
    L_0x0097:
        r2 = r10.i();
        if (r2 <= 0) goto L_0x00b2;
    L_0x009d:
        r2 = com.google.aq.a(r5);
        r2 = r2.d();
        r2 = com.google.co.a(r10, r2);
        r4 = com.google.aq.a(r5);
        r8.b(r4, r2);
        if (r3 == 0) goto L_0x0097;
    L_0x00b2:
        r10.c(r0);	 Catch:{ UnsupportedOperationException -> 0x00f6 }
        if (r3 == 0) goto L_0x0057;
    L_0x00b7:
        r0 = com.google.gh.a;	 Catch:{ UnsupportedOperationException -> 0x00f6 }
        r2 = com.google.aq.a(r5);	 Catch:{ UnsupportedOperationException -> 0x00f6 }
        r2 = r2.c();	 Catch:{ UnsupportedOperationException -> 0x00f6 }
        r2 = r2.ordinal();	 Catch:{ UnsupportedOperationException -> 0x00f6 }
        r0 = r0[r2];	 Catch:{ UnsupportedOperationException -> 0x00f6 }
        switch(r0) {
            case 1: goto L_0x00f8;
            case 2: goto L_0x013b;
            default: goto L_0x00ca;
        };
    L_0x00ca:
        r0 = com.google.aq.a(r5);
        r0 = r0.d();
        r0 = com.google.co.a(r10, r0);
    L_0x00d6:
        r2 = com.google.aq.a(r5);	 Catch:{ UnsupportedOperationException -> 0x0153 }
        r2 = r2.a();	 Catch:{ UnsupportedOperationException -> 0x0153 }
        if (r2 == 0) goto L_0x00e9;
    L_0x00e0:
        r2 = com.google.aq.a(r5);	 Catch:{ UnsupportedOperationException -> 0x00f2 }
        r8.b(r2, r0);	 Catch:{ UnsupportedOperationException -> 0x00f2 }
        if (r3 == 0) goto L_0x0057;
    L_0x00e9:
        r2 = com.google.aq.a(r5);	 Catch:{ UnsupportedOperationException -> 0x00f2 }
        r8.c(r2, r0);	 Catch:{ UnsupportedOperationException -> 0x00f2 }
        goto L_0x0057;
    L_0x00f2:
        r0 = move-exception;
        throw r0;
    L_0x00f4:
        r0 = move-exception;
        throw r0;
    L_0x00f6:
        r0 = move-exception;
        throw r0;
    L_0x00f8:
        r2 = 0;
        r0 = com.google.aq.a(r5);
        r0 = r0.a();
        if (r0 != 0) goto L_0x0155;
    L_0x0103:
        r0 = com.google.aq.a(r5);
        r0 = r8.b(r0);
        r0 = (com.google.a1) r0;
        if (r0 == 0) goto L_0x0155;
    L_0x010f:
        r0 = r0.a();
    L_0x0113:
        if (r0 != 0) goto L_0x011d;
    L_0x0115:
        r0 = com.google.aq.b(r5);
        r0 = r0.c();
    L_0x011d:
        r2 = com.google.aq.a(r5);	 Catch:{ UnsupportedOperationException -> 0x014f }
        r2 = r2.d();	 Catch:{ UnsupportedOperationException -> 0x014f }
        r4 = com.google.bJ.GROUP;	 Catch:{ UnsupportedOperationException -> 0x014f }
        if (r2 != r4) goto L_0x0132;
    L_0x0129:
        r2 = r5.b();	 Catch:{ UnsupportedOperationException -> 0x0151 }
        r10.a(r2, r0, r11);	 Catch:{ UnsupportedOperationException -> 0x0151 }
        if (r3 == 0) goto L_0x0135;
    L_0x0132:
        r10.a(r0, r11);	 Catch:{ UnsupportedOperationException -> 0x0151 }
    L_0x0135:
        r0 = r0.b();
        if (r3 == 0) goto L_0x00d6;
    L_0x013b:
        r0 = r10.c();
        r2 = com.google.aq.a(r5);
        r2 = r2.a();
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x00d6;
    L_0x014d:
        goto L_0x0057;
    L_0x014f:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0151 }
    L_0x0151:
        r0 = move-exception;
        throw r0;
    L_0x0153:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x00f2 }
    L_0x0155:
        r0 = r2;
        goto L_0x0113;
    L_0x0157:
        r0 = r1;
        goto L_0x0051;
    L_0x015a:
        r2 = r1;
        goto L_0x0051;
    L_0x015d:
        r2 = r0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.em.b(com.google.co, com.google.a1, com.google.I, com.google.aC, int):boolean");
    }

    public static aq a(a1 a1Var, a1 a1Var2, gJ gJVar, int i, bJ bJVar, boolean z) {
        return new aq(a1Var, Collections.emptyList(), a1Var2, new e0(gJVar, i, bJVar, true, z, null), null);
    }

    static boolean a(co coVar, a1 a1Var, I i, aC aCVar, int i2) {
        return b(coVar, a1Var, i, aCVar, i2);
    }

    protected em(bD bDVar) {
    }

    public eR c() {
        throw new UnsupportedOperationException(z);
    }

    protected Object writeReplace() {
        return new cv(this);
    }
}
