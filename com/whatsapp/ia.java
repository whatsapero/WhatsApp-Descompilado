package com.whatsapp;

import com.whatsapp.contact.c;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class ia implements Runnable {
    private static final String[] z;
    final c a;

    static {
        String[] strArr = new String[7];
        String str = "\by\u001es\b\bc\u0000|\u001e\u0017x\u000f?\u001a\u00029\u001eu\u0001\u000bw\u001fu";
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
                        i3 = 110;
                        break;
                    case ay.f /*1*/:
                        i3 = 22;
                        break;
                    case ay.n /*2*/:
                        i3 = 108;
                        break;
                    case ay.p /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 109;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\by\u001es\b\bc\u0000|\u001e\u0017x\u000f?\u001a\u00029\u001eu\u0001\u000bw\u001fu";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\by\u001es\b\bc\u0000|\u001e\u0017x\u000f?\u001a\u00029\u001eu\u0001\u000bw\u001fu";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\bc\u0000|\u001e\u0017x\u000f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001ey\u001bu\u001f";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\by\u001es\b\bc\u0000|\u001e\u0017x\u000f?\b\u001cd\u0003b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\by\u001es\b\bc\u0000|\u001e\u0017x\u000f?\u001a\u00029\rs\u001c\u001b\u007f\u001eu";
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
        r6_this = this;
        r3 = 1;
        r0 = com.whatsapp.App.p;
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r0 = r0.getSystemService(r1);
        r0 = (android.os.PowerManager) r0;
        r1 = 0;
        if (r0 == 0) goto L_0x001b;
    L_0x0011:
        r1 = z;
        r2 = 4;
        r1 = r1[r2];
        r0 = r0.newWakeLock(r3, r1);
        r1 = r0;
    L_0x001b:
        if (r1 == 0) goto L_0x0028;
    L_0x001d:
        r1.acquire();	 Catch:{ Exception -> 0x0069 }
        r0 = z;	 Catch:{ Exception -> 0x0069 }
        r2 = 1;
        r0 = r0[r2];	 Catch:{ Exception -> 0x0069 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0069 }
    L_0x0028:
        r0 = com.whatsapp.App.p;	 Catch:{ Exception -> 0x006b }
        r2 = r6.a;	 Catch:{ Exception -> 0x006b }
        r0 = com.whatsapp.contact.i.d(r0, r2);	 Catch:{ Exception -> 0x006b }
        r2 = r0.isSuccess();	 Catch:{ Exception -> 0x008a }
        if (r2 == 0) goto L_0x0049;
    L_0x0036:
        r2 = com.whatsapp.App.a0;	 Catch:{ Exception -> 0x008a }
        r3 = 1;
        r2.b(r3);	 Catch:{ Exception -> 0x008a }
        r2 = com.whatsapp.App.p;	 Catch:{ Exception -> 0x008a }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x008a }
        r2.d(r4);	 Catch:{ Exception -> 0x008a }
        r2 = com.whatsapp.App.az;	 Catch:{ Exception -> 0x008a }
        if (r2 == 0) goto L_0x0055;
    L_0x0049:
        r0 = r0.isFailure();	 Catch:{ Exception -> 0x008c }
        if (r0 == 0) goto L_0x0055;
    L_0x004f:
        r0 = com.whatsapp.App.a0;	 Catch:{ Exception -> 0x008e }
        r2 = 1;
        r0.a(r2);	 Catch:{ Exception -> 0x008e }
    L_0x0055:
        if (r1 == 0) goto L_0x0068;
    L_0x0057:
        r0 = r1.isHeld();	 Catch:{ Exception -> 0x00a5 }
        if (r0 == 0) goto L_0x0068;
    L_0x005d:
        r1.release();	 Catch:{ Exception -> 0x00a7 }
        r0 = z;	 Catch:{ Exception -> 0x00a7 }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ Exception -> 0x00a7 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00a7 }
    L_0x0068:
        return;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        r2 = z;	 Catch:{ all -> 0x0090 }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ all -> 0x0090 }
        com.whatsapp.util.Log.c(r2, r0);	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x0068;
    L_0x0076:
        r0 = r1.isHeld();	 Catch:{ Exception -> 0x0088 }
        if (r0 == 0) goto L_0x0068;
    L_0x007c:
        r1.release();	 Catch:{ Exception -> 0x0088 }
        r0 = z;	 Catch:{ Exception -> 0x0088 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0088 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0088 }
        goto L_0x0068;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x008e }
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x006b }
    L_0x0090:
        r0 = move-exception;
        if (r1 == 0) goto L_0x00a4;
    L_0x0093:
        r2 = r1.isHeld();	 Catch:{ Exception -> 0x00a9 }
        if (r2 == 0) goto L_0x00a4;
    L_0x0099:
        r1.release();	 Catch:{ Exception -> 0x00a9 }
        r1 = z;	 Catch:{ Exception -> 0x00a9 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ Exception -> 0x00a9 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x00a9 }
    L_0x00a4:
        throw r0;
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;
    L_0x00a9:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ia.run():void");
    }

    ia(c cVar) {
        this.a = cVar;
    }
}
