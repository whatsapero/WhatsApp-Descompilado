package com.whatsapp;

import com.whatsapp.protocol.c5;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a84 implements Runnable {
    private static final String[] z;
    final c5 a;
    final ale b;
    final String c;
    final int d;
    final String e;

    static {
        String[] strArr = new String[3];
        String str = "\u007f\r \u000e/s\r \u000e%{\u001e&\u000e {\u001f\u000fP\"{\u000f)\u000e'l\u0018&H2i]";
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
                        i3 = 30;
                        break;
                    case ay.f /*1*/:
                        i3 = 125;
                        break;
                    case ay.n /*2*/:
                        i3 = 80;
                        break;
                    case ay.p /*3*/:
                        i3 = 33;
                        break;
                    default:
                        i3 = 87;
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
                    str = "1\u001b1H;{\u0019";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "i\u00182";
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
        r11_this = this;
        r3 = 0;
        r10 = -1;
        r1 = 0;
        r4 = com.whatsapp.App.az;
        r5 = new com.whatsapp.protocol.c5;
        r5.<init>();
        r0 = com.whatsapp.App.P;
        r2 = r11.a;
        r2 = r2.b;
        r6 = r0.d(r2);
        if (r6 == 0) goto L_0x0068;
    L_0x0016:
        r0 = r6.a();
        r2 = r6.A;	 Catch:{ IOException -> 0x007c }
        r2 = java.lang.Integer.toString(r2);	 Catch:{ IOException -> 0x007c }
        r7 = r11.a;	 Catch:{ IOException -> 0x007c }
        r7 = r7.n;	 Catch:{ IOException -> 0x007c }
        r2 = r2.equals(r7);	 Catch:{ IOException -> 0x007c }
        if (r2 == 0) goto L_0x0032;
    L_0x002a:
        r2 = r11.a;	 Catch:{ IOException -> 0x007c }
        r2 = r2.n;	 Catch:{ IOException -> 0x007c }
        r5.n = r2;	 Catch:{ IOException -> 0x007c }
        if (r4 == 0) goto L_0x0068;
    L_0x0032:
        r2 = r6.A;	 Catch:{ IOException -> 0x007e }
        if (r2 == r10) goto L_0x0066;
    L_0x0036:
        r2 = r0.exists();	 Catch:{ IOException -> 0x007e }
        if (r2 == 0) goto L_0x0066;
    L_0x003c:
        r2 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0080, all -> 0x00b2 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0080, all -> 0x00b2 }
        r8 = r0.length();	 Catch:{ IOException -> 0x00c0 }
        r0 = (int) r8;	 Catch:{ IOException -> 0x00c0 }
        r0 = new byte[r0];	 Catch:{ IOException -> 0x00c0 }
    L_0x0048:
        r7 = r0.length;	 Catch:{ IOException -> 0x00c0 }
        if (r3 >= r7) goto L_0x0058;
    L_0x004b:
        r7 = r0.length;	 Catch:{ IOException -> 0x00c0 }
        r7 = r7 - r3;
        r7 = r2.read(r0, r3, r7);	 Catch:{ IOException -> 0x00c0 }
        if (r7 != r10) goto L_0x0055;
    L_0x0053:
        if (r4 == 0) goto L_0x0058;
    L_0x0055:
        r3 = r3 + r7;
        if (r4 == 0) goto L_0x0048;
    L_0x0058:
        if (r2 == 0) goto L_0x005d;
    L_0x005a:
        r2.close();	 Catch:{ IOException -> 0x00ba }
    L_0x005d:
        r1 = r6.A;
        r1 = java.lang.Integer.toString(r1);
        r5.n = r1;
        r1 = r0;
    L_0x0066:
        r5.q = r1;
    L_0x0068:
        r0 = r11.c;
        r1 = r11.d;
        com.whatsapp.App.a(r0, r5, r1);
        r0 = r11.c;
        r1 = r11.e;
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        com.whatsapp.App.a(r0, r1, r2);
        return;
    L_0x007c:
        r0 = move-exception;
        throw r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        r0 = move-exception;
        r2 = r1;
    L_0x0082:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00be }
        r3.<init>();	 Catch:{ all -> 0x00be }
        r4 = z;	 Catch:{ all -> 0x00be }
        r7 = 0;
        r4 = r4[r7];	 Catch:{ all -> 0x00be }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00be }
        r4 = r11.a;	 Catch:{ all -> 0x00be }
        r4 = r4.b;	 Catch:{ all -> 0x00be }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00be }
        r4 = z;	 Catch:{ all -> 0x00be }
        r7 = 2;
        r4 = r4[r7];	 Catch:{ all -> 0x00be }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00be }
        r3 = r3.toString();	 Catch:{ all -> 0x00be }
        com.whatsapp.util.Log.b(r3, r0);	 Catch:{ all -> 0x00be }
        if (r2 == 0) goto L_0x00c2;
    L_0x00aa:
        r2.close();	 Catch:{ IOException -> 0x00af }
        r0 = r1;
        goto L_0x005d;
    L_0x00af:
        r0 = move-exception;
        r0 = r1;
        goto L_0x005d;
    L_0x00b2:
        r0 = move-exception;
        r2 = r1;
    L_0x00b4:
        if (r2 == 0) goto L_0x00b9;
    L_0x00b6:
        r2.close();	 Catch:{ IOException -> 0x00bc }
    L_0x00b9:
        throw r0;
    L_0x00ba:
        r1 = move-exception;
        goto L_0x005d;
    L_0x00bc:
        r1 = move-exception;
        goto L_0x00b9;
    L_0x00be:
        r0 = move-exception;
        goto L_0x00b4;
    L_0x00c0:
        r0 = move-exception;
        goto L_0x0082;
    L_0x00c2:
        r0 = r1;
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a84.run():void");
    }

    a84(ale com_whatsapp_ale, c5 c5Var, String str, int i, String str2) {
        this.b = com_whatsapp_ale;
        this.a = c5Var;
        this.c = str;
        this.d = i;
        this.e = str2;
    }
}
