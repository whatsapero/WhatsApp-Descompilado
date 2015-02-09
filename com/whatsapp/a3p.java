package com.whatsapp;

import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a3p extends a3a {
    private static final String z;
    final AccountInfoActivity a;

    static {
        char[] toCharArray = ",/w`0#89f++#;n&.#aa1`#v| ?:q}j.$ua\"((4} ,?{axh?4`))q1ke#)c2`)lz`2pip".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 77;
                    break;
                case ay.f /*1*/:
                    i2 = 76;
                    break;
                case ay.n /*2*/:
                    i2 = 20;
                    break;
                case ay.p /*3*/:
                    i2 = 15;
                    break;
                default:
                    i2 = 69;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(atf com_whatsapp_atf, long j, long j2, ArrayList arrayList) {
        AccountInfoActivity.h(this.a).sendMessage(AccountInfoActivity.h(this.a).obtainMessage(11, ac.a(this.a, arrayList)));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.atf r9, long r10, long r12) {
        /*
        r8_this = this;
        r0 = com.whatsapp.App.az;
        r2 = java.lang.System.currentTimeMillis();
        r1 = z;	 Catch:{ RuntimeException -> 0x0068 }
        r4 = 0;
        r5 = 4;
        r5 = new java.lang.Object[r5];	 Catch:{ RuntimeException -> 0x0068 }
        r6 = 0;
        r5[r6] = r9;	 Catch:{ RuntimeException -> 0x0068 }
        r6 = 1;
        r7 = java.lang.Long.valueOf(r10);	 Catch:{ RuntimeException -> 0x0068 }
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x0068 }
        r6 = 2;
        r7 = java.lang.Long.valueOf(r12);	 Catch:{ RuntimeException -> 0x0068 }
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x0068 }
        r6 = 3;
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ RuntimeException -> 0x0068 }
        r5[r6] = r2;	 Catch:{ RuntimeException -> 0x0068 }
        com.whatsapp.util.Log.a(r1, r4, r5);	 Catch:{ RuntimeException -> 0x0068 }
        r1 = com.whatsapp.fd.a;	 Catch:{ RuntimeException -> 0x0068 }
        r2 = r9.ordinal();	 Catch:{ RuntimeException -> 0x0068 }
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0068 }
        switch(r1) {
            case 1: goto L_0x003a;
            case 2: goto L_0x0056;
            case 3: goto L_0x0056;
            default: goto L_0x0032;
        };
    L_0x0032:
        r0 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x0038 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x0038 }
        throw r0;	 Catch:{ RuntimeException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r1 >= 0) goto L_0x004b;
    L_0x003e:
        r1 = r8.a;	 Catch:{ RuntimeException -> 0x006c }
        r1 = com.whatsapp.AccountInfoActivity.h(r1);	 Catch:{ RuntimeException -> 0x006c }
        r2 = 9;
        r1.sendEmptyMessage(r2);	 Catch:{ RuntimeException -> 0x006c }
        if (r0 == 0) goto L_0x005d;
    L_0x004b:
        r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r1 <= 0) goto L_0x005d;
    L_0x004f:
        r1 = r8.a;	 Catch:{ RuntimeException -> 0x0070 }
        com.whatsapp.ac.a(r1, r10, r12);	 Catch:{ RuntimeException -> 0x0070 }
        if (r0 == 0) goto L_0x005d;
    L_0x0056:
        r1 = r8.a;	 Catch:{ RuntimeException -> 0x0038 }
        com.whatsapp.ac.a(r1, r10, r12);	 Catch:{ RuntimeException -> 0x0038 }
        if (r0 != 0) goto L_0x0032;
    L_0x005d:
        r0 = r8.a;
        r0 = com.whatsapp.AccountInfoActivity.h(r0);
        r1 = 5;
        r0.sendEmptyMessage(r1);
        return;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0038 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a3p.a(com.whatsapp.atf, long, long):void");
    }

    a3p(AccountInfoActivity accountInfoActivity) {
        this.a = accountInfoActivity;
    }
}
