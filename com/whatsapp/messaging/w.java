package com.whatsapp.messaging;

import com.whatsapp.protocol.j;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class w extends Thread {
    private static final String[] z;
    private final ae a;
    private final j b;

    static {
        String[] strArr = new String[12];
        String str = "o6E<CO\u0007L*C\\7";
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
                        i3 = 61;
                        break;
                    case ay.f /*1*/:
                        i3 = 83;
                        break;
                    case ay.n /*2*/:
                        i3 = 36;
                        break;
                    case ay.p /*3*/:
                        i3 = 88;
                        break;
                    default:
                        i3 = 38;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "E>T(\tO6E<CO|M7\u000bX!V7T\u001d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "E>T(\tO6E<CO|A*TR!";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "E>T(\tO6E<CO|A*TR!";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "E>T(\tO6E<CO|H7AR&P";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "E>T(\tO6E<CO|H7AR&P";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "E>T(\tO6E<CO|H7AR&P";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "E>T(\tO6E<CO|H7AR&P";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "E>T(\tO6E<CO|A*TR!";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "E>T(\tO6E<CO|G7TO&T,\u000bN'V=GP|W,GS)Ex";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "E>T(\tO6E<CO|G7TO&T,\u000bN'V=GP~A*TR!\u0004";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "E>T(\tO6E<CO|A*TR!";
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
        r4_this = this;
        r0 = com.whatsapp.messaging.au.a;
    L_0x0002:
        r1 = r4.b;	 Catch:{ IOException -> 0x0030, l -> 0x0068 }
        r1 = r1.e();	 Catch:{ IOException -> 0x0030, l -> 0x0068 }
        if (r1 != 0) goto L_0x0002;
    L_0x000a:
        r1 = z;	 Catch:{ IOException -> 0x0064 }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0064 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IOException -> 0x0064 }
        r1 = r4.a;	 Catch:{ IOException -> 0x0064 }
        r1 = com.whatsapp.messaging.ae.a(r1);	 Catch:{ IOException -> 0x0064 }
        com.whatsapp.messaging.af.a(r1);	 Catch:{ IOException -> 0x0064 }
        if (r0 == 0) goto L_0x002f;
    L_0x001e:
        r0 = z;	 Catch:{ IOException -> 0x0066 }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0066 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0066 }
        r0 = r4.a;	 Catch:{ IOException -> 0x0066 }
        r0 = com.whatsapp.messaging.ae.a(r0);	 Catch:{ IOException -> 0x0066 }
        com.whatsapp.messaging.af.b(r0);	 Catch:{ IOException -> 0x0066 }
    L_0x002f:
        return;
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0032, l -> 0x0068 }
    L_0x0032:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00bb }
        r1.<init>();	 Catch:{ all -> 0x00bb }
        r2 = z;	 Catch:{ all -> 0x00bb }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ all -> 0x00bb }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00bb }
        r0 = r0.toString();	 Catch:{ all -> 0x00bb }
        r0 = r1.append(r0);	 Catch:{ all -> 0x00bb }
        r0 = r0.toString();	 Catch:{ all -> 0x00bb }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x00bb }
        r0 = z;	 Catch:{ IOException -> 0x0062 }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0062 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0062 }
        r0 = r4.a;	 Catch:{ IOException -> 0x0062 }
        r0 = com.whatsapp.messaging.ae.a(r0);	 Catch:{ IOException -> 0x0062 }
        com.whatsapp.messaging.af.b(r0);	 Catch:{ IOException -> 0x0062 }
        goto L_0x002f;
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00bb }
        r1.<init>();	 Catch:{ all -> 0x00bb }
        r2 = z;	 Catch:{ all -> 0x00bb }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ all -> 0x00bb }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00bb }
        r2 = r0.toString();	 Catch:{ all -> 0x00bb }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00bb }
        r1 = r1.toString();	 Catch:{ all -> 0x00bb }
        com.whatsapp.util.Log.i(r1);	 Catch:{ all -> 0x00bb }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00bb }
        r1.<init>();	 Catch:{ all -> 0x00bb }
        r2 = z;	 Catch:{ all -> 0x00bb }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ all -> 0x00bb }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00bb }
        r0 = r0.a();	 Catch:{ all -> 0x00bb }
        r0 = r1.append(r0);	 Catch:{ all -> 0x00bb }
        r0 = r0.toString();	 Catch:{ all -> 0x00bb }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x00bb }
        r0 = z;	 Catch:{ IOException -> 0x00b9 }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ IOException -> 0x00b9 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x00b9 }
        r0 = r4.a;	 Catch:{ IOException -> 0x00b9 }
        r0 = com.whatsapp.messaging.ae.a(r0);	 Catch:{ IOException -> 0x00b9 }
        com.whatsapp.messaging.af.b(r0);	 Catch:{ IOException -> 0x00b9 }
        goto L_0x002f;
    L_0x00b9:
        r0 = move-exception;
        throw r0;
    L_0x00bb:
        r0 = move-exception;
        r1 = z;	 Catch:{ IOException -> 0x00ce }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IOException -> 0x00ce }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IOException -> 0x00ce }
        r1 = r4.a;	 Catch:{ IOException -> 0x00ce }
        r1 = com.whatsapp.messaging.ae.a(r1);	 Catch:{ IOException -> 0x00ce }
        com.whatsapp.messaging.af.b(r1);	 Catch:{ IOException -> 0x00ce }
        throw r0;
    L_0x00ce:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.w.run():void");
    }

    public w(j jVar, ae aeVar) {
        super(z[0]);
        this.b = jVar;
        this.a = aeVar;
    }
}
