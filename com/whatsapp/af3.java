package com.whatsapp;

import java.lang.Thread.UncaughtExceptionHandler;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class af3 implements UncaughtExceptionHandler {
    private static final String[] z;
    private final UncaughtExceptionHandler a;

    static {
        String[] strArr = new String[3];
        String str = "\\yb\u0015mMhn\u001e2]no\u00150N`h\u0004tWf";
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
                        i3 = 57;
                        break;
                    case ay.f /*1*/:
                        i3 = 1;
                        break;
                    case ay.n /*2*/:
                        i3 = 1;
                        break;
                    case ay.p /*3*/:
                        i3 = 112;
                        break;
                    default:
                        i3 = 29;
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
                    str = "lo`\u0012q\\!u\u001f=Zsd\u0011i\\!b\u0002|Ji!\u0003xWuh\u001exU!g\u0019q\\";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "lOB1H~IUPXaBD IpNO";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    af3() {
        this.a = Thread.getDefaultUncaughtExceptionHandler();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r6, java.lang.Throwable r7) {
        /*
        r5_this = this;
        r2 = com.whatsapp.App.az;
        r0 = z;	 Catch:{ Exception -> 0x004f, all -> 0x0077 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ Exception -> 0x004f, all -> 0x0077 }
        com.whatsapp.util.Log.b(r0, r7);	 Catch:{ Exception -> 0x004f, all -> 0x0077 }
        r0 = com.whatsapp.App.aK();	 Catch:{ Exception -> 0x0045, all -> 0x0077 }
        r0.createNewFile();	 Catch:{ Exception -> 0x0045, all -> 0x0077 }
        r1 = com.whatsapp.App.ay();	 Catch:{ Exception -> 0x0045, all -> 0x0077 }
        monitor-enter(r1);	 Catch:{ Exception -> 0x0045, all -> 0x0077 }
        r0 = z;	 Catch:{ all -> 0x0042 }
        r3 = 0;
        r0 = r0[r3];	 Catch:{ all -> 0x0042 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x0042 }
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
    L_0x001f:
        r0 = r7 instanceof com.whatsapp.protocol.h;
        if (r0 == 0) goto L_0x003c;
    L_0x0023:
        r0 = r7;
        r0 = (com.whatsapp.protocol.h) r0;
        r1 = r0.getMessage();	 Catch:{ Exception -> 0x0075 }
        r3 = r0.a();	 Catch:{ Exception -> 0x0075 }
        com.whatsapp.util.Log.b(r1, r3);	 Catch:{ Exception -> 0x0075 }
        r1 = r5.a;	 Catch:{ Exception -> 0x0075 }
        r0 = r0.a();	 Catch:{ Exception -> 0x0075 }
        r1.uncaughtException(r6, r0);	 Catch:{ Exception -> 0x0075 }
        if (r2 == 0) goto L_0x0041;
    L_0x003c:
        r0 = r5.a;	 Catch:{ Exception -> 0x0075 }
        r0.uncaughtException(r6, r7);	 Catch:{ Exception -> 0x0075 }
    L_0x0041:
        return;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        throw r0;	 Catch:{ Exception -> 0x0045, all -> 0x0077 }
    L_0x0045:
        r0 = move-exception;
        r1 = z;	 Catch:{ Exception -> 0x004f, all -> 0x0077 }
        r3 = 2;
        r1 = r1[r3];	 Catch:{ Exception -> 0x004f, all -> 0x0077 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ Exception -> 0x004f, all -> 0x0077 }
        goto L_0x001f;
    L_0x004f:
        r0 = move-exception;
        r0 = r7 instanceof com.whatsapp.protocol.h;
        if (r0 == 0) goto L_0x006d;
    L_0x0054:
        r0 = r7;
        r0 = (com.whatsapp.protocol.h) r0;
        r1 = r0.getMessage();	 Catch:{ Exception -> 0x0073 }
        r3 = r0.a();	 Catch:{ Exception -> 0x0073 }
        com.whatsapp.util.Log.b(r1, r3);	 Catch:{ Exception -> 0x0073 }
        r1 = r5.a;	 Catch:{ Exception -> 0x0073 }
        r0 = r0.a();	 Catch:{ Exception -> 0x0073 }
        r1.uncaughtException(r6, r0);	 Catch:{ Exception -> 0x0073 }
        if (r2 == 0) goto L_0x0041;
    L_0x006d:
        r0 = r5.a;	 Catch:{ Exception -> 0x0073 }
        r0.uncaughtException(r6, r7);	 Catch:{ Exception -> 0x0073 }
        goto L_0x0041;
    L_0x0073:
        r0 = move-exception;
        throw r0;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = move-exception;
        r1 = r0;
        r0 = r7 instanceof com.whatsapp.protocol.h;
        if (r0 == 0) goto L_0x0096;
    L_0x007d:
        r0 = r7;
        r0 = (com.whatsapp.protocol.h) r0;
        r3 = r0.getMessage();	 Catch:{ Exception -> 0x009c }
        r4 = r0.a();	 Catch:{ Exception -> 0x009c }
        com.whatsapp.util.Log.b(r3, r4);	 Catch:{ Exception -> 0x009c }
        r3 = r5.a;	 Catch:{ Exception -> 0x009c }
        r0 = r0.a();	 Catch:{ Exception -> 0x009c }
        r3.uncaughtException(r6, r0);	 Catch:{ Exception -> 0x009c }
        if (r2 == 0) goto L_0x009b;
    L_0x0096:
        r0 = r5.a;	 Catch:{ Exception -> 0x009c }
        r0.uncaughtException(r6, r7);	 Catch:{ Exception -> 0x009c }
    L_0x009b:
        throw r1;
    L_0x009c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.af3.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
