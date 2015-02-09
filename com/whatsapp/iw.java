package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class iw implements Runnable {
    private static final String[] z;
    final a8o a;
    final jg b;
    final m8 c;

    static {
        String[] strArr = new String[4];
        String str = "O*!e[\u0003=ihKOgt*";
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
                        i3 = 89;
                        break;
                    case ay.n /*2*/:
                        i3 = 73;
                        break;
                    case ay.p /*3*/:
                        i3 = 10;
                        break;
                    default:
                        i3 = 46;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "O*!e[\u0003=ihKOgt*";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u001d<*oG\u0019<-*^\u00076=eq\u001b1<gL00-*G\u0001/(fG\u000bui";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u001d<*oG\u0019<-*^\u00076=eq\t,%fq\u0006=ic@\u00198%cJCy";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r7_this = this;
        r1 = 0;
        r3 = com.whatsapp.App.az;
        r0 = r7.c;
        r2 = r7.a;
        r2 = r2.e;
        r4 = r7.a;
        r4 = r4.d;
        r0.a(r2, r4);
        r0 = r7.c;
        r0 = r0.M;
        r2 = r7.a;
        r2 = r2.e;
        if (r2 == 0) goto L_0x0020;
    L_0x001a:
        r0 = r7.a;
        r0 = r0.b;
        if (r3 == 0) goto L_0x0061;
    L_0x0020:
        r2 = r7.a;
        r2 = r2.b;
        if (r0 == r2) goto L_0x0061;
    L_0x0026:
        r2 = r7.a;
        r2 = r2.b;
        if (r2 >= r0) goto L_0x0057;
    L_0x002c:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 1;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r7.a;
        r4 = r4.b;
        r2 = r2.append(r4);
        r4 = z;
        r4 = r4[r1];
        r2 = r2.append(r4);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        if (r3 == 0) goto L_0x0061;
    L_0x0057:
        r0 = r7.c;
        r0 = r0.m();
        r0.delete();
        r0 = r1;
    L_0x0061:
        r2 = r7.c;
        r2 = r2.A;
        r4 = r7.a;
        r4 = r4.d;
        if (r4 == 0) goto L_0x0071;
    L_0x006b:
        r2 = r7.a;
        r2 = r2.b;
        if (r3 == 0) goto L_0x00b3;
    L_0x0071:
        r4 = r7.a;
        r4 = r4.b;
        if (r2 == r4) goto L_0x00b3;
    L_0x0077:
        r4 = r7.a;
        r4 = r4.b;
        if (r4 >= r2) goto L_0x00a9;
    L_0x007d:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 3;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = r7.a;
        r5 = r5.b;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 2;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r2);
        r4 = r4.toString();
        com.whatsapp.util.Log.e(r4);
        if (r3 == 0) goto L_0x00b3;
    L_0x00a9:
        r2 = r7.c;
        r2 = r2.a();
        r2.delete();
        r2 = r1;
    L_0x00b3:
        r1 = r7.c;
        r1.a(r0, r2);
        r0 = r7.a;
        r0 = r0.e;
        if (r0 == 0) goto L_0x00c7;
    L_0x00be:
        r0 = com.whatsapp.App.D;
        r1 = r7.c;
        r1 = r1.e;
        r0.a(r1);
    L_0x00c7:
        r0 = r7.a;
        r0 = r0.d;
        if (r0 == 0) goto L_0x00d6;
    L_0x00cd:
        r0 = com.whatsapp.App.N;
        r1 = r7.c;
        r1 = r1.e;
        r0.a(r1);
    L_0x00d6:
        r0 = r7.a;
        r0 = r0.e;
        if (r0 != 0) goto L_0x00e2;
    L_0x00dc:
        r0 = r7.a;
        r0 = r0.d;
        if (r0 == 0) goto L_0x00f0;
    L_0x00e2:
        r0 = com.whatsapp.App.p;
        r0 = r0.U();
        r1 = new com.whatsapp.s2;
        r1.<init>(r7);
        r0.post(r1);
    L_0x00f0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.iw.run():void");
    }

    iw(jg jgVar, m8 m8Var, a8o com_whatsapp_a8o) {
        this.b = jgVar;
        this.c = m8Var;
        this.a = com_whatsapp_a8o;
    }
}
