package com.google;

import java.util.List;
import java.util.Map.Entry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class dd {
    private static final String[] z;
    boolean a;
    boolean b;

    static {
        int i;
        String[] strArr = new String[10];
        char[] toCharArray = "`-".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 39;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 101;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "=\\E".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 39;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 101;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "`\u0007".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 39;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 101;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "=\\o".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 39;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 101;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "'\u0007".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 39;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 101;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "=\\o".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 39;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 101;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "=\\E".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 39;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 101;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "`\u0007".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 39;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 101;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "`-".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 39;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 101;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "'\u0007".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 39;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 101;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[9] = new String(cArr).intern();
        z = strArr;
    }

    private void c(dW dWVar, Object obj, cS cSVar) {
        boolean z = dy.b;
        if (dWVar.a()) {
            for (Object obj2 : (List) obj) {
                a(dWVar, obj2, cSVar);
                if (z) {
                    break;
                }
            }
            if (!z) {
                return;
            }
        }
        a(dWVar, obj, cSVar);
    }

    static dd b(dd ddVar, boolean z) {
        return ddVar.a(z);
    }

    private dd b(boolean z) {
        this.a = z;
        return this;
    }

    private void a(eE eEVar, cS cSVar) {
        boolean z = dy.b;
        for (Entry entry : eEVar.a().entrySet()) {
            c((dW) entry.getKey(), entry.getValue(), cSVar);
            if (z) {
                break;
            }
        }
        a(eEVar.b(), cSVar);
    }

    static dd a(dd ddVar, boolean z) {
        return ddVar.b(z);
    }

    static void a(dd ddVar, eE eEVar, cS cSVar) {
        ddVar.a(eEVar, cSVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.google.dW r4, java.lang.Object r5, com.google.cS r6) {
        /*
        r3_this = this;
        r0 = com.google.dy.b;
        r1 = r4.n();
        if (r1 == 0) goto L_0x004e;
    L_0x0008:
        r1 = "[";
        r6.a(r1);
        r1 = r4.g();
        r1 = r1.d();
        r1 = r1.f();
        if (r1 == 0) goto L_0x0040;
    L_0x001b:
        r1 = r4.k();
        r2 = com.google.dH.MESSAGE;
        if (r1 != r2) goto L_0x0040;
    L_0x0023:
        r1 = r4.h();
        if (r1 == 0) goto L_0x0040;
    L_0x0029:
        r1 = r4.e();
        r2 = r4.c();
        if (r1 != r2) goto L_0x0040;
    L_0x0033:
        r1 = r4.c();
        r1 = r1.b();
        r6.a(r1);
        if (r0 == 0) goto L_0x0047;
    L_0x0040:
        r1 = r4.b();
        r6.a(r1);
    L_0x0047:
        r1 = "]";
        r6.a(r1);
        if (r0 == 0) goto L_0x006a;
    L_0x004e:
        r1 = r4.k();
        r2 = com.google.dH.GROUP;
        if (r1 != r2) goto L_0x0063;
    L_0x0056:
        r1 = r4.c();
        r1 = r1.c();
        r6.a(r1);
        if (r0 == 0) goto L_0x006a;
    L_0x0063:
        r1 = r4.c();
        r6.a(r1);
    L_0x006a:
        r1 = r4.f();
        r2 = com.google.f0.MESSAGE;
        if (r1 != r2) goto L_0x008d;
    L_0x0072:
        r1 = r3.b;
        if (r1 == 0) goto L_0x0080;
    L_0x0076:
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r6.a(r1);
        if (r0 == 0) goto L_0x0095;
    L_0x0080:
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r6.a(r1);
        r6.b();
        if (r0 == 0) goto L_0x0095;
    L_0x008d:
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        r6.a(r1);
    L_0x0095:
        r3.b(r4, r5, r6);
        r1 = r4.f();
        r2 = com.google.f0.MESSAGE;
        if (r1 != r2) goto L_0x00bc;
    L_0x00a0:
        r1 = r3.b;
        if (r1 == 0) goto L_0x00ae;
    L_0x00a4:
        r1 = z;
        r2 = 7;
        r1 = r1[r2];
        r6.a(r1);
        if (r0 == 0) goto L_0x00cc;
    L_0x00ae:
        r6.a();
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r6.a(r1);
        if (r0 == 0) goto L_0x00cc;
    L_0x00bc:
        r1 = r3.b;
        if (r1 == 0) goto L_0x00c7;
    L_0x00c0:
        r1 = " ";
        r6.a(r1);
        if (r0 == 0) goto L_0x00cc;
    L_0x00c7:
        r0 = "\n";
        r6.a(r0);
    L_0x00cc:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dd.a(com.google.dW, java.lang.Object, com.google.cS):void");
    }

    dd(eA eAVar) {
        this();
    }

    private void a(int i, int i2, List list, cS cSVar) {
        boolean z = dy.b;
        for (Object obj : list) {
            CharSequence charSequence;
            cSVar.a(String.valueOf(i));
            cSVar.a(z[9]);
            fY.b(i2, obj, cSVar);
            if (this.b) {
                charSequence = " ";
            } else {
                charSequence = "\n";
            }
            cSVar.a(charSequence);
            if (z) {
                return;
            }
        }
    }

    static void a(dd ddVar, eS eSVar, cS cSVar) {
        ddVar.a(eSVar, cSVar);
    }

    private dd a(boolean z) {
        this.b = z;
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.google.eS r11, com.google.cS r12) {
        /*
        r10_this = this;
        r9 = 2;
        r8 = 1;
        r7 = 0;
        r3 = com.google.dy.b;
        r0 = r11.f();
        r0 = r0.entrySet();
        r4 = r0.iterator();
    L_0x0011:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x00a1;
    L_0x0017:
        r0 = r4.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (java.lang.Integer) r1;
        r2 = r1.intValue();
        r1 = r0.getValue();
        r1 = (com.google.de) r1;
        r5 = r1.b();
        r10.a(r2, r7, r5, r12);
        r5 = 5;
        r6 = r1.f();
        r10.a(r2, r5, r6, r12);
        r5 = r1.c();
        r10.a(r2, r8, r5, r12);
        r5 = r1.g();
        r10.a(r2, r9, r5, r12);
        r1 = r1.d();
        r5 = r1.iterator();
    L_0x0052:
        r1 = r5.hasNext();
        if (r1 == 0) goto L_0x009f;
    L_0x0058:
        r1 = r5.next();
        r1 = (com.google.eS) r1;
        r2 = r0.getKey();
        r2 = (java.lang.Integer) r2;
        r2 = r2.toString();
        r12.a(r2);
        r2 = r10.b;
        if (r2 == 0) goto L_0x0079;
    L_0x006f:
        r2 = z;
        r6 = 3;
        r2 = r2[r6];
        r12.a(r2);
        if (r3 == 0) goto L_0x0083;
    L_0x0079:
        r2 = z;
        r2 = r2[r8];
        r12.a(r2);
        r12.b();
    L_0x0083:
        r10.a(r1, r12);
        r1 = r10.b;
        if (r1 == 0) goto L_0x0093;
    L_0x008a:
        r1 = z;
        r1 = r1[r9];
        r12.a(r1);
        if (r3 == 0) goto L_0x009d;
    L_0x0093:
        r12.a();
        r1 = z;
        r1 = r1[r7];
        r12.a(r1);
    L_0x009d:
        if (r3 == 0) goto L_0x0052;
    L_0x009f:
        if (r3 == 0) goto L_0x0011;
    L_0x00a1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dd.a(com.google.eS, com.google.cS):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.google.dW r5, java.lang.Object r6, com.google.cS r7) {
        /*
        r4_this = this;
        r1 = com.google.dy.b;
        r0 = com.google.eA.a;
        r2 = r5.k();
        r2 = r2.ordinal();
        r0 = r0[r2];
        switch(r0) {
            case 1: goto L_0x0012;
            case 2: goto L_0x0012;
            case 3: goto L_0x0012;
            case 4: goto L_0x001e;
            case 5: goto L_0x001e;
            case 6: goto L_0x001e;
            case 7: goto L_0x002a;
            case 8: goto L_0x0036;
            case 9: goto L_0x0042;
            case 10: goto L_0x004e;
            case 11: goto L_0x004e;
            case 12: goto L_0x005e;
            case 13: goto L_0x005e;
            case 14: goto L_0x006e;
            case 15: goto L_0x0088;
            case 16: goto L_0x009e;
            case 17: goto L_0x00aa;
            case 18: goto L_0x00aa;
            default: goto L_0x0011;
        };
    L_0x0011:
        return;
    L_0x0012:
        r0 = r6;
        r0 = (java.lang.Integer) r0;
        r0 = r0.toString();
        r7.a(r0);
        if (r1 == 0) goto L_0x0011;
    L_0x001e:
        r0 = r6;
        r0 = (java.lang.Long) r0;
        r0 = r0.toString();
        r7.a(r0);
        if (r1 == 0) goto L_0x0011;
    L_0x002a:
        r0 = r6;
        r0 = (java.lang.Boolean) r0;
        r0 = r0.toString();
        r7.a(r0);
        if (r1 == 0) goto L_0x0011;
    L_0x0036:
        r0 = r6;
        r0 = (java.lang.Float) r0;
        r0 = r0.toString();
        r7.a(r0);
        if (r1 == 0) goto L_0x0011;
    L_0x0042:
        r0 = r6;
        r0 = (java.lang.Double) r0;
        r0 = r0.toString();
        r7.a(r0);
        if (r1 == 0) goto L_0x0011;
    L_0x004e:
        r0 = r6;
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r0 = com.google.fY.a(r0);
        r7.a(r0);
        if (r1 == 0) goto L_0x0011;
    L_0x005e:
        r0 = r6;
        r0 = (java.lang.Long) r0;
        r2 = r0.longValue();
        r0 = com.google.fY.a(r2);
        r7.a(r0);
        if (r1 == 0) goto L_0x0011;
    L_0x006e:
        r0 = "\"";
        r7.a(r0);
        r0 = r4.a;
        if (r0 == 0) goto L_0x00b1;
    L_0x0077:
        r0 = r6;
        r0 = (java.lang.String) r0;
        r0 = com.google.fY.e(r0);
    L_0x007e:
        r7.a(r0);
        r0 = "\"";
        r7.a(r0);
        if (r1 == 0) goto L_0x0011;
    L_0x0088:
        r0 = "\"";
        r7.a(r0);
        r0 = r6;
        r0 = (com.google.g2) r0;
        r0 = com.google.fY.a(r0);
        r7.a(r0);
        r0 = "\"";
        r7.a(r0);
        if (r1 == 0) goto L_0x0011;
    L_0x009e:
        r0 = r6;
        r0 = (com.google.bv) r0;
        r0 = r0.c();
        r7.a(r0);
        if (r1 == 0) goto L_0x0011;
    L_0x00aa:
        r6 = (com.google.eb) r6;
        r4.a(r6, r7);
        goto L_0x0011;
    L_0x00b1:
        r0 = r6;
        r0 = (java.lang.String) r0;
        goto L_0x007e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dd.b(com.google.dW, java.lang.Object, com.google.cS):void");
    }

    private dd() {
        this.b = false;
        this.a = true;
    }
}
