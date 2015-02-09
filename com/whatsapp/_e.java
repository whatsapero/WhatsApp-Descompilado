package com.whatsapp;

import com.whatsapp.protocol.b;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class _e implements Runnable {
    private static final String[] z;
    final b a;

    static {
        String[] strArr = new String[3];
        String str = "\u0015y\to\u0010\u0000mFs\n\u0000u\u000fm\u0018T";
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
                        i3 = 116;
                        break;
                    case ay.f /*1*/:
                        i3 = 1;
                        break;
                    case ay.n /*2*/:
                        i3 = 102;
                        break;
                    case ay.p /*3*/:
                        i3 = 3;
                        break;
                    default:
                        i3 = 127;
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
                    str = "Th\bw\u0010Tq\u0003m\u001b\u001do\u0001#\u001aFdFp\u001a\u0007r\u000fl\u0011Tr\u0012b\u000b\u0011!\u0002v\u001aTu\t#\u0011\u001b!\u0015f\f\u0007h\tm_\u0015o\u0002#AF5Fk\u0010\u0001s\u0015#\f\u001do\u0005f_\u0018`\u0015w_\u001fd\u001f#\r\u0011p\u0013f\f\u0000";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0015y\to\u0010\u0000mFj\fTr\u0003o\u0019Tr\u0003m\u001b\u001do\u00019_";
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
        r12_this = this;
        r4 = 0;
        r9 = 1;
        r8 = 0;
        r10 = com.whatsapp.App.az;
        r0 = r12.a;
        r0 = r0.e;
        r0 = r0.c;
        r0 = com.whatsapp.bd.b(r0);
        r1 = r12.a;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r1 = r1.j;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        if (r1 != 0) goto L_0x0186;
    L_0x0016:
        r1 = r12.a;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r1 = r1.e;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r1 = r1.c;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IllegalArgumentException -> 0x00f3 }
        if (r1 != 0) goto L_0x0186;
    L_0x0022:
        if (r0 != 0) goto L_0x0186;
    L_0x0024:
        r0 = r12.a;	 Catch:{ IllegalArgumentException -> 0x00f7 }
        r0 = r0.e;	 Catch:{ IllegalArgumentException -> 0x00f7 }
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x00f7 }
        r0 = com.whatsapp.m8.d(r0);	 Catch:{ IllegalArgumentException -> 0x00f7 }
        if (r0 != 0) goto L_0x0186;
    L_0x0030:
        r0 = r12.a;
        r1 = 0;
        r0.a(r1);
        r11 = new com.whatsapp.fieldstats.g;
        r11.<init>();
        r0 = com.whatsapp.App.P;
        r1 = r12.a;
        r1 = r1.e;
        r1 = r1.c;
        r1 = r0.h(r1);
        if (r1 == 0) goto L_0x00f9;
    L_0x0049:
        r0 = r9;
    L_0x004a:
        r2 = (double) r0;
        r0 = java.lang.Double.valueOf(r2);
        r11.c = r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r2 = r2[r9];
        r0 = r0.append(r2);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r12.a;
        r0 = r0.I;
        r0 = (double) r0;
        r0 = java.lang.Double.valueOf(r0);
        r11.b = r0;
        r0 = r12.a;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r0 = r0.e;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r6 = com.whatsapp.f_.a(r0);	 Catch:{ IllegalArgumentException -> 0x00fc }
        r0 = com.whatsapp.App.p;
        r0 = r0.a6;
        r0 = r0.a(r6);
        r0 = r0.a();
        r1 = java.util.Calendar.getInstance();
        r2 = 5;
        r3 = -1;
        r1.add(r2, r3);
        r2 = com.whatsapp.App.p;
        r2 = r2.a6;
        r2 = r2.e(r6);
        if (r0 == 0) goto L_0x00a7;
    L_0x009d:
        r1 = r1.getTime();	 Catch:{ IllegalArgumentException -> 0x010a }
        r0 = r0.before(r1);	 Catch:{ IllegalArgumentException -> 0x010a }
        if (r0 == 0) goto L_0x010c;
    L_0x00a7:
        r0 = r9;
    L_0x00a8:
        if (r2 != 0) goto L_0x019c;
    L_0x00aa:
        if (r0 == 0) goto L_0x019c;
    L_0x00ac:
        r0 = com.whatsapp.ge.r;	 Catch:{ IllegalArgumentException -> 0x010e }
        if (r0 == 0) goto L_0x0110;
    L_0x00b0:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x010e }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x010e }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x010e }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x010e }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x010e }
        r1 = r12.a;	 Catch:{ IllegalArgumentException -> 0x010e }
        r1 = r1.e;	 Catch:{ IllegalArgumentException -> 0x010e }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x010e }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x010e }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x010e }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x010e }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x010e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x010e }
        r0 = r12.a;	 Catch:{ IllegalArgumentException -> 0x010e }
        r1 = 14;
        r0.a = r1;	 Catch:{ IllegalArgumentException -> 0x010e }
        r0 = com.whatsapp.App.aJ;	 Catch:{ IllegalArgumentException -> 0x010e }
        r1 = r12.a;	 Catch:{ IllegalArgumentException -> 0x010e }
        r1 = r1.e;	 Catch:{ IllegalArgumentException -> 0x010e }
        r0.a(r1);	 Catch:{ IllegalArgumentException -> 0x010e }
        r0 = com.whatsapp.App.aD();	 Catch:{ IllegalArgumentException -> 0x010e }
        r1 = new com.whatsapp.avx;	 Catch:{ IllegalArgumentException -> 0x010e }
        r2 = 1;
        r1.<init>(r12, r2);	 Catch:{ IllegalArgumentException -> 0x010e }
        r0.post(r1);	 Catch:{ IllegalArgumentException -> 0x010e }
    L_0x00f2:
        return;
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f5 }
    L_0x00f5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f7 }
    L_0x00f7:
        r0 = move-exception;
        throw r0;
    L_0x00f9:
        r0 = r8;
        goto L_0x004a;
    L_0x00fc:
        r0 = move-exception;
        r0 = com.whatsapp.App.aD();
        r1 = new com.whatsapp.avx;
        r1.<init>(r12, r8);
        r0.post(r1);
        goto L_0x00f2;
    L_0x010a:
        r0 = move-exception;
        throw r0;
    L_0x010c:
        r0 = r8;
        goto L_0x00a8;
    L_0x010e:
        r0 = move-exception;
        throw r0;
    L_0x0110:
        r0 = java.lang.Double.valueOf(r4);
        r11.d = r0;
        r0 = com.whatsapp.fieldstats.ay.NO_SESSION_AVAILABLE;
        r0 = r0.getCode();
        r0 = (double) r0;
        r0 = java.lang.Double.valueOf(r0);
        r11.a = r0;
        if (r10 == 0) goto L_0x0180;
    L_0x0125:
        r0 = r9;
    L_0x0126:
        if (r2 == 0) goto L_0x016a;
    L_0x0128:
        r1 = new org.whispersystems.libaxolotl.a1;
        r2 = com.whatsapp.App.p;
        r2 = r2.a6;
        r3 = com.whatsapp.App.p;
        r3 = r3.a6;
        r4 = com.whatsapp.App.p;
        r4 = r4.a6;
        r4 = r4.c();
        r5 = com.whatsapp.App.p;
        r5 = r5.a6;
        r1.<init>(r2, r3, r4, r5, r6, r8);
        r2 = r12.a;
        r2 = r2.c();
        r1 = r1.a(r2);
        r2 = r12.a;	 Catch:{ IllegalArgumentException -> 0x0194 }
        r3 = r1.a();	 Catch:{ IllegalArgumentException -> 0x0194 }
        r2.a(r3);	 Catch:{ IllegalArgumentException -> 0x0194 }
        r2 = r12.a;	 Catch:{ IllegalArgumentException -> 0x0194 }
        r1 = r1.b();	 Catch:{ IllegalArgumentException -> 0x0194 }
        r3 = 3;
        if (r1 != r3) goto L_0x0196;
    L_0x015d:
        r2.a(r9);	 Catch:{ IllegalArgumentException -> 0x0198 }
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0198 }
        r11.d = r1;	 Catch:{ IllegalArgumentException -> 0x0198 }
        if (r10 == 0) goto L_0x019a;
    L_0x016a:
        r2 = 0;
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0198 }
        r11.d = r1;	 Catch:{ IllegalArgumentException -> 0x0198 }
        r1 = com.whatsapp.fieldstats.ay.NO_SESSION_AVAILABLE;	 Catch:{ IllegalArgumentException -> 0x0198 }
        r1 = r1.getCode();	 Catch:{ IllegalArgumentException -> 0x0198 }
        r2 = (double) r1;	 Catch:{ IllegalArgumentException -> 0x0198 }
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0198 }
        r11.a = r1;	 Catch:{ IllegalArgumentException -> 0x0198 }
        r9 = r0;
    L_0x0180:
        r0 = com.whatsapp.App.p;
        com.whatsapp.fieldstats.al.a(r0, r11);
        r8 = r9;
    L_0x0186:
        r0 = com.whatsapp.App.aD();
        r1 = new com.whatsapp.avx;
        r1.<init>(r12, r8);
        r0.post(r1);
        goto L_0x00f2;
    L_0x0194:
        r0 = move-exception;
        throw r0;
    L_0x0196:
        r9 = r8;
        goto L_0x015d;
    L_0x0198:
        r0 = move-exception;
        throw r0;
    L_0x019a:
        r9 = r0;
        goto L_0x0180;
    L_0x019c:
        r0 = r8;
        goto L_0x0126;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp._e.run():void");
    }

    _e(b bVar) {
        this.a = bVar;
    }
}
