package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a39 extends a3a {
    private static final String z;
    final HomeActivity a;

    static {
        char[] toCharArray = "V0b]M_<lW\u0017P+\"W\u0000M:}N\u0007LpkQ\u0003R0h\u0017\u0005W9{\u0018".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 62;
                    break;
                case ay.f /*1*/:
                    i2 = 95;
                    break;
                case ay.n /*2*/:
                    i2 = 15;
                    break;
                case ay.p /*3*/:
                    i2 = 56;
                    break;
                default:
                    i2 = 98;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.atf r5, long r6, long r8) {
        /*
        r4_this = this;
        r0 = com.whatsapp.App.az;
        java.lang.System.currentTimeMillis();
        r1 = com.whatsapp.ns.a;	 Catch:{ RuntimeException -> 0x003a }
        r2 = r5.ordinal();	 Catch:{ RuntimeException -> 0x003a }
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x003a }
        switch(r1) {
            case 1: goto L_0x0018;
            case 2: goto L_0x0032;
            case 3: goto L_0x0032;
            default: goto L_0x0010;
        };
    L_0x0010:
        r0 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x0016 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x0016 }
        throw r0;	 Catch:{ RuntimeException -> 0x0016 }
    L_0x0016:
        r0 = move-exception;
        throw r0;
    L_0x0018:
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 >= 0) goto L_0x0025;
    L_0x001c:
        r1 = r4.a;	 Catch:{ RuntimeException -> 0x003e }
        r2 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r1.showDialog(r2);	 Catch:{ RuntimeException -> 0x003e }
        if (r0 == 0) goto L_0x0039;
    L_0x0025:
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 <= 0) goto L_0x0039;
    L_0x0029:
        r1 = r4.a;	 Catch:{ RuntimeException -> 0x0042 }
        r2 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r1.showDialog(r2);	 Catch:{ RuntimeException -> 0x0042 }
        if (r0 == 0) goto L_0x0039;
    L_0x0032:
        r1 = r4.a;	 Catch:{ RuntimeException -> 0x0016 }
        com.whatsapp.ac.a(r1, r6, r8);	 Catch:{ RuntimeException -> 0x0016 }
        if (r0 != 0) goto L_0x0010;
    L_0x0039:
        return;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0016 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a39.a(com.whatsapp.atf, long, long):void");
    }

    public void a(atf com_whatsapp_atf, long j, long j2, ArrayList arrayList) {
        String a = ac.a(this.a, arrayList);
        Log.i(z + a);
        this.a.f(a);
    }

    a39(HomeActivity homeActivity) {
        this.a = homeActivity;
    }
}
