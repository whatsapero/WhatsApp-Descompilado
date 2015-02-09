package com.whatsapp;

import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class uo extends Thread {
    private static final String[] z;
    final s3 a;

    static {
        String[] strArr = new String[6];
        String str = "3u\u000eIh2\u007f\u000bDl\f";
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
                        i3 = 126;
                        break;
                    case ay.f /*1*/:
                        i3 = 16;
                        break;
                    case ay.n /*2*/:
                        i3 = 106;
                        break;
                    case ay.p /*3*/:
                        i3 = 32;
                        break;
                    default:
                        i3 = 9;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0013u\u000eIh\u001fe\u001eOm\u0011g\u0004Lf\u001ftEDf\t~\u0006Oh\u001a0";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0013u\u000eIh\u001fe\u001eOm\u0011g\u0004Lf\u001ftENf\r`\u000bCl^d\u0005Th\u0012*";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "^v\u0018ElD";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "^~\u000fEmD";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0013u\u000eIh\u001fe\u001eOm\u0011g\u0004Lf\u001ftEDf\t~\u0006Oh\u001a0\fA`\u0012u\u000e\u0000";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    uo(s3 s3Var, wx wxVar) {
        this(s3Var);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r15_this = this;
        r6 = com.whatsapp.App.az;
    L_0x0002:
        r0 = r15.a;	 Catch:{ InterruptedException -> 0x0125 }
        r0 = com.whatsapp.s3.a(r0);	 Catch:{ InterruptedException -> 0x0125 }
        r0 = r0.size();	 Catch:{ InterruptedException -> 0x0125 }
        if (r0 != 0) goto L_0x001f;
    L_0x000e:
        r0 = r15.a;	 Catch:{ InterruptedException -> 0x0125 }
        r1 = com.whatsapp.s3.a(r0);	 Catch:{ InterruptedException -> 0x0125 }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x0125 }
        r0 = r15.a;	 Catch:{ all -> 0x0122 }
        r0 = com.whatsapp.s3.a(r0);	 Catch:{ all -> 0x0122 }
        r0.wait();	 Catch:{ all -> 0x0122 }
        monitor-exit(r1);	 Catch:{ all -> 0x0122 }
    L_0x001f:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0125 }
        com.whatsapp.Voip.a();	 Catch:{ InterruptedException -> 0x0125 }
        r0 = r15.a;	 Catch:{ InterruptedException -> 0x0125 }
        r0 = com.whatsapp.s3.a(r0);	 Catch:{ InterruptedException -> 0x0125 }
        r0 = r0.size();	 Catch:{ InterruptedException -> 0x0125 }
        if (r0 == 0) goto L_0x011b;
    L_0x0033:
        r0 = r15.a;	 Catch:{ InterruptedException -> 0x0125 }
        r1 = com.whatsapp.s3.a(r0);	 Catch:{ InterruptedException -> 0x0125 }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x0125 }
        r0 = r15.a;	 Catch:{ all -> 0x0157 }
        r0 = com.whatsapp.s3.a(r0);	 Catch:{ all -> 0x0157 }
        r0 = r0.pop();	 Catch:{ all -> 0x0157 }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ all -> 0x0157 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0157 }
        r2.<init>();	 Catch:{ all -> 0x0157 }
        r3 = z;	 Catch:{ all -> 0x0157 }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ all -> 0x0157 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0157 }
        r3 = r0.t;	 Catch:{ all -> 0x0157 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0157 }
        r2 = r2.toString();	 Catch:{ all -> 0x0157 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ all -> 0x0157 }
        monitor-exit(r1);	 Catch:{ all -> 0x0157 }
        r1 = r0.j;	 Catch:{ InterruptedException -> 0x0125 }
        if (r1 == 0) goto L_0x018e;
    L_0x0066:
        r8 = com.whatsapp.App.aP();	 Catch:{ InterruptedException -> 0x0125 }
        r10 = com.whatsapp.App.ab();	 Catch:{ InterruptedException -> 0x0125 }
        r2 = 0;
        r1 = r0.j;	 Catch:{ Exception -> 0x015a }
        r4 = 3;
        if (r1 == r4) goto L_0x007f;
    L_0x0075:
        r1 = r0.j;	 Catch:{ Exception -> 0x015a }
        r4 = 2;
        if (r1 != r4) goto L_0x0097;
    L_0x007a:
        r1 = r0.w;	 Catch:{ Exception -> 0x015c }
        r4 = 1;
        if (r1 == r4) goto L_0x0097;
    L_0x007f:
        r1 = com.whatsapp.ge.k;	 Catch:{ InterruptedException -> 0x0125 }
        r1 = r1 * 1024;
        r1 = r1 * 1024;
        r2 = (long) r1;	 Catch:{ InterruptedException -> 0x0125 }
        r4 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r12 = 10;
        r12 = r10 / r12;
        r4 = java.lang.Math.min(r4, r12);	 Catch:{ InterruptedException -> 0x0125 }
        r2 = java.lang.Math.max(r2, r4);	 Catch:{ InterruptedException -> 0x0125 }
        if (r6 == 0) goto L_0x01a5;
    L_0x0097:
        r1 = r0.j;	 Catch:{ Exception -> 0x015e }
        r4 = 1;
        if (r1 != r4) goto L_0x01a5;
    L_0x009c:
        r1 = com.whatsapp.ge.k;	 Catch:{ InterruptedException -> 0x0125 }
        r1 = r1 * 512;
        r1 = r1 * 1024;
        r2 = (long) r1;	 Catch:{ InterruptedException -> 0x0125 }
        r4 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r12 = 20;
        r12 = r10 / r12;
        r4 = java.lang.Math.min(r4, r12);	 Catch:{ InterruptedException -> 0x0125 }
        r2 = java.lang.Math.max(r2, r4);	 Catch:{ InterruptedException -> 0x0125 }
        r4 = r2;
    L_0x00b3:
        r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x00df;
    L_0x00b7:
        r1 = r0.A;	 Catch:{ InterruptedException -> 0x0125 }
        r1 = (com.whatsapp.MediaData) r1;	 Catch:{ InterruptedException -> 0x0125 }
        r7 = r1.downloader;	 Catch:{ InterruptedException -> 0x0125 }
        r2 = r7.isCancelled();	 Catch:{ Exception -> 0x0160 }
        if (r2 != 0) goto L_0x00dd;
    L_0x00c3:
        r2 = r7.b();	 Catch:{ Exception -> 0x0160 }
        if (r2 == 0) goto L_0x00dd;
    L_0x00c9:
        r2 = 0;
        r2 = new java.lang.Void[r2];	 Catch:{ Exception -> 0x0162 }
        r2 = r7.a(r2);	 Catch:{ Exception -> 0x0162 }
    L_0x00d0:
        r3 = r7.isCancelled();	 Catch:{ Exception -> 0x018a }
        if (r3 != 0) goto L_0x00dd;
    L_0x00d6:
        r1 = r1.downloader;	 Catch:{ Exception -> 0x018a }
        if (r7 != r1) goto L_0x00dd;
    L_0x00da:
        r7.a(r2);	 Catch:{ Exception -> 0x018c }
    L_0x00dd:
        if (r6 == 0) goto L_0x011b;
    L_0x00df:
        r1 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0125 }
        r1.<init>();	 Catch:{ InterruptedException -> 0x0125 }
        r2 = z;	 Catch:{ InterruptedException -> 0x0125 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ InterruptedException -> 0x0125 }
        r1 = r1.append(r2);	 Catch:{ InterruptedException -> 0x0125 }
        r1 = r1.append(r10);	 Catch:{ InterruptedException -> 0x0125 }
        r2 = z;	 Catch:{ InterruptedException -> 0x0125 }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ InterruptedException -> 0x0125 }
        r1 = r1.append(r2);	 Catch:{ InterruptedException -> 0x0125 }
        r1 = r1.append(r8);	 Catch:{ InterruptedException -> 0x0125 }
        r2 = z;	 Catch:{ InterruptedException -> 0x0125 }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ InterruptedException -> 0x0125 }
        r1 = r1.append(r2);	 Catch:{ InterruptedException -> 0x0125 }
        r1 = r1.append(r4);	 Catch:{ InterruptedException -> 0x0125 }
        r1 = r1.toString();	 Catch:{ InterruptedException -> 0x0125 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ InterruptedException -> 0x0125 }
        r0 = r0.A;	 Catch:{ InterruptedException -> 0x0125 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ InterruptedException -> 0x0125 }
        r0 = r0.downloader;	 Catch:{ InterruptedException -> 0x0125 }
        r0.a();	 Catch:{ InterruptedException -> 0x0125 }
    L_0x011b:
        r0 = java.lang.Thread.interrupted();	 Catch:{ InterruptedException -> 0x0125 }
        if (r0 == 0) goto L_0x0002;
    L_0x0121:
        return;
    L_0x0122:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0122 }
        throw r0;	 Catch:{ InterruptedException -> 0x0125 }
    L_0x0125:
        r0 = move-exception;
        r0 = r15.a;
        r1 = com.whatsapp.s3.a(r0);
        monitor-enter(r1);
    L_0x012d:
        r0 = r15.a;	 Catch:{ all -> 0x0154 }
        r0 = com.whatsapp.s3.a(r0);	 Catch:{ all -> 0x0154 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0154 }
        if (r0 != 0) goto L_0x0152;
    L_0x0139:
        r0 = r15.a;	 Catch:{ all -> 0x0154 }
        r0 = com.whatsapp.s3.a(r0);	 Catch:{ all -> 0x0154 }
        r0 = r0.pop();	 Catch:{ all -> 0x0154 }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ all -> 0x0154 }
        r0 = r0.A;	 Catch:{ all -> 0x0154 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ all -> 0x0154 }
        r2 = 0;
        r0.transferring = r2;	 Catch:{ all -> 0x0154 }
        r2 = 0;
        r0.progress = r2;	 Catch:{ all -> 0x0154 }
        if (r6 == 0) goto L_0x012d;
    L_0x0152:
        monitor-exit(r1);	 Catch:{ all -> 0x0154 }
        goto L_0x0121;
    L_0x0154:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0154 }
        throw r0;
    L_0x0157:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0157 }
        throw r0;	 Catch:{ InterruptedException -> 0x0125 }
    L_0x015a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x015c }
    L_0x015c:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0125 }
    L_0x015e:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0125 }
    L_0x0160:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0125 }
    L_0x0162:
        r2 = move-exception;
        r3 = new com.whatsapp.a1n;	 Catch:{ InterruptedException -> 0x0125 }
        r12 = com.whatsapp.x2.FAILED_GENERIC;	 Catch:{ InterruptedException -> 0x0125 }
        r3.<init>(r12);	 Catch:{ InterruptedException -> 0x0125 }
        r12 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0125 }
        r12.<init>();	 Catch:{ InterruptedException -> 0x0125 }
        r13 = z;	 Catch:{ InterruptedException -> 0x0125 }
        r14 = 1;
        r13 = r13[r14];	 Catch:{ InterruptedException -> 0x0125 }
        r12 = r12.append(r13);	 Catch:{ InterruptedException -> 0x0125 }
        r2 = r2.toString();	 Catch:{ InterruptedException -> 0x0125 }
        r2 = r12.append(r2);	 Catch:{ InterruptedException -> 0x0125 }
        r2 = r2.toString();	 Catch:{ InterruptedException -> 0x0125 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ InterruptedException -> 0x0125 }
        r2 = r3;
        goto L_0x00d0;
    L_0x018a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x018c }
    L_0x018c:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0125 }
    L_0x018e:
        r1 = r0.f();	 Catch:{ Exception -> 0x01a3 }
        r1 = com.whatsapp.kh.a(r1);	 Catch:{ Exception -> 0x01a3 }
        r0.A = r1;	 Catch:{ Exception -> 0x01a3 }
        r1 = r0.A;	 Catch:{ Exception -> 0x01a3 }
        if (r1 == 0) goto L_0x011b;
    L_0x019c:
        r1 = com.whatsapp.App.aJ;	 Catch:{ Exception -> 0x01a3 }
        r1.a(r0);	 Catch:{ Exception -> 0x01a3 }
        goto L_0x011b;
    L_0x01a3:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0125 }
    L_0x01a5:
        r4 = r2;
        goto L_0x00b3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.uo.run():void");
    }

    private uo(s3 s3Var) {
        this.a = s3Var;
        super(z[0]);
    }
}
